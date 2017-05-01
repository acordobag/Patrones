/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import enums.PieceColor;

/**
 * 
 * @author Adrian Cordoba
 */
public abstract class GamePiece {
    private PieceColor color;
    
    public abstract void movePosition();
    
    public abstract boolean isMoveValid(Move destinationMove);
}
