package aula_06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ComparacaoDatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data (no formato 'dd/MM/yyyy'): ");
        String data1String = scanner.nextLine();

        System.out.print("Digite a segunda data (no formato 'dd/MM/yyyy'): ");
        String data2String = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate data1 = LocalDate.parse(data1String, formatter);
            LocalDate data2 = LocalDate.parse(data2String, formatter);

            int comparacao = data1.compareTo(data2);

            if (comparacao < 0) {
                System.out.println("A primeira data vem antes da segunda data.");
            } else if (comparacao > 0) {
                System.out.println("A primeira data vem depois da segunda data.");
            } else {
                System.out.println("As datas são iguais.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido! Certifique-se de usar o formato 'dd/MM/yyyy'.");
        }

        scanner.close();
    }
}
