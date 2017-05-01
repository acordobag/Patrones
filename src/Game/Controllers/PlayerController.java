/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.Controllers;

import Entities.Player;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;



/**
 *
 * @author david
 */
public class PlayerController {
    
    Player player;
    Properties prop = new Properties();
    OutputStream output;

    public void createPlayer(String pusername,String pmail,String ppassword) throws FileNotFoundException, IOException{
        player =  new Player(pusername,pmail,ppassword);
        createFile();
    }

    private void createFile() throws FileNotFoundException, IOException {
       try{ 
        output = new FileOutputStream("config.properties");
        setFileProperties();
       }catch(IOException ex){
         ex.printStackTrace();
       } 
    }

    private void setFileProperties() throws IOException {
        prop.setProperty("user", player.getUsername());
        prop.setProperty("mail", player.getMail());
        prop.setProperty("password", player.getPassword());
        prop.store(output, null);
    }

    

   
}
