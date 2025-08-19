// Introduction to Primality Test and School Method
// Last Updated : 13 Feb, 2025
// Given a positive integer, check if the number is prime or not. A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Examples of the first few prime numbers are {2, 3, 5, ...}
// Examples : 

// Input:  n = 11
// Output: true

// Input:  n = 15
// Output: false

// Input:  n = 1
// Output: false 


public class primeNumber{
    public static void checkPrime(int n){
        if ( n <= 1){
            System.out.println( n + "is Not a prime Number");
            return ;
        }
        for (int i=2 ; i< n ;i++){
            if( n % i == 0 ){
            System.out.println( n + "is Not a prime Number");
            return;
        }
        }
        System.out.println( n + "is a prime Number");
    }
    public static void main (String args[]){
        checkPrime(48);
    }
}