import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            boolean isAnagram = false;

            if (s1.length() == s2.length()) {
                char[] a1 = s1.toCharArray();
                char[] a2 = s2.toCharArray();
                Arrays.sort(a1);
                Arrays.sort(a2);
                isAnagram = Arrays.equals(a1, a2);
            }

            System.out.println(isAnagram);
        }
    }
}
