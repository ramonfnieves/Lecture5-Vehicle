
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car extends Vehicle{

	public Car(double x, double y){

		this.setPosition(x, y);
		this.setColor(Color.BLACK);
		this.setHorizontalSpeed(10);
		this.setHorizontalDirection(1);
	}

/*	public MutableCar(double x, double y, Color color){

		this.xPos = x;
		this.yPos = y;
		this.color = color;
		this.horizontalSpeed = 10;
		this.horizontalDirection = 1;

	}*/

	public Car(double x, double y, Color color, int hSpeed, int hDir, int num){

		this.setPosition(x, y);
		this.setColor(color);
		this.setHorizontalSpeed(hSpeed);
		this.setHorizontalDirection(hDir);
		this.setNumber(num); 

	}

	public int getHeight(){
		return 30;
	}

	public void draw(Graphics g){

		Graphics2D g2 = (Graphics2D) g;

		Point2D.Double rearWindowStart = new Point2D.Double(this.getXPos()+10, this.getYPos()+15);
		Point2D.Double rearWindowEnd = new Point2D.Double(this.getXPos()+20, this.getYPos()+5);
		Line2D.Double rearWindow = new Line2D.Double(rearWindowStart, rearWindowEnd);

		Point2D.Double frontWindowStart = new Point2D.Double(this.getXPos()+40, this.getYPos()+5);
		Point2D.Double frontWindowEnd = new Point2D.Double(this.getXPos()+50, this.getYPos()+15);
		Line2D.Double frontWindow = new Line2D.Double(frontWindowStart, frontWindowEnd);

		Point2D.Double roofStart = new Point2D.Double(this.getXPos()+20, this.getYPos()+5);
		Point2D.Double roofEnd = new Point2D.Double(this.getXPos()+40, this.getYPos()+5);
		Line2D.Double roof = new Line2D.Double(roofStart, roofEnd);

		Ellipse2D.Double rearTire = new Ellipse2D.Double(this.getXPos()+10, this.getYPos()+25, 10, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.getXPos()+40, this.getYPos()+25, 10, 10);

		Rectangle.Double body = new Rectangle.Double(this.getXPos()+0, this.getYPos()+15, 60.0, 10.0);

		Rectangle.Double leftLight = new Rectangle.Double(this.getXPos()+0, this.getYPos()+15, 5.0, 5.0);
		Rectangle.Double rightLight = new Rectangle.Double(this.getXPos()+55, this.getYPos()+15, 5.0, 5.0);

		g2.setColor(Color.BLACK);
		g2.draw(rearTire);
		g2.draw(frontTire);
		g2.setColor(this.getColor());
		g2.draw(rearWindow);
		g2.draw(roof);
		g2.draw(frontWindow);
		g2.fill(body);
		if(getHorizontalDirection()>0){
			g2.setColor(Color.RED);
			g2.fill(leftLight); 
			g2.setColor(Color.YELLOW);
			g2.fill(rightLight);}
		else{
			g2.setColor(Color.YELLOW);
			g2.fill(leftLight); 
			g2.setColor(Color.RED);
			g2.fill(rightLight);	
		}
		
		g2.setColor(Color.YELLOW);
		g2.drawString(this.getNumber()+"", Math.round(this.getXPos())+25, Math.round(this.getYPos())+20);
	}
}
