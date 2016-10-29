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
public abstract class AZwierzak implements IZwierzak{
    
    
    enum typZwierzaka{
        miesozerca(CzlowiekOdJedzenia.typJedzenia.MIESO),
        roslinozerca(CzlowiekOdJedzenia.typJedzenia.TRAWA);
        
        CzlowiekOdJedzenia.typJedzenia typJedzenia;

        public CzlowiekOdJedzenia.typJedzenia getTypJedzenia() {
            return typJedzenia;
        }

        private typZwierzaka(CzlowiekOdJedzenia.typJedzenia typJedzenia) {
            this.typJedzenia = typJedzenia;
        }
        
        
        
    }
    
    private int poziomNajedzenia;
    
}
