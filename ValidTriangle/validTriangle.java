// Given three sides, check whether triangle is valid or not. 

// Examples:  

// Input :  a = 7, b = 10, c = 5 
// Output : Valid
// We can draw a triangle with the given three edge lengths.

// Input : a = 1, b = 10, c = 12 
// Output : Invalid
// We can not draw a triangle with the given three edge lengths.

// Try it on GfG Practice


public class validTriangle {
    public static boolean checkTriangle (int a , int b , int c){
        if (a+b > c && b+c > a && c+a > b){
            return true ;
        }
        return false ;
    }
    public static void main(String args[]){
        int a = 7 ; int b = 10 ; int c = 5 ;
        System.out.println(checkTriangle(a,b,c));
    }
}