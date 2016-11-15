/*Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. 
 * Hacer un programa que lea un número N filtrando que debe ser mayor que cero y calcule su factorial.
 */
import java.util.Scanner;
public class ejercicio08 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner t= new Scanner (System.in);
	
			int n, factorial;
			
			System.out.print ("Ingrese un numero:");
			n = t.nextInt();
			factorial=1;
		while(n>0){
			factorial=factorial*n;
			n--;
		}
		
		System.out.println(factorial);
	}
}