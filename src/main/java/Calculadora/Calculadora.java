package Calculadora;

import Calculadora.Operacoes.*;

public class Calculadora {
    static Somador somador = new Somador();
    static Subtrator subtrator = new Subtrator();
    static Multiplicador multiplicador = new Multiplicador();
    static Divisor divisor = new Divisor();
    static Somador exSoma = new ExtendeSoma(1,2);



    public static void main(String[] args) {
        somador.soma(2, 3);
        subtrator.subtrai(2, 3);
        multiplicador.multiplica(2, 3);
        divisor.divide(2, 3);
        exSoma.soma(2, 3);
    }
}
