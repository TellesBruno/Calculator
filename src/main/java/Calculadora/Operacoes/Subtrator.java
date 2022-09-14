package Calculadora.Operacoes;

import Calculadora.Utilitarios.ExibeResultado;

public class Subtrator {
    public double subtrai(double a, double b) {
        double c = a - b;
        ExibeResultado.exibe("Subtração", c);
        return c;
    }
}
