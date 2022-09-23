package com.open_bootcamp;

public class Main{

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.puertasAgregadas();

        System.out.println(miCoche.puertas);
    }
}

class Coche{
    public int puertas = 0;

    public void puertasAgregadas(){
        this.puertas++;
    }

}
