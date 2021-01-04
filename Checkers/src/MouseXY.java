import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
public class MouseXY extends JFrame
{
  public static int  x, y;
  Color c= Color.BLACK;
  char[] data = new char[1];
  private static boolean Start,refresh;
  JButton button,button2;
  Image img;
  MyPanel1 panel1;
  MyPanel2 panel2;
  JFrame f;
  public MouseXY()
  {
	MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			Movement.click1=false;
			Movement.click2=false;
			if(Movement.jump) {
				Movement.jump=false;
				PlayerTurn.turn++;
			}
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	MouseListener mouseListener2 = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			x = e.getX();
		    y = e.getY();
		    System.out.println("val "+ValueAtMouseClick.getVal());
		    panel2.repaint();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			panel2.repaint();
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	MouseListener mouseListener3 = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			f.dispose();
			String[] args = null;
			Checkers.main(args);		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	};
	button = new JButton("Next");
	button2 = new JButton("Reset");
	button.setVisible(true);
	button.addMouseListener(mouseListener);
	button2.setVisible(true);
	button2.addMouseListener(mouseListener3);
	f = new JFrame();
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	panel1 = new MyPanel1();
	panel2 = new MyPanel2();
	JPanel Main = new JPanel();
	OverlayLayout layout = new OverlayLayout(Main);
	Main.setLayout(layout);
    //addMouseListener(this);
	//addMouseListener(panel1);
	panel2.addMouseListener(mouseListener2);
    panel2.setOpaque(false);
  
    Main.add(panel2);
    Main.add(panel1);
    //f.setLayout(new FlowLayout());
    f.add(Main);
    f.add(button,BorderLayout.SOUTH);
    f.add(button2,BorderLayout.EAST);
    f.setSize(600,600);
    f.setVisible(true);
    
    
  }
  
 }