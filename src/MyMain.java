
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyMain {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame();

		//Se crearon variable final porque no lee getWidth dentro del 
		//constructor CarStage
		final int FRAME_WIDTH=1100;
		final int FRAME_HEIGHT=600;

		Raceable[] theRaceables = new Raceable[10];

		for(int i = 0; i < theRaceables.length; i++){
			if(i==0){
				theRaceables[i] = new PoliceCar(0, 0, Color.BLACK, 5, 1, i+1);
			}
			else if(i%2==0){
				theRaceables[i] = new Truck(0, 0, Color.BLUE, 5, 1, i+1);
			}
			else{
				theRaceables[i] = new Car(0, 0, Color.BLUE, 5, 1, i+1);
			}
		}
		RaceStage theComponent = new RaceStage(FRAME_HEIGHT, theRaceables);
		frame.add(theComponent);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Java Guru");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);




		while(!theComponent.someCarWon()){
			frame.repaint();
			Thread.sleep(10);
		}

		JOptionPane.showMessageDialog(null, "END OF RACE\nCAR " +theComponent.winNum()+ " WON");

		System.exit(0);
	}

}
