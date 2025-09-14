
public class count {
    public static char cunt(String s) {
        int n = s.length();
        String str = s.toLowerCase();
        int vow = 0;
        int con = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'u') {
                vow++;
            } else if ((str.charAt(i) > 'a' && str.charAt(i) < 'z')) {
                con++;
            }
        }
        System.out.println("Number of Vowels = " + vow
                + "\nNumber of Consonants = "
                + con);

        return 0;
    }

    public static void main(String[] args) {
        String s = "Parmeshwar";
        System.out.println(cunt(s));
    }
}
