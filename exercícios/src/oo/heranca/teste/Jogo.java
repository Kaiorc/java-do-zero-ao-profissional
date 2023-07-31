package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
    
        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;
        
        Jogador heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        // monstro.andar(Direcao.SUL);
        // monstro.andar(Direcao.LESTE);
        // monstro.andar(Direcao.SUL);
        // monstro.andar(Direcao.LESTE);
        // monstro.andar(Direcao.NORTE);

        // System.out.println(monstro.x);
        // System.out.println(monstro.y);
        
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);
        
        System.out.println(monstro.vida);
        System.out.println(heroi.vida);
    }
}