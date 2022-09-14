package Calculadora.Operacoes;

import Calculadora.Utilitarios.ExibeResultado;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Somador {
    public double soma(double a, double b) {
        double c = a + b;
        ExibeResultado.exibe("Soma", c);
        return c;
    }
}
