package com.graphs;

import java.util.LinkedList;

public class SimpleGraph {

	static class Graph{
		int vertices;
		LinkedList<Integer> adjacentArraysList[];
		
		Graph(int vertices){
			this.vertices=vertices;
			adjacentArraysList = new LinkedList[this.vertices];
			for(int i=0;i<this.vertices;i++){
				adjacentArraysList[i]= new LinkedList<Integer>();
			}
		}
		
		static void addEdge(Graph graph, int src, int dest){
			graph.adjacentArraysList[src].addFirst(dest);
			graph.adjacentArraysList[dest].addFirst(src);
		}
		
		static void printGraph(Graph graph){
			for(int i=0;i<graph.vertices;i++){
				System.out.println("adjacent list of vertex "+i);
				System.out.print("head");
				for(Integer x:graph.adjacentArraysList[i]){
					System.out.print("-> "+x);
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String [] args){
		int vertices =5;
		Graph graph = new Graph(vertices);
		Graph.addEdge(graph,0,1);
		Graph.addEdge(graph,0,4);
		Graph.addEdge(graph,1,2);
		Graph.addEdge(graph,1,3);
		Graph.addEdge(graph,1,4);
		Graph.addEdge(graph,2,3);
		Graph.addEdge(graph,3,4);
		
		Graph.printGraph(graph);
	}
}
