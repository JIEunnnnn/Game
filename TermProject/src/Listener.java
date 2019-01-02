import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Listener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton)e.getSource();
		button.setText("ют╥б");
	}

}
