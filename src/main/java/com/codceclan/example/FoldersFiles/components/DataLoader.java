package com.codceclan.example.FoldersFiles.components;

import com.codceclan.example.FoldersFiles.models.File;
import com.codceclan.example.FoldersFiles.models.Folder;
import com.codceclan.example.FoldersFiles.models.User;
import com.codceclan.example.FoldersFiles.repositories.FileRepository;
import com.codceclan.example.FoldersFiles.repositories.FolderRepository;
import com.codceclan.example.FoldersFiles.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user = new User("Alison");
        userRepository.save(user);

        Folder folder1 = new Folder("Walks", user);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Music", user);
        folderRepository.save(folder2);

        File file1 = new File("West Highland Way", ".pdf", 14, folder1);
        fileRepository.save(file1);
        File file2 = new File("Arran Coast", ".pdf", 13, folder1);
        fileRepository.save(file2);
        File file3 = new File("Overture - Patrick Wolf", ".mp3", 3, folder2);
        fileRepository.save(file3);
        File file4 = new File("With Teeth - NIN", ".mp3", 4, folder2);
        fileRepository.save(file4);

        user.addFolder(folder1);
        user.addFolder(folder2);
        userRepository.save(user);

        folder1.addFiles(file1);
        folder1.addFiles(file2);
        folder2.addFiles(file3);
        folder2.addFiles(file4);
        folderRepository.save(folder1);
        folderRepository.save(folder2);

    }
}
