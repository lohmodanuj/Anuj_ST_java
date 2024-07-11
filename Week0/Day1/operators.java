package Day1;

public class operators {
    public static void main(String[] args) {
        //1. Arithmetic operators
        /*int a=2, b=3;
        // +,-,*,/,%,++,--
        a=a+b;
        b=b+a;
        a=a-b;
        b=b-a;
        ++a; a++;    //++a means increment before execution & a++ means increment after execution
        --b; b--; */   //--a means decrement before execution & a-- means decrement after execution

       //2. Comparison operators
       // >,<,!=,==,<=,>=
       
       //3. Logical operators
       // &&=and, ||=or, !
       // if (!(a>b || a<10));

       //4. Assignment operators
       /*int x=2;
       x+=3; // x=x+3;
       x-=3; // x=x-3;
       x*=3; // x=x*3;
       x/=3; // x=x/3;
       x%=3; // x=x%3;  */

       //Homework: Bitwise --> &, |, ^, <<, >>, ~
       
       //Loops: for, while, Do-while
       for (int i=0;i<10;i++){
        //code
       }
       // Using a for loop print sum of all numbers 1-->25
       // 1,2,3,4,5,....,25
       // 1,3,6,10,15,....
      /* int sum=0;
       for(int i=1;i<=25;i++){
        sum+=i;
        System.out.print(sum+" , ");
       }*/
       

       //the first multiple of 2 & 7 
       int i=5;
       while(i<15){
        if (i%2==0 && i%7==0)
        System.out.println(i);
        i++;
       }
        

    }
    
}
