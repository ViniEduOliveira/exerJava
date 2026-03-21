package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2026-02-15");
		LocalDateTime d02 = LocalDateTime.parse("2026-02-15T01:30:27");
		Instant d03 = Instant.parse("2026-02-15T01:30:27Z");

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01  mês = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minutos = " + d02.getMinute());
	}

}
