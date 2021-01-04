
public class Position {
	public boolean[] positionOccupied = new boolean[6]; 
	public boolean boolPosition=false;
	
	public void defaultAssign() {
		for(int i=0;i<6;i++) {
			positionOccupied[i]=false;
		}
	}
	
	
	public void assignPositionToPlayers(String pos,int player) {
		if(pos.equals("N")) {
			if(positionOccupied[0]) {
				System.out.println("Enter another position");
				boolPosition=false;
			}
			else {
				positionOccupied[0]=true;
				assignPieces(pos,player);
				boolPosition=true;
			}
		}
		else if(pos.equals("NE")) {
			if(positionOccupied[1]) {
				System.out.println("Enter another position");
				boolPosition=false;
			}
			else {
				positionOccupied[1]=true;
				assignPieces(pos,player);
				boolPosition=true;
			}
		}
		else if(pos.equals("SE")) {
			if(positionOccupied[2]) {
				System.out.println("Enter another position");
				boolPosition=false;
			}
			else {
				positionOccupied[2]=true;
				assignPieces(pos,player);
				boolPosition=true;
			}
		}
		else if(pos.equals("S")) {
			if(positionOccupied[3]) {
				System.out.println("Enter another position");
				boolPosition=false;
			}
			else {
				positionOccupied[3]=true;
				assignPieces(pos,player);
				boolPosition=true;
			}
		}
		else if(pos.equals("SW")) {
			if(positionOccupied[4]) {
				System.out.println("Enter another position");
				boolPosition=false;
			}
			else {
				positionOccupied[4]=true;
				assignPieces(pos,player);
				boolPosition=true;
			}
		}
		else if(pos.equals("NW")) {
			if(positionOccupied[5]) {
				System.out.println("Enter another position");
				boolPosition=false;
			}
			else {
				positionOccupied[5]=true;
				assignPieces(pos,player);
				boolPosition=true;
			}
		}
		else {
			System.out.println("Enter valid position");
			boolPosition=false;
		}
		
	}
	
	public boolean getBoolPosition() {
		return this.boolPosition;
	}
	
	public void assignPieces(String pos,int player) {
		//System.out.println(pos);
		switch(pos) {
		case "N" : 
			for(int i=0;i<4;i++) {
				for(int j=(12-i);j<(13+i);j++) {
					if(Checkers.board[i][j]!=' ') {
						//System.out.println((char)(player+48));
						Checkers.board[i][j]=(char)(48+player);
					}
				}
			}
			//Checkers.Print(Checkers.board);
			break;
			
		case "NE":
			//System.out.println(pos);
			for(int i=4;i<8;i++) {
				for(int j=(14+i);j<(29-i);j++) {
					if(Checkers.board[i][j]!=' ') {
						Checkers.board[i][j]=(char)(48+player);
					}
				}
			}
			//Checkers.Print(Checkers.board);
			break;
			
		case "NW":
			for(int i=4;i<8;i++) {
				for(int j=(i-4);j<(11-i);j++) {
					if(Checkers.board[i][j]!=' ') {
						Checkers.board[i][j]=(char)(48+player);
					}
				}
			}
			//Checkers.Print(Checkers.board);
			break;
			
		case "SE":
			for(int i=9;i<13;i++) {
				for(int j=(29-i);j<(i+13);j++) {
					if(Checkers.board[i][j]!=' ') {
						Checkers.board[i][j]=(char)(48+player);
					}
				}
			}
			//Checkers.Print(Checkers.board);
			break;
			
		case "SW":
			for(int i=9;i<13;i++) {
				for(int j=(12-i);j<(i-5);j++) {
					if(Checkers.board[i][j]!=' ') {
						Checkers.board[i][j]=(char)(48+player);
					}
				}
			}
			//Checkers.Print(Checkers.board);
			break;
			
		case "S":
			for(int i=13;i<17;i++) {
				for(int j=(i-4);j<(29-i);j++) {
					if(Checkers.board[i][j]!=' ') {
						Checkers.board[i][j]=(char)(48+player);
					}
				}
			}
			//Checkers.Print(Checkers.board);
			break;
		}
	}
	
}
