package OrdenacionPolimorfica;

public class CartaComparable implements Comparable<CartaComparable> {


    static final int AS = 1;
    private int valor;
    private String palo;

    /**
     * Constructor con todos los parámetros
     * @param valor
     * @param tipo
     */
    public CartaComparable(int valor, String tipo) {
        this.valor = valor;
        this.palo = tipo;
    }

    /**
     * implementamos el método compareTo
     * @param cartaPolimorfica
     * @return
     */

    @Override

    public int compareTo(CartaComparable cartaPolimorfica) {
        int resultado = 0;

        resultado = this.valor - cartaPolimorfica.valor;
        if (resultado != 0) {
            if (this.valor == AS) {
                resultado = 1;
            } else {
                if (cartaPolimorfica.valor == AS) {
                    resultado = -1;
                }
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "CartaPolimorfica{" +
                "valor=" + valor +
                ", tipo='" + palo + '\'' +
                "'} \n";
    }


}




