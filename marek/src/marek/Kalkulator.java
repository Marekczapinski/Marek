package marek;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) 
{
		System.out.println("Podaj liczb�");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj operacj8�");
		String operacja = scanner.next();
		System.out.println("Podaj liczb�");
		int liczba1 = scanner.nextInt();
		int liczba2 = scanner.nextInt();
		int wynik;
		if ( operacja.equals ("+")){
			wynik = liczba1 + liczba2;
		} else if ( operacja.equals ("-")){
			wynik = liczba1 - liczba2;
		}else if ( operacja.equals ("*")){
			wynik = liczba1 * liczba2;
		}else if ( operacja.equals ("/")){
			wynik = liczba1 / liczba2;
		}else if (operacja.equals("%")){
			wynik = liczba1 % liczba2;
		} else {
			System.out.println("bledna operacja");
			wynik = -1;
		}

		System.out.println(wynik);

	}

}
