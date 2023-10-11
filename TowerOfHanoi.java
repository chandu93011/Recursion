import java.util.Scanner;

public class TowerOfHanoi {

    //A--> sourceDisk, b--> Destination disk , C--> helpdesk
    public static void toh(int n,char A,char B,char C){
        //Base condition otherwise it will give the stack over-flow error

        if(n==0){
            return;
        }
        // will print the instructions to move (n-1) disks
        //from A to C by using the B disk
        toh(n-1,A,C,B);
        System.out.println(n +"["+ A+ "->"+ B+"]");

        //will print the instructions to move (n-1) disks from
        // C to B using A {by following rules]
        toh(n-1,C,B,A);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char sourceDisk=sc.next().charAt(0);
        char destinationDisk=sc.next().charAt(0);
        char helperDisk=sc.next().charAt(0);
        toh(n,sourceDisk,destinationDisk,helperDisk);

    }
}
