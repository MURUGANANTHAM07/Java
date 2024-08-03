 import java.util.Scanner;

public class fibnacci {
    public static void main(String[]args){
        int a=0;
        int b=1;
        Scanner s=new Scanner(System.in);
        System.out.print("value");
        int n=s.nextInt();
         System.out.print(a);
          System.out.print(b);
        int c=a+b;
        while(c<=n){
            System.out.print(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
