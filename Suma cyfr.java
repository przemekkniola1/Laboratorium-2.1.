import java.util.*;

public class Main {

    public static int sumaCyfr(int liczba) {
        // deklaracja i inicjalizacja zmiennej
        int suma = 0;

        do {
            // wyciagamy z liczby ostatnią cyfrę (modulo 10)
            int cyfra =  liczba % 10;
            // dodajemy ją do sumy
            suma += cyfra;
            // modyfikujemy liczbę (pozbywamy się ostatniej cyfry)
            liczba = (liczba - cyfra) / 10;

            // pętla działa dopóki liczba jest różna od zera
        } while ( liczba != 0 );

        // zwracamy do miejsca wywołania obliczoną sumę
        return suma;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print ("Podaj liczbę: " );

        // pobieramy od użytkownika liczbę
        int liczba = sc.nextInt();

        // wyświetlamy na ekranie sumę cyfr w liczbie
        System.out.println("Suma cyfr: " + sumaCyfr(liczba));

    }
}
