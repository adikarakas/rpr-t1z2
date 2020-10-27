package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int n) {
        int suma=0;
        while (n!=0) {
            int temp=n%10;
            suma=suma+temp;
            n=n/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesite jedan prirodan broj: ");
        int n=ulaz.nextInt();
        System.out.print("Brojevi djeljivi sa sumom svojih cifara na intervalu od 1 do " +n + " su:");
        for (int i=1; i<=n; i++) {
            if (i%sumaCifara(i)==0) System.out.print(i + " ");
        }
    }
}
