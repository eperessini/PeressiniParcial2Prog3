package ar.edu.undec.plantas.core.exception;

public class PlantaExisteException extends Exception {

    @Override
    public String getMessage(){
        return "La planta ya existe";
    }
}
