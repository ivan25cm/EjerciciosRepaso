import acm.program.*;
import acm.graphics.*;
public class EjercicioBasicoJava3 extends ConsoleProgram{

	public void run(){
		println(porcentaje(22));
		println(porcentaje(23));
		println(porcentaje(24));
		
	}
	private boolean porcentaje (int numero){
		if (numero % 11==0){
			return true;
		}
		if (numero % 11==1){
			return true;
		}
		else            {
			return false;
		}
			
	}
}
