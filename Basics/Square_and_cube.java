import java.util.Scanner;
public class Square_and_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int square = n*n;
        int cube = square*n;
        System.out.println("Square of "+n+ " is : "+square);
        System.out.println("cube of "+n+ " is : "+cube);
        sc.close();
    }
}
