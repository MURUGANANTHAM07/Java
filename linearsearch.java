import java.util.Scanner;
 
public class linearsearch1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the element");
        int ar[]=new int[5];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("enter k value");
        int k=sc.nextInt();
        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                count++;
            }
        }
        if(count!=0){
            System.out.println("exist");
        }
        else{
            System.out.print("not");
        }
    }
}
