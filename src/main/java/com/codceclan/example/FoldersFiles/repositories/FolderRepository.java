package com.codceclan.example.FoldersFiles.repositories;

import com.codceclan.example.FoldersFiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
