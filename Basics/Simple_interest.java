import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount : ");
        int p = sc.nextInt();
        System.out.println("Enter Rate of Interest : ");
        int r = sc.nextInt();
        System.out.println("Enter time : ");
        int t = sc.nextInt();
        int num = p*t*r;
        System.out.println("Simple interest is : "+(num/100));
        
        sc.close();
    }
}
