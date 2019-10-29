package com.example.artistas_eventos_marcel.service;

import com.example.artistas_eventos_marcel.entity.UserEntity;
import com.example.artistas_eventos_marcel.model.UserModel;

import java.util.List;

public interface IntUserService {
    public boolean Crear(UserEntity user);
    public boolean CrearConSoloUser(String user);
    public String RegistrarUsuarioUserNamePass(String user);
    public boolean Actualizar(UserEntity user);
    public boolean Borrar(String user);
    public List<UserModel> obtener();
    public List<UserModel> obtenerPorName(String name);
}
