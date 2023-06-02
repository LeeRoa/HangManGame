package frame;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panel.MainPanel;
import panel.StagePanel;

public class MainFrame extends JFrame {
	
	public static CardLayout card = new CardLayout();
	
	// 패널
	JPanel parentPanel = new JPanel(card);
	JPanel mainPanel = new MainPanel();
	JPanel stagePanel = new StagePanel(this);
	
	public MainFrame() {
		// 부모패널 설정
		parentPanel.setSize(1920, 1080);
		
		parentPanel.add(mainPanel, "main");
		parentPanel.add(stagePanel, "stage");
		
		add(parentPanel);
		setSize(1920, 1080);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
