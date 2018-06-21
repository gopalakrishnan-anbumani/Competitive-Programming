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
	public void addNode(int value){
		if(data > value){
			if(left == null){
				left = new BinarySearchTre(value);
			}else{
				left.addNode(value);
			}
		}else {
			if(right == null){
				right = new BinarySearchTre(value);
			}else{
				right.addNode(value);
			}
		}
	}
	
	public boolean contains(int value){
		if(data == value){
			return true;
		}
		else if(data > value){
			if(left==null){
				return false;
			}else{
				return left.contains(value);
			}
		}else{
			if(right==null){
				return false;
			}else{
				return right.contains(value);
			}
		}
	}
	
	public void deleteNode(int value){
		if(data > value){
			
		}
	}
	
	/**
	 * Main Method
	 */
	public static void main(String[] args){
		BinarySearchTre tree = new BinarySearchTre(20);
		tree.addNode(10);
		tree.addNode(25);
		tree.addNode(4);
		tree.addNode(5);
		tree.addNode(6);
		//preOrderTraversal(tree);
		System.out.println(tree.contains(40));
		
	}
	public static void preOrderTraversal(BinarySearchTre node){
		if(node==null) return;
		System.out.print(" *"+node.data+"*");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
}
