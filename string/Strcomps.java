import java.util.Scanner;

public class Strcomps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [] Freq = new int[256];

        for(int i=0;i<str.length();i++){
            Freq[str.charAt(i)]++;
        }

        for(int i=0;i<str.length();i++){
            if(Freq[str.charAt(i)]!=0){
            System.out.print(str.charAt(i) + "" + Freq[str.charAt(i)]);
            }
            Freq[str.charAt(i)]=0;
        }
        sc.close();

    }
}
