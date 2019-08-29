package com.softmodeler.common.communication;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * https://blog.dejavu.sk/inject-custom-java-types-via-jax-rs-parameter-annotations/
 */
@Provider
public class ObjectMapperParamConverterProvider implements ParamConverterProvider {

	@Context
	private Providers providers;

	@Override
	public <T> ParamConverter<T> getConverter(final Class<T> rawType, final Type genericType, final Annotation[] annotations) {
		if (String.class.equals(rawType) || rawType.isPrimitive()) {
			return null;
		}

		MessageBodyReader<T> mbr = providers.getMessageBodyReader(rawType, genericType, annotations, MediaType.APPLICATION_JSON_TYPE);
		if (mbr == null || !mbr.isReadable(rawType, genericType, annotations, MediaType.APPLICATION_JSON_TYPE)) {
			return null;
		}

		ObjectMapper mapper = CommunicationUtil.locateMapper(rawType);
		return new ParamConverter<T>() {
			@Override
			public T fromString(final String value) {
				try {
					T result = mapper.readValue(value, rawType);
					return result;
				} catch (IOException e) {
					throw new ProcessingException(e);
				}
			}

			@Override
			public String toString(final T value) {
				try {
					String result = mapper.writeValueAsString(value);
					return result;
				} catch (JsonProcessingException e) {
					throw new ProcessingException(e);
				}
			}
		};
	}
}
