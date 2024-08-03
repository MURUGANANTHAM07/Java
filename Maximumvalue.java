public class sorting {
    public static void main(String[]args){
        int ar[]={30,50,40,70,10,80,20,90,60};
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        for(int i=1;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("after swap");
        for(int j=0;j<ar.length;j++){
        System.out.print(ar[j]+" ");
        }
         int val=ar.length;
         System.out.println("maximumvalue"+ar[val-1]);
         System.out.println(" sec maximumvalue"+ar[val-2]);
    }
}
