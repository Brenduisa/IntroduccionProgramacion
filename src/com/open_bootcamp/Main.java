package com.open_bootcamp;
//EjercicioCoche
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
//EjercicioSuma
public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10,30, 4);

        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c){
        return a + b + c ;
    }

}
