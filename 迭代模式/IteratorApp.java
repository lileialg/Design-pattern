package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorApp {

	public static class Node {
		int value;

		Node left;

		Node right;


		public MyIterator<Node> iterator() {

			List<Node> list = new ArrayList<Node>();
			
			zhongxu(list,this);

			return new MyConrectIterator<Node>(list);
		}
		
		private void zhongxu(List<Node> list,Node node){
			
			
			if (node.left != null){
				zhongxu(list,node.left);
			}
			
			list.add(node);
			
			if (node.right != null){
				zhongxu(list,node.right);
			}
			
		}

	}

	public static interface MyIterator<T> {

		public boolean hasNext();

		public T next();

	}

	public static class MyConrectIterator<T> implements MyIterator<T> {

		List<T> list;

		int cur = 0;

		public MyConrectIterator(List<T> list) {
			this.list = list;
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cur < list.size();
		}

		public T next() {
			// TODO Auto-generated method stub
			return list.get(cur++);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node();
		
		root.value = 2;
		
		Node left = new Node();
		
		left.value = 1;
		
		root.left = left;
		
		Node right = new Node();
		
		right.value = 3;
		
		root.right = right;
		
		MyIterator<Node> it = root.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().value);
		}
		
	}

}
