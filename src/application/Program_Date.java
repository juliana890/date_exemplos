package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program_Date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Definição de time zone para o exemplo do Y3 - Horario de Brasilia
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date x1 = new Date(); //Data e hora atual
		Date x2 = new Date(System.currentTimeMillis()); //Pega a data do sistema e converte para o valor Date
		Date x3 = new Date(0L);
		
		//Criando data as 5hrs da manhã do dia 01/01/1970
		//L indica long
		//1 sg tem 1000 ms
		//Multiplica 1 sg por 60 para dar 1 minuto, novamente para dar 1 hora, e por fim multiplica por 5 para dar 5 horas
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		//Data no formato ISO 8601 padrão UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		
		System.out.println("\nSem formatação - Exemplos:");
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		System.out.println("X3: " + x3); 
		System.out.println("X4: " + x4); 
		System.out.println("Y3: " + y3);
		
		//Para imprimir as datas no formato dd/MM/yyyy HH:mm:ss - Utilizamos o sdf2
		System.out.println("\nSDF2 - Exemplos:");
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3)); //Essa impressão acontece pq o java marca apenas datas a partir de 01/01/1970 Horário de São Paulo é 3 horas menor que o GMT UTC
		System.out.println("X4: " + sdf2.format(x4)); //Essa impressão marca 5 horas do dia 01/01/1970 OBS: 02:00 pois em São Paulo temos 3 horas a menos 
		System.out.println("Y3: " + sdf2.format(y3));
		
		System.out.println("\nSDF3 - Exemplos:");
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3)); 
		System.out.println("X4: " + sdf3.format(x4)); 
		System.out.println("Y3: " + sdf3.format(y3));
		
		
	}

}
