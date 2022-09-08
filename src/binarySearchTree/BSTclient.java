package binarySearchTree;

public class BSTclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,40,50,60,70};
		BST tree = new BST(arr);
		
	//	tree.display();
	//	tree.inorder();
		tree.display2();
		
		System.out.println(tree.find(85));
		

	}

}
