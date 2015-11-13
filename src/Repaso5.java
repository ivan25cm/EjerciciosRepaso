import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
/*
 * REPASO 5 añade soporte al programa para poder escuchar los clicks del raton
 * 
 * Lo que hara el programa es cambiar el color de relleno aleatoriamente del rectangulo cada vez que
 * se pulse click
 * 
 */
public class Repaso5 extends GraphicsProgram{

	//declaro una variable de instancia para guardar el rectangulo
	GRect rectangulo;
	RandomGenerator aleatorio = new RandomGenerator();
	
	public void ini (){
		setSize (800,600);
		GRect rectangulo = new GRect (120,80);
		//inserto el "escuchador" del raton
		
		
		addMouseListeners();
	}
	
	public void run () {
		//Añado el rectangulo en el centro exacto de la pantalla
		add(rectangulo, getWidth()/2- rectangulo.getWidth()/2,
				getHeight()/2-rectangulo.getHeight()/2);
	}
	
	//añado el metodo que escucha el evento del click del raton
	public void mouseClicked (MouseEvent evento){
		if (evento.getButton ()== MouseEvent.BUTTON1){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
		
		
	}
	}
}

