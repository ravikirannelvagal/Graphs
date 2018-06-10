package com.BST;

public class Node {
	int data;
	Node left, right;
	Node(){}
	
	Node(int d){
		this.data = d;
		left=right=null;
	}
	
	public int getData(){
		return data;
	}
}
