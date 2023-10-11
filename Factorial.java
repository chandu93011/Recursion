import java.util.Scanner;

public class Factorial {

    public static int Fact(int n){
        int res;
        //base condition
        if(n==0 || n==1)
            return 1;
        else{
            res=n*Fact(n-1);

        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=Fact(n);
        System.out.println(ans);

    }
}
