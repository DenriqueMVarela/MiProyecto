/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario-pc
 */
public class BaseDatos {

      private static Connection cn;
      private static final String Driver="com.mysql.jdbc.Driver";
      private static final String url="jdbc:mysql://localhost/sistema";
      private static final String Myuser="root";
      private static final String MyPassword="UAw29hFcWj8PE75X";
 
     public Connection conexión(){
         try{
             Class.forName(Driver);
             cn=DriverManager.getConnection(url,Myuser,MyPassword);
             if(cn!=null){
             System.out.println("Conexión exitosa");
             }
         }catch(ClassNotFoundException | SQLException e){
             System.out.println(e.getMessage());
         }
         return cn;
     }
     
     Statement createStatement(){
         throw new UnsupportedOperationException("No soportado");
     }
    
}
