import java.awt.Graphics;

public class Paddle extends Sprite {
	//store the velocity of the paddle
	private int xVelocity;
	
	public Paddle() {
		//setup paddle size and put to initial position
		setWidth(Settings.PADDLE_WIDTH);
		setHeight(Settings.PADDLE_HEIGHT);
		resetPosition();
	}
	//set paddle to initial position
	public void resetPosition() {
		setX(Settings.INITIAL_PADDLE_X);
		setY(Settings.INITIAL_PADDLE_Y);
	}
	public void update() {
		//move paddle by velocity
		x += xVelocity;
		//check if right of paddle is at edge of window
		if(x + getWidth() >= (Settings.WINDOW_WIDTH - Settings.WINDOW_OFFSET)) {
			//if so, stay at edge window
			setX(Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH - Settings.WINDOW_OFFSET);
		}
		//check if left of paddle is at edge of window
		if(x <= 0) {
			//if so, stay at edge
			setX(0);
		}

	}
	//draw paddle
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	//set velocity of the paddle
	public void setXVelocity(int vel) {
		xVelocity = vel;
	}
}
