package com.example.artistas_eventos_marcel.service;

import com.example.artistas_eventos_marcel.SessionRequest;
import com.example.artistas_eventos_marcel.converter.Converter;
import com.example.artistas_eventos_marcel.entity.SessionEntity;
import com.example.artistas_eventos_marcel.entity.UsuarioArtistasEntity;
import com.example.artistas_eventos_marcel.repository.UsuarioArtistasRepository;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("usuarioArtistaService")
public class UsuarioArtistaService implements IntUsuarioArtistaService {

    @Autowired
    @Qualifier("usuarioArtistaRepository")
    private UsuarioArtistasRepository repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Converter convertidor;

    private static final Logger LOGGER = LoggerFactory.getLogger("debug");

    @Override
    public boolean RegistrarUsuarioArtista(SessionRequest idUserIdArtista) {
        try{
          UsuarioArtistasEntity usuarioArtistaEnt = new UsuarioArtistasEntity();
          usuarioArtistaEnt.setIdArtista(idUserIdArtista.getIdArtistaAA());
          usuarioArtistaEnt.setIdUser(idUserIdArtista.getIdUserTT());

          repositorio.save(usuarioArtistaEnt);
          return true;
        }catch (Exception e){
            //JSONObject objetoJson = new JSONObject(idUserIdArtista);
            //LOGGER.info("debug 45: "+objetoJson.getString("id_user"));
            return false;
        }

    }
}
