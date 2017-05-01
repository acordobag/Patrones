/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game.Controllers;

import Entities.Player;
import Entities.Util.Base.TableGame;
import Entities.Util.Factories.GameFactory;
import enums.Games;

/**
 * 
 * @author Adrian Cordoba
 */
public class GameController {
    public TableGame createGame(Games gameType, Player playerOne, Player playerTwo){
        return GameFactory.createGame(gameType, playerOne, playerTwo);
    }
}
