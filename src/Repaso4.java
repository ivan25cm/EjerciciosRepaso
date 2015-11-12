import acm.program.*;
import acm.graphics.*;
/*
 * autor ivan barroso clemente 
 * 
 */
public class Repaso4 extends acm.program.GraphicsProgram{

	
	GRect rectangulo;
	
	
	double distanciaX;
	double distanciaY;
	
	public void init(){
		setSize(800,600);
		
		
		rectangulo= new GRect (120,80);
		add(rectangulo);
	}
	public void run (){
		
		distanciaX = getWidth()/2- rectangulo.getWidth()/2;
		distanciaY = getHeight()/2-rectangulo.getHeight()/2;
		rectangulo.setLocation(distanciaX,distanciaY);
	}
	
}
