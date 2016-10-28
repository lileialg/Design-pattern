package com.designpattern.Adapter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AdapterList<T> implements List<T>{
	
	private int[] array;
	
	public AdapterList(int[] array){
		this.array = array;
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.array.length;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (array == null || array.length==0)
			return true;
		else
			return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
