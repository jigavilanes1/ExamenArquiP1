package ec.edu.espe.examen.Gavilanes.domain;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "DOCENTE_MATERIA")
public class DocenteMateria {

    @EmbeddedId
    private DocenteMateriaPk pk;

    @Column(name = "PERIODO", length = 10)
    private String periodo;

    @Column(name = "ALUMNOS_MATRICULADOS", precision = 2)
    private Integer alumnosMatriculados;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    @Column(name = "PROMEDIO_CURSO", precision = 4, scale = 2)
    private BigDecimal promedioCurso;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ULTIMO_CAMBIO")
    private Date fechaUltimoCambio;

    public DocenteMateria() {
    }

    public DocenteMateria(DocenteMateriaPk pk) {
        this.pk = pk;
    }

    public DocenteMateriaPk getPk() {
        return pk;
    }

    public void setPk(DocenteMateriaPk pk) {
        this.pk = pk;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    public void setAlumnosMatriculados(Integer alumnosMatriculados) {
        this.alumnosMatriculados = alumnosMatriculados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getPromedioCurso() {
        return promedioCurso;
    }

    public void setPromedioCurso(BigDecimal promedioCurso) {
        this.promedioCurso = promedioCurso;
    }

    public Date getFechaUltimoCambio() {
        return fechaUltimoCambio;
    }

    public void setFechaUltimoCambio(Date fechaUltimoCambio) {
        this.fechaUltimoCambio = fechaUltimoCambio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        DocenteMateria other = (DocenteMateria) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DocenteMateria [pk=" + pk + ", periodo=" + periodo + ", alumnosMatriculados=" + alumnosMatriculados
                + ", estado=" + estado + ", promedioCurso=" + promedioCurso + ", fechaUltimoCambio=" + fechaUltimoCambio
                + "]";
    }

    
}