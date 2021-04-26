import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project3.characters.character;
public class battleFrame extends JPanel{
	private int players;
	private JLabel player1;
	private JLabel player2;
	private JTextField health1;
	private JTextField health2;
	private JButton carButton;
	
	public int currentLoser = 0;
	public battleFrame(ArrayList<character> Arena) {
		players = 2;
		player1 = new JLabel(Arena.get(1).name);
		player2 = new JLabel(Arena.get(0).name);
		player1.setForeground(Color.white);
		player2.setForeground(Color.white);
		health1 = new JTextField(Arena.get(1).getHealth());
		health2 = new JTextField(Arena.get(0).getHealth());
		
		
//		add(player1);
//		add(health1);
//		add(player2);
//		add(health2);
		
		setBackground(Color.DARK_GRAY);
		setPreferredSize(new Dimension(300,200));
		
		health1.setText(Integer.toString(Arena.get(0).getHealth()));
		health2.setText(Integer.toString(Arena.get(0).getHealth()));
		
	}
	public void displayfight(ArrayList<character> Arena, int one, int two) {
		JLabel fight = new JLabel(Arena.get(one).name + " vs " + Arena.get(two).name);
		fight.setForeground(Color.white);
		add(fight);
	}
	public void addLoser(ArrayList<character> Arena) {
		
		add(new JLabel(" Loser number " + (currentLoser + 1) + ":" + Arena.get(currentLoser).name));
		currentLoser++;
	}
	
	public void displayWinner(ArrayList<character> Arena) {
		JLabel Winner = new JLabel("WINNER: " + Arena.get(0).name);
		Winner.setForeground(Color.yellow);
		add(Winner);
	}
//	private class ButtonListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent event) {
//			// TODO Auto-generated method stub
//			carCount += 1;
//			carTextField.setText(Integer.toString(carCount));
//		}
//		
//	}
}
