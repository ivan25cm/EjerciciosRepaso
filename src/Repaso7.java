import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
/*
*Repaso 7
*cuando se hace click en un rectangulo central,genera un nuevo rectangulo aleatorio
*
 */
public class Repaso7 extends GraphicsProgram{

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
				//esta linea esta añadiendo un rectangulo nuevo y lo estas declarando que tenga un alto aleatorio hasta 200 un 
				//ancho aleatorio hasta 200
				GRect auxiliar = new GRect(aleatorio.nextInt(200),aleatorio.nextInt(200));
				auxiliar.setFilled(true);
				auxiliar.setFillColor(aleatorio.nextColor());
				add(auxiliar,
						aleatorio.nextInt(800),
						aleatorio.nextInt(600));
				rectangulo.setFillColor(aleatorio.nextColor());
				

		}
}
}

