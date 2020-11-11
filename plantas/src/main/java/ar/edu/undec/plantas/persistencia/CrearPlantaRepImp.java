package ar.edu.undec.plantas.persistencia;

import ar.edu.undec.plantas.core.dominio.ICrearPlantaRepositorio;
import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.persistencia.crud.ICrearPlantaCRUD;
import ar.edu.undec.plantas.persistencia.entity.PlantaEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class CrearPlantaRepImp implements ICrearPlantaRepositorio {

    @Autowired
    ICrearPlantaCRUD CrearPlantaCRUD;


    @Override
    public boolean existePlanta(String plantaNombre) {
        return false;
    }

    @Override
    public boolean guardarPlanta(Planta laPlanta) {
        PlantaEntity plantaBD = new PlantaEntity();
        plantaBD.setNombreCientifico("Erythrina crista-galli");
        plantaBD.setNombreVulgar("Ceibo");
        plantaBD.setCategoria("Faboideae");
        plantaBD.setEpocaPlantado("Primavera");
        plantaBD.setAltura(10);

        return this.CrearPlantaCRUD.save(plantaBD).getNombreCientifico()!=null;
    }
}
