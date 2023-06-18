package com.sensori_antincendio;

public interface Subject {
	public void registra( Observer o);
	public void inregistra( Observer o);
	public void notificaTuttiOsservatori(String s);

}
