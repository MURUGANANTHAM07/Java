public class bubble {
    public static void main(String[]args){
       int i,j;
       int ar[]={3,10,2,1,6,5,4,7,9,8};
       System.out.println("before swap");
       for(i=0;i<ar.length;i++){
           System.out.print(ar[i]+" ");
       }
       for(i=0;i<ar.length;i++)
       {
           for(j=0;j<ar.length-1;j++)
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
       for(j=0;j<ar.length;j++){
           System.out.print(ar[j]+" ");
       }
    }
}
