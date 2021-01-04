
public class ValueAtMouseClick {
	static int i,j;
	
	static char val;
	static int x,y;
	static boolean refresh;
	
	public static char calculateVal() {
		i=-1;
		j=-1;
		refresh=false;
		while(i<=-1 || i>=17) {
			y=MouseXY.y;
			y-=79;
			if (y>432 && y<-12)
				return '0';
			i=(y/25);
			/*if(y%25>7)
				i++;*/
		}
		while(j<=-1 || j>=26) {
			x=MouseXY.x;
			x-=91;
			if(x>382 && x<-8)
				return '0';
			j=(x/15);
			//if(x%15>7)
				//j++;
		}
		
		//System.out.println("i and j "+i+" "+j);
		refresh=true;
		val=Checkers.board[i][j];
		return val;
	}
	
	public static char getVal() {
		val=calculateVal();
		if(Movement.click1) {
			Movement.click2=true;
			Movement.toVal2();
			if(!Movement.jump)
				Movement.checkMove(PlayerTurn.getPlayer());
			else
				Movement.jumpMove(PlayerTurn.getPlayer());
		}
		else {
			Movement.click1=true;
			Movement.fromVal1();
		}
		
		return val;
	}
}
