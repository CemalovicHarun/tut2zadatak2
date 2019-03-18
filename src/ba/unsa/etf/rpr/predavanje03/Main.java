package ba.unsa.etf.rpr.predavanje03;

import java.util.Scanner;

public class Main {
static int SumaCifara (int n){
    int broj=n,suma=0;
    while(broj!=0){
        int cifra= broj%10;
        suma+=cifra;
        broj=broj/10;
    }
    return suma;
}
    public static void main(String[] args) {
	int n;
	Scanner ulaz = new Scanner (System.in);
            System.out.println("Unesite broj n");
	        n=ulaz.nextInt();
	        System.out.println("Brojevi su: ");
	        for(int i=1;i<n;i++){
	            if (i % SumaCifara(n)==0){
	                System.out.println(i);
                }
            }

    }
}
