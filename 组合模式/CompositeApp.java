package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {
	
	public static class Node{
		
		int value;
		
		String name;
		
		List<Node> subNodes = new ArrayList<Node>();

		public List<Node> getSubNodes() {
			return subNodes;
		}

		public void setSubNodes(List<Node> subNodes) {
			this.subNodes = subNodes;
		}
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
