/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.util.ArrayList;

/**
 *
 * @author Usuario-pc
 */
public class Salas {
    
    int Sala;
      
    public Salas(ArrayList<Peliculas> peli,int Sala) {
       
        this.Sala = Sala;
    }

    Salas() {
        
    }
    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }


   
}
