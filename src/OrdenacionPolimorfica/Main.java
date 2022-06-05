package OrdenacionPolimorfica;

/**
 * Práctica para ordenación de Arrays (vectores) de objetos
 * Tal como hemos construido los distintos algoritmos de ordenación, sería necesaria una
 * implementación diferente para cada tipo de datos de los elementos del array que queramos
 * ordenar.
 * Para solucionar este problema podemos usar el polimorfismo, propiedad fundamental de la
 * POO, para tener una sola implementación que nos sirva para ordenar un array de objetos de
 * cualquier clase, eso sí, cada clase ha de incorporar un método de comparar adaptado a sus
 * propias características.
 * para ilustrar el ejercicio hemos implementado la clase Cartas de dos formas distintas, las clases se
 * llaman Clase Cartas y ClasePolimorfica. La segunda implementa Comparable<CartaPolimorfica> que le permite
 * crear variables de la interfaz
 */
public class Main {
    public static final int TAMAÑO=10;
    public static void main(String[] args) {
        Carta [] mazo=new Carta[TAMAÑO];
        Comparable[] mazoGenérico=null;//variable de la interfaz Comparable

        mazo=Utilidades.cargar();
        mazoGenérico=Utilidades.cargarComparable();//la instanciamos con objetos tipo CartaPolimorifca
        Utilidades.ordenarCartas(mazo);//metodo específico para la clase Cartas
        Utilidades.ordenarCartasGenerico(mazoGenérico);
        Utilidades.mostrar(mazo);
        Utilidades.mostrarGenerico(mazoGenérico);
    }
}
