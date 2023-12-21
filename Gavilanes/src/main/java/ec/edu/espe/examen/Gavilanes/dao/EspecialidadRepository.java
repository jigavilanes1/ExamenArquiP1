package ec.edu.espe.examen.Gavilanes.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.Gavilanes.domain.Especialidad;
import java.util.List;


public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {
    List<Especialidad> findByNombre(String Nombre);
}