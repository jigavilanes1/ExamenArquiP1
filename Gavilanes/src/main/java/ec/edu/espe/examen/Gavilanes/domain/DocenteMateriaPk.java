package ec.edu.espe.examen.Gavilanes.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DocenteMateriaPk implements Serializable {
     @Column(name = "COD_DOCENTE", nullable = false)
    private Integer codigoDocente;

    @Column(name = "COD_MATERIA", nullable = false)
    private Integer codigoMateria;

    public DocenteMateriaPk() {
    }

    public Integer getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(Integer codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Integer getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(Integer codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoDocente == null) ? 0 : codigoDocente.hashCode());
        result = prime * result + ((codigoMateria == null) ? 0 : codigoMateria.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DocenteMateriaPk other = (DocenteMateriaPk) obj;
        if (codigoDocente == null) {
            if (other.codigoDocente != null)
                return false;
        } else if (!codigoDocente.equals(other.codigoDocente))
            return false;
        if (codigoMateria == null) {
            if (other.codigoMateria != null)
                return false;
        } else if (!codigoMateria.equals(other.codigoMateria))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DocenteMateriaPK [codigoDocente=" + codigoDocente + ", codigoMateria=" + codigoMateria + "]";
    }

    
}