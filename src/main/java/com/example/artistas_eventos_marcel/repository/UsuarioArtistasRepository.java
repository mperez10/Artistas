package com.example.artistas_eventos_marcel.repository;

import com.example.artistas_eventos_marcel.entity.UsuarioArtistasEntity;
import com.example.artistas_eventos_marcel.model.UsuarioArtistasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("usuarioArtistaRepository")
public interface UsuarioArtistasRepository extends JpaRepository<UsuarioArtistasEntity, Serializable> {
    //public abstract List<UsuarioArtistasModel> findByIdUser(Long idUser);
}
