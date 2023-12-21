package ec.edu.espe.examen.Gavilanes.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.Gavilanes.domain.Materia;
import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, String>{
    List<Materia> findByNombreContaining(String Nombre);
}
