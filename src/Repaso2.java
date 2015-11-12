import acm.program.*;
import acm.graphics.*;
/*
 * autor ivan barroso clemente 
 * 
 */
public class Repaso2 extends acm.program.GraphicsProgram{

	
	GRect rectangulo;
	
	
	int distanciaX;
	
	public void init(){
		setSize(800,600);
		
		
		rectangulo= new GRect (120,80);
		add(rectangulo);
	}
	public void run (){
		
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX,0);
	}
	
}
