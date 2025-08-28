 import java.util.* ;
 
public class deciToBinary {
    static void deciToBinary (int num){
        Stack<Integer> st = new Stack<>();
        while (num > 0){
            st.push( num % 2);
            num = num / 2 ;
        }
        while(!(st.isEmpty())){
            System.out.print(st.pop());
        }
    }
    public static void main (String[] args){
        int num = 39 ;
        deciToBinary(num);
    }
}