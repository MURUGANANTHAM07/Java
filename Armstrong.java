import java.util.Scanner;
 
public class armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value");
        int n=sc.nextInt();
        int t=n,temp=0;
        while(n>0){
            int r=n%10;
            temp=temp+(r*r*r);
             n=n/10;
        }
        if(t==temp){
            System.out.print("armstrong");
        }
        else{
            System.out.print("not");
        }
    }
}
