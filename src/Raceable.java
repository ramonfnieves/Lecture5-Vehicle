import java.awt.Color;
import java.awt.Graphics;

public interface Raceable {

	public int getHorizontalSpeed();
	public int getHorizontalDirection();
	public Color getColor();
	public double getXPos();
	public double getYPos();
	public int getNumber();
	public abstract int getHeight();
	public void setPosition(double xPos, double yPos);
	public void setColor(Color color);
	public void setNumber(int number);
	public void setHorizontalSpeed(int horizontalSpeed);
	public void setHorizontalDirection(int horizontalDirection);
	public void moveInX(int deltaXCar1);
	public  void draw(Graphics g);

}

