package com.inforhomex.jtarot.service;

public interface Calculable{
	String getCalculo(String nombre, String fecha);
	String getTarot(String fecha);
	String getDescripcion(String nombre, String fecha);
}
