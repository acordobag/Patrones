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
public class Player {
    
    private String username;
    private String  mail;
    private String password;

    public Player(String username, String mail, String password) {
        this.username = username;
        this.mail = mail;
        this.password = password;
    }

    public Player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Player{" + "username=" + username + ", mail=" + mail + ", password=" + password + '}';
    }
    
    
    
}
