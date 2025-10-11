import java.util.Scanner;
public class Remainder_without_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        int remainder = a - ((a/b)*b);
        System.out.println("Remainder when "+a+" is divided by "+b+" is : "+remainder);
        sc.close();
    }
}
