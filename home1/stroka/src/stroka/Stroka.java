package stroka;
import java.util.Scanner;
public class Stroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������:");
        String s1 = sc.nextLine();
        String b = new StringBuffer(s1).reverse().toString();
        System.out.print("����������� ������ = " +b); 
      
    }
}