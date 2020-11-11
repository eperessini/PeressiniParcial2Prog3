package ar.edu.undec.plantas.persistencia.entity;

import ar.edu.undec.plantas.core.dominio.Planta;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="Plantas")
@SequenceGenerator(name="plantas_id_seq", initialValue = 1, sequenceName = "plantas_id_seq", allocationSize = 1)

public class PlantaEntity {

    @Id
    @Column (name="nombre_cientifico")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "plantas_id_seq")
    private String nombreCientifico;
    @Column (name="nombre_vulgar")
    private String nombreVulgar;
    @Column (name="categoria")
    private String categoria;
    @Column (name="epoca_plantado")
    private String epocaPlantado;
    @Column (name="altura")
    private int altura;

    public PlantaEntity() {}

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

}
