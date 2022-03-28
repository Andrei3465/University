package com.belhard.university.datastructures;

public class MyDynamicArray implements MyCollection {

	Object[] object = new Object[10];
	private int numberOfObject = 0;

	@Override
	public int size() {
		for (int i = 0; i < object.length; i++) {
			if (object[i] != null)
				numberOfObject++;
		}
		return numberOfObject;
	}

	@Override
	public boolean add(Object obj) {
		if (numberOfObject < object.length) {
			object[numberOfObject++] = obj;
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object obj) {
		boolean removed = false;
		for (int i = 0; i < object.length; i++) {
			Object elm = object[i];
			if (elm.equals(object) == obj.equals(obj)) {
				object[i] = null;
				removed = true;
			}
			if (removed) {
				if (i != object.length - 1) {
					object[i] = object[i + 1];
				} else {
					object[i] = null;
				}
			}
		}
		return removed;
	}

	@Override
	public boolean contains(Object obj) {
		for (int i = 0; i < object.length; i++) {
			Object elm = object[i];
			if (elm.equals(object) == obj.equals(obj)) {
				object[i] = true;
			}
		}
		return false;

	}

	@Override
	public Object get(int index) {
		for (int i = 0; i < object.length; i++) {
			Object elm = object[i];
		}
		return object;

	}

	@Override
	public Object[] toArray() {
		for (int i = 0; i < object.length; i++) {
			Object elm = object[i];
			if (elm == null) {
				break;
			}
		}
		return object;
	}
}
