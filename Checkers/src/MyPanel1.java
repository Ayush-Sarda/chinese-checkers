import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel1 extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
	  g.setColor(new Color(106,75,53));
	  g.fillRect(0,0, 600,600);
	  g.setColor(new Color(193,173,158));
	  //g.fillOval(267, 75, 25, 25);
	  //g.fillOval(252, 100, 25, 25);
	  for(int i=0;i<Checkers.board.length;i++) {
	    	for(int j=0;j<Checkers.board[i].length;j++) {
	    		if(Checkers.board[i][j]=='*' || (Checkers.board[i][j]>=48 && Checkers.board[i][j]<=53 )) {
	    			g.fillOval(87+15*j, 75+25*i, 24, 24);
	    			
	    		}
	    	}
	    	
	  }
	}
}
