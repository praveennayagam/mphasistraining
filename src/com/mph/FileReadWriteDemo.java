package com.mph;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {

	
	public void writeToFile() {
		try (FileWriter fw = new FileWriter("file1.txt")) {
			fw.write("Hello Everybody");
			System.out.println("written on the file...");
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	public void readToFile() {
		try (FileReader fr = new FileReader("file1.txt")) {
			int ch;
			while((ch =fr.read()) !=-1)
					{
				System.out.print((char)ch);
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FileReadWriteDemo f=new FileReadWriteDemo();
		f.writeToFile();
		f.readToFile();

	}

}
