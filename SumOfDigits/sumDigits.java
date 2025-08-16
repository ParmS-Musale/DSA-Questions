// Sum of Digits of a Number
// Given a number n, find the sum of its digits.

// Examples : 

// Input: n = 687
// Output: 21
// Explanation: The sum of its digits are: 6 + 8 + 7 = 21

// Input: n = 12
// Output: 3
// Explanation: The sum of its digits are: 1 + 2 = 3

public class sumDigits {
    public static int sumDigits(int n){
        int sum = 0 ;
        while (n != 0){
            int last = n % 10 ;
        sum += last ;
        n /= 10 ;   
        }
        return sum ;
    };
    public static void main (String args[]){
        int n = 12345 ;
        System.out.println(sumDigits(n));
    }
}