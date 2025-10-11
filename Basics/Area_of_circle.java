import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        System.out.println("Enter radius of circle : ");
        int radius = sc.nextInt();
        System.out.println("Area of circle is : "+(pi*radius*radius));
        float area = pi*radius*radius;
        System.out.printf( "%.1f",area);
        sc.close();
    }
}
