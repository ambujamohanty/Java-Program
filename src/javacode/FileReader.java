package javacode;

import java.io.*;

public class FileReader {

	public FileReader(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception
	// TODO Auto-generated method stub
	{

		// Passing the path to the file as a parameter
		FileReader fileReader = new FileReader("C:\\Users\\chitt\\Desktop\\test.txt");

		// Declaring loop variable
		int i;
		// Holds true till there is nothing to read
		while ((i = fileReader.read()) != -1)

			// Print all the content of a file
			System.out.print((char) i);
	}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

}
