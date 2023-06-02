package label;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextPanel extends JPanel {

	ImageIcon panel_icon;
	Image panel_image;

	public static List<JLabel> hitWords = new ArrayList<>();

	public TextPanel(int len) {

		String url = "";
		if (len == 4) {
			url = "HangMan/ui/label/word_4.png";
		} else if (len == 5) {
			url = "HangMan/ui/label/word_5.png";
		} else if (len == 6) {
			url = "HangMan/ui/label/word_6.png";
		} else {
			url = "HangMan/ui/label/word_7.png";
		}
		
		// 정답 길이에 따라 미리 라벨 리스트를 생성
		for (int i = 0; i < len; ++i) {
			JLabel word = new JLabel();
			
			word.setForeground(Color.BLACK);
			word.setFont(new Font("Noto sans KR medium", Font.PLAIN, 80));
			word.setSize(90, 85);
			hitWords.add(word);
		}
		if (len == 4) {
			hitWords.get(0).setLocation(279, 9);
			hitWords.get(1).setLocation(370, 9);
			hitWords.get(2).setLocation(461, 9);
			hitWords.get(3).setLocation(552, 9);
		} else if (len == 5) {
			hitWords.get(0).setLocation(231, 9);
			hitWords.get(1).setLocation(323, 9);
			hitWords.get(2).setLocation(415, 9);
			hitWords.get(3).setLocation(507, 9);
			hitWords.get(4).setLocation(599, 9);
		} else if (len == 6) {
			hitWords.get(0).setLocation(196, 9);
			hitWords.get(1).setLocation(287, 9);
			hitWords.get(2).setLocation(379, 9);
			hitWords.get(3).setLocation(471, 9);
			hitWords.get(4).setLocation(563, 9);
			hitWords.get(5).setLocation(654, 9);
		} else {
			hitWords.get(0).setLocation(140, 9);
			hitWords.get(1).setLocation(231, 9);
			hitWords.get(2).setLocation(322, 9);
			hitWords.get(3).setLocation(413, 9);
			hitWords.get(4).setLocation(504, 9);
			hitWords.get(5).setLocation(595, 9);
			hitWords.get(6).setLocation(686, 9);
		}
		

		panel_icon = new ImageIcon(url);
		panel_image = panel_icon.getImage();
		
		for (JLabel word : hitWords) {
			add(word);
		}
		
		setBounds(570, 950, 780, 120);
		setLayout(null);
	}

	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.drawImage(panel_image, 0, 0, this);
	}
}
