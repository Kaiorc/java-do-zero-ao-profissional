package oo.heranca.desafio;

public class Agera extends Carro implements Luxo, Esportivo{
    private boolean ligarTurbo;
    private boolean ligarAr;

    public Agera(){
        this(277);
    }
    
    public Agera(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }
    
    @Override
    public int getDelta(){
        if (ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;
        }else {
            return 15;
        }
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo(){
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr(){
        ligarAr = false;
    }

    // @Override
    // void acelerar() {
    //     velocidadeAtual += 15;
    // }
}
