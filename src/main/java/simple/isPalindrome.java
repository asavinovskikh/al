package src.main.java.simple;

//https://leetcode.com/problems/palindrome-number/description/
public class isPalindrome {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x); //число в строку - нужна запись
        int len = s.length(); // посчитаем количество элементом

        for (int i=0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }

    public static void main (String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(122222));
    }
}