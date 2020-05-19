import java.util.Scanner;

public class OwnershipCalculator {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int userChoice;

        System.out.println("Let's calculate ownership shares for fractional ownership at\n The Royal in Kelowna, BC Canada. ");
        System.out.println("Enter the share you are considering to purchase: ");
        System.out.println("1) 1/12th Share");
        System.out.println("2) 1/6th Share");
        System.out.println("3) 1/4th Share");
        System.out.println("4) 1/3rd Share");
        System.out.println("5) 1/2th Share");
        System.out.println("6) 1/1 Full Share");

        userChoice = sc.nextInt();

        if (userChoice == 1) {
            System.out.println("You have a 1/12th Share.\nYou get get 1 week per quarter.\nThis equals 4 weeks per year.");
        }

        if (userChoice == 2) {
            System.out.println("You have a 1/6th Share.\nYou get get 2 weeks per quarter.\nThis equals 8 weeks per year.");
        }

        if (userChoice == 3) {
            System.out.println("You have a 1/4th Share.\nYou get get 3 weeks per quarter.\nThis equals 12 weeks per year.");
        }

        if (userChoice == 4) {
            System.out.println("You have a 1/3rd Share.\nYou get get 4 weeks per quarter.\nThis equals 16 weeks per year.");
        }

        if (userChoice == 5) {
            System.out.println("You have a 1/2 Half Share.\nYou get get 6.5 weeks per quarter.\nThis equals 26 weeks per year.");
        }

        if (userChoice == 6) {
            System.out.println("You have a Full Share.\nYou own the unit!");
        }

        else if (userChoice <= 0 || userChoice > 6) {
            System.err.println("Please enter a number between 1-6");
        }

    }


}
