package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		ArrayList<String> list;
		list = new ArrayList<String>();

		boolean termina = false;

		while (termina = true) {

			System.out.print("Aggiungi un elemento alla lista dei desideri: ");
			list.add(scn.nextLine());
			System.out.println("La tua lista contiene " + list.size() + " desiderio");
			System.out.print("Continuare? (s/n)");
			String risposta = scn.nextLine().toLowerCase();

			if (risposta.equals("s")) {

				termina = true;

			} else {
				break;
			}

		}
		System.out.println("Ecco la tua lista:");
		for (String i : list) {
			System.out.println(i);
		}

		scn.close();
	}

}
