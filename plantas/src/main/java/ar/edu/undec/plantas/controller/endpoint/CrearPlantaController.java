package ar.edu.undec.plantas.controller.endpoint;

import ar.edu.undec.plantas.controller.dto.PlantaDTO;
import ar.edu.undec.plantas.core.dominio.Planta;
import ar.edu.undec.plantas.core.exception.PlantaExisteException;
import ar.edu.undec.plantas.core.usecase.input.ICrearPlantaInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrearPlantaController {

    @Autowired
    ICrearPlantaInput crearPlantaInput;

    @PostMapping(value="/plantas")
    public ResponseEntity<?> crearPlanta(@RequestBody PlantaDTO laPlanta){

        Planta plantaCore = Planta.instancia(laPlanta.getNombreCientifico(), laPlanta.getNombreVulgar(), laPlanta.getCategoria(), laPlanta.getEpocaPlantado(), laPlanta.getAltura());

        try {
            boolean resultado=crearPlantaInput.crearPlanta(plantaCore);
            return ResponseEntity.status(HttpStatus.OK).body("Planta creada");
        } catch (PlantaExisteException existePlanta) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(existePlanta.getMessage());
        }
            catch (Exception exceptionOther) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inesperado");
         }

    }
}
