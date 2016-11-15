//Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.
import java.util.Scanner;
public class ejercicio10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int  n, contador; boolean primo;
		
		System.out.println("Introduzca el n");
		n = t.nextInt();
		contador=2;
		primo=true;
		
			while ((primo) && (contador!=n)) {
				if (n % contador ==0);
				primo=true;
				contador++;
			}
			
	System.out.println(primo);	
}
}
