import java.util.Scanner;

public class GUTANG_ACTIVITY_VI {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println( "Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.println( "Enter the second number: ");
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    int diff = num1 - num2;
    int prod = num1 * num2;

    System.out.println(sum);
    System.out.println(diff);
    System.out.println(prod);

}
}