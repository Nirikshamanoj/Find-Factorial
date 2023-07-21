import java.util.Scanner;
public class FindFactorial {
    static int findFactorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return (findFactorial(n-1)*n);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int factorial=findFactorial(n);
        System.out.println(factorial);
    }
}
