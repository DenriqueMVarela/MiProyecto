/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Usuario-pc
 */
public class BaseDatos {

      Connection cn;
     
     public Connection conexión(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             cn=DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","UAw29hFcWj8PE75X");
             System.out.println("Conexión exitosa");
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
         return cn;
     }
     
     Statement createStatement(){
         throw new UnsupportedOperationException("No soportado");
     }
    
}
