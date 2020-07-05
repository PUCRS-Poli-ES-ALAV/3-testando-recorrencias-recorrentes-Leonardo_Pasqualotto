
public class Aplicacao {

	public static void main(String[] args) {
		System.out.println(exercicio1(1));
		System.out.println(exercicio1(2));
		System.out.println(exercicio1(4));
		System.out.println(exercicio1(6));
		System.out.println(exercicio1(8));
		System.out.println(exercicio1(16));
		System.out.println(exercicio2(1));
		System.out.println(exercicio2(2));
		System.out.println(exercicio2(4));
		System.out.println(exercicio2(6));
		System.out.println(exercicio2(8));
		System.out.println(exercicio2(16));
		System.out.println(exercicio3(1));
		System.out.println(exercicio3(2));
		System.out.println(exercicio3(4));
		System.out.println(exercicio3(6));
		System.out.println(exercicio3(8));
		System.out.println(exercicio3(16));
		System.out.println(exercicio4(1));
		System.out.println(exercicio4(2));
		System.out.println(exercicio4(4));
		System.out.println(exercicio4(6));
		System.out.println(exercicio4(8));
		System.out.println(exercicio4(16));
	}
	//1. Para uma constante c = 10, e para n = 1, 2, 4, 6, 8, 16
	public static int exercicio1(int n) {
		if(n==0) return 0;
		return 10 + exercicio1(n-1);
		
	}
	//2. Para n = 1, 2, 4, 6, 8, 16
	public static int exercicio2(int n) {
		if(n==0) return 0;
		return n +exercicio2(n-1);
		
	}
	//3. Para uma constante c = 10, e para n = 1, 2, 4, 6, 8, 16
	public static int exercicio3(int n) {
		if(n==1) return 10;
		return 2 * exercicio3(n/2) +10;
	}
	//4.Para uma constante a = 5, b = 2 e c = 10, e para n = 1, 2, 4, 6, 8, 16
	public static int exercicio4(int n) {
		if(n==1) return 10;
		return 5 * exercicio4(n/2) + 10*n;
	}
}
