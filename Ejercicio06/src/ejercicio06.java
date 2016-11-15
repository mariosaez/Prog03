
/*Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará
el fin de la entrada de datos. El programa debe calcular y escribir 
la suma de los números introducidos en lugar par y de los introducidos en lugar impar,
es decir los introducidos primero, tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.*/
import java.util.Scanner;
public class ejercicio06 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner t= new Scanner (System.in);
	
			int n,p,i;
			
			
			System.out.print ("Ingrese un numero:");
			n = t.nextInt();
			i=n;
			
			System.out.print ("Ingrese un numero:");
			n = t.nextInt();
			p=n;
			while (n!=0) {
				
				System.out.print ("Ingrese un numero:");
				n = t.nextInt();
				i=i + n;
				
				System.out.print ("Ingrese un numero:");
				n = t.nextInt();
				p=p + n;

			
		}
			System.out.println(i);
			System.out.println(p);	
		
	}
}
