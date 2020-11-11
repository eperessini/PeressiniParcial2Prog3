package ar.edu.undec.plantas.core.usecase;

import ar.edu.undec.plantas.core.dominio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInput;

public class CrearPlantaUseCase implements ICrearPlantaInput {

    private ICrearPlantaRepositorio plantaRepositorio;

    public CrearPlantaUseCase (ICrearPlantaRepositorio plantaRepositorio){
        this.plantaRepositorio = plantaRepositorio;
    }


    @Override
    public boolean crearPlanta(Planta laPlanta) throws PlantaExisteException {
        if (plantaRepositorio.existePlanta(laPlanta.getNombreCientifico()))
            throw new PlantaExisteException();
        else
            plantaRepositorio.guardarPlanta(laPlanta);
            return true;
    }
}
