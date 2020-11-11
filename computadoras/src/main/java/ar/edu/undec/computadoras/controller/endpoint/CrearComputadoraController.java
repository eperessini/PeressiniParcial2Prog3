package ar.edu.undec.computadoras.controller.endpoint;

import ar.edu.undec.computadoras.controller.dtomodel.ComputadoraDTO;
import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.usecase.input.ICrearComputadoraInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrearComputadoraController {

    @Autowired
    ICrearComputadoraInput crearComputadoraInput;

    @PostMapping(value="/computadoras")

    public ResponseEntity<?> crearComputadora(@RequestBody ComputadoraDTO laComputadora){

        Computadora computadoraCore=Computadora.instancia(laComputadora.getI310401000GB16GB(), laComputadora.getS(), laComputadora.getI(), laComputadora.getSsd(), laComputadora.getI1(), laComputadora.getPc());

        try {
            boolean resultado = crearComputadoraInput.crearcomputadora(computadoraCore);
            return ResponseEntity.status(HttpStatus.OK).body(resultado);
        } catch (ComputadoraExisteException ComputadoraExiste) {
            ComputadoraExiste.printStackTrace();
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(ComputadoraExiste.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error en el servidor");
        }

    }

}
