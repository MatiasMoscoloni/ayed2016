package practica2;
import java.util.Scanner;

public class ejercicio2 {
	public static void N(int n ){
		int [] arreglo = new int [n];
		int p= 0;
		for( int i= 0; i< n; i++){
			p = p + n;
			arreglo[i]= p;
		}
		for (int i = 0; i< arreglo.length; i++){
			System.out.print((arreglo[(i)]) + ";");
				
		}
	}
	public static void main(String [] args){
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		while(n > 0){
			ejercicio2.N(n);
			n = s.nextInt();
		}
	}
		
	}


