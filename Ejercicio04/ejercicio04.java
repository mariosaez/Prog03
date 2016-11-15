/*Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo 
 * (NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)*/
import java.util.Scanner;
public class ejercicio04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int  n, contador; boolean primo;
	
	System.out.println("Introduzca el n");
	n = sc.nextInt();
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