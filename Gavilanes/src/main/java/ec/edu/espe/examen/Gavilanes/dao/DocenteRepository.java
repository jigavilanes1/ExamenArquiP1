package ec.edu.espe.examen.Gavilanes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.Gavilanes.domain.Docente;

public interface  DocenteRepository extends JpaRepository<Docente, Long> {
    
}