package com.example.artistas_eventos_marcel.service;

import com.example.artistas_eventos_marcel.converter.Converter;
import com.example.artistas_eventos_marcel.entity.SessionEntity;
import com.example.artistas_eventos_marcel.model.SessionModel;
import com.example.artistas_eventos_marcel.model.UserModel;
import com.example.artistas_eventos_marcel.repository.SessionRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("sesionservicio")
public class SessionService implements IntSessionService {
    @Autowired
    @Qualifier("sesionrepositorio")
    private SessionRepository repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Converter convertidor;

    @Override
    public String RegistrarSession(String user){
        try{

            JSONObject objetoJson = new JSONObject(user);
            SessionEntity sesion = new SessionEntity();

            sesion.setId_user(Long.parseLong(objetoJson.getString("iduser")));


            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            sesion.setFechahora(hourdateFormat.format(date));

            sesion.setEstado_sesion("Activa");

            repositorio.save(sesion);
            return "session-iniciada";
        }catch (Exception e){
            return "intento-ini-session";
        }
    }
    @Override
    public List<SessionModel> obtener(){
        return convertidor.SessionEntityToSessionModel(repositorio.findAll());
    }

    @Override
    public List<SessionModel> obtenerPorUser(Long name){
       return convertidor.SessionEntityToSessionModel(repositorio.findByIduser(name));
    }


}
