import java.util.*;

public class Validator {
    public static String validateEmail(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex == -1) {
            throw new InvalidInputException("Email must contain @");
        }
        int dotIndex = email.indexOf(".", atIndex);  
        if (dotIndex == -1) {
            throw new InvalidInputException("Email must contain a dot after @");
        }
        return email;
    }

    public static int parsePositiveInt(String s){
        int n;
        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Input is not a valid number: " + s);
        }
        if (n < 0) {
            throw new InvalidInputException("Number must be positive, got: " + n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        try {
            validateEmail(email);
            System.out.println("Valid email");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Enter a positive integer: ");
        String input = sc.nextLine();
        try {
            int n = parsePositiveInt(input);
            System.out.println("Valid number: " + n);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}