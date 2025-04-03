import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your sentence: ");
        String str=s.nextLine();
        Search se=new Search();
        if(se.search(str))
        {
            System.out.println("all parentheses are pairs");
        }
        else
            System.out.println("there is a parenthesis that is not a pair");
    }
}
class Search
{
    boolean search(String str)
    {
        Stack<Character> s=new Stack<>();
        char[] c=str.toCharArray();
        for(char C:c)
        {
            if(C=='(')
            {
                s.push('(');
            }
            else if (C==')')
            {
                if(s.isEmpty())
                {
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
