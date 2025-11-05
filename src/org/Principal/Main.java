package org.Principal;

import org.model.CalculadoraImpostos;
import org.model.ConversorMoeda;
import org.model.GerenciadorLog;
import org.model.UtilitariosDataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Conversor de Moedas ===");

        // Exibe taxas iniciais
        ConversorMoeda.mostrarTaxas();

        double valorReais = 1000.0;

        System.out.println("\n" + valorReais + " Reais em Dólares = " + ConversorMoeda.realParaDolar(valorReais));
        System.out.println(valorReais + " Reais em Euros = " + ConversorMoeda.realParaEuro(valorReais));

        double valorDolares = 200.0;
        System.out.println("\n" + valorDolares + " Dólares em Reais = " + ConversorMoeda.dolarParaReal(valorDolares));

        // Atualizando as taxas de câmbio
        System.out.println("\nAtualizando taxas...");
        ConversorMoeda.atualizarTaxas(5.70, 6.20);

        ConversorMoeda.mostrarTaxas();

        // ----------------------------------------------------------------------------------------------------

        double valor = 1000.0; // valor base


        double irrf = CalculadoraImpostos.calcularIRRF(valor);
        double icms = CalculadoraImpostos.calcularICMS(valor);
        double iss  = CalculadoraImpostos.calcularISS(valor);

        System.out.println("IRRF: R$ " + irrf);
        System.out.println("ICMS: R$ " + icms);
        System.out.println("ISS : R$ " + iss);


        System.out.println();
        CalculadoraImpostos.exibirCalculos(valor);

        // -----------------------------------------------------------------------------------------------------


        // Log padrão (console)
        GerenciadorLog.logInfo("Sistema iniciado com sucesso.");
        GerenciadorLog.logWarn("Uso de memória acima de 80%.");
        GerenciadorLog.logError("Falha ao conectar ao banco de dados.");

        // Alterando o destino para arquivo
        GerenciadorLog.configurarDestino(GerenciadorLog.DestinoLog.ARQUIVO);
        GerenciadorLog.logInfo("Este log será salvo no arquivo.");
        GerenciadorLog.logError("Erro crítico foi registrado no arquivo.");

        // -----------------------------------------------------------------------------------------------------

        LocalDate hoje = LocalDate.now();
        LocalDate dataAntiga = LocalDate.of(2020, 5, 15);
        LocalDateTime agora = LocalDateTime.now();

        System.out.println("=== FORMATAÇÃO ===");
        System.out.println("Data formatada: " + UtilitariosDataHora.formatarData(hoje, "dd/MM/yyyy"));
        System.out.println("Data e hora formatadas: " + UtilitariosDataHora.formatarDataHora(agora, "dd/MM/yyyy HH:mm:ss"));

        System.out.println("\n=== DIFERENÇAS ===");
        System.out.println("Diferença em dias: " + UtilitariosDataHora.diferencaEmDias(dataAntiga, hoje));
        System.out.println("Diferença em meses: " + UtilitariosDataHora.diferencaEmMeses(dataAntiga, hoje));
        System.out.println("Diferença em anos: " + UtilitariosDataHora.diferencaEmAnos(dataAntiga, hoje));

        System.out.println("\n=== PROPRIEDADES ===");
        System.out.println("Ano 2024 é bissexto? " + UtilitariosDataHora.ehAnoBissexto(2024));
        System.out.println("Dia da semana de hoje: " + UtilitariosDataHora.diaDaSemana(hoje));


    }
}
