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
		BFSInorderSearch(root);
	}
	
	public static void BFSInorderSearch(Node node){
		if(node!=null){
			BFSInorderSearch(node.left);
			System.out.print(node.data+" ");
			BFSInorderSearch(node.right);
		}
		
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
