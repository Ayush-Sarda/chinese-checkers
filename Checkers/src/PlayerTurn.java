
public class PlayerTurn {
	static int turn=0;
	public static char player;
	/*PlayerTurn(){
		turn++;
	}*/
	
	static char getPlayer() {
		player = (char)(48+turn%Checkers.playersCount);
		
		//System.out.println("turn "+turn);
		//System.out.println("player "+player);
		return player;
	}

}
