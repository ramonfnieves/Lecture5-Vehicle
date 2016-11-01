import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class PoliceCar extends Car {

	public PoliceCar(double x, double y, Color color, int hSpeed, int hDir, int num){
		super(x, y, color, hSpeed, hDir, num);	
	} 
	
	public void draw(Graphics g){
		
		super.draw(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double biombo = new Ellipse2D.Double(this.getXPos()+27, this.getYPos(), 5, 5);
		g2.setColor(Color.BLUE);
		g2.fill(biombo);
		
	}
}
