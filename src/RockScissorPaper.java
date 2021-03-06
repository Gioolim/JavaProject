/*
 * 파일명: RockScissorPaper.java
 * 작성일: 2018.12.15
 * 작성자: 진영
 * 설명:  가위 바위 보 게임
         사용자가 버튼 중 하나를 클릭하면, 컴퓨터가 내부에서 생성한 값과 비교해, 결과를 화면에 출력하는 프로그램
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RockScissorPaper extends JFrame implements ActionListener {
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;

	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton paper;
	private JButton scissor;

	public RockScissorPaper() {
		setTitle("가위, 바위, 보");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3)); // 그리드 레이아웃을 지정한다

		information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JTextField(20);

		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);

		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);

		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		RockScissorPaper gui = new RockScissorPaper();
	}

	// 버튼이 눌려지면 이 메소드가 호출된다.
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		if (e.getSource() == rock) {
			if (computer == SCISSOR)
				output.setText("사용자 승리");
			else if (computer == ROCK)
				output.setText("비김");
			else
				output.setText("컴퓨터 승리");
		}

		else if (e.getSource() == paper) {
			if (computer == ROCK)
				output.setText("사용자 승리");
			else if (computer == PAPER)
				output.setText("비김");
			else
				output.setText("컴퓨터 승리");
		}

		else if (e.getSource() == scissor) {
			if (computer == PAPER)
				output.setText("사용자 승리");
			else if (computer == SCISSOR)
				output.setText("비김");
			else
				output.setText("컴퓨터 승리");
		}
	}
}
