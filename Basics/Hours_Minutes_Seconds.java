import java.util.Scanner;
public class Hours_Minutes_Seconds {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hours : ");
        int hrs = sc.nextInt();
        int min = hrs * 60;
        int sec = min *60;
        System.out.println( hrs + " hours contains : "+min+ " minutes");
        System.out.println(hrs+ " hours contains : "+sec+" seconds");
        sc.close(); 
    }
}
