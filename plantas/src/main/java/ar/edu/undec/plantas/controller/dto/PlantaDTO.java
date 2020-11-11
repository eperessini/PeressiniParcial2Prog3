package ar.edu.undec.plantas.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PlantaDTO {


    @JsonProperty ("nombre_cientifico")
    private String nombreCientifico;
    @JsonProperty ("nombre_vulgar")
    private String nombreVulgar;
    @JsonProperty ("categoria")
    private String categoria;
    @JsonProperty ("epoca_plantado")
    private String epocaPlantado;
    @JsonProperty ("altura")
    private int altura;

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEpocaPlantado() {
        return epocaPlantado;
    }

    public int getAltura() {
        return altura;
    }

    public PlantaDTO (@JsonProperty ("nombre_cientifico") String nombreCientifico,
                      @JsonProperty ("nombre_vulgar") String nombreVulgar,
                      @JsonProperty ("categoria") String categoria,
                      @JsonProperty ("epoca_plantado") String epocaPlantado,
                      @JsonProperty ("altura") int altura) {

        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
        this.categoria = categoria;
        this.epocaPlantado = epocaPlantado;
        this.altura = altura;





    }
}
