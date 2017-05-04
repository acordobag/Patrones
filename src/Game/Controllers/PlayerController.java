/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.Controllers;

import Entities.Player;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;



/**
 *
 * @author david
 */
public class PlayerController {
    
    public void createPlayer(String pUsername, String pEmail, String pPassword) throws IOException{
      Player player = new Player(pUsername,pEmail,pPassword);

      try {
                FileWriter writer = new FileWriter("Players.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                bufferedWriter.write("User: " + player.getUsername());;;
                bufferedWriter.newLine();
                bufferedWriter.write("Mail: " + player.getMail());
                bufferedWriter.newLine();
                bufferedWriter.write("Password: " + player.getPassword());
                bufferedWriter.newLine();

                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
                BufferedWriter out = new BufferedWriter(new FileWriter("Players.txt"));
                createPlayer(pUsername, pEmail, pPassword);
            }

     }
    
    public void setFilePath() throws IOException{
        
        Properties prop = new Properties();
        OutputStream output  = null;

        try {
         output  = new FileOutputStream("filesDirections.properties");

         // set the properties value
         prop.setProperty("Players file", "workspace" + "\\" + "proPatrones.");

         // save properties to project root folder
         prop.store(output , null);

        } catch (IOException io) {
         io.printStackTrace();
        } finally {
            if (output  != null) {
               try {
                output.close();
               } catch (IOException e) {
                e.printStackTrace();
               }
           }
        }
    }   

    

    

   
}
