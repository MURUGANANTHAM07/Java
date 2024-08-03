import java.util.Scanner;

public class stringcount {
    public static void main(String[]args){
         char a;
        Scanner d=new Scanner(System.in);
        System.out.println("enter the String");
         String string=d.nextLine();
         char ch[]=string.toCharArray();
         int count1=0;
        for(int i=0;i<ch.length;i++)
        {
            a=string.charAt(i);
            if(a=='a')
            {
               count1++;
            }
        }
        System.out.println("a"+count1);
             int count2=0;
        for(int j=0;j<ch.length;j++)
        {
            a=string.charAt(j);
            if(a=='b')
            {
               count2++;
            }
        }
        System.out.println("b"+count2);
            
            int count3=0;
        for(int k=0;k<ch.length;k++)
        {
            a=string.charAt(k);
            if(a=='c')
            {
               count3++;
            }
        }
        System.out.println("c"+count3);  
        }
}
    

