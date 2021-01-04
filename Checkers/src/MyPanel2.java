import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel2 extends JPanel {
	char[] data = new char[1];
	Color c;
	
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<Checkers.board.length;i++) {
	    	for(int j=0;j<Checkers.board[i].length;j++) {
	    		data[0]=Checkers.board[i][j];
	    		switch(data[0]) {
	    		case '0':
	    			data[0]='*';
	    			c=Color.red;
	    			g.setColor(c);
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;
	    			
	    		case '1':
	    			data[0]='*';
	    			c=Color.yellow;
	    			g.setColor(c);
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;	
	    			
	    		case '2':
	    			data[0]='*';
	    			c=Color.gray;
	    			g.setColor(new Color(204,132,0));
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;
	    			
	    		case '3':
	    			data[0]='*';
	    			c=Color.blue;
	    			g.setColor(c);
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;
	    			
	    		case '4':
	    			data[0]='*';
	    			c=Color.green;
	    			g.setColor(c);
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;
	    			
	    		case '5':
	    			data[0]='*';
	    			c=Color.cyan;
	    			g.setColor(c);
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;
	    		
	    		case '*':
	    			data[0]=0;
	    			//c=Color.white;
	    			g.setColor(new Color(193,173,158));
	    			g.fillOval(91+15*j, 79+25*i, 16, 16);
	    			break;
	    			
	    		case ' ':
	    			//data[0]='*';
	    			//c=Color.orange;
	    			g.setColor(c);
	    			break;
	    			
	    			
	    		}
	    		//g.setColor(Color.black);
	    		//g.drawLine(90+15*j, 0, 90+15*j, 600);
	           // g.drawChars(data, 0, data.length, 90+15*j,100+25*i);
	    		
	            //g.drawString(x + "," + y,  x+10, y -10);
	    	}
	    	//g.setColor(Color.black);
	    	//g.drawLine(0, 78+25*i, 600, 78+25*i);
	    }
	}
}
