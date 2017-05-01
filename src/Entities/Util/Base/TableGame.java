/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities.Util.Base;

import Entities.Player;
import Entities.Util.Base.GameBoard;
import Entities.Util.Base.GamePiece;
import enums.Games;

/**
 * 
 * @author Adrian Cordoba
 */
public class TableGame {
    private Games GameName;
    private GameBoard board;
    private Player playerOne;
    private Player playerTwo;
    private GamePiece[] gamesPieces;
}
