// Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
// Output: 1
// Explanation: Element 1 appears 4 times. Since ⌊7/2⌋ = 3, and 4 > 3, it is the majority element.

// Input: arr[] = [7]
// Output: 7
// Explanation: Element 7 appears once. Since ⌊1/2⌋ = 0, and 1 > 0, it is the majority element.

// Input: arr[] = [2, 13]
// Output: -1
// Explanation: No element appears more than ⌊2/2⌋ = 1 time, so there is no majority element.

 public class majorityElement{

     public static int majority(int[] arr){
        int n = arr.length ;
        int count = 0 ;

        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                if (arr[i] == arr[j]){
                    count++ ;
                }
            }
            if (count > n/2) {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 5, 1 };
        System.out.println(majority(arr));
    
    }
}