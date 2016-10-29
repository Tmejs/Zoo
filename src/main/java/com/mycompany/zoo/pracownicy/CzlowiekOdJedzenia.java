/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoo.pracownicy;

/**
 *
 * @author mati
 */
public class CzlowiekOdJedzenia {

    void karmWszystkieZwierzeta() {
        //TODO: pobranie wszystkoch zwierzat
        //Nakarmienie odpowiednim jedzeniem - dodac enum jakie jedzenie on je
        
       new Thread(new Runnable() {
            @Override
            public void run() {
             //Nakarm zwierze
            }
        }).start();
        
    }
 
    
    public enum typJedzenia{
        MIESO,
        TRAWA
    }
    
    
    
    public boolean nakarmZwierze(typJedzenia typJedzenia){
        
        return true;
        
    }
}

