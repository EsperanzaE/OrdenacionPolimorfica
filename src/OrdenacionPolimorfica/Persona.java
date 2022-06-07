package OrdenacionPolimorfica;

public class Persona implements Comparable<Persona>{

    private int edad=0;
    private String nombre ="";
    private String dni="";

    /**
     * Constructor con todos los argumentos
     * @param edad
     * @param nombre
     * @param dni
     */
    public Persona(int edad, String nombre, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * implemento el compare para dos objeto de la clase persona
     * @param persona
     * @return
     */
    @Override
    public int compareTo(Persona persona) {
        return persona.edad-this.edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                "'} \n";
    }
}
