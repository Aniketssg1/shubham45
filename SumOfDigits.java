public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;  // Initialize the number
        int temp = number;
        int sum = 0;        // Initialize the sum to 0

        // Iterate through the digits using a while loop
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;             // Add the digit to the sum
            number /= 10;             // Remove the last digit
        }

        System.out.println("The sum of digits in " + temp + " is " + sum);
    }
}
