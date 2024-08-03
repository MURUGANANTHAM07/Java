import java.util.Scanner;

public class insert {
    public static void main(String[]args){
        int ar[]=new int[5];
        System.out.println("enter the array value");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<ar.length-1;i++){
            ar[i]=s.nextInt();
        }
        for(int i:ar){
            System.out.println(i);
        }
        System.out.print("enter the location");
        int location=s.nextInt();
         System.out.print("enter the value");
        int value=s.nextInt();
        for(int i=ar.length-1;i>location;i--){
            ar[i]=ar[i-1];
        }
        ar[location]=value;
        for(int i:ar){
            System.out.println(i);
        }
    }
}
