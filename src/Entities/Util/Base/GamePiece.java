/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities.Util.Base;

import enums.PieceColor;
import enums.PieceStatus;


/**
 * 
 * @author Adrian Cordoba
 */
public class GamePiece {
    private PieceColor color;
    private String name;
    private PieceStatus status;

    public PieceColor getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public PieceStatus getStatus() {
        return status;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(PieceStatus status) {
        this.status = status;
    }
    
}
