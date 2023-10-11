import java.util.Scanner;

public class Numbers {
    public void PrintNumbers(int n){

        // base condition
        if(n==0){
            System.out.println();
        }else{
            System.out.print(n +" ");
            PrintNumbers(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Numbers nm=new Numbers();
        nm.PrintNumbers(n);
    }
}
