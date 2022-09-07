package Tree;

import java.util.*;
public class Genric_Tree {
	private class Node
	{
		int data;
		ArrayList <Integer> children = new ArrayList<>();
		 Node(int data)
		 {
			 this.data = data;
			 this.children = new ArrayList <>();
		 }
		 
	}
	
	 private Node root;
	 private int size;
	 
	 Genric_Tree()
	 {
		 Scanner s = new Scanner(System.in);
		 this.root = takeinput(s, null, 0);
	 }
	 
	 private Node takeinput (Scanner s, Node parent , int ithchild)
	 {
		 if(this.root == null)
		 {
			 System.out.println(" Enter root data");
		 }
		 
		 else
		 {
			 System.out.println("Enter the date for" + ithchild);
		 }
		 
		 int nodeata = s.nextInt();
		 Node node = new Node(nodeata);
		 this.size++;
		 
		 System.out.println("Enter Number of Children for" + node.data);
		 int children = s.nextInt();
		 
		 
		 for(int i=0; i<children;i++)
		 {
			Node child = this.takeinput(s, node , i);
			node.children.add(children);
		 }
		 
		return node;
	 }
	 
	 public void display() {
		 this.display(this.root);
	 }
	 
	 
	 public void display(Node node)
	 {
		 String str = node.data + "==>";
		 for(int i=0; i<node.children.size(); i++)
		 {
			 str = str+ node.children.get(i) + ";";
			 	 
		 }
		 
		 str = str+ ", END";
		 
		 for(int i=0; i<node.children.size(); i++)
		 {
			
		 }
		 
	 }
}
