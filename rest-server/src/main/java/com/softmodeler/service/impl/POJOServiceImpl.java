package com.softmodeler.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.softmodeler.common.ServerException;
import com.softmodeler.common.ValidationException;
import com.softmodeler.common.pojo.AssociationObject;
import com.softmodeler.common.pojo.PrivateObject;
import com.softmodeler.common.pojo.SampleObject;
import com.softmodeler.common.service.POJOService;

public class POJOServiceImpl implements POJOService {

	@Override
	public SampleObject get() {
		SampleObject object = new SampleObject();
		object.setId(99);
		object.setName("Test");
		object.setAssociationObject(new AssociationObject(1, "Association Name 1"));
		object.setAssociationObjects(Arrays.asList(new AssociationObject(2, "Association Name 2"),
				new AssociationObject(3, "Association Name 3")));
		return object;
	}

	@Override
	public void set(SampleObject object) {
		System.out.println("server: " + object.getId() + " " + object.getName());
	}

	@Override
	public List<SampleObject> findAll() {
		List<SampleObject> all = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			SampleObject s = new SampleObject();
			s.setId(i);
			s.setName("Test " + i);
			all.add(s);
		}
		return all;
	}

	@Override
	public Set<SampleObject> getSampleSet() {
		return new HashSet<>(findAll());
	}
	
	@Override
	public Map<String, SampleObject> getSampleMap() {
		Map<String, SampleObject> map = new HashMap<>();
		List<SampleObject> result = findAll();
		for (SampleObject o : result) {
			map.put(o.getName(), o);
		}
		return map;
	}
	
	@Override
	public PrivateObject getPrivateObject() {
		PrivateObject object = new PrivateObject(1234, "test");
		return object;
	}
	
	@Override
	public void testException() throws Exception {
		throw new Exception("plain exception");
	}
	
	@Override
	public void testRuntimeException() {
		throw new RuntimeException("runtime exception");
	}
	
	@Override
	public void testServerException() throws ServerException {
		throw new ServerException("server exception");		
	}
	
	@Override
	public void testValidationException() throws ValidationException {
		throw new ValidationException("validation exception");
	}
	
	@Override
	public boolean testObjectParameter(Object value) {
		if (value != null) {
			if (value instanceof String) {
				return "test-string".equals(value);
			}
			if (value instanceof Integer) {
				return value.equals(987654321);
			}
			if (value instanceof SampleObject) {
				SampleObject sampleObject = (SampleObject) value;
				if (!"new name".equals(sampleObject.getName()) || sampleObject.getId() != 99) {
					return false;
				}
				if (sampleObject.getAssociationObject() == null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public Map<String, Object> testMap(Map<String, Object> map) {
		return map;
	}

	@Override
	public String testNullString(String param) {
		return param;
	}

	@Override
	public Object testNullObject(Object param) {
		return param;
	}
}
