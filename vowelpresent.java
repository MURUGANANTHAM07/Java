public class work {
    public static void main(String[]args){
        String str="Cadopt";
        char ch[]=str.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                System.out.println("vowel present");
            }
            else{
                System.out.println("not");
            }
        }
    }
}
