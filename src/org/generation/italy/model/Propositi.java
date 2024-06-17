package org.generation.italy.model;

import java.util.ArrayList;

public class Propositi {
	private String nome;
	private static boolean completo;
	public Propositi(String nome) {
		this.nome=nome;
		completo=false;
	}
	public boolean isCompletato() {
		return completo;
	}
	public String getNome() {
		return nome;
	}
	
	public static void completato(int compl,ArrayList<Propositi> p) {
		if(!completo) {
			p.remove(compl);
		}
	}
}
