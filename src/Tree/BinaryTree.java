package Tree;

import java.util.*;

public class BinaryTree {
	
	static class Node
	{
		int data;
		Node left;
		Node right;	
		
		Node (int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class binary
	{

		static int idx = -1;
		public static Node buildtree (int nodes[] )
		{
			idx++;
			if(nodes[idx] == -1)
			{
				return null;
			}
			
			Node Newnode = new Node(nodes[idx]);
			Newnode.left =  buildtree(nodes);
			Newnode.right =  buildtree(nodes);
			
			return Newnode;
		}
		
	}
	
	public static void preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.data + " ");
		
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public static void inorder (Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static void postorder (Node root)
	{
		if(root == null)
		{
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void levelorder(Node root)
	{
		Queue <Node> q  = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null)
			{
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			
			else {
				System.out.print(currNode.data+ " ");
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
		
	}
	
	public static int CountNodes(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int count = CountNodes(root.left) + CountNodes(root.right)+ 1;
		return count;
	}
	
	public static int SumNodes(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int count = SumNodes(root.left) + SumNodes(root.right)+ root.data;
		return count;
	}
	
	public static int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int max = Math.max(height(root.left), height(root.right)) + 1;
		return max;
	}
	
	public static int diameter(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int dia1 = diameter(root.left);
		int dia2 = diameter(root.right);
		int dia3 = height(root.left)+ height(root.right)+1;
		
		int max = Math.max(Math.max(dia1, dia2), dia3);
		return max;
	}
	
	static class treeinfo
	{
		int diam;
		int height;
		
		
		treeinfo(int height , int diam){
			this.diam = diam;
			this.height = height;
		}
	}
	
	public static treeinfo diameter2(Node root)
	{
		if(root == null)
		{
			return new treeinfo(0,0);
		}
		
		treeinfo left = diameter2(root.left);
		treeinfo right = diameter2(root.right);
		
		int myheight = Math.max(left.height, right.height)+1;
		
		int dia1 = diameter(root.left);
		int dia2 = diameter(root.right);
		int dia3 = left.height+ right.height+1;
		
		int mydiam = Math.max(Math.max(dia1, dia2), dia3);
		
		treeinfo myinfo = new treeinfo(myheight, mydiam);
		return myinfo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		binary tree = new binary ();
		Node root = tree.buildtree(nodes);
		System.out.println(root.data);
		
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		levelorder(root);
		System.out.println();
		
		System.out.println(CountNodes(root));
		System.out.println(SumNodes(root));
		System.out.println(height(root));
		System.out.println(diameter(root));
		System.out.println(diameter2(root).diam);
		
		
	}
	
	
	
	

}
