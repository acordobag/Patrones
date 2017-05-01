/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities.Util.Base;

import Entities.GameBoard;
import Entities.Player;
import java.util.ArrayList;

/**
 * 
 * @author Adrian Cordoba
 */
public class TableGame {
    private String GameName;
    private GameBoard board;
    private Player playerOne;
    private Player playerTwo;
    private ArrayList<GamePiece>[] gamesPieces;

    public TableGame(String gameName, int columns, int rows){
        this.GameName = gameName;
        this.board = new GameBoard(columns, rows);
    }
    
    public String getGameName() {
        return GameName;
    }

    public GameBoard getBoard() {
        return board;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public ArrayList<GamePiece>[] getGamesPieces() {
        return gamesPieces;
    }

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void setGamesPieces(ArrayList<GamePiece>[] gamesPieces) {
        this.gamesPieces = gamesPieces;
    }
    
    
}
