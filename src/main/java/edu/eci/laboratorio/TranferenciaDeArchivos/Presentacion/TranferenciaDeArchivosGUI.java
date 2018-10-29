package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import javax.swing.JFrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Runtime;
import edu.eci.laboratorio.TranferenciaDeArchivos.Logico.TransferenciaDeArhivosException;

public class TranferenciaDeArchivosGUI extends JFrame{
			
	public TranferenciaDeArchivosGUI() {
		
	}
	

	public static void main(String[] args) throws TransferenciaDeArhivosException {
		//TranferenciaDeArchivosGUI gui = new TranferenciaDeArchivosGUI();
		//gui.setVisible(true);
		
		
			 		/*ProcessBuilder builder = new ProcessBuilder(
			           "cmd.exe","c/", "pushd \\sistemas70\\Sistemas\\Temp","mkdir testo");
			        builder.redirectErrorStream(true);
			        try {
						 Process p = builder.start();
						 BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
					        String line;
					        while (true) {
					            line = r.readLine();
					            if (line == null) { break; }
					            System.out.println(line);
					       }
						System.err.println(p.isAlive());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
		
		try {
			/*String can = "-Sistemas";
			String arg = "cd \\\\sistemas70\\Sistemas\\Temp mkdir gordo1";
			String ars = "cd Documents mkdir gordo1";
			 */
			String arg = "pushd \\\\sistemas70\\Sistemas\\Temp";
			//;
			Runtime rt = Runtime.getRuntime();
			rt.exec("cmd.exe /c cd \\Users\\rescate  & start  cmd.exe /k \"java -flag -flag -cp terminal-based-program.jar\"");
			//ProcessBuilder pbBuilder = new ProcessBuilder();
			//pbBuilder.command(new String[]{"cmd.exe c/ notepad.exe"});
			//pbBuilder.start();
		
			System.out.println("");
			//String pruebas[] = new String[] {"pushd "+arg+" && mkdir gordo1"};
			//Process builder = Runtime.getRuntime().exec(ars);

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			       
			
		
	}
 
}
