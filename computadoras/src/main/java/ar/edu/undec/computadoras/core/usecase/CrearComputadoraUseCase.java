package ar.edu.undec.computadoras.core.usecase;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.repositorio.ICrearComputadoraRepositorio;
import ar.edu.undec.computadoras.core.usecase.input.ICrearComputadoraInput;

public class CrearComputadoraUseCase implements ICrearComputadoraInput {

    private ICrearComputadoraRepositorio computadoraRepositorio;

    public CrearComputadoraUseCase (ICrearComputadoraRepositorio computadoraRepositorio) {
        this.computadoraRepositorio = computadoraRepositorio;
    }


    @Override
    public boolean crearcomputadora(Computadora laComputadora) throws ComputadoraExisteException {
         if(computadoraRepositorio.existeComputadora(laComputadora.getI310401000GB16GB()))
            throw new ComputadoraExisteException();

         else{
            computadoraRepositorio.guardarComputadora(laComputadora);
            return true;
        }

    }
}
