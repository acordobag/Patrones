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
    
    private int id;
    private String username;
    private String  mail;
    private String password;

    public Player(String pusername, String pmail, String ppassword) {
        setId();
        setUsername(pusername);
        setMail(pmail);
        setPassword(ppassword);
    }
    
    public int getId() {
        return id;
    }

    public void setId() {
        
        this.id++;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String pusername) {
        this.username = pusername;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String pmail) {
        this.mail = pmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String ppassword) {
        this.password = ppassword;
    }

    @Override
    public String toString() {
        return "Player{" + "username=" + username + ", mail=" + mail + ", password=" + password + '}';
    }
    
    
    
}
