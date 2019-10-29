package com.example.artistas_eventos_marcel.service;

import com.example.artistas_eventos_marcel.entity.UserEntity;
import com.example.artistas_eventos_marcel.model.SessionModel;

import java.util.List;

public interface IntSessionService {
    public List<SessionModel> obtener();
    public String RegistrarSession(String user);
    public List<SessionModel> obtenerPorUser(Long name);
}
