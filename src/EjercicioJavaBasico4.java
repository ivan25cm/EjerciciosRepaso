import acm.graphics.*;
import acm.program.*;

public class EjercicioJavaBasico4 extends ConsoleProgram{
	
	public void run (){
		println(contesta(false,false,false));
		println(contesta(false,false,true));
		println(contesta(true,false,false));
	}
	private boolean contesta (boolean matinal, boolean madre, boolean dormido){
		if (matinal){
			return false;
		}
		if (dormido){
			return false;
		}
		else if(matinal&& madre){
			return true;
		}
		else{
			return true;
		}
			
			
	}
	}

