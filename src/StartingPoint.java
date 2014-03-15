import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class StartingPoint extends Applet implements Runnable{
		
	int x = 0;
	int y = 0;
	double dx = 20;
	double dy = 0;
	int radius = 20;
	private Image i;
	private Graphics doubleG;
	double gravity = 15;
	double energyloss = .65;
	double xFriction = .9;
	double dt = .2;
		
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
			if ( x + dx > this.getWidth() -radius-1){
				x = this.getWidth() - radius - 1;
				dx = - dx;
			}else if( x + dx < 0 + radius){
				x = 0+radius;
				dx = -dx;
			}
			else{
				x += dx;
			}
			
			if(y == this.getHeight()-radius-1){
				dx *= xFriction;
				if (Math.abs(dx) < .8){
					dx = 0;
				}
			}
			
			if(y > this.getHeight() - radius -1){
				y = this.getHeight() - radius -1;
				dy *= energyloss;
				dy = -dy;
			}else{
				//velocity formula
				dy += gravity *dt;
				//position formula
				y += dy*dt + .5*gravity*dt*dt;
			}


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
