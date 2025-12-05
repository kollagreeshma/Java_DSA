import java.util.Arrays;

public class factorialusingdynamic {
    static int[] memo;

    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n] = n*factorial(n-1);

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5;
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(factorial(n));
    }
}

