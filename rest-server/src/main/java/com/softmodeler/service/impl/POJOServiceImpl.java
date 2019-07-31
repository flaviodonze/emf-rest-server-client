package com.softmodeler.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.softmodeler.common.pojo.AssociationObject;
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
}
