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

public class WinDialog extends JDialog {
	
	JLabel youWinLabel = new JLabel(new ImageIcon("ui/label/you_win.png"));
	JLabel party = new JLabel(new ImageIcon("ui/label/party.gif"));
	
	JPanel clearPanel = new JPanel();
	JButton playAgainBtn = new JButton(new ImageIcon("ui/button/play_again_button.png"));
	
	
	public WinDialog(JFrame parent) {
		party.setBounds(0, 0, 1920, 1080);
		youWinLabel.setBounds(395, 100, 1137, 415);
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
				new MainFrame();
			}
		});
		
		clearPanel.add(party);
		
		clearPanel.add(playAgainBtn);
		clearPanel.add(youWinLabel);
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
