package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class testPowerShell {
     private static void eliminarTemporales() throws IOException, TransferenciaDeArhivosException {

        String command = "powershell.exe  "
                + "Invoke-Command -computerName sistemas50,sistemas51,sistemas52,sistemas53,sistemas54,sistemas55,sistemas56,sistemas57,sistemas58,sistemas59,sistemas60,sistemas61,sistemas62,sistemas63,sistemas64,sistemas65,sistemas66,sistemas67,sistemas68,sistemas69,sistemas70,sistemas71,sistemas72,sistemas73,sistemas74,sistemas75,sistemas76,sistemas77,sistemas78,sistemas79,sistemas81,sistemas82,sistemas83,sistemas84,sistemas85,sistemas86,sistemas87,sistemas88,sistemas89,sistemas90,sistemas91,sistemas92,sistemas93,sistemas94,sistemas95,sistemas96,sistemas97,sistemas98,sistemas99,sistemas100 -ScriptBlock{msg * '=)'} -credential rescate ";
        // Executing the command
        System.out.println(command);
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.err.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.err.println(line);
        }
        stdout.close();
        System.err.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.err.println(line);
        }
        stderr.close();
        System.err.println("Done");
    }



    public static void main(String[] args) throws TransferenciaDeArhivosException, IOException, SQLException {
        eliminarTemporales();
    }
}
