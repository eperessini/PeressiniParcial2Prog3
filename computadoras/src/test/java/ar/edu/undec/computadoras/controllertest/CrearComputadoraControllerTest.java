package ar.edu.undec.computadoras.controllertest;


import ar.edu.undec.computadoras.controller.dtomodel.ComputadoraDTO;
import ar.edu.undec.computadoras.controller.endpoint.CrearComputadoraController;
import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.usecase.input.ICrearComputadoraInput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

@SpringBootTest
public class CrearComputadoraControllerTest {

    @Mock
    ICrearComputadoraInput crearComputadoraInput;

    @Autowired
    CrearComputadoraController crearComputadoraController;

    @Test
    void crearComputadoraComputadoraNoExisteDevuelve200() throws ComputadoraExisteException {
        Computadora laComputadora = Computadora.instancia("Prueba 2", "prueba II", 2, "SSD", 8, "Notebook");
        ComputadoraDTO laComputadoraDTO = new ComputadoraDTO("Prueba 2", "prueba II", 2, "SSD", 8, "Notebook");

        when(crearComputadoraInput.crearcomputadora(laComputadora)).thenReturn(true);

        ResponseEntity<?> laRespuesta = crearComputadoraController.crearComputadora(laComputadoraDTO);


        Assertions.assertEquals(HttpStatus.OK, laRespuesta.getStatusCode());


    }
}
