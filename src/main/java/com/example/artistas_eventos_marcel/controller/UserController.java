package com.example.artistas_eventos_marcel.controller;

import com.example.artistas_eventos_marcel.entity.UserEntity;
import com.example.artistas_eventos_marcel.model.UserModel;
import com.example.artistas_eventos_marcel.service.IntUserService;
import com.example.artistas_eventos_marcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/artistas_eventos_mp")
public class UserController {
    @Autowired
    @Qualifier("userservicio")
    private IntUserService service;

    @PutMapping("/newuser")
    public boolean AgregarUsuario(@RequestBody @Valid UserEntity user){
        return service.Crear(user);
    }

    @PutMapping("/newuser/speedcreatewithuser")
    public boolean AgregarUsuarioUser(@RequestBody @Valid String user){
        return service.CrearConSoloUser(user);
    }

    @PutMapping("/newuser/registerjson")
    public String RegistrarUsuario(@RequestBody @Valid String user_name_password){
        return service.RegistrarUsuarioUserNamePass(user_name_password);
    }


    @PostMapping("/updateuser")
    public boolean ActualizarUsuario(@RequestBody @Valid UserEntity user){
        return service.Actualizar(user);
    }

    @DeleteMapping("/delete/{username}")
    public boolean BorrarUsuario(@PathVariable("username") String username){
        return service.Borrar(username);
    }

    @GetMapping("/getusers")
    public List<UserModel> obtenerUsuarios(){
        return service.obtener();
    }
}
