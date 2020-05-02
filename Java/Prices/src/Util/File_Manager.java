package Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File_Manager{

	//Mode 0 = Read
	//Mode 1 = Write
	public File_Manager(String filename, int mode) {
		
		if (mode == 0) Read();
		else if(mode == 1)Write();
		
	}
	
	private void Read() {
		
	}
	
	//
	private void Write(String[] elem_list) {
		
		try (PrintWriter pw  = new PrintWriter(new File("Test.csv"))){
			
			StringBuilder sb = new StringBuilder();
			//TODO: SB
			
			for(int i = 0; i<elem_list.length; i++) {
				
				
				
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
