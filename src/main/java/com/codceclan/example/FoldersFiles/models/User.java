package com.codceclan.example.FoldersFiles.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    private ArrayList<Folder> folders;

    public User(){
    }

    public User(String name){
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder){
        this.folders.add(folder);
    }
}
