import java.applet.Applet;
import java.awt.Graphics;


public class StartingPoint extends Applet implements Runnable{
		
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


	}

}
