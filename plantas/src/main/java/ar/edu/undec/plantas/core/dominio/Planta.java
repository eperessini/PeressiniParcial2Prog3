package ar.edu.undec.plantas.core.dominio;

public class Planta {

    private String nombreCientifico;
    private String nombre;
    private String subfamilia;
    private String estacion;
    private int tamanio;

    public Planta() {}

    public Planta(String nombreCientifico, String nombre, String subfamilia, String estacion, int tamanio) {
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.subfamilia = subfamilia;
        this.estacion = estacion;
        this.tamanio = tamanio;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public static Planta instancia(String nombreCientifico, String nombre, String subfamilia, String estacion, int tamanio) {
        return false;
    }
}

