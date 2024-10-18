import java.util.Scanner;

// This is a simple Java program to test the Dockerfile
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to the calculator");
        System.out.println("Enter a command:");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            try {
                switch (command) {
                    case "add":
                        int addResult = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + addResult);
                        break;
                    case "subtract":
                        int subtractResult = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + subtractResult);
                        break;
                    case "multiply":
                        int multiplyResult = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + multiplyResult);
                        break;
                    case "divide":
                        int divideResult = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + divideResult);
                        break;
                    case "fibonacci":
                        int fibonacciResult = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                        System.out.println("Output: " + fibonacciResult);
                        break;
                    case "binary":
                        String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                        System.out.println("Output: " + binaryResult);
                        break;
                    default:
                        System.out.println("Unknown command");
                }
            } catch (Exception e) {
                System.out.println("Error processing command: " + e.getMessage());
            }

            System.out.println("Enter a command:");
        }

        scanner.close();
    }
}
