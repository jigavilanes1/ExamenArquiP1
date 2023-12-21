package ec.edu.espe.examen.Gavilanes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examen.Gavilanes.domain.Docente;
import ec.edu.espe.examen.Gavilanes.domain.DocenteMateria;
import ec.edu.espe.examen.Gavilanes.domain.DocenteMateriaPk;
import ec.edu.espe.examen.Gavilanes.domain.Materia;
import ec.edu.espe.examen.Gavilanes.dao.DocenteMateriaRepository;
import ec.edu.espe.examen.Gavilanes.dao.DocenteRepository;
import ec.edu.espe.examen.Gavilanes.dao.MateriaRepository;
import jakarta.transaction.Transactional;

@Service
public class PlanificacionService {
     @Autowired
    private DocenteRepository docenteRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private DocenteMateriaRepository docenteMateriaRepository;

    @Transactional
    public void asignarDocenteAMateria(Long codigoDocente, Long codigoMateria) {
        Optional<Docente> docenteTmp = docenteRepository.findById(codigoDocente);
        Optional<Materia> materiaTmp = materiaRepository.findById(codigoMateria);

        if (docenteTmp.isEmpty() || materiaTmp.isEmpty()) {
            throw new RuntimeException("Docente o materia no encontrados");
        }

        Docente docente = docenteTmp.get();
        Materia materia = materiaTmp.get();


        DocenteMateriaPk docenteMateriaPK = new DocenteMateriaPk();

        DocenteMateria docenteMateria = new DocenteMateria();
        docenteMateria.setPk(docenteMateriaPK);

        docenteMateriaRepository.save(docenteMateria);

    }
}
