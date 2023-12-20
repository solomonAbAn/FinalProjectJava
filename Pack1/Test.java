package Pack1;


import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		    
		        Scanner scanner = new Scanner(System.in);
		        
		        // Display welcome message
		        System.out.println("Welcome to Mike's Triangle/Diamond Printer");

		        // Repeat until user chooses to quit (enter 5)
		        while (true) {
		            // Prompt user for pattern choice
		            int patternNumber = getInput("Please enter the pattern number [1...4, 5 to quit]: ", 1, 5, scanner);

		            // Exit program if user chooses to quit
		            if (patternNumber == 5) {
		                System.out.println("Thank you for using Mike's Triangle/Diamond Printer. Goodbye!");
		                break;
		            }

		            // Prompt user for input value
		            int inputValue = getInput("Please enter the input value [1...9]: ", 1, 9, scanner);

		            // Check if input value is odd or even
		            boolean isOdd = inputValue % 2 != 0;

		            // Display the requested pattern
		            switch (patternNumber) {
		                case 1:
		                    printPattern1(inputValue, isOdd);
		                    break;
		                case 2:
		                    printPattern2(inputValue, isOdd);
		                    break;
		                case 3:
		                    printPattern3(inputValue, isOdd);
		                    break;
		                case 4:
		                    printPattern4(inputValue, isOdd);
		                    break;
		                default:
		                    System.out.println("Invalid pattern number. Please enter a valid pattern number.");
		            }
		        }
		    }

		    // Helper method to get valid user input within a specified range
		    private static int getInput(String prompt, int min, int max, Scanner scanner) {
		        int input;
		        while (true) {
		            try {
		                System.out.print(prompt);
		                input = Integer.parseInt(scanner.nextLine());
		                if (input >= min && input <= max) {
		                    break;
		                } else {
		                    System.out.println("Invalid input. Please enter a number within the specified range.");
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a valid number.");
		            }
		        }
		        return input;
		    }

		    // Helper method to print pattern 1
		    private static void printPattern1(int rows, boolean isOdd) {
		        for (int i = rows; i >= 1; i--) {
		            for (int j = 5; j >= i; j--) {
		                System.out.print(j);
		            }
		            System.out.print("      ");
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
		    }

		    // Helper method to print pattern 2
		    private static void printPattern2(int rows, boolean isOdd) {
		        for (int i = rows; i >= 1; i--) {
		            for (int j = 5; j >= i; j--) {
		                System.out.print(j);
		            }
		            System.out.print("     ");
		            for (int j = 5 - i + 1; j >= 1; j--) {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
		    }

		    // Helper method to print pattern 3
		    private static void printPattern3(int rows, boolean isOdd) {
		        for (int i = rows; i >= 1; i--) {
		            for (int j = 5; j >= i; j--) {
		                System.out.print(j);
		            }
		            System.out.print("    ");
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
		    }

		    // Helper method to print pattern 4
		    private static void printPattern4(int rows, boolean isOdd) {
		        for (int i = 1; i <= rows; i++) {
		            for (int j = rows - 1; j >= i; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
		        for (int i = rows - 1; i >= 1; i--) {
		            for (int j = rows - 1; j >= i; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
		    }
		}
