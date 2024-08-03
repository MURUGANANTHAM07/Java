import java.util.Scanner;
 
public class delete {
    public static void main(String[]args){
        int ar[]=new int[5];
        int max=4;
        int location=0;
        Scanner s=new Scanner(System.in);
         System.out.println("enter the array");
        for( int i=0;i<=max;i++){
            ar[i]=s.nextInt();
        }
        System.out.println(" integer array values");
        for( int i=0;i<=max;i++){
           System.out.println(ar[i]);
        }
        System.out.println("enter the array delete location");
        location=s.nextInt();
         for( int i=location;i<max;i++){
             ar[i]=ar[i+1];
         }
         System.out.println(" after delete the array");
        for( int i=0;i<max;i++){
           System.out.println(ar[i]);
        }
    }
}
