package com.example.artistas_eventos_marcel.model;

import com.example.artistas_eventos_marcel.entity.UsuarioArtistasEntity;

public class UsuarioArtistasModel {
    private Long id;
    private Long idUser;
    private Long idArtista;

    public UsuarioArtistasModel(){

    }

    public UsuarioArtistasModel(UsuarioArtistasEntity usuArtisEnt) {
        this.id = usuArtisEnt.getId();
        this.idUser = usuArtisEnt.getIdUser();
        this.idArtista = usuArtisEnt.getIdArtista();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Long idArtista) {
        this.idArtista = idArtista;
    }
}
