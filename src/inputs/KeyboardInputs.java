package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import bunkeyman.GamePanel;

public class KeyboardInputs implements KeyListener{

	private GamePanel gamePanel;
	
	// Now you can access the vlues of the Gamepanel class
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("A keys is pressed");
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			System.out.println("W");
			gamePanel.changeY(-10);
			break;
		case KeyEvent.VK_A:
			System.out.println("A");
			gamePanel.changeX(-10);
			break;
		case KeyEvent.VK_S:
			System.out.println("S");
			gamePanel.changeY(10);
			break;
		case KeyEvent.VK_D:
			System.out.println("D");
			gamePanel.changeX(10);
			break;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
