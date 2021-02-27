
import dado.Dado;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDados {

    @Test
    public void a_comprobarQueNoSePuedeCrearUnDadoMenorDeTresCaras(){
        Dado dado =  new Dado();
        int cantCaras = 1;
        dado.miCantidadDeCarasEs(cantCaras);
        int miCantCaras = dado.getCantCaras();
        Assert.assertFalse(miCantCaras>=3);
    }

    @Test
    public void b_comprobarQueELDadoLanzaUnNumeroFijoMenorALaCantidadDeCaras(){
        Dado dado =  new Dado();
        int canCaras = 5;
        int valorDado = 3;
        dado.miCantidadDeCarasEs(canCaras);
        dado.elNumeroQueDebeMostrarEs(valorDado);
        int numeroFijo = dado.lanzarNumeroFijo();
        Assert.assertEquals(valorDado,  numeroFijo);
    }

    @Test
    public void c_comprobarQueElNumeroFijoAMostrarEsMasgrandeQueLaCantidadDeCarasQuetieneELDado(){
        Dado dado =  new Dado();
        int cantCaras = 5;
        int valorDado = 7;
        dado.miCantidadDeCarasEs(cantCaras);
        dado.elNumeroQueDebeMostrarEs(valorDado);
        int numeroFijo = dado.lanzarNumeroFijo();
        Assert.assertEquals(0, numeroFijo);
    }

    @Test
    public void d_comprobarQueElDadoLanzaUnNumeroAleatorioMenorASuCantidadDeCaras(){
        Dado dado =  new Dado();
        int cantCaras = 6;
        dado.miCantidadDeCarasEs(cantCaras);
        int numeroAleatorio = dado.lanzar();
        Assert.assertTrue(numeroAleatorio <= cantCaras);
    }
}
