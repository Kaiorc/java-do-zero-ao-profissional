package oo.heranca.teste;

import oo.heranca.desafio.Agera;
import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Sandero;

public class CarroTeste {
    public static void main(String[] args) {
        
        Carro sandero = new Sandero();

        //Usando o tipo mais específico, pois em Carro,
        //não estão presentes os métodos da interfaces
        //utilizadas.
        Agera agera = new Agera(277);

        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();

        agera.acelerar();
        agera.acelerar();
        agera.ligarTurbo();
        //agera.ligarAr();
        agera.acelerar();
        agera.acelerar();
        
        
        System.out.println(sandero.velocidadeAtual);
        System.out.println(agera.velocidadeAtual);
        
        sandero.frear();
        sandero.frear();
        sandero.frear();
        sandero.frear();
        sandero.frear();

        // agera.frear();
        // agera.frear();
        // agera.frear();
        // agera.frear();

        System.out.println(sandero.velocidadeAtual);
        System.out.println(agera.velocidadeAtual);
    }
}
