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
	public static void Modulo_B (int a, int b){
		if (a< b){
			while (a <= b){
				System.out.println(a);
				a++;
			}
		}
		else{
			while (b <= a){
				System.out.println(b);
				b++;
			}
		}
	}
	public static void Modulo_C ( int a, int b){
		
	}
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		ejercicio1.Modulo_B(a, b);
	}	
}
