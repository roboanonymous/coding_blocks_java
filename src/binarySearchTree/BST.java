package binarySearchTree;

public class BST {
	
	private class Node{
		int data;
		Node Left;
		Node Right;
	}
	
	private Node Root;
	
	public BST(int [] arr) {
		this.Root = construct(arr, 0, arr.length-1);
	}
	
	private Node construct (int [] arr, int low, int high)
	{
		if(low> high)
		{
			return null;
		}
		
		int mid = (low+ high)/2;
		Node nn  = new Node();
		
		nn.data = arr[mid];
		nn.Left = construct(arr, 0, mid-1);
		nn.Right = construct(arr, mid+1 ,high);
		
		return nn;
		
	}
	public void display() {
		display(this.Root);
	}
	
	private void display(Node node) {
		
		if(node == null)
		{
			return;
		}
		String str = "";
		
		if(node.Left == null) {
			str += " .";
		}
		
		else
		{
			str += node.Left.data;
		}
		
		str += "  ->  " + node.data + "  <-  ";
		
		if(node.Right == null) {
			str += " .";
		}
		
		else
		{
			str += node.Right.data;
		}
		
		System.out.println(str);
		
		display(node.Left);
		display(node.Right);
	}
	
	public void display2() {
		display2(this.Root);
	}
	
	private void display2(Node node) {
		
		if(node == null || node.Left == null || node.Right == null)
		{
			return;
		}
		System.out.println(node.Left.data + " " +node.data + "  " + node.Right.data);
	//	display2(node.Left);
		display2(node.Right);
	}
	
	
	private void inorder() {
		inorder(this.Root);
	}
	
	private void inorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.Left);
		System.out.print(root.data + " ");
		inorder(root.Right);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70,80};
		BST tree = new BST(arr);
		
	//	tree.display();
	//	tree.inorder();
		tree.display2();
		
		
	}
}
