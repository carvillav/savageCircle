package generadorDeNumeros;

public class GeneradorNumeroFijo implements GeneradorDeNumero {

    int numeroFijo;

    @Override
    public void reciboElNumero(int unNumero) {
        this.numeroFijo = unNumero;

    }

    public int lanzar() {
        return numeroFijo;
    }


}
