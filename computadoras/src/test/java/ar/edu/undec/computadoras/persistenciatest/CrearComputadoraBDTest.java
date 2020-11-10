package ar.edu.undec.computadoras.persistenciatest;


import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.persistencia.CrearComputadoraImpl;
import ar.edu.undec.computadoras.persistencia.crud.ICrearComputadoraCRUD;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class CrearComputadoraBDTest {
    @Mock
    CrearComputadoraImpl crearMComputadoraRepo;

    @Test
    public void CrearComputadoraBD()
    {
        Computadora laComputadora = Computadora.instancia("I310401000GB16GB","Core I3 1040",1000,"SSD",16,"PC");
        boolean resultado = crearMComputadoraRepo.guardarComputadora(laComputadora);


        Assertions.assertTrue(resultado);

    }
}
