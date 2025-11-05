package org.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilitariosDataHora {

    // ============================================================
    // Métodos estáticos para formatação de datas
    // ============================================================

    /**
     * Formata uma data (LocalDate) para o padrão especificado.
     * Exemplo de padrão: "dd/MM/yyyy", "yyyy-MM-dd"
     */
    public static String formatarData(LocalDate data, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return data.format(formatter);
    }

    /**
     * Formata uma data e hora (LocalDateTime) para o padrão especificado.
     * Exemplo: "dd/MM/yyyy HH:mm:ss"
     */
    public static String formatarDataHora(LocalDateTime dataHora, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return dataHora.format(formatter);
    }

    // ============================================================
    // Métodos estáticos para cálculo de diferença entre datas
    // ============================================================

    /**
     * Calcula a diferença entre duas datas em dias.
     */
    public static long diferencaEmDias(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }

    /**
     * Calcula a diferença entre duas datas em meses.
     */
    public static long diferencaEmMeses(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.MONTHS.between(dataInicial, dataFinal);
    }

    /**
     * Calcula a diferença entre duas datas em anos.
     */
    public static long diferencaEmAnos(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.YEARS.between(dataInicial, dataFinal);
    }

    // ============================================================
    // Métodos estáticos para verificar propriedades de datas
    // ============================================================

    /**
     * Verifica se um determinado ano é bissexto.
     */
    public static boolean ehAnoBissexto(int ano) {
        return LocalDate.of(ano, 1, 1).isLeapYear();
    }

    /**
     * Retorna o dia da semana de uma data.
     */
    public static String diaDaSemana(LocalDate data) {
        return data.getDayOfWeek().toString(); // Ex: MONDAY
    }
}
