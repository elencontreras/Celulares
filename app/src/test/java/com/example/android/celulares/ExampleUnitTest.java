package com.example.android.celulares;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void cantidad_apple_negros(){
        Celular c1= new Celular(1,0,1,4,100000);
        Celular c2= new Celular(1,0,1,4,100000);
        Celular c3= new Celular(1,1,1,4,100000);
        Celular c4= new Celular(1,0,1,4,100000);


        Celular celular[]={c1,c2,c3,c4};

        ArrayList<Celular> pers = new ArrayList<>(Arrays.asList(celular));

        assertEquals(3, Metodos.cantidadAppleNegro(pers));

    }
    @Test
    public void cantidad_apple_negros_incorrecta(){
        Celular c1= new Celular(1,0,1,4,100000);
        Celular c2= new Celular(1,0,1,4,100000);
        Celular c3= new Celular(1,1,1,4,100000);
        Celular c4= new Celular(1,0,1,4,100000);


        Celular celular[]={c1,c2,c3,c4};

        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));

        assertNotEquals(2, Metodos.cantidadAppleNegro(cel));

    }
}