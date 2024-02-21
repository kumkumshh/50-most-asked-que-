public class reverse {
    // Function to reverse the given number
    public static int reverse(int num) {
        // Initialize variables to store reversed number and remainder
        int reversed = 0, remainder;
        
        // Loop until the input number becomes zero
        while (num != 0) {
            // Extract the last digit of the number
            remainder = num % 10;
            
            // Append the extracted digit to the reversed number
            reversed = reversed * 10 + remainder;
            
            // Remove the last digit from the input number
            num /= 10;
        }
        
        // Return the reversed number
        return reversed;
    }
    
    // Main method to test the reverse function
    public static void main(String[] args) {
        // Input number to be reversed
        int num = 12345;
        
        // Call the reverse function and print the result
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reverse(num));
    }
}
