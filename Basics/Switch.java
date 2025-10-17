import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        System.out.print("Enter an Operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum : "+(a+b));
                break;
            case '-':
                System.out.println("Minus : "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication : "+(a*b));
                break;
            case '/':
                if(b>0){
                     System.out.println("Division : "+(a/b));
                }
                else System.out.println("b must greater than zero!");
                break;
            case '%':
                if(b>0){
                    System.out.println("Modulo Division : "+(a%b));
                }
                else System.out.println("b must greater than zero!");
                break;
            default:
                System.out.println("Operations not occoured . ");
                break;
        }
        sc.close();
    }
}
