import java.util.*;

public class Replacestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char rep = sc.next().charAt(0);
        
        

        String result = str1.replace(str2, String.valueOf(rep));

        System.out.print(result);

        sc.close();

    }
}
