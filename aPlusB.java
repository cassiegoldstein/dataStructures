
import java.util.Scanner;

public class aPlusB
{
    private int a;
    private int b;
    private int sum;

    public aPlusB(int a, int b)
    {
        this.a = a;
        this.b = b;
        sum = 0;
    }

    public int addition()
    {
        sum = a + b;
        return sum;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        aPlusB sum = new aPlusB(a, b);
        int sum1 = sum.addition();
        System.out.println(sum1);
        
    }
    
    
}
