package com.example.artistas_eventos_marcel;

public class SessionRequest {
    private long idUserTT;
    private long idArtistaAA;

    public SessionRequest(long id_user, long id_artista) {
        this.idUserTT = id_user;
        this.idArtistaAA = id_artista;
    }



    public long getIdUserTT() {
        return idUserTT;
    }

    public void setId_user(long id_user) {
        this.idUserTT = id_user;
    }

    public long getIdArtistaAA() {
        return idArtistaAA;
    }

    public void setId_artista(long id_artista) {
        this.idArtistaAA = id_artista;
    }
}
