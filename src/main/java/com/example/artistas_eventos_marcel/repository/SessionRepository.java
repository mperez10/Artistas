package com.example.artistas_eventos_marcel.repository;

import com.example.artistas_eventos_marcel.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("sesionrepositorio")
public interface SessionRepository extends JpaRepository<SessionEntity, Serializable> {
    public abstract List<SessionEntity> findByIduser(Long name);
}
