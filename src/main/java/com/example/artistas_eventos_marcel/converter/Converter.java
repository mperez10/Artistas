package com.example.artistas_eventos_marcel.converter;

import com.example.artistas_eventos_marcel.entity.SessionEntity;
import com.example.artistas_eventos_marcel.entity.UserEntity;
import com.example.artistas_eventos_marcel.entity.UsuarioArtistasEntity;
import com.example.artistas_eventos_marcel.model.SessionModel;
import com.example.artistas_eventos_marcel.model.UserModel;
import com.example.artistas_eventos_marcel.model.UsuarioArtistasModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Converter {
    public List<UserModel> UserEntityToUserModel(List<UserEntity> usersEntity){
        List<UserModel> usersModel = new ArrayList<UserModel>();

        for(UserEntity userEnt: usersEntity){
            usersModel.add(new UserModel(userEnt));
        }
        return usersModel;
    }

    public List<SessionModel> SessionEntityToSessionModel(List<SessionEntity> sessionsEntity){
        List<SessionModel> sessionsModel = new ArrayList<SessionModel>();

        for(SessionEntity sessEnt: sessionsEntity){
            sessionsModel.add(new SessionModel(sessEnt));
        }
        return sessionsModel;
    }

    public List<UsuarioArtistasModel> UsuArtisEntiToUsuArtisModel(List<UsuarioArtistasEntity> usuArtisEntidad){
        List<UsuarioArtistasModel> usuArtisModelo = new ArrayList<UsuarioArtistasModel>();

        for(UsuarioArtistasEntity usuArtistasKey: usuArtisEntidad){
            usuArtisModelo.add(new UsuarioArtistasModel(usuArtistasKey));
        }
        return usuArtisModelo;
    }
}
