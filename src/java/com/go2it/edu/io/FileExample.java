package com.go2it.edu.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Alex Ryzhkov
 */
public class FileExample {
	public static void main(String[] args) throws IOException {
		Path fileToRead = Paths.get(
				"C:\\Users\\oryzhkov\\Documents\\Course\\git\\basics\\src\\java\\com\\go2it\\edu\\io\\dummyData.dat");
		try (FileReader reader = new FileReader(fileToRead.toFile());
				FileWriter writer = new FileWriter(
						Paths.get(fileToRead.getParent().toString(), "dummyData.dat.copy").toFile())) {
			System.out.println("Successful start");
			int i;
			while ((i = reader.read()) != -1) {
				System.out.println(i);
				writer.write(i);
			}

			System.out.println("Successful end");
		}
	}
}
