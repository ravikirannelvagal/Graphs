package com.BST;

public class ComplexNode  extends Node{
	int data;
	int count;
	ComplexNode left,right;
	
	ComplexNode(int data, Long count){
		this.data=data;
		this.count=count.intValue();
		left=right=null;
	}
}
