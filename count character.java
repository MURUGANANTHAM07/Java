import java.util.Scanner;
 
public class string {
     public static void main(String[]args){
         String string;
         char a;
         int character=0,space=0,special=0,number=0;
        Scanner d=new Scanner(System.in);
        System.out.println("enter the String");
         string=d.nextLine();
         char ch[]=string.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            a=string.charAt(i);
            if(a>='a'&&a<='z')
            {
               character++;
            }
            else if(a>'0'&&a<'9')
            {
               number++;
            }
            else if(a==' ')
            {
               space++;
            }
            else{
            special++;
            }
        }
            System.out.println("character="+character);
            System.out.println("number="+number);
            System.out.println("space="+space);
            System.out.println("special="+special);
        }
        }
    

