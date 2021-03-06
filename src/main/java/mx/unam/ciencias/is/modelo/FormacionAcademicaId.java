package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:40:38 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * FormacionAcademicaId generated by hbm2java
 */
public class FormacionAcademicaId  implements java.io.Serializable {


     private String colegio;
     private int grado;
     private Date inicioPeriodo;
     private Date finPeriodo;

    public FormacionAcademicaId() {
    }

    public FormacionAcademicaId(String colegio, int grado, Date inicioPeriodo, Date finPeriodo) {
       this.colegio = colegio;
       this.grado = grado;
       this.inicioPeriodo = inicioPeriodo;
       this.finPeriodo = finPeriodo;
    }
   
    public String getColegio() {
        return this.colegio;
    }
    
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    public int getGrado() {
        return this.grado;
    }
    
    public void setGrado(int grado) {
        this.grado = grado;
    }
    public Date getInicioPeriodo() {
        return this.inicioPeriodo;
    }
    
    public void setInicioPeriodo(Date inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
    }
    public Date getFinPeriodo() {
        return this.finPeriodo;
    }
    
    public void setFinPeriodo(Date finPeriodo) {
        this.finPeriodo = finPeriodo;
    }




}


