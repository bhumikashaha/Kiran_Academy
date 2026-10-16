package kiranAcademy;

import java.util.Scanner;
import java.util.Random;

public class CabBookingChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\n===== CAB BOOKING CHATBOT =====");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.println("Thank you for using Cab Booking Chatbot!");
                break;
            }

            if (choice != 1) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            System.out.println("\n1. Auto - Rs.12/km");
            System.out.println("2. Sedan - Rs.18/km");
            System.out.println("3. SUV - Rs.25/km");
            System.out.print("Choose cab type: ");
            int cab = sc.nextInt();

            if (cab < 1 || cab > 3) {
                System.out.println("Invalid cab choice!");
                continue;
            }

            String cabType = "";
            int rate = 0;

            if (cab == 1) {
                cabType = "Auto";
                rate = 12;
            } else if (cab == 2) {
                cabType = "Sedan";
                rate = 18;
            } else {
                cabType = "SUV";
                rate = 25;
            }

            System.out.println("\n1. Pune Station to Shivajinagar - 5 km");
            System.out.println("2. Swargate to Kothrud - 8 km");
            System.out.println("3. Hinjawadi to Wakad - 10 km");
            System.out.print("Choose route: ");
            int route = sc.nextInt();

            if (route < 1 || route > 3) {
                System.out.println("Invalid route choice!");
                continue;
            }

            String source = "";
            String destination = "";
            int distance = 0;

            if (route == 1) {
                source = "Pune Station";
                destination = "Shivajinagar";
                distance = 5;
            } else if (route == 2) {
                source = "Swargate";
                destination = "Kothrud";
                distance = 8;
            } else {
                source = "Hinjawadi";
                destination = "Wakad";
                distance = 10;
            }

            int fare = rate * distance;

            System.out.println("\n===== RIDE DETAILS =====");
            System.out.println("Cab Type: " + cabType);
            System.out.println("Source: " + source);
            System.out.println("Destination: " + destination);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Rate: Rs." + rate + "/km");
            System.out.println("Total Fare: Rs." + fare);

            System.out.println("\n1. Confirm & Share OTP");
            System.out.println("2. Cancel Ride");
            System.out.print("Enter your choice: ");
            int confirm = sc.nextInt();

            if (confirm == 2) {
                System.out.println("Ride cancelled successfully. No OTP shared.");
                continue;
            }

            if (confirm != 1) {
                System.out.println("Invalid choice! Ride cancelled. No OTP shared.");
                continue;
            }

            int otp = 1000 + random.nextInt(9000);

            System.out.println("\nYour OTP is: " + otp);
            System.out.println("OTP shared successfully.");
            System.out.println("Cancellation is not allowed after OTP sharing.");
            System.out.println("Booking confirmed successfully!");
        }

        sc.close();
    }
}
