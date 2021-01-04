import java.util.*;


public class Checkers {
	
	public static int playersCount;
	public static char[][] board = new char[17][26];

	
	
	public static void Board(char[][] A) {
		for(int i=0;i<17;i++){
			while(i>=0 && i<4){
				for(int j=0;j<(12-i);j++){
					A[i][j]=' ';
				}
				for(int j=(12-i);j<(i+13);j++){
					A[i][j]='*';
					j++;
					if(j!=(i+12)){
						A[i][j]=' ';
					}
	            }
				for(int j=(13+i);j<25;j++){
					A[i][j]=' ';

				}
				i++;
			}


			while(i>=4 && i<8){
				for(int j=0;j<(i-4);j++){
					A[i][j]=' ';
				}
				for(int j=(i-4);j<(29-i);j++){
					A[i][j]='*';
					j++;
					if(j!=(28-i)){
						A[i][j]=' ';
					}
	            }
				for(int j=(29-i);j<25;j++){
					A[i][j]=' ';

				}
				i++;
			}

			while(i>=8 && i<13){
				for(int j=0;j<(12-i);j++){
					A[i][j]=' ';
				}
				for(int j=(12-i);j<(13+i);j++){
					A[i][j]='*';
					j++;
					if(j!=(2+i)){
						A[i][j]=' ';
					}
	            }
				for(int j=(13+i);j<25;j++){
					A[i][j]=' ';

				}
				i++;
			}

			while(i>=13 && i<17){
				for(int j=0;j<(i-4);j++){
					A[i][j]=' ';
				}
				for(int j=(i-4);j<(29-i);j++){
					A[i][j]='*';
					j++;
					if(j!=(28-i)){
						A[i][j]=' ';
					}
	            }
				for(int j=(29-i);j<25;j++){
					A[i][j]=' ';

				}
				i++;
			}
		}
	}
	
	public static void Print(char[][] A) {
		for(int i=0;i<17;i++) {
			for(int j=0;j<25;j++) {
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void Layout(char[][] A) {
		Board(A);
		Print(A);
	}

	public static int getPlayersCount() {
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Number of Players- ");  
		playersCount= sc.nextInt();
		return playersCount;
	}
	
	public static String getPosition() {
		String pos;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter position- ");  
		pos= sc.nextLine();
		//System.out.println("position " +pos);
		return pos;
	}
	
	public static int getPlayerNumber() {
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Player Number- ");  
		int playerNumber= sc.nextInt();
		return playerNumber;
	}
	
	public static void main(String[] args) {
		Layout(board);
		new Start();
		
		/*String pos;
		int playerNumber;
		for(int i=0;i<playersCount;i++) {
			position.boolPosition=false;
			while(!position.getBoolPosition()) {
				pos=getPosition();
				playerNumber=getPlayerNumber();
				position.assignPositionToPlayers(pos,playerNumber);
			}
		}*/
		
		
		//MouseXY run = new MouseXY();
		//run.panel2.repaint();
		//Print(board);
		
		
		
		

	}

}
