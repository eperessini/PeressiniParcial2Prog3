package ar.edu.undec.computadoras.persistencia;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.repositorio.ICrearComputadoraRepositorio;
import ar.edu.undec.computadoras.persistencia.crud.ICrearComputadoraCRUD;
import org.springframework.beans.factory.annotation.Autowired;

public class CrearComputadoraImpl implements ICrearComputadoraRepositorio {
    @Autowired
    ICrearComputadoraCRUD crearComputadoraCRUD;

    @Override
    public boolean existeComputadora(String i310401000GB16GB) {
        return false;
    }

    @Override
    public boolean guardarComputadora(Computadora laComputadora) {
        return false;
    }
}
