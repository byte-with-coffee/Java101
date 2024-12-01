public class Practice4 {

    public static void main(String[] args) {
        int n = 10; // Example input
        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int fib(int n) {
        // Validate input
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Variables to hold the previous two Fibonacci numbers
        int a = 0; // F(0)
        int b = 1; // F(1)
        int fibNum = 0; // Variable to hold the current Fibonacci number

        // Calculate Fibonacci number iteratively
        for (int i = 2; i <= n; i++) {
            fibNum = a + b; // F(n) = F(n-1) + F(n-2)
            a = b; // Update a to the previous Fibonacci number
            b = fibNum; // Update b to the current Fibonacci number
        }

        return fibNum; // Return the nth Fibonacci number
    }
}
