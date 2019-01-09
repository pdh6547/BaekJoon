package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c[] = new char[s.length()];
        int n = Integer.parseInt(br.readLine());
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            left.push(c[i]);
        }
        while (n != 0) {
            String s2 = br.readLine();
            if (s2.contains("L")) {
                if(left.isEmpty()) {
                    n--;
                    continue;
                }
                right.push(left.pop());
            } else if (s2.contains("D")) {
                if(right.isEmpty()){
                    n--;
                    continue;
                }
                left.push(right.pop());
            } else if (s2.contains("B")) {
                if(left.isEmpty()) {
                    n--;
                    continue;
                }
                left.pop();
            } else if (s2.contains("P")) {
                char c2 = s2.charAt(2);
                left.push(c2);
            }
            n--;
        }
        while(!left.isEmpty()){
            right.push(left.pop());
        }
        while(!right.isEmpty()){
            System.out.print(right.pop());
        }
    }
}
