package com.example.artistas_eventos_marcel.controller;

import com.example.artistas_eventos_marcel.SessionRequest;
import com.example.artistas_eventos_marcel.service.IntUserService;
import com.example.artistas_eventos_marcel.service.IntUsuarioArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/artistas_eventos_mp")
public class UsuarioArtistaController {
    @Autowired
    @Qualifier("usuarioArtistaService")
    private IntUsuarioArtistaService servicio;

    @PutMapping("/newuser/register_usuario_artista")
    public Boolean RegistrarUsuarioArtista(@RequestBody @Valid SessionRequest idUserIdArtista){
        return servicio.RegistrarUsuarioArtista(idUserIdArtista);
    }
}

