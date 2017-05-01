/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities.Util.Factories;

import Entities.King;
import Entities.Util.Base.GamePiece;
import enums.GamePieces;

/**
 * 
 * @author Adrian Cordoba
 */
public class PieceFactory {
    
    public static GamePiece createGamePiece(GamePieces pieceName){
        
        switch (pieceName) {
            case KING:
                return new King();
            default:
                throw new AssertionError();
        }
        
    }

}
