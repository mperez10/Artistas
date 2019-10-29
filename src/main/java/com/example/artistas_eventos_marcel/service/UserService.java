package com.example.artistas_eventos_marcel.service;

import com.example.artistas_eventos_marcel.converter.Converter;
import com.example.artistas_eventos_marcel.entity.UserEntity;
import com.example.artistas_eventos_marcel.model.UserModel;
import com.example.artistas_eventos_marcel.repository.UserRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userservicio")
public class UserService implements IntUserService {
    @Autowired
    @Qualifier("userrepositorio")
    private UserRepository repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Converter convertidor;

    @Override
    public boolean Crear(UserEntity user){
        try{
            repositorio.save(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean CrearConSoloUser(String user){
        try{
            JSONObject objetoJson = new JSONObject(user);
            UserEntity usuario = new UserEntity();
            usuario.setName(objetoJson.getString("user"));
            usuario.setPassword("1234");
            usuario.setUser(objetoJson.getString("user"));
            repositorio.save(usuario);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String RegistrarUsuarioUserNamePass(String user){
        try{

            JSONObject objetoJson = new JSONObject(user);
            UserEntity usuario = new UserEntity();

            usuario.setName(objetoJson.getString("name"));
            usuario.setPassword(objetoJson.getString("password"));
            usuario.setUser(objetoJson.getString("user"));
            repositorio.save(usuario);
            return "usuario-registrado";
        }catch (Exception e){
            return "username-duplicado";
        }
    }

    @Override
    public boolean Actualizar(UserEntity user){
        try{
            repositorio.save(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean Borrar(String user){
        try{
            UserEntity figura = repositorio.findByUser(user);
            repositorio.delete(figura);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<UserModel> obtener(){
        return convertidor.UserEntityToUserModel(repositorio.findAll());
    }

    @Override
    public List<UserModel> obtenerPorName(String name){
        return convertidor.UserEntityToUserModel(repositorio.findByName(name));
    }

}
