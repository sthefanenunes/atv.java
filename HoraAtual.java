package aula_06;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraAtual {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String horaFormatada = horaAtual.format(formatter);
        System.out.println("A hora atual é: " + horaFormatada);
    }
}
