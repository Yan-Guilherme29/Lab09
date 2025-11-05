package org.model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorLog {

    // ============================================================
    // Enum para representar o destino do log
    // ============================================================
    public enum DestinoLog {
        CONSOLE, ARQUIVO
    }

    // ============================================================
    // Atributos estáticos de configuração
    // ============================================================
    private static DestinoLog destino = DestinoLog.CONSOLE; // padrão: console
    private static final String CAMINHO_ARQUIVO = "logs.txt"; // nome do arquivo de log
    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // ============================================================
    // Métodos estáticos para configurar o destino
    // ============================================================
    public static void configurarDestino(DestinoLog novoDestino) {
        destino = novoDestino;
    }

    // ============================================================
    // Métodos de log para cada nível
    // ============================================================

    public static void logInfo(String mensagem) {
        registrarLog("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        registrarLog("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        registrarLog("ERROR", mensagem);
    }

    // ============================================================
    // Método central que grava o log (no console ou arquivo)
    // ============================================================
    private static void registrarLog(String nivel, String mensagem) {
        String timestamp = LocalDateTime.now().format(FORMATO_DATA);
        String logFormatado = String.format("[%s] [%s] %s", timestamp, nivel, mensagem);

        if (destino == DestinoLog.CONSOLE) {
            System.out.println(logFormatado);
        } else {
            try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO, true)) {
                writer.write(logFormatado + "\n");
            } catch (IOException e) {
                System.err.println("[ERRO] Falha ao escrever no arquivo de log: " + e.getMessage());
            }
        }
    }
}
