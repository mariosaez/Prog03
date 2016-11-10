/*Escribir un programa que lea una secuencia de datos numéricos de longitud indefinida, 
 * de manera que cuando el número sea el cero cesará la entrada de dicha secuencia. 
 * El programa debe imprimirnos la media de todos ellos, el mayor y el menor.
 */
import java.util.Scanner;
public class ejercicio07 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner t= new Scanner (System.in);
	
			int n,contador,media,suma,max=0, min=99999;

			
			System.out.print ("Ingrese un numero:");
			n = t.nextInt();
			suma=n;
			contador=0;
			media=0;
	while (n!=0) {
				System.out.print ("Ingrese un numero:");
				n = t.nextInt();
				suma=n+suma;
				contador=contador+1;
				media=suma/contador;
	
	if(n>max){
		max=n;
					
}
	if(n<=min){
	
		min=n;
	}
	}
	System.out.println("La media de los numeros es: " + media);
	System.out.println("El numero maximo es " +max);
	System.out.println("El numero minimo es " +min);
	}
}