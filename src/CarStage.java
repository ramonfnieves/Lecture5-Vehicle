
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9032539863554018689L;
	int counter = 0;
	int n;

	Vehicle [] vehicles;

	boolean someCarWon = false;

	Random r = new Random();

	public boolean someCarWon(){
		return someCarWon;
	}

	public int winNum(){
		return n;
	}

	public CarStage(int frameHeight){
		int laneHeight = 50;
		int numberOfLanes = Math.round(frameHeight/laneHeight);
		
		vehicles= new Vehicle[numberOfLanes];

		int nextYPos = 0;
		for (int i = 0; i < numberOfLanes; i++) {
			vehicles[i] = new Vehicle(0,nextYPos,Color.BLUE, 5, 1, i+1);
			nextYPos += laneHeight;
		}
	}

	public void paintComponent(Graphics g){

		for (Vehicle vehicle : vehicles) {
			vehicle.draw(g);
			int deltaXCar = r.nextInt(vehicle.getHorizontalSpeed());
			vehicle.moveInX(deltaXCar);

			if((vehicle.getXPos()+60)>=this.getWidth()){
				n = vehicle.getNumber();
				winNum();
				vehicle.setPosition(this.getWidth()-60, vehicle.getYPos());
				someCarWon=true;
			} 
		} 

		System.out.println(counter++);
	}
}
