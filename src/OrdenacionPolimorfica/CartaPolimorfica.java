package OrdenacionPolimorfica;

public class CartaPolimorfica implements Comparable<CartaPolimorfica>{


        static final int AS = 1;
        private int valor;
        private String tipo;


        public CartaPolimorfica(int valor, String tipo) {
            this.valor = valor;
            this.tipo = tipo;
        }

        public int getValor() {
            return valor;
        }



        public int compareTo(CartaPolimorfica cartaPolimorfica) {
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

             return resultado;}

    @Override
    public String toString() {
        return "CartaPolimorfica{" +
                "valor=" + valor +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}




