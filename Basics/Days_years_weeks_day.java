import java.util.Scanner;
public class Days_years_weeks_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_days = sc.nextInt();
        int years = n_days/365;
        int weeks = (n_days%365)/7;
        int days = (n_days%365)%7;
         
        sc.close();
    }
}
