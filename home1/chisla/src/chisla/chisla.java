package chisla;
import java.util.Scanner;

public class chisla {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("������� ������ �����: ");
		int a = scanner.nextInt();
		 System.out.print("������� ������ �����: ");
		int b = scanner.nextInt();
int sum = a + b;
System.out.println("����� ���� ����� = " + sum);
int raz = a - b;
System.out.println("������� ������� � ������� = " + raz);
int umn = a * b;
System.out.println("������������ ���� ����� = " + umn);
int del = a / b;
System.out.println("������� ������� �� ������ �����= " + del);
}
}
