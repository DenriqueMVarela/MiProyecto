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

        Connection cn;
      private  String Driver="com.mysql.jdbc.Driver";
      private  String url="jdbc:mysql://localhost/sistema";
      private  String Myuser="root";
      private  String MyPassword="AAAAAAqqqqqq123456";
 
     public Connection conexión(){
         try{
             Class.forName(Driver);
             cn=DriverManager.getConnection(url,Myuser,MyPassword);
             System.out.println("Conexión exitosa");
             
         }catch(ClassNotFoundException | SQLException e){
             System.out.println(e.getMessage());
         }
         return cn;
     }
     
     Statement createStatement(){
         throw new UnsupportedOperationException("No soportado");
     }
    
}
