package Day2;
import java.util.Scanner;


public class patternprinting {
    public static void main(String[] args){
        
        
        // * in 1 line
        /*for (int i=0; i<5; i++){
            System.out.print("* ");*/
        
        // * in 1 line
        /*int n;
        Scanner Sc = new Scanner(System.in);
        n=Sc.nextInt();
        for (int i=1; i<=n; i++)
            System.out.print("* ");
        sc.close();
        */

        // * in square form
        /*Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */
        

        // * in right facing triangle form
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        // * in left facing triangle form
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        // * in inverted right facing triangle
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */


        // * in inverted left facing triangle
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        //Ques6
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("    ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        //Ques7
        /*Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        
            
        }
        sc.close(); */

        //Ques8
        /*Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
                if(i==j || i+j==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        
            
        }
        sc.close(); */

        //Ques9
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for (int j1=1; j1<=i; j1++)
                System.out.print("* ");
            for (int j2=1; j2<=i-1; j2++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        //Ques10
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for (int j1=1; j1<=i; j1++)
                System.out.print("* ");
            for (int j2=1; j2<=i-1; j2++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        //Ques11                               // galat h wapis kr
        /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++)
                System.out.print("   ");
            for (int j=1; j<=i; j++)
                System.out.print("  *   ");
            System.out.println();
        }
        sc.close(); */

        //Ques12                                    //galat h wapis kr
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("   ");
            for (int j=1; j<=i; j++)
                System.out.print("  *   ");
            System.out.println();
        }
        sc.close(); */


        //Ques13
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
        sc.close(); */

        //Ques14
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("  ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
        sc.close(); */

        //Ques15
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("    ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=2; i<=n; i++){
            for (int k=1; k<=(n-i); k++)
                System.out.print("    ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */
        
        //Q
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=2; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        //Q
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++)
                System.out.print("    ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int k=1; k<=(n-i); k++)
                System.out.print("    ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close(); */

        //Ques16
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=2; i<=n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
    
}
