package ar.com.xeven;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // genero un objeto generador de aleatorios
        // con la semilla de la hora actual de mi sistema
        Random aleatorio = new Random(System.currentTimeMillis());

        // un numero entero pseudoaleatorio entre 0 y 5 (el 6 no lo incluye).
        int enteroRandom = aleatorio.nextInt(6);

        System.out.println("Nro random: "+enteroRandom);

        IntStream enterosAleatorios = aleatorio.ints(10,1,53);
        enterosAleatorios.forEach(numero -> System.out.println("Número: "+numero));

    }
}
