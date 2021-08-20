package sample;
import java.util.Scanner;

public class String_Reverse {

        public static void main(String[] arg)
        {
            String_Reverse rev=new String_Reverse(); //String reverse object creation
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a string : ");
            String  s=sc.nextLine(); // Inputting the String literal
            System.out.println("Reverse String  is : "+rev.reverse(s)); //calling method
        }
        //calling method
        static String reverse(String str)
        {
            String rev="";
            for(int i=str.length();i>0;--i)
            {
                rev=rev+(str.charAt(i-1));
            }
            return rev;
        }
}
