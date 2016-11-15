/*Realizar un programa que elija mediante un menú un tipo de figura:
 Triángulo
 Cuadrado
 Rectángulo
Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos la muestre.*/
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int  n,a,b ; 

		n=1;
		while(n!=0){
			
			System.out.println("1 Calculara el area de un Triangulo");
			System.out.println("2 Calculara el area de un Cuadrado");
			System.out.println("3 Calculara el area de un Rectángulo");
			System.out.println("0 Se parara el programa");
			System.out.println("");
			
			System.out.println("Inserte su numero");
			n = t.nextInt();
			
			if(1==n){
				System.out.println("Ingrese la altura de su Triangulo");
				a = t.nextInt();
				System.out.println("Ingrese la base de su Triangulo");
				b = t.nextInt();
				System.out.println("El area de su Triangulo es: " +(b*a)/2);
				System.out.println("");
				System.out.println("");
			}
			
			if(2==n){
				System.out.println("Ingrese la altura de su Cuadrado");
				a = t.nextInt();
				System.out.println("Ingrese la base de su Cuadrado");
				b = t.nextInt();
				System.out.println("El area de su Cuadrado es: " +(b*a));
				System.out.println("");
				System.out.println("");
			}
			
			if(3==n){
				System.out.println("Ingrese la altura de su Rectangulo");
				a = t.nextInt();
				System.out.println("Ingrese la base de su Rectangulo");
				b = t.nextInt();
				System.out.println("El area de su Rectangulo es: " +(b*a));
				System.out.println("");
				System.out.println("");
				
			}
			
			if(0==n){
				System.out.println("");
				System.out.println("Su Programa se ha detenido");
				}
			}
		}

}
