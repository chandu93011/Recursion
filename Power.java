import java.util.Scanner;

public class Power {

    public static int PowerOfNumber(int x,int n){
        int res;
        if(n==0){
            return 1;
        }else {
            int pow=PowerOfNumber(x,n-1);
            res=x*pow;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the exponent ");
        int n=sc.nextInt();
        System.out.println("Enter the number ");
        int x= sc.nextInt();
        System.out.println("The power will be "+ PowerOfNumber(x,n));

    }
}
