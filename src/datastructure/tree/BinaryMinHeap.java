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
	
	//==================================
	// AddNode in Min Heap Tree
	//==================================
	public void addNode(int data){
		if(currentNode == capacity){
			System.out.println("Over Flow");
			return;
		}
		currentNode++;
		array[currentNode] = data;
		shiftUp();
	}
	
	//======================================
	// Shift Up Operation if violotes the Heapify
	//======================================
	public void shiftUp(){
		int newElement = currentNode;
		int parent = newElement/2;
		while(parent>0){
			
			if(array[newElement] <= array[parent]){
				int temp = array[newElement];
				array[newElement] = array[parent];
				array[parent] = temp;
			}
			
			newElement = parent;
			parent = newElement/2;
		}
	}
	//==========================================
	//Shift Down
	//==========================================
	/**
	 * Method to Maintain Heapify after Delete Root
	 */
	public void shiftDown(){
		int point = 1;
		int left = (2*point);
		int right = (2*point)+1;
		while(left<=currentNode || right <= currentNode){
			if(right > currentNode){
				if(array[point] > array[left]){
					int temp = array[left];
					array[left] = array[point];
					array[point] = temp;
				}
				System.out.println("break1");
				break;
			}else{
				if(array[point] > array[left]){
					if(array[left] <= array[right]){
						int temp = array[left];
						array[left] = array[point];
						array[point] = temp;
						point = left;
					}else{
						int temp = array[right];
						array[right] = array[point];
						array[point] = temp;
						point = right;
					}
				}else{
					System.out.println("break2");
					break;
				}
				left = (2*point);
				right = (2*point)+1;
			}
		}
		
	}
	
	public void printArr(int[] arr){
		for(int a : arr)
			System.out.print(" "+a);
	}
	public static void main(String[] args) {
		BinaryMinHeap binaryMinHeap = new BinaryMinHeap(10);
		binaryMinHeap.addNode(5);
		binaryMinHeap.addNode(9);
		binaryMinHeap.addNode(3);
		binaryMinHeap.addNode(4);
		binaryMinHeap.addNode(6);
		binaryMinHeap.addNode(2);
		binaryMinHeap.addNode(7);
		binaryMinHeap.addNode(1);
		binaryMinHeap.addNode(8);
		binaryMinHeap.addNode(5);
		
		binaryMinHeap.printArr(binaryMinHeap.array);
		
		binaryMinHeap.array[1] = 10;
		System.out.println();
		binaryMinHeap.printArr(binaryMinHeap.array);
		
		binaryMinHeap.shiftDown();
		System.out.println();
		binaryMinHeap.printArr(binaryMinHeap.array);
	}
}


