import java.awt.Graphics;

public class Ball extends Sprite {
	//store velocities of the ball
	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor, set size of ball and set to initial position
	public Ball() {
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BALL_HEIGHT);
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		//move x and y by their respective velocities
		x += getXVelocity();
		y += getYVelocity();
		
		// Bounce off left side of screen
		if(x <= 0) {
			setX(0);
			setXVelocity(-getXVelocity());
		}
		
		// Bounce off right side of screen
		if(x + getWidth() >= Settings.WINDOW_WIDTH - Settings.WINDOW_OFFSET) {
			setX(Settings.WINDOW_WIDTH - Settings.BALL_WIDTH - Settings.WINDOW_OFFSET);
			setXVelocity(-getXVelocity());
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			setY(0);
			//reverse y velocity
			setYVelocity(-getYVelocity());
		}
		
	}
	//set the x velocity
	public void setXVelocity(int x) {
		xVelocity = x;
	}
	//set the y velocity
	public void setYVelocity(int y) {
		yVelocity = y;
	}
	//return the x velocity
	public int getXVelocity() {
		return xVelocity;
	}
	//return the y velocity
	public int getYVelocity() {
		return yVelocity;
	}
	//draw the ball
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
