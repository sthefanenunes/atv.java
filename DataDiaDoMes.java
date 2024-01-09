package aula_06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DataDiaDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato 'dd/MM/yyyy': ");
        String dataString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate data = LocalDate.parse(dataString, formatter);

            int diaDoMes = data.getDayOfMonth();
            System.out.println("O dia do mês é: " + diaDoMes);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido! Certifique-se de usar o formato 'dd/MM/yyyy'.");
        }

        scanner.close();
    }
}
