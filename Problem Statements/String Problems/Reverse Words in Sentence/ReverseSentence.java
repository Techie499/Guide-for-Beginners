import java.util.*;
class ReverseSentence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        s=s+" ";
        String s1="",s2="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char e=s.charAt(i);
            if(e!=' ')
            {
                s1=s1+e;
            }
            else
            {
                s2=s1+" "+s2;
                s1="";
            }
        }
        System.out.println(s2);
    }
}