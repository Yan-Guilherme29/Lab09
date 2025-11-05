package org.Principal;

import org.model.CalculadoraImpostos;
import org.model.ConversorMoeda;

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

        // Exemplo de uso direto dos métodos estáticos
        double irrf = CalculadoraImpostos.calcularIRRF(valor);
        double icms = CalculadoraImpostos.calcularICMS(valor);
        double iss  = CalculadoraImpostos.calcularISS(valor);

        System.out.println("IRRF: R$ " + irrf);
        System.out.println("ICMS: R$ " + icms);
        System.out.println("ISS : R$ " + iss);

        // Ou usando o método auxiliar
        System.out.println();
        CalculadoraImpostos.exibirCalculos(valor);


    }
}
