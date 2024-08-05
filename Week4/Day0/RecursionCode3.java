package Week4.Day0;

public class RecursionCode3 {
    // public static int countEven(int n,int count) {
    //     if(n==1)
    //         return count;
    //     if(n%2==0) count++;
    //     return countEven(n-1, count);
        
    // }
    // public static void main(String[] args) {
    //     int n=10;
    //     int count=0;
    //     System.out.println(countEven(n, count));
    // }

    public static int countEven(int n) {
        if (n == 1)
            return 0;
        
        else if (n % 2 == 0)
            return 1 + countEven(n - 1);
         
        else
            return countEven(n - 1);
        
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countEven(n));
    }
}

