package Week4.Day0;

public class RecursionCode5 {
    // Head Recursion
    // public static int factorial(int n){
    //     if(n==0 || n==1) return 1;
    //     return n*factorial(n-1);
    // }
    // public static void main(String[] args) {
    //     // int n=5;
    //     System.out.println(factorial(5));

    // }
    //Tail Recursion
    public static int factorial(int n, int ans){
        if(n==0 || n==1) return ans;
        return factorial(n-1, n*ans);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n, 1));
    }
}
