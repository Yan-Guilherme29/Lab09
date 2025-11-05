package org.model;

public class ConversorMoeda {

    private static double taxaDolar = 5.50;
    private static double taxaEuro = 6.00;

    public static double realParaDolar(double valoremReais){
        return valoremReais / taxaDolar;
    }

    public static double dolarParaReal(double valoremDolar){
        return valoremDolar * taxaDolar;
    }

    public static double realParaEuro(double valoremReais){
        return valoremReais / taxaEuro;
    }


    public static double euroParaReal(double valorEmEuros) {
        return valorEmEuros * taxaEuro;
    }


    public static double dolarParaEuro(double valorEmDolares) {
        double emReais = dolarParaReal(valorEmDolares);
        return realParaEuro(emReais);
    }


    public static double euroParaDolar(double valorEmEuros) {
        double emReais = euroParaReal(valorEmEuros);
        return realParaDolar(emReais);
    }

     public static void atualizarTaxas(double novaTaxaDolar, double novaTaxaEuro) {
        taxaDolar = novaTaxaDolar;
        taxaEuro = novaTaxaEuro;
        System.out.println("Taxas de câmbio atualizadas com sucesso!");
    }


    public static void mostrarTaxas() {
        System.out.println("Taxa do Dólar: R$ " + taxaDolar);
        System.out.println("Taxa do Euro: R$ " + taxaEuro);
    }
}


