import java.util.Scanner;

class decimal {
    public static int decToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int num = sc.nextInt();

        int i = 0;
        int t = num;
        int d = 0;

        while (t > 0) {
            int r = t % 10;
            t = t / 10;
            d = d + r * (int) Math.pow(2, i++);
        }

        System.out.println("Decimal Number Equivalent of " + num + " is " + d);
        sc.close();
        return d;
    }

    public static void main(String[] args) {
        decToBinary();
    }
}