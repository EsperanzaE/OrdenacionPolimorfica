package OrdenacionPolimorfica;

public class Utilidades {
    //ordenamos cartas de mayor a menor
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
        Carta[] cartas = {new Carta(1, "Copas"),
                new Carta(1, "Copas"),
                new Carta(2, "Copas"),
                new Carta(3, "Copas"),
                new Carta(4, "Copas"),
                new Carta(12, "Copas"),
                new Carta(1, "Bastos"),
                new Carta(10, "Oros"),
                new Carta(7, "Espadas")};
        return cartas;
    }

    public static Comparable[] cargarComparable() {
        Comparable[] cartas = {
                new CartaPolimorfica(1, "Copas"),
                new CartaPolimorfica(1, "Copas"),
                new CartaPolimorfica(2, "Copas"),
                new CartaPolimorfica(3, "Copas"),
                new CartaPolimorfica(4, "Copas"),
                new CartaPolimorfica(12, "Copas"),
                new CartaPolimorfica(1, "Bastos"),
                new CartaPolimorfica(10, "Oros"),
                new CartaPolimorfica(7, "Espadas")};
        return cartas;
    }

    public static void ordenarCartasGenerico(Comparable[] mazoComparable) {
        Comparable aux = null;
        for (int i = 0; i < mazoComparable.length - 1; i++) {
            for (int j = i + 1; j < mazoComparable.length; j++) {
                if (mazoComparable[i].compareTo(mazoComparable[j]) < 0) {
                    aux = mazoComparable[i];
                    mazoComparable[i] = mazoComparable[j];
                    mazoComparable[j] = aux;
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
}

