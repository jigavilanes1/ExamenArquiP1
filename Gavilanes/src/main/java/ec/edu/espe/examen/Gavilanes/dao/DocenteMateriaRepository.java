package ec.edu.espe.examen.Gavilanes.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.Gavilanes.domain.DocenteMateria;
import ec.edu.espe.examen.Gavilanes.domain.DocenteMateriaPk;

public interface DocenteMateriaRepository extends JpaRepository<DocenteMateria, DocenteMateriaPk>{
    Optional<DocenteMateria> findByPkCodigoDocenteAndPkCodigoMateria(Integer codigoDocente, Integer codigoMateria);
}
