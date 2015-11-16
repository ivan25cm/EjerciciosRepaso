import acm.program.*;
import acm.graphics.*;

public class EjerciciosJavaBasico extends ConsoleProgram {

	public void run (){
		println(fiestaArdillas(40,false));
		println(fiestaArdillas(60,false));
		println(fiestaArdillas(60,true));
		
	}
	private boolean fiestaArdillas(int bellotas, boolean finDeSemana){
		if(finDeSemana){
			return true;
		}
		else if(bellotas >=40 && bellotas <=60){
			return true;
		}
		return false;


		
	
	

	}
}
