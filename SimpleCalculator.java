import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int n1 = sc.nextInt(); 
        System.out.print("Enter Second Number:");
        int n2 = sc.nextInt();
        System.out.print("Enter Operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                if(n2 != 0){
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
