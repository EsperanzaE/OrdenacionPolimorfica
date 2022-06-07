package OrdenacionPolimorfica;


public class Carta {

    static final int AS = 1;
    private int valor;
    private String palo;


    public Carta(int valor, String tipo) {
        this.valor = valor;
        this.palo = tipo;
    }

    public int getValor() {
        return valor;
    }


    public int compareTo(Object object) {
        int resultado = 0;

        if (object instanceof Carta) {
            resultado = this.valor - ( (Carta) object ).valor;
            if (resultado != 0) {
                if (this.valor == AS) {
                    resultado = 1;
                } else {
                    if (( (Carta) object ).valor == AS) {
                        resultado = -1;
                    }
                }
            }


        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", tipo='" + palo + '\'' +
                "'} \n";
    }
}




