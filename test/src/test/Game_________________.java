package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class GameView extends JPanel {
	Image back, horse;
	int x = 600, y = 450;

	public GameView() {
		back = Toolkit.getDefaultToolkit().getImage("/Users/joo/Documents/javaDev/back.jpg");// 파일 저장 후 경로 가져오기
		horse = Toolkit.getDefaultToolkit().getImage("/Users/joo/Documents/javaDev/back.jpg");// 파일 저장 후 경로 가져오기
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(horse, x, y, 150, 100, this);
	}

}

public class Game_________________ extends JFrame implements KeyListener {
	
	GameView gv = new GameView();

	public Game_________________() {
		add("Center", gv);
		setSize(800, 600);
		setVisible(true);
		addKeyListener(this);
		setFocusable(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT: {
				gv.x -= 5;
				if (gv.x < 0)
					gv.x = 800;
			}
			case KeyEvent.VK_RIGHT: {
				gv.x += 5;
				if (gv.x > 800)
					gv.x = 0;
			}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Game_________________();
	}
}
