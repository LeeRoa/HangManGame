package button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import dialog.LoseDialog;
import dialog.WinDialog;
import label.TextPanel;
import panel.StagePanel;

public class WordSelectButton extends JButton {

	private LineBorder border = new LineBorder(Color.BLACK, 5);

	public static int life = 10;;

	public WordSelectButton(String word, JFrame parent, List<WordSelectButton> btns) {
		setBorder(border);
		setFont(new Font("Noto Sans KR Medium", Font.PLAIN, 80));
		setText(word);
		setBackground(Color.white);
		setSize(100, 100);
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (StagePanel.hit.contains(word)) {
					StagePanel.score += 15;
					StagePanel.scoreLabel.setText(StagePanel.score.toString());
					setVisible(false);

					Matcher matcher = Pattern.compile(word).matcher(StagePanel.hit);

					int index;
					while (matcher.find()) {
						index = matcher.start();
						TextPanel.hitWords.get(index).setText(word);
					}

					int count = 0;
					for (JLabel wordLabel : TextPanel.hitWords) {
						if (!wordLabel.getText().equals("")) {
							++count;
						}
					}
					System.out.println("hitCount: " + count);
					System.out.println(TextPanel.hitWords.size());
					if (count == TextPanel.hitWords.size()) {
						for (WordSelectButton btn : btns) {
							btn.setVisible(false);
						}
						
						SwingUtilities.invokeLater(() -> {
							// 1초 뒤에 JDialog를 띄우기 위한 Timer 생성
							Timer timer = new Timer(2000, e1 -> {
								JDialog winDialog = new WinDialog(parent);
							});
							// Timer 시작
							timer.setRepeats(false); // 한 번만 실행되도록 설정
							timer.start();
						});
						
					}
				} else {
					setVisible(false);
					--life;
					System.out.println("life: " + life);

					if (life == 9) {
						StagePanel.head.setVisible(true);
					} else if (life == 8) {
						StagePanel.body.setVisible(true);
					} else if (life == 7) {
						StagePanel.leftArm.setVisible(true);
					} else if (life == 6) {
						StagePanel.rightArm.setVisible(true);
					} else if (life == 5) {
						StagePanel.leftLeg.setVisible(true);
					} else if (life == 4) {
						StagePanel.rightLeg.setVisible(true);
					} else if (life == 3) {
						StagePanel.leftHand.setVisible(true);
					} else if (life == 2) {
						StagePanel.rightHand.setVisible(true);
					} else if (life == 1) {
						StagePanel.leftFoot.setVisible(true);
					} else {
						StagePanel.rightFoot.setVisible(true);
						StagePanel.head.setVisible(false);
						StagePanel.deadFace.setVisible(true);
						
						for (WordSelectButton btn : btns) {
							btn.setVisible(false);
						}
						
						SwingUtilities.invokeLater(() -> {
							// 1초 뒤에 JDialog를 띄우기 위한 Timer 생성
							Timer timer = new Timer(2000, e1 -> {
								JDialog loseDialog = new LoseDialog(parent);
							});
							// Timer 시작
							timer.setRepeats(false); // 한 번만 실행되도록 설정
							timer.start();
						});
					}
				}
			}
		});
	}
}
