/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities.Util.Factories;

import Entities.ChessGame;
import Entities.Player;
import Entities.Util.Base.TableGame;
import enums.Games;

/**
 * 
 * @author Adrian Cordoba
 */
public class GameFactory {
    public static TableGame createGame(Games gameType, Player playerOne, Player playerTwo){
        TableGame game;
        
        switch(gameType){
            case CHESS:
                game = new ChessGame();
                
                break;
                
            default:
                game=new ChessGame();
        }
        
        game.setPlayerOne(playerOne);
        game.setPlayerTwo(playerTwo);
        
        return game;
    }
}
