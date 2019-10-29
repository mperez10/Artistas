package com.example.artistas_eventos_marcel.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="SESIONES")
@Entity
public class SessionEntity implements Serializable {
    @GeneratedValue
    @Id
    @Column(name="ID")
    private long id;

    @Column(name = "ID_USER")
    private long iduser;

    @Column(name = "FECHAHORA")
    private String fechahora;

    @Column(name = "FECHAHORAFIN")
    private String fechahorafin;

    @Column(name = "ESTADO")
    private String estado_sesion;

    public SessionEntity(){

    }

    public SessionEntity(long id, long id_user, String fechahora, String fechahorafin, String estado_sesion) {
        this.id = id;
        this.iduser = id_user;
        this.fechahora = fechahora;
        this.fechahorafin = fechahorafin;
        this.estado_sesion = estado_sesion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_user() {
        return iduser;
    }

    public void setId_user(long id_user) {
        this.iduser = id_user;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public String getFechahorafin() {
        return fechahorafin;
    }

    public void setFechahorafin(String fechahorafin) {
        this.fechahorafin = fechahorafin;
    }

    public String getEstado_sesion() {
        return estado_sesion;
    }

    public void setEstado_sesion(String estado_sesion) {
        this.estado_sesion = estado_sesion;
    }
}
