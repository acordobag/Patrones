/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 * 
 * @author Adrian Cordoba
 */
public class Move {
    
    private int XPosition;
    private int YPosition;

       
    public Move(int x, int y){
        this.XPosition = x;
        this.YPosition= y;
    }

    public int getYPosition() {
        return YPosition;
    }

    public int getXPosition() {
        return XPosition;
    }

    public void setXPosition(int XPosition) {
        this.XPosition = XPosition;
    }

    public void setYPosition(int YPosition) {
        this.YPosition = YPosition;
    }
    
    
}
