package ar.edu.undec.plantas.core.usecase;

import ar.edu.undec.plantas.core.dominio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.core.dominio.Planta;

public class CrearPlantaUseCase implements ICrearPlantaRepositorio {
    private ICrearPlantaRepositorio iCrearPlantaRepositorio;

    public CrearPlantaUseCase (ICrearPlantaRepositorio plantaRepositorio){
        this.iCrearPlantaRepositorio = plantaRepositorio;
    }

    @Override
    public boolean existePlanta(String plantaNombre) {
        return false;
    }

    @Override
    public boolean guardarPlanta(Planta laPlanta) {
        return false;
    }
}
