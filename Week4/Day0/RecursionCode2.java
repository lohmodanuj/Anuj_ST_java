package Week4.Day0;

public class RecursionCode2 {
    //Tail Recursion
    // public static int sum(int n, int a) {
    //     if (n==1){
    //         return a+n;
    //     }
    //     return sum(n-1,a+n);
        
    // }
    // public static void main(String[] args) {
    //     int n=10;
    //     int sum=sum(n,0);
    //     System.out.println(sum);
               
    // }
    //Head Recursion
    public static int sumHead(int n){
        if(n==1) return 1;
        return n + sumHead(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        int sum=sumHead(n);
        System.out.println(sum);
        
    }
}
