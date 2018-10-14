package code.java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllHackerRankQues {

	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
		if(game[1]==1 && game[leap] == 1){
			return false;
		}
		game[0]=1;
		if(game[1]==0){
			if (game[leap]==0){
				return (recur(1, leap, game) || recur(leap, leap, game));
			}else{
				return (recur(1, leap, game));
			}
		}else if(game[leap]==0){
			return (recur(leap, leap, game));
		}
		return false;
    }
	
	public static boolean recur(int pos,int leap,int[] game){
		if(pos >= game.length || pos == game.length-1 || pos+leap >= game.length){
			return true;
		}
		game[pos]=1;
		if(pos >= 0){
			if(game[pos] == 0){
				if(game[pos+1] == 0 && game[pos+leap] == 0){
					return (recur(pos+1, leap, game) || recur(pos+leap, leap, game));
				}else if(game[pos+1] == 0){
					return (recur(pos+1, leap, game));
				}else if(game[pos+leap] == 0){
					return (recur(pos+leap, leap, game));
				}else {
					return false;
				}
			}else {
				if(game[pos-1] == 0){
					if(game[pos+1]==0){
						if(game[pos+leap]==0){
							if(pos-1!=0){
								return (recur(pos-1, leap, game) || recur(pos+1, leap, game) || recur(pos+leap, leap, game));	
							}else{
								return (recur(pos+1, leap, game) || recur(pos+leap, leap, game));
							}
							
						}else{
							if(pos-1!=0){
								return (recur(pos-1, leap, game) || recur(pos+1, leap, game));	
							}else{
								return recur(pos+1, leap, game);
							}
							
						}
					}else {
						if(pos-1!=0){
							return (recur(pos-1, leap, game));	
						}
						
					}
				}else{
					if(game[pos+1]==0){
						if(game[pos+leap]==0){
							return (recur(pos+1, leap, game) || recur(pos+leap, leap, game));
						}else{
							return (recur(pos+1, leap, game));
						}
					}else {
						if(game[pos+leap]==0){
							return (recur(pos+leap, leap, game));
						}else{
							return false;
						}
					}
				}
			}
		}
		return false;
	}

	
	private static void findMinimumPathSum(){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> row1 = new ArrayList<Integer>(Arrays.asList(2));
		List<Integer> row2 = new ArrayList<Integer>(Arrays.asList(3,4));
		List<Integer> row3 = new ArrayList<Integer>(Arrays.asList(5,6,7));
		List<Integer> row4 = new ArrayList<Integer>(Arrays.asList(4,2,8,1));
		list.add(row1); list.add(row2); list.add(row3); list.add(row4);
		printListOfListIntegers(list);
		MaxPath(list);
		
	}
	
	public static int MaxPath(List<List<Integer>> list){
		
		if(list==null || list.size() == 0){
			return 0;
		}
		if(list.size()==1){
			int max = list.get(0).get(0);
			for(int a : list.get(0)){
				if(max<a){
					max=a;
				}
			}
			return max;
		}
		
		for(int currentRow=1;currentRow<list.size();currentRow++){
			int lastIndex = list.get(currentRow).size();
			for(int index = 0; index<lastIndex; index++){
				int index1 = (index-1 >= 0) ? index-1 : 0;    
				int index2 = index >= list.get(currentRow-1).size() ? index-1 : index;
				int index1Num = list.get(currentRow-1).get(index1);
				int index2Num = list.get(currentRow-1).get(index2);
				int currentIndexNum = list.get(currentRow).get(index);
				int maxNum = (currentIndexNum+index1Num) < (currentIndexNum+index2Num) ? currentIndexNum+index1Num : currentIndexNum+index2Num;
				list.get(currentRow).set(index, maxNum);
			}
		}
		
		printListOfListIntegers(list);
			
		
		return 0;
	}

	/**
	 * Print List of List Integers
	 *
	 * @param list
	 */
	private static void printListOfListIntegers(List<List<Integer>> list) {
		for(List<Integer> l : list){
			for(int a : l){
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//            
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
//        }
//        scan.close();
    	
    	findMinimumPathSum();
    }

}
