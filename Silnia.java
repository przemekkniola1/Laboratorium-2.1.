import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner klaw=new Scanner(System.in);
        System.out.print("n = ");
        n=klaw.nextInt();
        int i=1, s=1;
        while(i<=n){
            s=s*i;
            i++;
        }
        System.out.print(n);
        System.out.print("! = ");
        System.out.println(s);
    }
}