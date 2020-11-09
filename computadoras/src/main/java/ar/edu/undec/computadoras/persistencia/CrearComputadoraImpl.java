package ar.edu.undec.computadoras.persistencia;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.repositorio.ICrearComputadoraRepositorio;

public class CrearComputadoraImpl implements ICrearComputadoraRepositorio {


    @Override
    public boolean existeComputadora(String i310401000GB16GB) {
        return false;
    }

    @Override
    public boolean guardarComputadora(Computadora laComputadora) {
        return false;
    }
}
