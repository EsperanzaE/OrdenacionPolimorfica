package OrdenacionPolimorfica;

import java.util.Arrays;

/**
 * Práctica para ordenación de Arrays (vectores) de objetos
 * Tal como hemos construido los distintos algoritmos de ordenación, sería necesaria una
 * implementación diferente para cada tipo de datos de los elementos del array que queramos
 * ordenar.
 * Para solucionar este problema podemos usar el polimorfismo, propiedad fundamental de la
 * POO, para tener una sola implementación que nos sirva para ordenar un array de objetos de
 * cualquier clase, eso sí, CADA CLASE A DE IMPLEMENTAR SU MÉTODO DE COMPARACIÓN a sus
 * propias características.
 * Para ilustrar el ejercicio hemos implementado la clase Cartas, un array de Cartas y una ordenación
 * ex-profeso para esta clase
 * Por otra parte hemos declarado una variable de la clase Comparable y hemos implementado una segunda
 * clase Carta, que la hemos llamado CartaComparable, que implementa la interfaz Comparable, la diferencia
 * como veréis es que el argumento del método que compara, no es la clase CartaPolimórfica sino Comparable
 * <p>
 * Voy a crear la clase Persona y voy a hacer lo mismo que con la clase CartaComparable
 */
public class Main {
    public static final int TAMAÑO = 10;
    public static Carta[] mazoCarta = new Carta[TAMAÑO];
    public static Comparable[] mazoCartaComparable = new CartaComparable[TAMAÑO];//variable de la interfaz Comparable
    public static Comparable[] personaComparable = new Persona[TAMAÑO];//variable de la interfaz Comparable


    public static void main(String[] args) {
        //defino tres arrays de 10 elementos cada uno, uno con Carta (que no uso la interfaz comparable)
        //otro con

        mazoCarta=Utilidades.cargar();//cargo el array de Carta
        mazoCartaComparable=Utilidades.cargar2();//cargo el array de CartaComparable
        personaComparable=Utilidades.cargar3();//cargo el array de personaComparable

        Utilidades.ordenarCartas(mazoCarta);//Ordenamos el array de Cartas con metodo específico para la clase Cartas
        //tanto mazoCartaComparable como personaComparable lo ordenamos con el método de la burbuja pero la implementación
        //es la misma para los dos, solo hay que especificar en la clase como es el CompareTo
        Utilidades.ordenarComparables(mazoCartaComparable);
        Utilidades.ordenarComparables(personaComparable);
        System.out.println("cartas ordenadas");
        System.out.println(Arrays.toString(mazoCarta));

        System.out.println("cartasComparables ordenadas");
        System.out.println(Arrays.toString(mazoCartaComparable));
        System.out.println("personas ordenadas");
        System.out.println(Arrays.toString(personaComparable));
    }
}
