package com.inforhomex.jtarot.service;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;


@Service("calculable")
public class CalculableImpl implements Calculable{

	@Override
	public String getTarot(String nombre, String fecha){
		String[] datos = fecha.split("-");
		int a = Integer.parseInt(datos[0]);
		int b = Integer.parseInt(datos[1]);
		int c = Integer.parseInt(datos[2]);
		// 1981 + 12 + 18 = 2011
		int suma = a + b + c;
		return "/img/"+getCarta(separar(String.valueOf(suma)))+".jpg";
	}

	@Override
	public String getCalculo(String nombre, String fecha){
		String result = "";
		String[] datos = fecha.split("-");
		result += "Nombre: "+nombre+" | ";
		result += "Año : "+datos[0]+" | ";
		result += "Mes : "+datos[1]+" | ";
		result += "Día : "+datos[2]+" | ";

		
		int a = Integer.parseInt(datos[0]);
		int b = Integer.parseInt(datos[1]);
		int c = Integer.parseInt(datos[2]);
		// 1981 + 12 + 18 = 2011
		int suma = a + b + c;

		result += "";
		result += "No. de nacimiento: "+ separar(String.valueOf(suma))+" | ";

		String miCarta = getCarta(separar(String.valueOf(suma)));
		result += "Tu carta del Tarot de nacimiento es: "+miCarta;


		return result;
	}


	public static HashMap<Integer,String> getMapa(){
		HashMap<Integer,String> tarot = new HashMap<Integer,String>();
		tarot.put(1, "EL MAGO");
		tarot.put(2, "LA PAPISA");
		tarot.put(3, "LA EMPERATRIZ");
		tarot.put(4, "EL EMPERADOR");
		tarot.put(5, "EL PAPA");
		tarot.put(6, "EL ENAMORADO");
		tarot.put(7, "EL CARRO");
		tarot.put(8, "LA JUSTICIA");
		tarot.put(9, "EL ERMITAÑO");
		tarot.put(10, "LA RUEDA");
		tarot.put(11, "LA FUERZA");
		tarot.put(12, "EL COLGADO");
		tarot.put(13, "LA MUERTE");
		tarot.put(14, "LA TEMPLANZA");
		tarot.put(15, "EL DIABLO");
		tarot.put(16, "LA TORRE");
		tarot.put(17, "LA ESTRELLA");
		tarot.put(18, "LA LUNA");
		tarot.put(19, "EL SOL");
		tarot.put(20, "EL JUICIO");
		tarot.put(21, "EL MUNDO");
		tarot.put(22, "EL LOCO");
		return tarot;
	}

	public static String getCarta(int numero){
		HashMap<Integer,String> mapa = getMapa();
		return (String) mapa.get(numero);
	}

	public static int separar(String numero){
		int suma = 0;
		for(int i= 0; i < numero.length() ; i++){
			char c = numero.charAt(i);
			suma += Integer.parseInt(String.valueOf(c));
		}
		if(suma > 22){
			String tmp = String.valueOf(suma);
			int s = 0;
			for(int j = 0; j < tmp.length(); j++){
				char tmpC = tmp.charAt(j);
				s += Integer.parseInt(String.valueOf(tmpC));
			}
			suma = s;
		}
		return suma;
	}

}
