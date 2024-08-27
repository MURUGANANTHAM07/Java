public class triangle {
    public static void main(String[]args){
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=9;j++){
                if(i==n||i+j==n+1||j-i==4)
                    System.out.print("* ");
                else
                 System.out.print("  ");   
            }
            System.out.println(" ");
        }
    }
}
