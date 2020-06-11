package Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import Market.pt_market;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class File_Manager{

	//Mode 0 = Read buf must be empty
	//Mode 1 = Write buf must not be empty
	public File_Manager(pt_market market) throws IOException {

            Write("data.csv", market);
            Process proc = Runtime.getRuntime().exec("python3 prices_plot.py");
            Read("plot.png");
            
        }
            

	
	private void Read(String Filename) {
            ImageIcon ImgIco = new ImageIcon(Filename);
	}
	
	//
	private void Write(String filename, pt_market market) throws IOException {
	
   
            try (PrintWriter pw  = new PrintWriter(new File(filename))){
                
                System.out.println("File Created");
                
                StringBuilder sb = new StringBuilder();
                sb.append("Supply Curve,Demand Curve\n");

                System.out.println("String Building...");
                
                for (int i = 0; i< 10; i++){
                    sb.append(market.getSupplyCurve(i));
                    sb.append(",");
                    sb.append(market.getDemandCurve(i));
                    sb.append("\n");
                }
                
                pw.write(sb.toString());
                pw.close();
                System.out.println("File Closed...");
                
            }
            catch(FileNotFoundException e) {
                    System.out.println(e.getMessage());
            }

        }

}
