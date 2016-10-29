/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zoo.pracownicy;

import com.mycompany.zoo.zwierzeta.AZwierzak;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mati
 */
public class Zoo {

    private List<AZwierzak> listaZwierzakow = new ArrayList<AZwierzak>();

    private CzlowiekOdJedzenia czlowiekOdJedzenia;
    private CzlowiekOdKlatek czlowiekOdKlatek;
    
    public void start(){
        
        //co 3 sek
        czlowiekOdJedzenia.karmWszystkieZwierzeta();
        
    }
    
}
