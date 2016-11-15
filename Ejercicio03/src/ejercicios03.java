/*Escribir un programa que una vez que lea un número N por teclado calcule y 
escriba sus divisores por la pantalla (sin incluirse a si mismo).*/
import java.util.Scanner;
public class ejercicios03{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n, divisor;
	
	System.out.println("Introduzca el N");
	n = sc.nextInt();
	
		divisor=1;
	
	while(divisor<n){
	if(n%divisor==0){
	System.out.println(divisor);
	}
divisor++;
}
	}
	}
