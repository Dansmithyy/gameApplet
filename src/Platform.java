import java.awt.Color;
import java.awt.Graphics;


public class Platform {

	
	int dx;
	int x, y, width, height;
	
	public Platform() {
		// TODO Auto-generated constructor stub
		dx = -10;
		x = 300;
		y = 300;
		width = 120;
		height = 40;
	}
	
	public void update(StartingPoint sp){
		

	}
	
	public void paint (Graphics g){
		g .setColor(Color.GREEN);
		g.fillRect(dx, y, width, height);
		//g.drawRect(x, y, width, height);
	}
}
