import java.util.Scanner;


public class Permutation {

    static void permute(char[] arr, int index) {

        if (index == arr.length) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

        
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(arr, index + 1);

            
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray(); // built-in function

        permute(arr, 0);
        sc.close();
    }
}