package mx.unam.ciencias.is.modelo;
// Generated 20/02/2018 02:40:38 PM by Hibernate Tools 4.3.1



/**
 * ExperienciaLaboral generated by hbm2java
 */
public class ExperienciaLaboral  implements java.io.Serializable {


     private ExperienciaLaboralId id;
     private Integer fkIdProfesionista;

    public ExperienciaLaboral() {
    }

	
    public ExperienciaLaboral(ExperienciaLaboralId id) {
        this.id = id;
    }
    public ExperienciaLaboral(ExperienciaLaboralId id, Integer fkIdProfesionista) {
       this.id = id;
       this.fkIdProfesionista = fkIdProfesionista;
    }
   
    public ExperienciaLaboralId getId() {
        return this.id;
    }
    
    public void setId(ExperienciaLaboralId id) {
        this.id = id;
    }
    public Integer getFkIdProfesionista() {
        return this.fkIdProfesionista;
    }
    
    public void setFkIdProfesionista(Integer fkIdProfesionista) {
        this.fkIdProfesionista = fkIdProfesionista;
    }




}


