/*
 * Copyright (c) 2015 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Guillaume Hillairet - initial API and implementation
 *
 */
package com.softmodeler.common.communication.ser;

import static org.eclipse.emf.ecore.EcorePackage.Literals.EJAVA_CLASS;
import static org.eclipse.emf.ecore.EcorePackage.Literals.EJAVA_OBJECT;

import java.io.IOException;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class EDataTypeDeserializer extends JsonDeserializer<Object> {

	private EDataType type;

	public EDataTypeDeserializer(EDataType type) {
		this.type = type;
	}
	
	@Override
	public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
		if (type instanceof EEnum || EJAVA_CLASS.equals(type) || EJAVA_OBJECT.equals(type)) {
			return EcoreUtil.createFromString(type, jp.getText());
		}
		return null;
	}

}
