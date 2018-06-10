package com.BST;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.sort.MergeSort;

public class ArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		int[] arr = {10,1,10,5,7,50,40};
		//MergeSort ms = new MergeSort();
		//ms.sort(arr, 0, arr.length-1);
		List<Integer> nodes = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, Long> dupNodes = nodes.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<Entry<Integer, Long>> dupNodesEntry = dupNodes.entrySet();
		Node [] nodeArr = new Node[dupNodes.entrySet().size()];
		int i=0;
		for(Map.Entry<Integer, Long> e: dupNodesEntry){
			if(e.getValue()>1){
				nodeArr[i]=new ComplexNode(e.getKey(), e.getValue());
			}else{
				nodeArr[i]=new Node(e.getKey());
			}
			i++;
		}
		/*for(int i=0;i<nodeArr.length;i++){
			nodeArr[i]=new Node(arr[i]);
		}*/
		MergeSort ms = new MergeSort();
		ms.sort(nodeArr, 0, nodeArr.length-1);
		Node root = bt.formBST(nodeArr, 0, nodeArr.length-1);
		
		bt.preOrderTraversal(root);
	}
}
