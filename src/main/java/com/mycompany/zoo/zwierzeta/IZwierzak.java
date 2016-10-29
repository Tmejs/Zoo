/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoo.zwierzeta;

import com.mycompany.zoo.pracownicy.CzlowiekOdJedzenia;

/**
 *
 * @author mati
 */
public interface IZwierzak {
    
    
    /**
     * Metoda odpowiadajaca za karmienie zwierzaka
     * @param jedzenie - Rodzaj jedzenia jakie dostanie nasz zwierzak
     * @return czy zjadł jedzenie
     */
    public boolean jedz(CzlowiekOdJedzenia.typJedzenia jedzenie);
    
    /**
     * Metoda za uspienie zwierzaka
     * @param czySpi - true zwierzak idzie spac , false zwierzak sie budzi
     */
    public void uspij(Boolean czySpi);
    
}
