package edu.schoollibrary.repository;

import edu.schoollibrary.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
  Optional<AppUser> findAppUserByEmailAndPassword(String email, String password);
}
