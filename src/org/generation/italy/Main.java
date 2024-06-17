package org.generation.italy;

import java.util.ArrayList;
import java.util.Scanner;

import org.generation.italy.model.Propositi;

public class Main {
	static String risp;
	static String nome;
	static int completato;
	static int cont = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Propositi> listaPropositi = new ArrayList<Propositi>();
		//inizio
		System.out.println("I 5 buoni propositi 2024");
		//inserimento propositi
		for (int i = 0; i < 5; i++) {
			System.out.println("inserisci il tuo proposito");
			nome = sc.nextLine();
			Propositi p = new Propositi(nome);
			listaPropositi.add(p);
		}
		//ciclo per ripetere fino a completamento
		do {
			//ciclo per scoprrimento lista
			for (int i = 0; i < listaPropositi.size(); i++)
				//stampa
				System.out.println("il proposito numero " + i + " " + listaPropositi.get(i).getNome());
			System.out.println("Hai completato qualche proposito? (1)si (2)no");
			risp = sc.nextLine();
			//verifica completamento
			if (risp.equalsIgnoreCase("1")) {
				System.out.println("quale hai completato?");
				try {
					completato = sc.nextInt();
					//richiamo metodo rimozione lista
					Propositi.completato(completato, listaPropositi);
					System.out.println("il proposito è stato completato e rimosso dalla lista");
					cont++;
				} catch (Exception e) {
					e.getMessage();
				}
			}

		} while (cont < 5);
		//fine
		System.out.println("complimenti hai completato tutti i tuoi propositi");
	}// fine main

}
