package ec.edu.espe.examen.Gavilanes.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examen.Gavilanes.domain.Docente;
import ec.edu.espe.examen.Gavilanes.domain.Especialidad;
import ec.edu.espe.examen.Gavilanes.dao.DocenteRepository;
import ec.edu.espe.examen.Gavilanes.dao.EspecialidadRepository;
import jakarta.transaction.Transactional;

@Service
public class DocenteService {
    @Autowired
    private DocenteRepository docenteRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Transactional
    public Docente create(Docente docente) {
        String codigoEspecialidad = docente.getEspecialidad().getcodigo();
        Especialidad especialidad = especialidadRepository.findById(codigoEspecialidad)
                .orElseThrow(() -> new RuntimeException("La especialidad no está registrada"));

        Date fechaIngreso = docente.getFechaIngreso();
        Date fechaActual = new Date();

        if (fechaIngreso.before(fechaActual)) {
            throw new RuntimeException("La fecha de ingreso debe ser posterior a la fecha actual");
        }

        docente.setEspecialidad(especialidad);
        return docenteRepository.save(docente);
    }
}