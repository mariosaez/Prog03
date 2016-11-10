//Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.
import java.util.Scanner;
public class ejercicio10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int i, n, suma;
		
		System.out.print ("Ingrese un numero:");
		n = t.nextInt();
		suma=0;
		for(i=1;i<n;i++){

			if(n%i==0){
			suma=suma+i;
			}
		}
			if(suma==n){
				System.out.println("Este numero es Perfecto");
			}
			if(suma!=n){
				System.out.println("Este numero no es Perfecto");
				
			}
		
		
}
}

