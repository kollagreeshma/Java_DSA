import java.util.*;
public class Sumofnumusingdynamic {
    static int[] memo;

    public static int SumDigits(int n){
        if(n<10){
            return n;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n] = (n%10) + SumDigits(n/10);

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 12345;
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(SumDigits(n));
    }
}
