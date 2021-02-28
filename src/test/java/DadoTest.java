
import dado.Dado;
import generadorDeNumeros.GeneradorDeNumero;
import generadorDeNumeros.GeneradorDeNumeroAleatorio;
import generadorDeNumeros.GeneradorDeNumeroFijo;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DadoTest {

    private void assertBetween(int numeroMinimo, int numeroMaximo, int numeroAComparar) {
        Assert.assertTrue(numeroMinimo <= numeroAComparar);
        Assert.assertTrue(numeroMaximo >= numeroAComparar);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void t01_comprobarQueNoSePuedeCrearUnDadoMenorDeTresCaras() throws InstantiationException {
        exceptionRule.expect(InstantiationException.class);
        exceptionRule.expectMessage(Dado.CANTIDAD_DE_CARAS_INVALIDA);
        new Dado(1, new GeneradorDeNumeroAleatorio());
    }

    @Test
    public void t02_lanzarUnDadoConUnGeneradorDeNumerosAleatoriosGeneraUnNumeroMenorOIgualQueLaCantidadDeCaras() throws InstantiationException {
        GeneradorDeNumero generadorDeNumeroAleatorio = new GeneradorDeNumeroAleatorio();
        int cantidadDeCaras = 5;

        Dado dado = new Dado(cantidadDeCaras, generadorDeNumeroAleatorio);
        this.assertBetween(1, cantidadDeCaras, dado.lanzar());
    }

    @Test
    public void t03_lanzarUnDadoConUnGeneradorDeNumerosFijosGeneraUnNumeroIgualALaCantidadDeCaras() throws InstantiationException {
        GeneradorDeNumero generadorDeNumeroFijo = new GeneradorDeNumeroFijo();
        int cantidadDeCaras = 6;
        Dado dado = new Dado(cantidadDeCaras, generadorDeNumeroFijo);
        Assert.assertEquals(cantidadDeCaras, dado.lanzar());
    }
}
