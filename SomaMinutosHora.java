package aula_06;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SomaMinutosHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora no formato 'HH:mm': ");
        String horaString = scanner.nextLine();

        System.out.print("Digite o número de minutos a serem adicionados: ");
        int minutos = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            LocalTime hora = LocalTime.parse(horaString, formatter);

            LocalTime novaHora = hora.plusMinutes(minutos);

            String novaHoraFormatada = novaHora.format(formatter);
            System.out.println("A nova hora é: " + novaHoraFormatada);
        }catch (DateTimeParseException e) {
            System.out.println("Formato de hora inválido! Certifique-se de usar o formato 'HH:mm'.");
        }

        scanner.close();
    }
}
