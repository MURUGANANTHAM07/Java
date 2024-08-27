import java.util.Scanner;
 
public class arraymatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value");
        int ar[][]=new int[3][3];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                ar[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                System.out.print(15+ar[i][j]+" ");
            }
            System.out.println();
         }
    }
}
