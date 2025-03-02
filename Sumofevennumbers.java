import java.util.Scanner;

public class Sumofevennumbers {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=scan.nextInt();
        int i=0,s=0;
        while(i<n)
        {
            s+=i;
            i+=2;
        }
        System.out.printf("the sum of even numbers till %d : %d",n,s);
    }
}
