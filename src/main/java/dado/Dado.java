package dado;


import generadorDeNumeros.GeneradorDeNumero;

public class Dado {

    public static final String CANTIDAD_DE_CARAS_INVALIDA = "No se puede crear un dado que tenga menos de 3 caras.";
    private final int cantidadDeCaras;
    private final GeneradorDeNumero generadorDeNumero;

    public Dado(int posibleCantidadDeCaras, GeneradorDeNumero generadorDeNumero) throws InstantiationException {
        if (posibleCantidadDeCaras < 3){
            throw new InstantiationException(CANTIDAD_DE_CARAS_INVALIDA);
        }

        this.cantidadDeCaras = posibleCantidadDeCaras;
        this.generadorDeNumero = generadorDeNumero;
    }

    public int lanzar() {
        return generadorDeNumero.generarNumeroHasta(cantidadDeCaras);
    }
}
