package Week4.Day0;
public class RecursionCode4 {
    //Tail Recursion
    // public static int power(int base, int pow, int ans){
    //     if(pow==0)
    //         return ans;
    //     else
    //         return power(base, pow-1, ans*base);
    // }
    // public static void main(String[] args) {
    //    int n=10;
    //    int pow=5;
    //    int ans=1;
    //    System.out.println(power(n,pow,ans));

    // }
    
    //Head Recursion
    public static int powerHead(int base, int pow){
        if(pow==0)
            return 1;
        return base * powerHead(base, pow-1);
    }
    public static void main(String[] args) {
       int n=10;
       int pow=5;
       System.out.println(powerHead(n,pow));
}
}
