package datastructure.tree;

public class BinaryMinHeap {
	
	int currentNode;
	int capacity;
	int[] array;
	
	
	public BinaryMinHeap(){}
	
	public BinaryMinHeap(int capacity){
		currentNode = 0;
		this.capacity = capacity;
		array = new int[capacity+1];
	}
	
	public void addNode(int data){
		if(currentNode == capacity){
			System.out.println("Over Flow");
			return;
		}
		currentNode++;
		array[currentNode] = data;
		
	}
	
}


