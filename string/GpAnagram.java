import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GpAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
         ArrayList<String> anagrams = new ArrayList<>();
        System.out.println("enter the no of element");
        int Num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < Num; i++) {
            System.out.println("enter the element no " + i + ":");
            String word = sc.nextLine();
            words.add(word);
        }

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (isAnagram(words.get(i), words.get(j))) {
                     anagrams.add(words.get(i));
                    anagrams.add(words.get(j));
                }
            }
        }
         System.out.println(anagrams);

        sc.close();
    }

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
