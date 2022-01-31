import java.awt.Graphics;

public class Brick extends Sprite {
	//store state of brick
	private boolean broken = false;
	//brick constructor
	public Brick(int x, int y) {
		setX(x);
		setY(y);
		setWidth(Settings.BRICK_WIDTH);
		setHeight(Settings.BRICK_HEIGHT);
	}
	//return state of brick
	public boolean isBroken() {
		return broken;
	}
	//set state of brick
	public void setBroken(boolean b) {
		broken = b;
	}
	//draw brick on screen
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
