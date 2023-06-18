package com.sensori_antincendio;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;




@Data
@AllArgsConstructor
public class Edificio implements Subject{
	private String nome;
	private List<Observer> sonde;
	
	public Edificio(String nome) {
		super();
		this.nome = nome;
		this.sonde = new ArrayList<>();
	}

	@Override
	public void registra(Observer o) {
		sonde.add(o);
		System.out.println(o + " Aggiunta nell'edificio " + this.nome);
		
	}

	@Override
	public void inregistra(Observer o) {
		sonde.remove(o);
		System.out.println(o + " rimossa dall'edificio " + this.nome);
		
	}

	@Override
	public void notificaTuttiOsservatori(String s) {
		for(Observer observer : sonde) {
			observer.update(nome, s);
		}
	}
}
