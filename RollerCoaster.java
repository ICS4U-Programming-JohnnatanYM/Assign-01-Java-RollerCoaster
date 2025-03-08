import java.util.Scanner;

/**
 * This program checks if a user can ride
 * a roller coaster at Canada's Wonderland
 * based on their height.
 * It also has extra functions:
 * 1. Tells the user how much height they are missing if they are too short.
 * 2. Tells them other rides they can go on.
 *
 * @author Johnnatan Yasin Medina
 * @version 1.0
 * @since 2025-03-08
 */
final class RollerCoaster {

    /**
     * This is to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private RollerCoaster() {
        throw new IllegalStateException("Utility Class");
    }

    //Constants for ride height
    /**Behemoth ride height constant. */
    private static final int BEHEMOTH_HEIGHT = 137;
    /**Leviathan ride height constant. */
    private static final int LEVIATHAN_HEIGHT = 140;
    /**Might Mountain ride height constant. */
    private static final int MIGHTY_MOUNTAIN_HEIGHT = 120;
    /**Wonder Coaster ride height constant. */
    private static final int WONDER_COASTER_HEIGHT = 100;

    /**
     * Main method that runs the program.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Create scanner object
        final Scanner scanner = new Scanner(System.in);
        String response;

        do {
            int requiredHeight = 0;
            String rideName = "";

            // Loop until a valid ride is chosen
            do {
                System.out.print("Welcome to Canada's Wonderland!");
                System.out.println(" Here are the rides:");
                System.out.println("- Behemoth (137cm minimum)");
                System.out.println("- Leviathan (140cm minimum)");
                System.out.println("- Mighty Mountain (120cm minimum)");
                System.out.println("- Wonder Coaster (100cm minimum)");
                System.out.print("Which ride do you want to go on? ");
                System.out.print("Enter the name exactly as shown: ");

                // Get the ride selection
                String rideChoice = scanner.nextLine().trim();

                if (rideChoice.equals("Behemoth")) {
                    requiredHeight = BEHEMOTH_HEIGHT;
                    rideName = "Behemoth";
                } else if (rideChoice.equals("Leviathan")) {
                    requiredHeight = LEVIATHAN_HEIGHT;
                    rideName = "Leviathan";
                } else if (rideChoice.equals("Mighty Mountain")) {
                    requiredHeight = MIGHTY_MOUNTAIN_HEIGHT;
                    rideName = "Mighty Mountain";
                } else if (rideChoice.equals("Wonder Coaster")) {
                    requiredHeight = WONDER_COASTER_HEIGHT;
                    rideName = "Wonder Coaster";
                } else {
                    System.out.println("Invalid selection. Please try again.");
                }
            } while (requiredHeight == 0);

        // Ask for the user's height
        int userHeight = 0;

        while (userHeight <= 0) {
            System.out.print("Enter your height in cm: ");
            try {
                userHeight = Integer.parseInt(scanner.nextLine());
                if (userHeight <= 0) {
                    System.out.print("Height must be a positive number.");
                    System.out.println(" Please try again.");
                    }
            } catch (NumberFormatException error) {
            System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Check if they can ride
        if (userHeight >= requiredHeight) {
            System.out.println("You can ride " + rideName + "! Have fun!");
        } else {
            int heightDifference = requiredHeight - userHeight;
            System.out.println("Sorry, you are too short for "
            + rideName + ".");
            System.out.println("You need " + heightDifference
            + " more cm to ride.");
            }

            // Suggest alternative rides
            System.out.println("Here are some rides you can go on:");
            //USed this link to find out how to do equal or greater than:
            //https://www.w3schools.com/java/java_operators.asp
            if (userHeight >= BEHEMOTH_HEIGHT) {
                System.out.println("- Behemoth");
            }
            //USed this link to find out how to do equal or greater than:
            //https://www.w3schools.com/java/java_operators.asp
            if (userHeight >= LEVIATHAN_HEIGHT) {
                System.out.println("- Leviathan");
            }
            //USed this link to find out how to do equal or greater than:
            //https://www.w3schools.com/java/java_operators.asp
            if (userHeight >= MIGHTY_MOUNTAIN_HEIGHT) {
                System.out.println("- Mighty Mountain");
            }
            //USed this link to find out how to do equal or greater than:
            //https://www.w3schools.com/java/java_operators.asp
            if (userHeight >= WONDER_COASTER_HEIGHT) {
                System.out.println("- Wonder Coaster");
            }

        // Ask if they want to check another ride
            do {
            System.out.print("Do you want to check another ride? (yes/no): ");
                response = scanner.nextLine();
            //USed this link to find out how to &&:
            //https://www.w3schools.com/java/java_operators.asp
            if (!response.equals("yes") && !response.equals("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
            //USed this link to find out how to &&:
            //https://www.w3schools.com/java/java_operators.asp
            } while (!response.equals("yes") && !response.equals("no"));

        } while (response.equals("yes"));

        // Close scanner
        scanner.close();
    System.out.print("Thank you for visiting Canada's ");
    System.out.println("Wonderland Ride Checker!");
    }
}
