package code.java.hackerrank;

import java.util.Scanner;

public class AllHackerRankQues {

	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
		if(game[1]==1 && game[leap] == 1){
			return false;
		}
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
		if(pos >= 0){
			if(pos == 0){
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
							return (recur(pos-1, leap, game) || recur(pos+1, leap, game) || recur(pos+leap, leap, game));
						}else{
							return (recur(pos-1, leap, game) || recur(pos+1, leap, game));
						}
					}else {
						return (recur(pos-1, leap, game));
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
		}else {
			return false;
		}
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
