package datastructure.tree;

public class InOrderSearch {
	
	static Node root;

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		//BFSInorderSearch(root);
		System.out.println();
		//BFSPreorderSearch(root);
		System.out.println();
		//BFSPostorderSearch(root);
		
		System.out.println(heightOftheTree(root));
		System.out.println(sizeOfTheTree(root));
	}
	
	public static void BFSInorderSearch(Node node){
		if(node!=null){
			BFSInorderSearch(node.left);
			System.out.print(node.data+" ");
			BFSInorderSearch(node.right);
		}
		
	}
	public static void BFSPreorderSearch(Node node){
		if(node!=null){
			System.out.print(node.data+" ");
			BFSPreorderSearch(node.left);
			BFSPreorderSearch(node.right);
		}
	}
	
	public static void BFSPostorderSearch(Node node){
		System.out.print("");
		if(node!=null){
			BFSPostorderSearch(node.left);
			BFSPostorderSearch(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	public static int heightOftheTree(Node node){
		if(node==null) return 0;
		
		return 1 + Math.max(heightOftheTree(node.left), heightOftheTree(node.right));
	}
	
	public static int sizeOfTheTree(Node node){
		if(node==null) return 0;
		return 1 + sizeOfTheTree(node.left)+sizeOfTheTree(node.right);
	}
	static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

}
