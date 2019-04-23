package com.inforhomex.jtarot.service;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;


@Service("calculable")
public class CalculableImpl implements Calculable{


	@Override
	public String getDescripcion(String nombre, String fecha){
		String[] datos = fecha.split("-");
		int a = Integer.parseInt(datos[0]);
		int b = Integer.parseInt(datos[1]);
		int c = Integer.parseInt(datos[2]);
		// 1981 + 12 + 18 = 2011
		int suma = a + b + c;
		String miCarta = getCarta(separar(String.valueOf(suma)));
		String descripcion ="";
		switch(miCarta){
			case "EL MAGO": descripcion += nombre+ ", tus capacidades comunicativas y para resolver problemas se verán realizadas.";break;
			case "LA PAPISA": descripcion += nombre+", comienza una época de independencia que te dará una nueva identidad.";break;
			case "LA EMPERATRIZ": descripcion += nombre+", tiempo de sanar y evaluar cosas importantes.";break;
			case "EL EMPERADOR": descripcion = nombre+", es un buen año para realizar cambios y tomar el liderazgo.";break;
			case "EL PAPA": descripcion += nombre+", un buen año para desarrollarse.";break;
			case "EL ENAMORADO": descripcion += nombre+", tiempo para renovar pareja o separarse de ella.";break;
			case "EL CARRO": descripcion += nombre+", época de cambios, de mudanzas. Mucha actividad.";break;
			case "LA JUSTICIA": descripcion += nombre+", tiempo para equilibar el trabajo y el descanso.";break;
			case "EL ERMITAÑO": descripcion += nombre+", atiende a tus voces interiores y termina lo inconcluso.";break;
			case "LA RUEDA": descripcion += nombre+", las puertas pequeñas siempre se abren que las grandes.";break;
			case "LA FUERZA": descripcion += nombre+", tiempo pra las artes y la creatividad.";break;
			case "EL COLGADO": descripcion += nombre+", deberás renunciar a todos los objetivos que no se han originado de tu ser.";break;
			case "LA MUERTE": descripcion += nombre+", alguien se irá. Vendrán grandes cambios.";break;
			case "LA TEMPLANZA": descripcion += nombre+", la belleza llenará tu vida y sentirás la presencia de seres de luz.";break;
			case "EL DIABLO": descripcion += nombre+", deberás reírte de ti mismo, de tus problemas, pensar con humor.";break;
			case "LA TORRE": descripcion += nombre+", tiempo para ponerse a prueba, grandes transformaciones en tu vida.";break;
			case "LA ESTRELLA": descripcion += nombre+", mejorará tu autoestima. Lograás el éxito y tus objetivos.";break;
			case "LA LUNA": descripcion += nombre+", tiempo de alcanzar independencia y sabiduría.";break;
			case "EL SOL": descripcion += nombre+", oportunidades en todos loa ámbitos. Un buen año.";break;
			case "EL JUICIO": descripcion += nombre+", los pendientes te pueden alanzar. Deberás razonar a cerca de tu vida.";break;
			case "EL MUNDO": descripcion += nombre+", tiempo pra viajar y conocer el mundo.";break;
			case "EL LOCO": descripcion += nombre+", abrete a la amabilidad, trata de olvidad el caos del mundo.";break;
			default: break;
		}
		return descripcion;
	}

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
		result += "Tu número es: "+ separar(String.valueOf(suma))+" | ";

		String miCarta = getCarta(separar(String.valueOf(suma)));
		result += "Tu carta del Tarot es: "+miCarta;


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
