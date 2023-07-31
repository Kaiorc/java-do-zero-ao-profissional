package oo.polimorfismo;

public class Pessoa {
    private Double peso;

    Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }   

    public String toString() {
        return String.format("%.2f",peso);
    }
}