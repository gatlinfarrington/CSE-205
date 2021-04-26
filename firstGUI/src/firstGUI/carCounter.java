
package firstGUI;
import javax.swing.JFrame;
public class carCounter {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Car Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		carCounterPanel panel = new carCounterPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
