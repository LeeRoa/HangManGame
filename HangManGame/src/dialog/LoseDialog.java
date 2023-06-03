package dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import button.WordSelectButton;
import color.MyColor;
import frame.MainFrame;
import label.TextPanel;
import panel.StagePanel;

public class LoseDialog extends JDialog {
	
	JLabel gameOverLabel = new JLabel(new ImageIcon("ui/label/game_over.png"));
	JPanel clearPanel = new JPanel();
	JButton playAgainBtn = new JButton(new ImageIcon("ui/button/play_again_button.png"));
	
	public LoseDialog(JFrame parent) {
		
		gameOverLabel.setBounds(285, 100, 1350, 415);
		playAgainBtn.setContentAreaFilled(false);
		playAgainBtn.setBorderPainted(false);
		playAgainBtn.setBounds(695, 540, 530, 229);
		playAgainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				parent.dispose();
				for (JLabel word : TextPanel.hitWords) {
					word.setText("");
				}
				TextPanel.hitWords.clear();
				WordSelectButton.life = 10;
				StagePanel.score = 0;
				StagePanel.scoreLabel.setText(StagePanel.score.toString());
				new MainFrame();
			}
		});
		
		clearPanel.add(playAgainBtn);
		clearPanel.add(gameOverLabel);
		clearPanel.setLayout(null);
		clearPanel.setBackground(MyColor.CLEAR);
		clearPanel.setSize(1920, 1080);
		
		add(clearPanel);
		setModal(true); // 팝업창 이외에 다른 버튼들은 누를 수 없음
		setLayout(null);
		setUndecorated(true); // 팝업창 위 닫기버튼들을 다 없앰
		setBackground(MyColor.CLEAR);
		setResizable(false); // 사용자가 팝업창 크기를 조정하는것을 해제
		setSize(1920, 1080);
		setVisible(true);
	}
}
