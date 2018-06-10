package com.BST;

public class BinaryTree {

	static Node root;
	
	public Node formBST(Node []arr, int start, int end){
		if(start>end){
			return null;
		}
		int mid = (int) Math.ceil((start+end)/2.0);
		Node node = arr[mid];
		node.left=formBST(arr,start,mid-1);
		node.right=formBST(arr,mid+1,end);
		
		return node;
	}
	
	public void preOrderTraversal(Node node){
		if(node == null)
			return;
		if(node instanceof ComplexNode){
			ComplexNode loc=(ComplexNode)node;
			System.out.print(loc.data+"("+loc.count+") ");
			preOrderTraversal(loc.left);
			preOrderTraversal(loc.right);
		}else{
			System.out.print(node.data+" ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
		
	}
}
