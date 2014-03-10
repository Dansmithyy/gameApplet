import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class StartingPoint extends Applet implements Runnable{
		
	int x = 0;
	int y = 0;
	int dx = 2;
	int dy = 2;
	int radius = 20;
	private Image i;
	private Graphics doubleG;
		
	@Override
	public void init() {
		setSize(800, 600);

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
	public void update(Graphics g) {
		if (i == null){
			i = createImage(this.getSize().width, this.getSize().height);
			doubleG = i.getGraphics();
		}
		
		doubleG.setColor(getBackground());
		doubleG.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
		doubleG.setColor(getForeground());
		paint(doubleG);
		
		g.drawImage(i, 0, 0, this);
	}
	
	@Override
	public void paint(Graphics g) {
		g .setColor(Color.ORANGE);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

}
