package Tree;



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
		
		
	}
	
	
	
	

}
