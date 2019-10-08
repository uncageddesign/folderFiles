package com.codceclan.example.FoldersFiles;

import com.codceclan.example.FoldersFiles.repositories.FileRepository;
import com.codceclan.example.FoldersFiles.repositories.FolderRepository;
import com.codceclan.example.FoldersFiles.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoldersFilesApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

}
