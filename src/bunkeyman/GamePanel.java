package bunkeyman;

import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel {

	private MouseInputs mouseInputs;

	private int xDelta = 100;
	private int yDelta = 100;

	public GamePanel() {

		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}

	public void changeX(int value) {
		this.xDelta += value;
		// Component class method
		repaint();
	}

	public void changeY(int value) {
		this.yDelta += value;
		repaint();
	}

	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}

	public void paintComponent(Graphics g) {
		// Clean the frames and allows you to paint
		super.paintComponent(g);

		//
		g.fillRect(xDelta, yDelta, 200, 50);

	}

}
