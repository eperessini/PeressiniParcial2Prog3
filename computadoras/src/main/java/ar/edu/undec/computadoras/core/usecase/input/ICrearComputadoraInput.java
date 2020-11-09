package ar.edu.undec.computadoras.core.usecase.input;

import ar.edu.undec.computadoras.core.dominio.*;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;


public interface ICrearComputadoraInput  {
    boolean crearcomputadora(Computadora laComputadora)throws ComputadoraExisteException;
}
