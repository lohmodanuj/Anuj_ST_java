package Week4.Day1;

public class RecursionCode9 {
    public static void validParentheses(int n, int l, int r, String ans){
        if(l==n && r==n){
            System.out.println(ans);
            return;
        }
        if(l>n || r>l) return;
        validParentheses(n, l+1, r, ans+"{");
        validParentheses(n, l, r+1, ans+"}");

    }
    public static void main(String[] args) {
        validParentheses(4, 0, 0, "");
    }
    
}
 