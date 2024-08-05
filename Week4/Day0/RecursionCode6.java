package Week4.Day0;

public class RecursionCode6 {
    //Head Recursion
    // public static int fib(int n) {
    //     if(n==0 || n==1) return n;
    //     return fib(n-1)+fib(n-2);
    // }

    // public static void main(String[] args){
    //     int n=10;
    //     System.out.println(fib(n));
    // }

    // Tail Recursion
    public static int fibTail(int n, int a, int b) {
        if(n==0) return a;
        return fibTail(n-1, b, a+b);
    }
    
    public static void main(String[] args){
        int n=6;
        System.out.println(fibTail(n, 0, 1));
    }
    
}
