/*Leer un número N que debe filtrarse entre 1 y 100 y a continuación calcular 
y escribir la tabla de multiplicar de ese número con el siguiente formato:
TABLA DE MULTIPLICAR DE 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
......
.....
8 * 10 = 80
*/
import java.util.Scanner;
public class ejercicio02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n;
	
	System.out.println("Introduzca un numero entre el 1 y el 100");
	n = sc.nextInt();
	
	while(n>=0 && n<=100){
		System.out.println("Tabla de multiplicar de " + n);
		System.out.println(n +" * 1 = "+ n*1);
		System.out.println(n +" * 2 = "+ n*2);
		System.out.println(n +" * 3 = "+ n*3);
		System.out.println(n +" * 4 = "+ n*4);
		System.out.println(n +" * 5 = "+ n*5);
		System.out.println(n +" * 6 = "+ n*6);
		System.out.println(n +" * 7 = "+ n*7);
		System.out.println(n +" * 8 = "+ n*8);
		System.out.println(n +" * 9 = "+ n*9);
		System.out.println(n +" * 10 = "+ n*10);
		
		break;
   }
	System.out.println();	
}
}