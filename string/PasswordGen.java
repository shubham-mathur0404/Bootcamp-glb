import java.util.*;

public class PasswordGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fullname = new String();
        String id = new String();

        Fullname = sc.nextLine();
        id = sc.nextLine();

        String Firstname = "";
        String Lastname = "";
        int i = 0;
        while (i < Fullname.length() && Fullname.charAt(i) != ' ') {
            Firstname += Fullname.charAt(i);
            i++;
        }
        i++;

        int lastSpace = Fullname.lastIndexOf(' ');

        for(i = lastSpace + 1; i < Fullname.length(); i++) {
            Lastname += Fullname.charAt(i);
        }

        String password = Firstname +"_"+ Lastname + id;
        System.out.println(password);

        sc.close();

    }
}
