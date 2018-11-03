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
    ArrayList<Peliculas> peli;
    int Sala;
      
    public Salas(ArrayList<Peliculas> peli,int Sala) {
        this.peli = peli;
        this.Sala = Sala;
    }


    public ArrayList<Peliculas> getPeli() {
        return peli;
    }

    public void setPeli(ArrayList<Peliculas> peli) {
        this.peli = peli;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }


   
}
