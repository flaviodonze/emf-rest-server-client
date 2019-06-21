package com.softmodeler.common.pojo;

import java.util.List;

public class SampleObject {

	private int id;

	private String name;

	private AssociationObject associationObject;

	private List<AssociationObject> associationObjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AssociationObject getAssociationObject() {
		return associationObject;
	}

	public void setAssociationObject(AssociationObject associationObject) {
		this.associationObject = associationObject;
	}

	public List<AssociationObject> getAssociationObjects() {
		return associationObjects;
	}

	public void setAssociationObjects(List<AssociationObject> associationObjects) {
		this.associationObjects = associationObjects;
	}
}
