package ar.edu.undec.computadoras.persistencia;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.repositorio.ICrearComputadoraRepositorio;
import ar.edu.undec.computadoras.persistencia.crud.ICrearComputadoraCRUD;
import ar.edu.undec.computadoras.persistencia.entity.ComputadoraEntity;
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
        ComputadoraEntity computadoraBD = new ComputadoraEntity();
        computadoraBD.setI310401000GB16GB("prueba 1");
        computadoraBD.setS("prueba 2");
        computadoraBD.setI(8);
        computadoraBD.setSsd("SSD2");
        computadoraBD.setI1(12);
        computadoraBD.setPc("Pc 002");

        return this.crearComputadoraCRUD.save(computadoraBD).getI310401000GB16GB()!=null;
    }
}
