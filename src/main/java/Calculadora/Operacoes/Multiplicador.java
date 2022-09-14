package Calculadora.Operacoes;

import Calculadora.Utilitarios.ExibeResultado;

public class Multiplicador {
    public double multiplica(double a, double b) {
        double c = a * b;
        ExibeResultado.exibe("Multiplicação", c);
        return c;
    }
}
