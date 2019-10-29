package com.example.artistas_eventos_marcel.controller;

import com.example.artistas_eventos_marcel.model.SessionModel;
import com.example.artistas_eventos_marcel.model.UserModel;
import com.example.artistas_eventos_marcel.service.IntSessionService;
import com.example.artistas_eventos_marcel.service.SessionService;
import com.example.artistas_eventos_marcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/artistas_eventos_mp")
public class SessionController {
    @Autowired
    @Qualifier("sesionservicio")
    private IntSessionService service;

    @PutMapping("/newuser/initsession")
    public String RegistrarSession(@RequestBody @Valid String user){
        return service.RegistrarSession(user);
    }

    @GetMapping("/getsessions/id_user={id_user}")
    public List<SessionModel> obtenerSesiones(@PathVariable("id_user") Long username){
        return service.obtenerPorUser(username);
    }

    @GetMapping("/getsessions")
    public List<SessionModel> obtenerSesiones(){
        return service.obtener();
    }
}
