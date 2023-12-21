package ec.edu.espe.examen.Gavilanes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.examen.Gavilanes.domain.Especialidad;
import ec.edu.espe.examen.Gavilanes.dao.EspecialidadRepository;
import jakarta.transaction.Transactional;

@Service
public class EspecialidadService {
    private final EspecialidadRepository especialidadRepository;

    public EspecialidadService(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }


    @Transactional
    public Especialidad create(Especialidad especialidad){
        List<Especialidad> especialidadTmp = this.especialidadRepository.findByNombre(especialidad.getNombre());
        if (especialidadTmp == null) {
            return this.especialidadRepository.save(especialidad);
        } else {
            throw new RuntimeException("La especialidad ya existe");
        }
    }

    public List<Especialidad> listByPatronNombre(String Nombre){
        return this.especialidadRepository.findByNombre(Nombre);
    }
    
}
