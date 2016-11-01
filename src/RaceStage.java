
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class RaceStage extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9032539863554018689L;
	int counter = 0;
	int n;

	Raceable [] raceable;

	boolean someCarWon = false;

	Random r = new Random();

	public boolean someCarWon(){
		return someCarWon;
	}

	public int winNum(){
		return n;
	}

	public RaceStage(int frameHeight, Raceable [] Raceables){
		
		this.raceable= new Raceable[Raceables.length];
		int nextYPos = 0;
		for (int i = 0; i < Raceables.length; i++) {
			Raceables[i].setPosition(0, nextYPos);
			this.raceable[i] = Raceables[i];
			nextYPos += Raceables[i].getHeight()+20;
		}
	}

	public void paintComponent(Graphics g){

		for (Raceable Raceable : raceable) {
			Raceable.draw(g);
			int deltaXCar = r.nextInt(Raceable.getHorizontalSpeed());
			Raceable.moveInX(deltaXCar);

			if((Raceable.getXPos()+60)>=this.getWidth()){
				n = Raceable.getNumber();
				winNum();
				Raceable.setPosition(this.getWidth()-60, Raceable.getYPos());
				someCarWon=true;
			} 
		} 
		System.out.println(counter++);
	}
}
