package src.main.java.simple;

public class GreatestLetter {
    public static void main (String[] args) {
        GreatestLetter g = new GreatestLetter();
        System.out.println(g.greatestLetter("lEeTcOdE"));
    }

    public static String greatestLetter(String s) {
        int a [] = new int [26];
        int b [] = new int [26];
        char[] n = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(n[i])) {
                a[n[i]-'a']++;
            } else {
                b[n[i]-'A']++;
            }
        }
        for(int j = 26; j >0; j--) {
            if (a[j-1] >0 && b[j-1] > 0) {
                return String.valueOf(j+'a');
            }
        }
        return "";
    }
}
