import java.util.Scanner;

class MARQUEZ_ACTIVITY_IV{ 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the non-enteger: ");
            int num = scanner.nextInt();
            long factorial = 1;
    
            for (int i = 1; i<=num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + factorial);

            
    }
}
  