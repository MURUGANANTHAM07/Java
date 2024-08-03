import java.util.Scanner;

public class prime {
    public static void main(String[]args){
        int x=2;
        System.out.print("enter the n");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(x<=n){
            if(n%x==0)
                break;
            x++;
        }
        if(x==n){
            System.out.print("prime");}
        else{
             System.out.print("not prime");
        }
        }
    }
