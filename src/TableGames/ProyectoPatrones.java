/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableGames;

import Game.Controllers.PlayerController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Adrian Cordoba
 */
public class ProyectoPatrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("TableGames 1.0");
        
        PlayerController playerController = new PlayerController();
        playerController.setFilePath();
        int option = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (option !=3){
            System.out.println("Select action:");
            System.out.println("1. Create Player");
            System.out.print("Enter String");
            option = Integer.parseInt(br.readLine());
            if (option == 1){
                System.out.print("Escriba el nombre de usuario del Jugador (y presione ENTER)? ");
                String username = br.readLine();
                System.out.print("Escriba el corre del Jugador (y presione ENTER)? ");
                String mail = br.readLine();
                System.out.print("Escriba la contraseña del Jugador (y presione ENTER)? ");
                String password = br.readLine();
                
                playerController.createPlayer(username, mail, password);
                      
            }else if(option == 3){
            
                option=3;
            
            }
            
        }

    }
    
}
