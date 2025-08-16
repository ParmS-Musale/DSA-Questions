// Find Closest to n and Divisible by m
// Last Updated : 09 Jul, 2025
// Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.

// Examples: 

// Input: n = 13, m = 4
// Output: 12
// Explanation: 12 is the closest to 13, divisible by 4.

// Input: n = -15, m = 6
// Output: -18
// Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.



public class closestNumber {
    public static int closestNumber(int n, int m) {
        int a = n % m;
        int a1 = a + m;

        int b1 = n - a;   // closest smaller multiple
        int b2 = n + (m - a); // closest larger multiple

        // Compare distances and return the closest
        if (Math.abs(n - b1) < Math.abs(n - b2)) {
            return b1;
        } else {
            return b2;
        }
    }

    public static void main(String[] args) {
        int n = 13;
        int m = 4;
        System.out.println(closestNumber(n, m)); 
    }
}
