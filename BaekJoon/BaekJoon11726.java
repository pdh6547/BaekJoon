package BaekJoon;

import java.util.Scanner;

public class BaekJoon11726 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n[] = new int[N];
        if(N>=2) {
            n[0] = 1;
            n[1] = 2;
            for (int i = 2; i < n.length; i++) {
                n[i] = (n[i-1] + n[i-2])%10007;
            }
        }
        else if(N<2) {
            n[0] = 1;
        }
        System.out.println(n[n.length-1]%10007);
    }
}
