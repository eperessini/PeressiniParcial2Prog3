package ar.edu.undec.computadoras.core.exception;

public class ComputadoraExisteException extends Exception {

    @Override
    public String getMessage(){
        return "La computadora que intenta crear ya existe";
    }

}
