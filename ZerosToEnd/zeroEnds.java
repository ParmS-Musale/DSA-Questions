
public class zeroEnds {
    public static int pushToZero(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }

        while (j < n) {
            temp[j++] = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = temp[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,4,0,4,5,0,4,0,0};
        pushToZero(arr);

        for(int num :arr){
            System.out.print(num);
        }
    }
}
