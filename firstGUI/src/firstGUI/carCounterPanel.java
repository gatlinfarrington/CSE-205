package firstGUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class carCounterPanel extends JPanel{
	private int carCount;
	private JLabel carLabel;
	private JTextField carTextField;
	private JButton carButton;
	
	public carCounterPanel() {
		carCount = 0;
		carLabel = new JLabel("Number of cars: ");
		carTextField = new JTextField(10);
		carButton = new JButton("Press Here!");
		
		carButton.addActionListener(new ButtonListener());
		
		add(carLabel);
		add(carTextField);
		add(carButton);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300,200));
		carTextField.setText(Integer.toString(0));
	}
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			carCount += 1;
			carTextField.setText(Integer.toString(carCount));
		}
		
	}
}
