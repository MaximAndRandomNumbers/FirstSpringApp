package ru.kuznetsov.stories.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kuznetsov.stories.models.User;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    Optional<User> findByLogin(String login);
    Optional<User> findByEmail(String email);
}
