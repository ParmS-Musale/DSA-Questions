public class distanceTwoPoints {
    public static double checkDistance ( int x1 , int y1 , int x2 , int y2){
        int dx = x2-x1 ;
        int dy = y2-y1 ;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static void main(String args[]){
        System.out.println(checkDistance(2,4,5,8));
    }
}