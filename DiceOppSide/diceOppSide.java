// The dice problem
// Last Updated : 16 Jul, 2025
// You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

// Examples:

// Input: n = 2
// Output: 5
// Explanation: For dice facing number 5 opposite face will have the number 2.

// Input: n = 6
// Output: 1
// Explanation: For dice facing number 6 opposite face will have the number 1.

public class diceOppSide {
    public static int diceOppSide (int n){
        // Dice Opp Side Chacking Formula

        if (n > 6 || n < 1){
            throw new IllegalArgumentException("Number must be between 1 and 6");
        }
        return 7-n ;
    }
    public static void main( String args[]){
        int n =-8 ;
        System.out.println(diceOppSide(n));
    }
}


// ANother Method Like Nested Else If we Also Used In This 1-->6 . 2-->5 . 3-->4 