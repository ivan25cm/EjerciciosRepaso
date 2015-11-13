import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
/*
*Repaso 6
*es un programa que hace lo mismo que repaso5 pero que solo cambia el coplor del rectangulo
*si se hace click dentro de el
 */
public class Repaso6 extends GraphicsProgram{

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
			//evento.getX()
			// si en la posicion en la que se hace click esta el rectangulo entonces lo relleno
			
			//la funcion se llama getElementat
			if ( getElementAt (evento.getX(),evento.getY())==rectangulo){
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());
	}
		}
}

