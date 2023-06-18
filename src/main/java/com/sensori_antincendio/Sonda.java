package com.sensori_antincendio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RequestMapping("/host")
public class Sonda implements Observer {
	@Id
	private Long Id;
	private double longitudine;
	private double latitudine;
	private int smokelevel;
	
	@Override
	public void update(String name, String s) {
System.out.println("la sonda ha aggiornati i dati");		
	}
	
	public String toString() {
		return "Sonda [SondaId=" + Id + "]";
	}
	@GetMapping("/alarm")
	public void Allarme() {
		if (smokelevel > 3 ) {
			System.out.println("Lo smoke level è maggiore di 3, l'edificio è a fuoco");
		}
	}

}
