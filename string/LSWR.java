import java.util.Scanner;

public class LSWR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            int[] Freq = new int[256];

            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (Freq[ch] > 0) {
                    break;
                }
                Freq[ch]++;
                if (j - i + 1 > max) {
                    max = j - i + 1;
                    ans = str.substring(i, j + 1);
                }

            }
         
        }
           System.out.println(ans);

            sc.close();
    }
}