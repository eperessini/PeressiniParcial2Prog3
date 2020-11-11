package ar.edu.undec.plantas.core.dominio;

public interface ICrearPlantaRepositorio {

    boolean existePlanta (String plantaNombre);
    boolean guardarPlanta (Planta laPlanta);
}
