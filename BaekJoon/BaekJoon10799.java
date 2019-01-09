package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10799 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c [] = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            if(c[i]=='(') {
                stack.push(c[i]);
            }
            else if (c[i]==')'){
                if(c[i-1]=='('){
                    stack.pop();
                    cnt+=stack.size();
                }
                else {
                    stack.pop();
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}
