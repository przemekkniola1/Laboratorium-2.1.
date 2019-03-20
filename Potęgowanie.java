import java.util.*;
import java.lang.*;
 
class Potegowanie
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner scanner = new Scanner(System.in);
int a, b, wynik = 1;
 
a = scanner.nextInt();
b = scanner.nextInt();
 
while(b > 0)
{
wynik *= a;
b--;
}
 
System.out.println(wynik);
}
}
