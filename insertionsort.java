public class insertion {
    public static void main(String[]args){
        int ar[]={6,4,3,1,5,8,7};
       for(int i=0;i<ar.length;i++){
           int key=ar[i];
           int j=i-1;
           while(j>=0&&ar[j]>key){
               ar[j+1]=ar[j];
               j--;
           }
           ar[j+1]=key;
       }    
       System.out.println("after swap");
       for(int i=0;i<ar.length;i++){
           System.out.print(ar[i]+" ");
       }
    }
}
