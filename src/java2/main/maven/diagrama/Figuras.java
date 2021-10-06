package diagrama;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 2;
		do {
		
		System.out.println("Ingrese opcion");
		System.out.println("1.- Imagen triangulo");
		System.out.println("2.- Salir ");
		Scanner teclado = new Scanner(System.in);
		int N=0;
		
		while (N!=0) {
			System.out.println("Ingrese un numero:  ");
		
		}
		
		System.out.println(" Ingrese un numero: ");
		Scanner teclado1 = new Scanner(System.in);
		int n = teclado.nextInt();
		for(int fila =n; fila>=1; fila=fila +1) {
		for(int ast = fila; ast>=1;ast=ast +1) {
			System.out.println(" * ");
		}
			for(int fila2 =n; fila>=2; fila=fila +3) {
				for(int ast2 = fila; ast2>=1;ast2=ast2 +3) {
					System.out.println(" **");
					System.out.println("  *");
					
				}
					
					for(int fila3 =n; fila>=1; fila=fila +6) {
						for(int ast3 = fila; ast3>=1;ast3=ast3 +6) {
							System.out.println("  ***");
							System.out.println("   **");
							System.out.println("    *");
								
						}
							
							for(int fila5 =n; fila>=1; fila=fila +15) {
								for(int ast5 = fila; ast5>=1;ast5=ast5 +15) {
									System.out.println("  *****");
									System.out.println("   ****");
									System.out.println("    ***");
									System.out.println("     **");
									System.out.println("      *");
}
							}
					}
			}
		}
	}while(opcion!=2);
		System.out.println("SALIR");
}
}
