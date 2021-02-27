package dado;

import generadorDeNumeros.GeneradorDeNumero;
import generadorDeNumeros.GeneradorNumeroAletarioMenorA;
import generadorDeNumeros.GeneradorNumeroFijo;

public class Dado {

    GeneradorDeNumero generadorDeNumeroFijo;
    GeneradorDeNumero generadorDeNumeroAleatorio;
    int cantCaras;

    public Dado() {
        this.generadorDeNumeroFijo = new GeneradorNumeroFijo();
        this.generadorDeNumeroAleatorio = new GeneradorNumeroAletarioMenorA();
    }

    public void miCantidadDeCarasEs(int cantCaras) {
        try {
            if (cantCaras > 2) {
                this.cantCaras = cantCaras;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("No se puede crear un dado que tenga menos de 3 caras.");
        }
    }

    public void elNumeroQueDebeMostrarEs(int unNumero) {
        try {
            if (unNumero < this.cantCaras) {
                generadorDeNumeroFijo.reciboElNumero(unNumero);
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Se ingresó un número mayor a la cantidad de caras que tiene el dado");
        }
    }

    public int lanzarNumeroFijo() {
        return this.generadorDeNumeroFijo.lanzar();
    }

    public int lanzar() {
        generadorDeNumeroAleatorio.reciboElNumero(this.cantCaras);
        return generadorDeNumeroAleatorio.lanzar();
    }

    public int getCantCaras() {
        return cantCaras;
    }

}
