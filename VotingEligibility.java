package org.example;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("Invalid Age");
        }
        else if (age >= 18) {
            System.out.println("Valid Age");
            System.out.println("Eligible for Voting");
        }
        else {
            System.out.println("Valid Age");
            System.out.println("Not Eligible for Voting");
        }

        sc.close();
    }
}
