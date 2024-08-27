import java.util.Scanner;

public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value");
        int n=sc.nextInt();
        int r=0;
        int a;
        while(n>0){
            a=n%10;
            int palindrome=r*10+a;
             n=n/10;
             System.out.print(palindrome);
        }
    }
}
