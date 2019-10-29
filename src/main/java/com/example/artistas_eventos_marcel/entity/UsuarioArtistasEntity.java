package com.example.artistas_eventos_marcel.entity;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="USUARIOS_ARTISTAS")
@Entity
public class UsuarioArtistasEntity implements Serializable {
    @GeneratedValue
    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="ID_USER")
    private Long idUser;

    @Column(name = "ID_ARTISTA")
    private Long idArtista;

    public UsuarioArtistasEntity(){

    }

    public UsuarioArtistasEntity(Long id, Long idUser, Long idArtista) {
        this.id = id;
        this.idUser = idUser;
        this.idArtista = idArtista;
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
