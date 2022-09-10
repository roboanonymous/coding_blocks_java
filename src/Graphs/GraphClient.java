package Graphs;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph();
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.AddEdge("A", "B", 2);
		graph.AddEdge("A", "D", 3);
		graph.AddEdge("B", "C", 1);
		graph.AddEdge("C", "D", 8);
		graph.AddEdge("D", "E", 10);
		graph.AddEdge("E", "F", 45);
		graph.AddEdge("E", "G", 7);		
		graph.AddEdge("F", "G", 8);
		
		graph.display();
		
	//	System.out.println(graph.haspath("A", "F", new HashMap()));
	//	System.out.println(graph.haspath("A", "B", new HashMap()));
	//	System.out.println(graph.haspath("A", "C", new HashMap()));
		
	//	graph.RemoveEdge("A", "B");	
	//	graph.display();		
	//	graph.removeVertex("C");
	//	graph.display();
		
		System.out.println(graph.bfs("A" , "F"));
		

	}

}
