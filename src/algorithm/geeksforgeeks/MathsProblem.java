package algorithm.geeksforgeeks;

import java.util.Scanner;

public class MathsProblem {

	public static void main(String[] args) {
		
	}

	
	/**
	 * Your task is to complete the function printPat which takes one argument 'n' 
	 	denoting the length of the pattern and prints the following pattern
		for n=2 the pattern will be 
		2 2 1 1
		2 1
		
	 * https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1
	 * status -> Completed	
	 * @param n	
	 */
	
	static void printPat()
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T>0){
        	int num = scanner.nextInt();
        	StringBuilder builder = new StringBuilder();
        	for(int i=num;i>0;i--){
        		int N = num;
        		int count = 0;
        		while(N>0){
        			if(count == i){
        				count = 0;
        				--N;
        			}else{
        				builder.append(N+" ");
        				count++;
        			}
        		}
        		builder.append("$");
        		
        	}
        	System.out.print(builder.toString());
        	--T;
        }
        
        scanner.close();
    }
	
}
