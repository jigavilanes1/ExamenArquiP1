package ec.edu.espe.examen.Gavilanes.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DocentePk implements Serializable{
    
    @Column(name = "COD_DOCENTE", nullable = false)
    private String codigoDocente;
    @Column(name = "COD_ESPECIALIDAD", nullable = false)
    private String codigoEspecialidad;

    public DocentePk(){

    }

    public DocentePk(String codigoDocente, String codigoEspecialidad) {
        this.codigoDocente = codigoDocente;
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(String codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoDocente == null) ? 0 : codigoDocente.hashCode());
        result = prime * result + ((codigoEspecialidad == null) ? 0 : codigoEspecialidad.hashCode());
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
        DocentePk other = (DocentePk) obj;
        if (codigoDocente == null) {
            if (other.codigoDocente != null)
                return false;
        } else if (!codigoDocente.equals(other.codigoDocente))
            return false;
        if (codigoEspecialidad == null) {
            if (other.codigoEspecialidad != null)
                return false;
        } else if (!codigoEspecialidad.equals(other.codigoEspecialidad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DocentePk [codigoDocente=" + codigoDocente + ", codigoEspecialidad=" + codigoEspecialidad + "]";
    }
    
}