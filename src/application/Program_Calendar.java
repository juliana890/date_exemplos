package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_Calendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//Padrão ISO 8601 UTC
		
		System.out.println(sdf.format(d));
		
		//Declarando o objeto Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); //Agora temos um calendário com a data "d" definida dentro dele, com isso podemos aumentar ou diminuir dias
		cal.add(Calendar.HOUR_OF_DAY, 4); //Essa chamada define que na data "d" acrescentamos 4 horas
		d = cal.getTime();//Para definir a data atualizada
		
		System.out.println(sdf.format(d));
		
		int minutos = cal.get(Calendar.MINUTE); //Obtendo os minutos da data "d"
		int horas = cal.get(Calendar.HOUR_OF_DAY); //Obtendo as horas da data "d"
		int mes = 1 + cal.get(Calendar.MONTH); //Somamos 1 pq os meses começam com o valor 0
		
		System.out.println("\nMinutos: " + minutos);
		System.out.println("Horas: " + horas);
		System.out.println("Mês: " + mes);
		

	}

}
