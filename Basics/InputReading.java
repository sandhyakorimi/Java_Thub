import java.util.Scanner;
public class InputReading {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        sc.nextLine();          //bcz string take space as a string
        String str1 = sc.next();
        sc.nextLine();
        String str2 = sc.nextLine();
        char c = sc.next().charAt(0);

        System.out.println("Entered values are : ");
        System.out.println("Byte is : "+b);
        System.out.println("Short is : "+s);
        System.out.println("Integer is : "+i);
        System.out.println("Long is : "+l);
        System.out.println("Float  is : "+f);
        System.out.println("Double is : "+d);
        System.out.println("String is : "+str1);
        System.out.println("Statement String is : "+str2);
        System.out.println("char is : "+c);
        sc.close();
    }
}
