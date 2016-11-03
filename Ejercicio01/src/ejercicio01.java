/*Escribir un programa que calcule e imprima la suma de los números enteros comprendidos 
		  entre A y B que deben leerse por teclado y filtrarse para que A<=B. 
		  Los valores de A y B no deben incluirse en la suma.*/

import java.util.Scanner;
public class ejercicio01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int a, b, resultado, indice;
	
	System.out.println("Introduzca el valor A");
	a = sc.nextInt();
		
	System.out.println("Introduzca el valor B");	
	b = sc.nextInt();
	
	resultado = 0;
	indice = a+1;
	
	while(indice<=b-1){
		resultado= resultado + indice;
		indice=indice+1;
   }
	System.out.println(resultado);	
}
}
