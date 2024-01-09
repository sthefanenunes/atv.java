package aula_06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (no formato 'dd/MM/yyyy'): ");
        String dataNascimentoString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);

            LocalDate dataAtual = LocalDate.now();

            Period periodo = Period.between(dataNascimento, dataAtual);

            int anos = periodo.getYears();
            int meses = periodo.getMonths();
            int dias = periodo.getDays();

            System.out.println("Sua idade é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido! Certifique-se de usar o formato 'dd/MM/yyyy'.");
        }

        scanner.close();
    }
}
