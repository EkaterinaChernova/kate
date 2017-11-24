package fact;

import java.util.Scanner;

public class Factorial {


	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		
		Scanner sc = new Scanner(System.in);
		System.out.println("chislo = ");
		int n = sc.nextInt();
		int factor =  n*factorial(n-1);
		System.out.println("factorial = " + factor);
			
			}

	@SuppressWarnings("unused")
	public static int factorial(int n) {
		// TODO Автоматически созданная заглушка метода
		if (n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	
}
