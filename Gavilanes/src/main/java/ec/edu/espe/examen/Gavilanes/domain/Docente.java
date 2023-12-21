package ec.edu.espe.examen.Gavilanes.domain;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "DOCENTE")
public class Docente {

    @EmbeddedId
    private DocentePk pk;

    @Column(name = "CEDULA", length = 10, nullable= false)
    private String cedula;

    @Column(name = "NOMBRE", length = 100, nullable= false)
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;

    @Column(name = "TITULO", length = 100, nullable= false)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "COD_ESPECIALIDAD", referencedColumnName = "COD_ESPECIALIDAD", insertable = false,updatable = false)
    private Especialidad especialidad;

    public Docente() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
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
        Docente other = (Docente) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (fechaIngreso == null) {
            if (other.fechaIngreso != null)
                return false;
        } else if (!fechaIngreso.equals(other.fechaIngreso))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (especialidad == null) {
            if (other.especialidad != null)
                return false;
        } else if (!especialidad.equals(other.especialidad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Docente [pk=" + pk + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaIngreso=" + fechaIngreso
                + ", titulo=" + titulo + ", especialidad=" + especialidad + "]";
    }


    
}