package com.example.artistas_eventos_marcel.model;

import com.example.artistas_eventos_marcel.entity.SessionEntity;

public class SessionModel {
    private long id;
    private long iduser;
    private String fechahora;
    private String fechahorafin;
    private String estado_sesion;

    public SessionModel(){

    }

    public SessionModel(SessionEntity session) {
        this.id = session.getId();
        this.iduser = session.getId_user();
        this.fechahora = session.getFechahora();
        this.fechahorafin = session.getFechahorafin();
        this.estado_sesion = session.getEstado_sesion();
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
