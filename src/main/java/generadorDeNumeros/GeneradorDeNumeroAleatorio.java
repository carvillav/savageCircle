package generadorDeNumeros;

import java.util.Random;

public class GeneradorDeNumeroAleatorio extends GeneradorDeNumero {

    private Random random = new Random();

    @Override
    public int generarNumeroHasta(int unNumeroLimite){
        return random.nextInt(unNumeroLimite) + 1;
    }

}
