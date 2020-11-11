package ar.edu.undec.plantas.core.dominio;

public class Planta {

    private String nombreCientifico;
    private String nombreVulgar;
    private String categoria;
    private String epocaPlantado;
    private int altura;

    public Planta() {}

    public Planta(String nombreCientifico, String nombreVulgar, String subfamilia, String estacion, int tamanio) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
        this.categoria = subfamilia;
        this.epocaPlantado = estacion;
        this.altura = tamanio;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEpocaPlantado() {
        return epocaPlantado;
    }

    public void setEpocaPlantado(String epocaPlantado) {
        this.epocaPlantado = epocaPlantado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static Planta instancia(String nombreCientifico, String nombreVulgar, String categoria, String epocaPlantado, int altura) {
        return new Planta(nombreCientifico, nombreVulgar, categoria, epocaPlantado, altura);
    }
}

