package label;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HangManLabel extends JLabel {
	
	
	public HangManLabel(String url, int x, int y, int width, int height) {
		
		setIcon(new ImageIcon(url));
		setBounds(x, y, width, height);
	}
}
