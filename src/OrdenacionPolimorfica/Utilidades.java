package OrdenacionPolimorfica;

public class Utilidades {

    /**
     * ordenamos cartas de mayor a menor usamos el método compareTo definido en la clase Cartas
     * el método de ordenación es el de la burbuja
     *
     * @param cartas
     */
    public static void ordenarCartas(Carta[] cartas) {
        Carta aux;
        for (int i = 0; i < cartas.length - 1; i++) {
            for (int j = i + 1; j < cartas.length; j++) {
                if (cartas[i].compareTo(cartas[j]) < 0) {
                    aux = cartas[i];
                    cartas[i] = cartas[j];
                    cartas[j] = aux;
                }
            }
        }
    }


    public static Carta[] cargar() {
        Carta[] mazoCarta = new Carta[]{
                new Carta(1, "Oros"),
                new Carta(1, "Copas"),
                new Carta(2, "Copas"),
                new Carta(3, "Copas"),
                new Carta(4, "Copas"),
                new Carta(12, "Copas"),
                new Carta(1, "Bastos"),
                new Carta(10, "Oros"),
                new Carta(7, "Espadas")};
        return mazoCarta;
    }


    /**
     * Este método sería genérico para cualquier array de objetos que queramos ordenar
     * por el método de la  burbuja
     *
     * @param comparables
     */
    public static void ordenarComparables(Comparable[] comparables) {
        Comparable aux = null;
        for (int i = 0; i < comparables.length - 1; i++) {
            for (int j = i + 1; j < comparables.length; j++) {
                if (comparables[i].compareTo(comparables[j]) < 0) {
                    aux = comparables[i];
                    comparables[i] = comparables[j];
                    comparables[j] = aux;
                }
            }
        }
    }

    public static void mostrarGenerico(Comparable[] mazoGenérico) {
        System.out.println();
        for (Comparable elemento : mazoGenérico) {
            System.out.println(elemento.toString());
        }
        System.out.println();
    }

    public static void mostrar(Carta[] cartas) {
        System.out.println();
        for (Carta elemento : cartas) {
            System.out.println(elemento.toString());
        }
        System.out.println();
    }

    public static Comparable[] cargar2() {
        Comparable[] mazoCartaGenérico = new CartaComparable[]{
                new CartaComparable(1, "Oros"),
                new CartaComparable(1, "Copas"),
                new CartaComparable(2, "Copas"),
                new CartaComparable(3, "Copas"),
                new CartaComparable(4, "Copas"),
                new CartaComparable(12, "Copas"),
                new CartaComparable(1, "Bastos"),
                new CartaComparable(10, "Oros"),
                new CartaComparable(7, "Espadas")};
        return mazoCartaGenérico;
    }

    public static Comparable[] cargar3() {
        Comparable[] personaComparable = new Persona[]{
                new Persona(25, "Pepe", "12345678J"),
                new Persona(28, "Juan", "12345678J"),
                new Persona(29, "Manu", "12345678J"),
                new Persona(30, "Pepa", "12345678J"),
                new Persona(45, "Juana", "12345678J"),
                new Persona(58, "Manuela", "12345678J"),
                new Persona(10, "Rocío", "12345678J")
        };
        return personaComparable;
    }
}

