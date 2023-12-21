package ec.edu.espe.examen.Gavilanes.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.Gavilanes.domain.Especialidad;


public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {
    Especialidad findByNombre(String nombre);
}
