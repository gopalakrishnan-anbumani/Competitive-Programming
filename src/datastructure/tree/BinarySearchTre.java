package datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

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
	
	
	//=====================================================
	// DELETE
	//=====================================================
	
	public void deleteNode(int value){
		deleteNode(this,value);
	}
	private BinarySearchTre deleteNode(BinarySearchTre node, int value){
		if(node == null){
			System.out.println("Node is Empty");
			return null;
		}
		
		if(node.data > value){
			node.left = deleteNode(node.left, value);
		}else if(node.data < value){
			node.right = deleteNode(node.right, value);
		}else{
			
			if(node.left == null) return node.right;
			else if(node.right == null) return node.left;
			else{
				node.data = retrieveFromRightMost(node.left);
				node.left = deleteNode(node.left, node.data);
			}
		}
	return node;
	}
	private int retrieveFromRightMost(BinarySearchTre node){
		
		while(node.right!=null){
			node = node.right;
		}
		
		return node.data;
	}

	
	/**
	 * Main Method
	 */
	public static void main(String[] args){
		BinarySearchTre tree = new BinarySearchTre(20);
		tree.addNode(10);
		tree.addNode(25);
		tree.addNode(11);
		tree.addNode(9);
		tree.addNode(30);
		tree.addNode(22);
		tree.addNode(50);
		tree.addNode(6);
//		tree.addNode(1);
		//preOrderTraversal(tree);
		//System.out.println(tree.contains(40));
		//tree.deleteNode(215);
		System.out.println();
		//preOrderTraversal(tree);
		levelOrderSearch(tree);
		
	}
	public static void preOrderTraversal(BinarySearchTre node){
		if(node==null) return;
		System.out.print(" *"+node.data+"*");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	//=========================================
	// LEVEL ORDER SEARCH - BST
	//=========================================
	public static void levelOrderSearch(BinarySearchTre tree){
		Queue<BinarySearchTre> queue = new LinkedList<>();
		queue.add(tree);
		while(!queue.isEmpty()){
			BinarySearchTre node = queue.remove();
			System.out.print(node.data+" ");
			if(node.left !=null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
		}
	}
}
