package com.sensori_antincendio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SensoriAntincendioApplication {

	public static void main(String[] args) {
		Edificio e1 = new Edificio ( "Scuola Elementare");
		Edificio e2 = new Edificio ("Azienda Agricola");
		SpringApplication.run(SensoriAntincendioApplication.class, args);
		Sonda s1 = new Sonda ();
		s1.setSmokelevel(2);
		
		Sonda s2 = new Sonda ();

		Sonda s3 = new Sonda ();
		e1.registra(s1);
		e1.registra(s2);
		
		e2.registra(s3);
		s1.Allarme();

		
	}

}
