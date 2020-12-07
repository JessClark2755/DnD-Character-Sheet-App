import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoadDB {
	FileWriter fwriter;
	PrintWriter pwriter;
	BufferedReader in;
	
	public LoadDB() {
		try {
			fwriter = new FileWriter("db.txt",true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		pwriter = new PrintWriter(fwriter);
		try {
			in=new BufferedReader(new FileReader("db.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addtoDB(String title) {
		pwriter.println(title);
		pwriter.close();
	}
	public int getLines() {
		int lines = 0;
		try {
			in=new BufferedReader(new FileReader("db.txt"));
		while (in.readLine() != null) 
			lines++;
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	public String getLine(int num) {
		String s = null;
		try {
		in=new BufferedReader(new FileReader("db.txt"));
		for(int x = 0; x < num; x++){
		   in.readLine();
		}
		s=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
}
