
public class noRep {
    public static char nonRepeting(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean found = false;
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
                if (!found) {
                    return s.charAt(i);
                }
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String s = "Parmeshwar";
        System.out.println(nonRepeting(s));
    }
}
