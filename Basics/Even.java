import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd : ");
        int val = sc.nextInt();
        // if(val%2==0){
        //     System.out.println(val+" is Even.");
        // }
        // else System.out.println(val+" is Odd");

        String res = (val%2==0)?"Even":"Odd";
        System.out.println("Entered num "+val+ " is: "+res);

        sc.close();
    }
}
