import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
/*
 * Repaso8:
 * 
 * 
 */

public class Repaso9 extends GraphicsProgram{

	//declaro una variable de instancia para guardar el rectangulo
	GRect rectangulo;
	RandomGenerator aleatorio = new RandomGenerator();
	

	
	public void init(){
		setSize (800,600);
		rectangulo = new GRect (120,80);
		//inserto el "escuchador" del raton
		
		
		addMouseListeners();
		
		
	}
	
	public void run () {
		//Añado el rectangulo en el centro exacto de la pantalla
		add(rectangulo, getWidth()/2- rectangulo.getWidth()/2,
				getHeight()/2-rectangulo.getHeight()/2);
	}

		
		
		
	

		public void mouseClicked (MouseEvent evento){


			if ( getElementAt (evento.getX(),evento.getY())==rectangulo){
				double distanciaAlCentroDelRectangulo = 
						evento.getY()-rectangulo.getY();
				if(distanciaAlCentroDelRectangulo > rectangulo.getHeight()/2){
					rectangulo.move(0, 10);
				}
				else {
					rectangulo.move(0, -10);
				}
			


		}
}
		
}


