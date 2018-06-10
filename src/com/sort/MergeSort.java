package com.sort;
import com.BST.Node;


public class MergeSort {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int [] arr = {666,53,33,9,856,7,6,5,4,3,2,1};
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		ms.sort(arr,0,arr.length-1);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public void sort(Node []inp, int start,int end){
		if(end>start){
			int mid = (start+end)/2;
			
			sort(inp,start,mid);
			sort(inp,mid+1,end);
			
			merge(inp,start,mid,end);
		}
	}
	
	private void merge(Node []inp,int start, int mid, int end){
		int n1=mid-start+1;
		int n2=end-mid;
		Node []left=new Node[n1];
		Node []right=new Node[n2];
		
		for(int i=0;i<n1;i++){
			left[i]=inp[start+i];
		}
		for(int j=0;j<n2;j++){
			right[j]=inp[mid+1+j];
		}
		
		int i=0,j=0;
		int k=start;
		
		while(i<n1 && j<n2){
			if(left[i].getData()<=right[j].getData()){
				inp[k]=left[i];
				i++;
			}else{
				inp[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			inp[k]=left[i];
			i++;
			k++;
		}
		while(j<n2){
			inp[k]=right[j];
			j++;
			k++;
		}
	}
	
	public void sort(int []inp, int start,int end){
		if(end>start){
			int mid = (start+end)/2;
			
			sort(inp,start,mid);
			sort(inp,mid+1,end);
			
			merge(inp,start,mid,end);
		}
	}
	
	private void merge(int []inp,int start, int mid, int end){
		int n1=mid-start+1;
		int n2=end-mid;
		int []left=new int[n1];
		int []right=new int[n2];
		
		for(int i=0;i<n1;i++){
			left[i]=inp[start+i];
		}
		for(int j=0;j<n2;j++){
			right[j]=inp[mid+1+j];
		}
		
		int i=0,j=0;
		int k=start;
		
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				inp[k]=left[i];
				i++;
			}else{
				inp[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			inp[k]=left[i];
			i++;
			k++;
		}
		while(j<n2){
			inp[k]=right[j];
			j++;
			k++;
		}
	}

}
