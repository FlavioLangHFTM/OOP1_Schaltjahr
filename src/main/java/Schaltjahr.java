import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year do you want to check? ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
    }
}
