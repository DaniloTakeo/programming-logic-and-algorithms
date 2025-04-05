package stringTransformation;

public class StringTransformation {
    public static boolean canTransform(String s, String t) {
        if (s.length() != t.length()) return false;

        int changes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                changes++;
            }
        }

        return changes <= s.length(); // é possível com até s.length() operações
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "adc";

        boolean result = canTransform(s, t);
        System.out.println("Pode transformar? " + result);
    }
}