import java.util.Scanner;
import java.util.Stack;

public class ValidPara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

    
            else {

                
                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = stack.peek();

                
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {

                    stack.pop();
                } else {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        
        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}