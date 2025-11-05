package org.model;

public class CalculadoraImpostos {

    private static final double ALIQUOTA_IRRF = 0.15; // 15%
    private static final double ALIQUOTA_ICMS = 0.18; // 18%
    private static final double ALIQUOTA_ISS  = 0.05; // 5%

     // Calcula o IRRF com base no valor informado
    public static double calcularIRRF(double valorBase) {
        return valorBase * ALIQUOTA_IRRF;
    }

    // Calcula o ICMS com base no valor informado
    public static double calcularICMS(double valorBase) {
        return valorBase * ALIQUOTA_ICMS;
    }

    // Calcula o ISS com base no valor informado
    public static double calcularISS(double valorBase) {
        return valorBase * ALIQUOTA_ISS;
    }

    // ============================================================
    // (Opcional) Método auxiliar para exibir todos os cálculos
    // ============================================================
    public static void exibirCalculos(double valorBase) {
        System.out.println("=== Cálculo de Impostos ===");
        System.out.println("Valor base: R$ " + valorBase);
        System.out.println("IRRF (15%): R$ " + calcularIRRF(valorBase));
        System.out.println("ICMS (18%): R$ " + calcularICMS(valorBase));
        System.out.println("ISS  (5%) : R$ " + calcularISS(valorBase));
        System.out.println("============================");
    }
}

