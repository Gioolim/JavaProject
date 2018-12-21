/*
 * 파일명: Scribble.java
 * 작성일: 2018.12.20
 * 작성자: 진영
 * 설명:  마우스를 드래그하여 그림을 그리는 프로그램
 */
 

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Point {
	int x, y;
}

class MyPanel extends JPanel implements MouseMotionListener {
	private int index = 0;
	Point[] array = new Point[1000];

	public MyPanel() {
		this.addMouseMotionListener(this);
	}

	// 마우스가 움직일 때마다 마우스의 위치를 배열에 저장하는 클래스
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (index > 1000)
			return;
		array[index] = new Point();
		array[index].x = e.getX();
		array[index].y = e.getY();
		index++;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Point p : array)
			if (p != null)
				g.drawRect(p.x, p.y, 1, 1);
	}

	@Override
	public void mouseMoved(MouseEvent args) { }
}

public class Scribble extends JFrame {
	public Scribble( ) {
		setSize(300, 300);
		setTitle("마우스로 그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		Scribble s = new Scribble();
	}

}
