package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import button.WordSelectButton;
import label.HangManLabel;
import label.TextPanel;

public class StagePanel extends JPanel {
	
	// 단어 리스트
	private static String[] words = {
				    "BOOK",
				    "TREE",
				    "TIME",
				    "MOON",
				    "BABY",
				    "FISH",
				    "BIRD",
				    "HOME",
				    "FIRE",
				    "RAIN",
				    "APPLE",
				    "GRAPE",
				    "LEMON",
				    "MELON",
				    "PEACH",
				    "MANGO",
				    "BERRY",
				    "WALRUS",
				    "CHERRY",
				    "BANANA",
				    "ORANGE",
				    "COFFEE",
				    "PURPLE",
				    "SILVER",
				    "YOGURT",
				    "BUTTON",
				    "TURTLE",
				    "TISSUE",
				    "RABBIT",
				    "SUNSET",
				    "PENCIL",
				    "PUMPKIN",
				    "BANANAS",
				    "MANGOES",
				    "CARROTS",
				    "BICYCLE",
				    "SUNRISE",
				    "SANDALS",
				    "SAILING",
				    "BLUEJAY",
				    "PENGUIN",
				    "FIREFOX",
				    "DOLPHIN",
				    "CRICKET",
				    "AIRPORT",
				    "TRUMPET",
				    "LEOPARD"
		};
	
	// 정답
	public int ranNum;
	public static String hit;
	
	// 스코어
	public static Integer score = 0;
	public static JLabel scoreLabel = new JLabel(score.toString());
	
	// 알파벳 버튼
	List<WordSelectButton> alphabetBtns = new ArrayList<>();

	// 행맨
	public static JLabel head = new HangManLabel("ui/hangMan/head.png", 999, 415, 60, 60);
	public static JLabel body = new HangManLabel("ui/hangMan/body.png", 1024, 475, 10, 140);
	public static JLabel leftArm = new HangManLabel("ui/hangMan/left_armOrLeg.png", 944, 475, 85, 65);
	public static JLabel leftLeg = new HangManLabel("ui/hangMan/left_armOrLeg.png", 945, 606, 85, 65);
	public static JLabel rightArm = new HangManLabel("ui/hangMan/right_armOrLeg.png", 1026, 475, 85, 65);
	public static JLabel rightLeg = new HangManLabel("ui/hangMan/right_armOrLeg.png", 1027, 606, 85, 65);
	public static JLabel leftHand = new HangManLabel("ui/hangMan/left_handOrFoot.png", 914, 524, 44, 44);
	public static JLabel leftFoot = new HangManLabel("ui/hangMan/left_handOrFoot.png", 914, 654, 44, 44);
	public static JLabel rightHand = new HangManLabel("ui/hangMan/right_handOrFoot.png", 1096, 524, 44, 44);
	public static JLabel rightFoot = new HangManLabel("ui/hangMan/right_handOrFoot.png", 1096, 654, 44, 44);
	public static JLabel deadFace = new HangManLabel("ui/hangMan/dead_face.png", 999, 415, 60, 60);
	public static JLabel deathHangMan = new HangManLabel("ui/hangMan/death_hangMan.png", 999, 415, 493, 331);
	
	ImageIcon panel_icon = new ImageIcon("ui/background/stage.png");
	Image panel_image = panel_icon.getImage();
	
	public StagePanel(JFrame parent) {
		
		// 정답 생성
		ranNum = (int)(Math.random() * words.length);
		hit = words[ranNum];
//		System.out.println(hit);

		// 정답 길이에 따라 나타나는 텍스트 필드
		JPanel textPanel = new TextPanel(hit.length());
		
		// 알파벳 버튼 생성
		int charNum = 65;
		for (int i = 0; i < 26; ++i) {
			WordSelectButton alphabetBtn = new WordSelectButton(String.valueOf((char)charNum++),parent, alphabetBtns);
			alphabetBtns.add(alphabetBtn);
		}
		alphabetBtns.get(0).setLocation(20, 40);
		alphabetBtns.get(1).setLocation(155, 40);
		alphabetBtns.get(2).setLocation(290, 40);
		alphabetBtns.get(3).setLocation(425, 40);
		alphabetBtns.get(4).setLocation(560, 40);
		alphabetBtns.get(5).setLocation(695, 40);
		alphabetBtns.get(6).setLocation(830, 40);
		alphabetBtns.get(7).setLocation(965, 40);
		alphabetBtns.get(8).setLocation(1100, 40);
		alphabetBtns.get(9).setLocation(1235, 40);
		alphabetBtns.get(10).setLocation(1370, 40);
		alphabetBtns.get(11).setLocation(1515, 40);
		alphabetBtns.get(12).setLocation(1650, 40);
		alphabetBtns.get(13).setLocation(1785, 40);
		alphabetBtns.get(14).setLocation(85, 180);
		alphabetBtns.get(15).setLocation(220, 180);
		alphabetBtns.get(16).setLocation(355, 180);
		alphabetBtns.get(17).setLocation(500, 180);
		alphabetBtns.get(18).setLocation(635, 180);
		alphabetBtns.get(19).setLocation(770, 180);
		alphabetBtns.get(20).setLocation(905, 180);
		alphabetBtns.get(21).setLocation(1035, 180);
		alphabetBtns.get(22).setLocation(1170, 180);
		alphabetBtns.get(23).setLocation(1305, 180);
		alphabetBtns.get(24).setLocation(1440, 180);
		alphabetBtns.get(25).setLocation(1575, 180);
		
		for (int i = 0; i < alphabetBtns.size(); ++i) {
			add(alphabetBtns.get(i));
		}
		
		// 스코어 라벨 설정
		scoreLabel.setForeground(Color.BLACK);
		scoreLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 80));
		scoreLabel.setBounds(290, 984, 300, 90);
		
		// 패널 기본 설정
		head.setVisible(false);
		body.setVisible(false);
		leftArm.setVisible(false);
		rightArm.setVisible(false);
		leftLeg.setVisible(false);
		rightLeg.setVisible(false);
		leftHand.setVisible(false);
		leftFoot.setVisible(false);
		rightHand.setVisible(false);
		rightFoot.setVisible(false);
		deadFace.setVisible(false);
		deathHangMan.setVisible(false);
		
		add(head);
		add(body);
		add(leftArm);
		add(rightArm);
		add(leftLeg);
		add(rightLeg);
		add(leftHand);
		add(leftFoot);
		add(rightHand);
		add(rightFoot);
		add(deadFace);
		add(deathHangMan);
		add(textPanel);
		add(scoreLabel);
		setSize(1920, 1080);
		setLayout(null);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(panel_image, 0, 0, this);
	};
}
