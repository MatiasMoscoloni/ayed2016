package practica2;

public class ejercicio1 {
	public static void Modulo_A (int a,int b){
		if(a<b){			
			for ( int i = a; i < b + 1; i++){
				System.out.println(i);
			}			
		}
		else{
			for ( int i = b; i < a + 1; i++){
				System.out.println(i);
		}
	}
}
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		ejercicio1.Modulo_A(a, b);
	}	
}
