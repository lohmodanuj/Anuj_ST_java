package Week4.Day2;

public class Cheezy{
    static int sum=0;
    static boolean backtrackSumArray(int[] arr, int i, int k){
        if(i==arr.length) return true;
        if (sum>k) return false;
        sum+=arr[i];
        if(!backtrackSumArray(arr, i+1, k)){
            sum-=arr[i];
            
        }
        return true;
    }
    static void sumArray(int i, int[] arr, int k){
    if(i==arr.length) return;
    sum+=arr[i];
    if (sum>k){
        sum-=arr[i];
        return;
    }
    sumArray(i+1, arr,k);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        sumArray(0,arr,14);
        System.out.println(sum);
        System.out.println(backtrackSumArray(arr, 0, 14));      
        
    }
    
}
