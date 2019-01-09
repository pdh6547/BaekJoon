package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N[] = new int[n];
        int j = 0;
        Stack<Character> stack = new Stack<>();
        while (n != 0) {
            while(!stack.isEmpty()){
                stack.pop();
            }
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                char c[] = new char[s.length()];
                c[i] = s.charAt(i);
                if (c[i] == '(') {
                    stack.push(c[i]);
                } else if (c[i] == ')') {
                    if(stack.isEmpty()) {
                        System.out.println("NO");
                        j++;
                        break;
                    }
                    else stack.pop();
                }
                if(i==s.length()-1){
                    if(stack.isEmpty()) {
                        System.out.println("YES");
                        j++;
                    }
                    else if (!stack.isEmpty()) {
                        System.out.println("NO");
                        j++;
                    }
                }
            }
            n--;
        }
    }
}
