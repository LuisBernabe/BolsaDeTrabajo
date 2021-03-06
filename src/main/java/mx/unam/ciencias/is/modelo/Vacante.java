package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:40:38 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vacante generated by hbm2java
 */
public class Vacante  implements java.io.Serializable {


     private int idVacante;
     private Empresa empresa;
     private Date horaInicio;
     private Date horaFinal;
     private String lugar;
     private String puesto;
     private Integer salario;
     private String actividades;
     private String descripcion;
     private Set postulars = new HashSet(0);

    public Vacante() {
    }

	
    public Vacante(int idVacante) {
        this.idVacante = idVacante;
    }
    public Vacante(int idVacante, Empresa empresa, Date horaInicio, Date horaFinal, String lugar, String puesto, Integer salario, String actividades, String descripcion, Set postulars) {
       this.idVacante = idVacante;
       this.empresa = empresa;
       this.horaInicio = horaInicio;
       this.horaFinal = horaFinal;
       this.lugar = lugar;
       this.puesto = puesto;
       this.salario = salario;
       this.actividades = actividades;
       this.descripcion = descripcion;
       this.postulars = postulars;
    }
   
    public int getIdVacante() {
        return this.idVacante;
    }
    
    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFinal() {
        return this.horaFinal;
    }
    
    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Integer getSalario() {
        return this.salario;
    }
    
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public String getActividades() {
        return this.actividades;
    }
    
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPostulars() {
        return this.postulars;
    }
    
    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }




}


