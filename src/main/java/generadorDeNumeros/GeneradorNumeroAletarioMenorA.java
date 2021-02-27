package generadorDeNumeros;

import java.util.Random;

public class GeneradorNumeroAletarioMenorA implements GeneradorDeNumero {

    int numero;

    @Override
    public void reciboElNumero(int unNumero) {
        this.numero = unNumero;
    }

    @Override
    public int lanzar() {
        Random random = new Random();
        return random.nextInt(this.numero) + 1;
    }


}
