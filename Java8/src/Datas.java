import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);

		int anos = olimpiadasRio.getYear() - hoje.getYear();

		System.out.println(anos);

		Period periodo = Period.between(hoje, olimpiadasRio);

		LocalDate proximasOlimpiadasRio = olimpiadasRio.plusYears(4);

		System.out.println(proximasOlimpiadasRio);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = proximasOlimpiadasRio.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15,  30);
		System.out.println(intervalo);
	}
}