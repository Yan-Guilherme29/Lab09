package org.Principal;

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
    }
}
