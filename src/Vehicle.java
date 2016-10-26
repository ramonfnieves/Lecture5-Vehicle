
import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle {

	private double xPos = 0;
	private double yPos = 0;
	private Color color;
	private int number;
	
	private int horizontalSpeed=0;
	private int horizontalDirection;

	public int getHorizontalSpeed() {
		return horizontalSpeed;
	}


	public int getHorizontalDirection() {
		return horizontalDirection;
	}

	
	public Color getColor(){

		return this.color;
	}

	public double getXPos(){

		return this.xPos;
	}

	public double getYPos(){

		return this.yPos;
	}
		
	public int getNumber() {
		return number;
	}
	
	public void setPosition(double xPos, double yPos){

		this.xPos=xPos;
		this.yPos=yPos;
	}

	public void setColor(Color color){

		this.color=color;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setHorizontalSpeed(int horizontalSpeed) {
		this.horizontalSpeed = horizontalSpeed;
	}
	
	public void setHorizontalDirection(int horizontalDirection) {
		this.horizontalDirection = horizontalDirection;
	}
	
	public void moveInX(int deltaXCar1) {
		this.xPos += deltaXCar1;
	}



	public abstract void draw(Graphics g);


}
