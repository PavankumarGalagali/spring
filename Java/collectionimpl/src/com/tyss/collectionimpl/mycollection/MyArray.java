package com.tyss.collectionimpl.mycollection;

import java.util.Iterator;

public class MyArray<E> implements Iterable<E>{

	Object[] arr;
	private int position = 0;
	final static int DEFAULT_SIZE = 10;

	public MyArray() {
		arr = new Object[DEFAULT_SIZE];
	}

	public MyArray(int size) {
		arr = new Object[size];
	}

	public boolean add(Object element) {
		arr[position++] = element;
		return true;
	}

	public Object get(int index) {
		return  arr[index];
	}

	public boolean remove(int index) {
		int length = arr.length - index - 1;
		System.arraycopy(arr, index + 1, arr, index, length);
		return true;
	}
	
	public void set(int index,Object element) {
		arr[index]= element;
	}
	
	@Override
	public String toString() {
		String str ="";
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null)
			System.out.print(arr[i]+" ,");
		}
		System.out.print("]");
		return "";
	}

	@Override
	public Iterator<E> iterator() {
		
		return new MyIteratorImpl();
	}
	
	class MyIteratorImpl implements Iterator<E>{

		int index ;
		@Override
		public boolean hasNext() {
			
			return (index<position)? true:false;
		}

		@Override
		public E next() {
			E e = (E) arr[index];
			index++;
			return e;
		}
	}
	
}
