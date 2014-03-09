import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class StartingPoint extends Applet implements Runnable{
		
	int x = 0;
	int y = 0;
	int dx = 2;
	int dy = 2;
	int radius = 20;
		
	@Override
	public void init() {


	}
	
	@Override
	public void start() {
			Thread thread = new Thread(this);
			thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// thread information 
		while (true){
			x += dx;
			y += dy;
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	@Override
	public void stop() {


	}
	
	@Override
	public void destroy() {


	}
	
	@Override
	public void paint(Graphics g) {
		g .setColor(Color.ORANGE);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

}
