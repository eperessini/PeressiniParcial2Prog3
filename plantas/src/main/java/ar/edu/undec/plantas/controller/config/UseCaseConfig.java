package ar.edu.undec.plantas.controller.config;


import ar.edu.undec.plantas.core.usecase.CrearPlantaUseCase;
import ar.edu.undec.plantas.persistencia.CrearPlantaRepImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Autowired
    CrearPlantaRepImp crearPlantaRep;

    @Bean
    public CrearPlantaUseCase crearPlantaUseCase() {
        return new CrearPlantaUseCase(crearPlantaRep);
    }
    
}
