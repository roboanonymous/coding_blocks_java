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
	
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70,};
		BST tree = new BST(arr);
		
		
	}
}
