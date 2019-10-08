package com.codceclan.example.FoldersFiles.repositories;

import com.codceclan.example.FoldersFiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
