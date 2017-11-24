package chisla;
import java.util.Scanner;

public class chisla {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Введите первое число: ");
		int a = scanner.nextInt();
		 System.out.print("Введите второе число: ");
		int b = scanner.nextInt();
int sum = a + b;
System.out.println("Сумма двух чисел = " + sum);
int raz = a - b;
System.out.println("Разница первого и второго = " + raz);
int umn = a * b;
System.out.println("Произведение двух чисел = " + umn);
int del = a / b;
System.out.println("Деление первого на второе число= " + del);
}
}
