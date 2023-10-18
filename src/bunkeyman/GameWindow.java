package bunkeyman;

import javax.swing.JFrame;

import inputs.KeyboardInputs;

public class GameWindow {

	public JFrame jframe;

	public GameWindow(GamePanel gamePanel) {
		jframe = new JFrame();

		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setLocationRelativeTo(null);
		// Always last.
		jframe.setVisible(true);
	}

}
