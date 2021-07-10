package library.String;
import javax.swing.*;

public class ValueOfNSwingJFrame extends JFrame{
	JTextField tf = new JTextField();
	public ValueOfNSwingJFrame() {
		add("North",tf);
		tf.setText(String.valueOf(100));
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ValueOfNSwingJFrame();
	}
}
