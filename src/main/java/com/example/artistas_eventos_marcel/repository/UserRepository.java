package com.example.artistas_eventos_marcel.repository;

import com.example.artistas_eventos_marcel.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("userrepositorio")
public interface UserRepository extends JpaRepository<UserEntity, Serializable> {
    public abstract List<UserEntity> findByName(String name);
    public abstract UserEntity findByUser(String user);
}
