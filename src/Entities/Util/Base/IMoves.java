/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Util.Base;

import Entities.Move;

/**
 *
 * @author Adrian Cordoba
 */
public interface IMoves {
    public abstract void movePosition();
    
    public abstract boolean isMoveValid(Move destinationMove);
}
