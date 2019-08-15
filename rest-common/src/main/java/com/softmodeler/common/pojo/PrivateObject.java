package com.softmodeler.common.pojo;

/**
 * object with no actual getters
 */
public class PrivateObject {
	private int id;
	private String name;

	public PrivateObject(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 'get' method without being an actual 'getter', should not be part of json
	 * 
	 * @return
	 */
	public String getNoGetter() {
		return "another string";
	}
	
	@Override
	public String toString() {
		return id + " "+ name;
	}
}
