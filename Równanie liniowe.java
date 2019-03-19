import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float a,b;
        Scanner klaw=new Scanner(System.in);
        System.out.print("a=");
        a=klaw.nextFloat();
        System.out.print("b=");
        b=klaw.nextFloat();
        if(a==0)
            if(b==0)
                System.out.println("Równanie tożsamościowe");
            else
                System.out.println("Równanie sprzeczne");
        else {
            float x;
            x=-b/a;
            System.out.print("x=");
            System.out.println(x);
        }
    }
}