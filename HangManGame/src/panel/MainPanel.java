package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import color.MyColor;
import frame.MainFrame;

public class MainPanel extends JPanel {

	ImageIcon panel_icon = new ImageIcon("HangMan/ui/background/start_background.png");
	Image panel_image = panel_icon.getImage();

	// 버튼
	JButton startBtn = new JButton(new ImageIcon("HangMan/ui/button/start_button.png"));
	
	public MainPanel() {
		
		startBtn.setContentAreaFilled(false);
		startBtn.setBorderPainted(false);
		startBtn.setBounds(695, 540, 530, 229);
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.card.show(getParent(), "stage");
			}
		});
		
		add(startBtn);
		setSize(1920, 1080);
		setLayout(null);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(panel_image, 0, 0, this);
	};
}
