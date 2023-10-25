package desafio_pensionato;

import java.util.Locale;
import java.util.Scanner;

import entities_pensionato.Rent;

public class app_pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How may rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
