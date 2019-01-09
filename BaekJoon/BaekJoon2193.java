package BaekJoon;

import java.util.Scanner;

public class BaekJoon2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long n[] = new long[N];
        if(N>=2) {
            n[0] = 1;
            n[1] = 1;
            for (int i = 2; i < n.length; i++) {
                n[i] = (n[i-1] + n[i-2]);
            }
        }
        else if(N<2) {
            n[0] = 1;
        }
        System.out.println(n[n.length-1]);
    }
}
