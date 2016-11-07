/*Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo 
 * (NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)*/
import java.util.Scanner;
public class ejercicio04{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int  a=0,i,n; 
	
	System.out.println("Introduzca el N");
	n = sc.nextInt();
	
     for(i=1;i<(n+1);i++){
     if(n%i==0){
         a++;
        }
     }
     if(a!=2){
          System.out.println("No es Primo");
        }else{
            System.out.println("Si es Primo");
     }
 }
}
