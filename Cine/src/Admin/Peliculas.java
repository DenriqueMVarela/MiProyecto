/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario-pc
 */
public class Peliculas {
    String Nombre;
    Icon imagen;
    LocalDateTime ldt;
    LocalDateTime in;
    LocalDateTime fin;
    int Duración;
    Vector v=new Vector();
    
    public Peliculas(String Nombre, Icon imagen, LocalDateTime ldt, LocalDateTime in, LocalDateTime fin, int Duración) {
        this.Nombre = Nombre;
        this.imagen = imagen;
        this.ldt = ldt;
        this.in = in;
        this.Duración = Duración;
        this.fin = ldt.minusMinutes(Duración);
       
    }

    Peliculas() {
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public LocalDateTime getIn() {
        return in;
    }

    public void setIn(LocalDateTime in) {
        this.in = in;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public int getDuración() {
        return Duración;
    }

    public void setDuración(int Duración) {
        this.Duración = Duración;
    }
      
     public void guardar(Peliculas p){
        v.addElement(p);
    }
            
}
