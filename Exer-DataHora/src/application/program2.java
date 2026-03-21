package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class program2 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2026-02-15");
		LocalDateTime d02 = LocalDateTime.parse("2026-02-15T01:30:27");
		Instant d03 = Instant.parse("2026-02-15T01:30:27Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("Semana passada " + pastWeekLocalDate);		
		System.out.println("Próxima semana " + nextWeekLocalDate);
		
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		
		System.out.println("Semana passada " + pastWeekLocalDateTime);
		System.out.println("Próxima semana " + nextWeekLocalDateTime);
		
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada " + pastWeekInstant);
		System.out.println("Próxima semana " + nextWeekInstant);
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekInstant);
		
		System.out.println("t1 Dias " + t1.toDays());	
		System.out.println("t2 Dias " + t2.toDays());
		System.out.println("t3 Dias " + t3.toDays());
		System.out.println("t4 Dias " + t4.toDays());
		
		
		
	}

}
