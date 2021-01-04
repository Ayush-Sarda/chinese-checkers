
public class Movement {
	
	static boolean click1;
	static boolean click2;
	static char val1;
	static char val2;
	static int val1_i,val1_j,val2_i,val2_j;
	static boolean correctMove,jump;
	
	
	
	public static void fromVal1() {
		if(click1) {
			val1=ValueAtMouseClick.val;
			val1_i=ValueAtMouseClick.i;
			val1_j=ValueAtMouseClick.j;
			//click1=true;
		}
	}
	
	public static void toVal2() {
		if(click1 && click2) {
			val2=ValueAtMouseClick.val;
			val2_i=ValueAtMouseClick.i;
			val2_j=ValueAtMouseClick.j;
		}
	}
	
	public static void checkMove(char player) {
		//System.out.println(click1+" "+click2);
		//System.out.println("values "+val1+" "+val2);
		if(click1 && click2) {
			correctMove=false;
			jump=false;
			if(val1==player) {
				if(val2=='*') {
					if((val2_i-val1_i)==0) {
						if((val2_j-val1_j)==4) {
							if(Checkers.board[val1_i][val1_j+2]!='*' && Checkers.board[val1_i][val1_j+2]!=' ') {
								correctMove=true;
								jump=true;
							}
						}
						else if((val2_j-val1_j)==-4) {
							if(Checkers.board[val1_i][val2_j+2]!='*' && Checkers.board[val1_i][val2_j+2]!=' ') {
								correctMove=true;
								jump=true;
							}
						}
						else if((val2_j-val1_j)==-2 || (val2_j-val1_j)==-2) {
							correctMove=true;
						}
					}
					
					else if(-1==(val2_i-val1_i) || (val2_i-val1_i)==1) {
						if(-1==(val2_j-val1_j) || (val2_j-val1_j)==1) {
							correctMove=true;
						}
					}
					
					else if(-2==(val2_i-val1_i) && -2==(val2_j-val1_j) && Checkers.board[val2_i+1][val2_j+1]!='*' && Checkers.board[val2_i+1][val2_j+1]!=' ') {
						correctMove=true;
						jump=true;
					}
					
					else if(-2==(val2_i-val1_i) && 2==(val2_j-val1_j) && Checkers.board[val2_i+1][val1_j+1]!='*' && Checkers.board[val2_i+1][val1_j+1]!=' ') {
						correctMove=true;
						jump=true;
					}
					
					else if(2==(val2_i-val1_i) && 2==(val2_j-val1_j) && Checkers.board[val1_i+1][val1_j+1]!='*' && Checkers.board[val1_i+1][val1_j+1]!=' ') {
						correctMove=true;
						jump=true;
					}
					else if(2==(val2_i-val1_i) && -2==(val2_j-val1_j) && Checkers.board[val1_i+1][val2_j+1]!='*' && Checkers.board[val1_i+1][val2_j+1]!=' ') {
						correctMove=true;
						jump=true;
					}
				}
			}
			//System.out.println("correct move "+correctMove);
			if(correctMove) {
				Move(player);
				if(!jump) {
					PlayerTurn.turn++;//player should not change piece, still a bug here
					System.out.println("Player "+ PlayerTurn.player+" turn");
				}
				
			}
			click2=false;
			click1=false;
			
			
			//return correctMove;
		}
	}
	
	
	public static void jumpMove(char player) {
		
		jump=false;
		if(val1==player) {
			if(val2=='*') {
				if((val2_i-val1_i)==0) {
					if((val2_j-val1_j)==4) {
						if(Checkers.board[val1_i][val1_j+2]!='*' && Checkers.board[val1_i][val1_j+2]!=' ') {
							correctMove=true;
							jump=true;
						}
					}
					else if((val2_j-val1_j)==-4) {
						if(Checkers.board[val1_i][val2_j+2]!='*' && Checkers.board[val1_i][val2_j+2]!=' ') {
							correctMove=true;
							jump=true;
						}
					}
				}
				else if(-2==(val2_i-val1_i) && -2==(val2_j-val1_j) && Checkers.board[val2_i+1][val2_j+1]!='*' && Checkers.board[val2_i+1][val2_j+1]!=' ') {
					correctMove=true;
					jump=true;
				}
				
				else if(-2==(val2_i-val1_i) && 2==(val2_j-val1_j) && Checkers.board[val2_i+1][val1_j+1]!='*' && Checkers.board[val2_i+1][val1_j+1]!=' ') {
					correctMove=true;
					jump=true;
				}
				
				else if(2==(val2_i-val1_i) && 2==(val2_j-val1_j) && Checkers.board[val1_i+1][val1_j+1]!='*' && Checkers.board[val1_i+1][val1_j+1]!=' ') {
					correctMove=true;
					jump=true;
				}
				else if(2==(val2_i-val1_i) && -2==(val2_j-val1_j) && Checkers.board[val1_i+1][val2_j+1]!='*' && Checkers.board[val1_i+1][val2_j+1]!=' ') {
					correctMove=true;
					jump=true;
				}
			}
		}
		if(jump) {
			Move(player);
			
		}
		else {
			PlayerTurn.turn++;
			//System.out.println("Player "+ PlayerTurn.player+" turn");
			
		}
		click1=false;
		click2=false;
	}
	
	
	public static void Move(char player) {
		
		Checkers.board[val1_i][val1_j]=val2;
		Checkers.board[val2_i][val2_j]=val1;
		
		
		
		
		
	}
	
}
