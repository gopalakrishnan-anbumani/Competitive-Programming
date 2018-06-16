package datastructure.tree;

public class BinarySearchTre {
	
	int data;
	BinarySearchTre left;
	BinarySearchTre right;
	
	public BinarySearchTre(int data) {
		this.data = data;
	}
	
	/**
	 * In Binary Search Tree, Left Side Node values are should less than the Root node and 
	 * Right Side Values are greater than root node. It is applicable to all nodes.
	 *  
	 * 
	 * @param data
	 */
	public void addNode(int data){
		
		BinarySearchTre current = this;
		System.out.println("In -> : "+current.data);
		
		if(current.data > data){
			if(current.left == null){
				current.left = new BinarySearchTre(data);
			}else{
				current.left.addNode(data);
			}
		}else if(current.data < data){
			if(current.right == null){
				current.right = new BinarySearchTre(data);
			}else{
				current.right.addNode(data);
			}
		}
	}
	/**
	 * Main Method
	 */
	public static void main(String[] args){
		BinarySearchTre tree = new BinarySearchTre(20);
		tree.addNode(10);
		tree.addNode(5);
		tree.addNode(25);
		tree.addNode(8);
		tree.addNode(10);
		preOrderTraversal(tree);
	}
	public static void preOrderTraversal(BinarySearchTre node){
		if(node==null) return;
		System.out.print(" *"+node.data+"*");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
}
