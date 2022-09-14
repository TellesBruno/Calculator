package Calculadora.Operacoes;

import Calculadora.Utilitarios.ExibeResultado;

public class Divisor {
    public double divide(double a, double b) {
        double c = a / b;
        ExibeResultado.exibe("Divisão", c);
        return c;
    }
}
