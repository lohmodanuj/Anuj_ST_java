//Generate Subsequences
package Week4.Day1;

public class RecursionCode8 {
    //TAIL RECURSION
    // public static void generateSubsequences(String Ques, String ans){
    //     if(Ques.isEmpty()){
    //         System.out.println(ans);
    //         return;
    //     }
    //     generateSubsequences(Ques.substring(1), ans+Ques.charAt(0));
    //     generateSubsequences(Ques.substring(1), ans);
        
    // }
    // public static void main(String[] args) {
    //     String s= "TAP";
    //     generateSubsequences(s, "");
    // }
    

    //HEAD RECURSION
    public static int countSubseq(String Ques){
        if(Ques.isEmpty()){
            return 1;
        }
        int n1= countSubseq(Ques.substring(1));
        //int n2= countSubseq(Ques.substring(1));
        return n1*2;
    }
    public static void main(String[] args) {
        String s= "TAP";
        System.out.println(countSubseq(s));
        
    }
}
