/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoo.pracownicy;

import com.mycompany.zoo.zwierzeta.AZwierzak;

/**
 *
 * @author mati
 */
public class Klatka {

    //Zwierze które znajduje się w klatce
    private AZwierzak zwierzeWKlatce;

    public boolean dodajZwierzeDoKlatki(AZwierzak zwierzak) {
        //Sprawdzmay czy w klatce jest juz jakies zwierze
        if (czyKlatkaJestPusta()) {
            //Poprawnie dodany zwierzak
            this.zwierzeWKlatce = zwierzak;
            return true;
        } else {
            //tutaj juz jest jakies zwierze
            return false;
        }
    }

    /**
     * Pobranie zwierzaka z klatki
     * @return Zwierze w klatce
     */
    public AZwierzak getZwierzeWKlatce() {
        return zwierzeWKlatce;
    }
    
    /**
     * Sprawdzenie czy w danej klatce znajduje sie zwierze
     * @return 
     */
    public boolean czyKlatkaJestPusta(){
        if(zwierzeWKlatce==null){
            return true;
        }else
            return false;
    }
    

}
