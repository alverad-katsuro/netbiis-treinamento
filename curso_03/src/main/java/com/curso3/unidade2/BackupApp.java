package com.curso3.unidade2;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupApp {
	public static void main(String[] args) throws Exception {
		Path home = Paths.get("/home/alverad/eclipse-workspace/curso_03/src/unidade2");
		String filtro = "*.java";
		DirectoryStream<Path> stream = Files.newDirectoryStream(home, filtro);
		for (Path path : stream) {
			Path txt = home.resolve(path);
			Path backup = home.resolve((path + ".back"));
			Files.copy(txt, backup, StandardCopyOption.REPLACE_EXISTING);
		}
	}
}
