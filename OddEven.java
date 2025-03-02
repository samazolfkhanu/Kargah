import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int c;
        do {
            System.out.print("choose one of items:\n1.odd and even numbers\n2.reversing the number\n3.sum of even numbers\n4.exit");
            c=scan.nextInt();
            switch(c)
            {
                case 1:
                    oddeven();
                    break;
                case 2:
                    reverseNumber();
                    break;
                case 3:
                    sumofevennumbers();
                    break;
                case 4:
                    System.out.print("exiting the code ...!");
                    break;
            }

        }while(c!=4);

    }
    static void oddeven()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=scan.nextInt();
        if(n%2==0) System.out.printf("%d is an even number!",n);
        else System.out.printf("%d is an odd number!",n);
    }
    static void sumofevennumbers()
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
        scan.close();
    }
    static void reverseNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=scan.nextInt();
        int m=0;
        while(n>0)
        {
            m=(m+(n%10))*10;
            n=n/10;
        }
        System.out.printf("reverse number: %d",m);
        scan.close();
    }
}
