import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Start extends JFrame {
	JFrame f;
	JButton button6,button2,button3,button4,button5;
	static int playersCount;
	Players[] players;
	Position position;
	Start(){
		f=new JFrame("Number of players");
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);
		position=new Position();
		button2 = new JButton("2 Players");
		button3 = new JButton("3 Players");
		button4 = new JButton("4 Players");
		button5 = new JButton("5 Players");
		button6 = new JButton("6 Players");
		
		MouseListener m = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==button2) {
					playersCount=2;
					f.dispose();
					Checkers.playersCount=2;
					players_2();
				}
				else if(e.getSource()==button3) {
					playersCount=3;
					f.dispose();
					Checkers.playersCount=3;
					players_3();
				}
				else if(e.getSource()==button4) {
					playersCount=4;
					f.dispose();
					Checkers.playersCount=4;
					players_4();
				}
				else if(e.getSource()==button5) {
					playersCount=5;
					f.dispose();
					Checkers.playersCount=5;
					players_5();
				}
				else if(e.getSource()==button6) {
					playersCount=6;
					f.dispose();
					Checkers.playersCount=6;
					players_6();
				}
				new MouseXY();
				
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
		button2.addMouseListener(m);
		button3.addMouseListener(m);
		button4.addMouseListener(m);
		button5.addMouseListener(m);
		button6.addMouseListener(m);
		
		f.setSize(400,400);
		panel.setBackground(Color.GRAY);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		f.add(panel);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	void players_2() {
		players = new Players[playersCount];
		for(int i=0;i<playersCount;i++) {
			players[i] = new Players();
			System.out.println("Player " + i + " " + players[i].piece );
		}
		int i =0;
		position.assignPieces("N", i);
		i++;
		position.assignPieces("S", i);
		Checkers.Print(Checkers.board);
		
;	}
	
	void players_3() {
		players = new Players[playersCount];
		for(int i=0;i<playersCount;i++) {
			players[i] = new Players();
			System.out.println("Player " + i + " " + players[i].piece );
		}
		int i =0;
		position.assignPieces("N", i);
		i++;
		position.assignPieces("NE", i);
		i++;
		position.assignPieces("S", i);
		Checkers.Print(Checkers.board);
	}
	
	void players_4() {
		players = new Players[playersCount];
		for(int i=0;i<playersCount;i++) {
			players[i] = new Players();
			System.out.println("Player " + i + " " + players[i].piece );
		}
		int i =0;
		position.assignPieces("N", i);
		i++;
		position.assignPieces("NE", i);
		i++;
		position.assignPieces("S", i);
		i++;
		position.assignPieces("SW", i);
		Checkers.Print(Checkers.board);
	}
	
	void players_5() {
		players = new Players[playersCount];
		for(int i=0;i<playersCount;i++) {
			players[i] = new Players();
			System.out.println("Player " + i + " " + players[i].piece );
		}
		int i =0;
		position.assignPieces("N", i);
		i++;
		position.assignPieces("NE", i);
		i++;
		position.assignPieces("SE", i);
		i++;
		position.assignPieces("S", i);
		i++;
		position.assignPieces("SW", i);
		Checkers.Print(Checkers.board);
	}
	
	void players_6() {
		players = new Players[playersCount];
		for(int i=0;i<playersCount;i++) {
			players[i] = new Players();
			System.out.println("Player " + i + " " + players[i].piece );
		}
		int i =0;
		position.assignPieces("N", i);
		i++;
		position.assignPieces("NE", i);
		i++;
		position.assignPieces("SE", i);
		i++;
		position.assignPieces("S", i);
		i++;
		position.assignPieces("SW", i);
		i++;
		position.assignPieces("NW", i);
		Checkers.Print(Checkers.board);
	}
}
