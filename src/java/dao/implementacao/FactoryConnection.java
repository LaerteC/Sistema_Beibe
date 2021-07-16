/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implementacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author laert
 */
public class FactoryConnection {
    
    
   private static final String URL="jdbc:mysql://localhost/sistemaUsuario?userTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USER="root";
    private static final String SENHA="210394";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection(){
        
        try{
            
             Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,SENHA);
            
        }catch(ClassNotFoundException | SQLException ex){
            
            throw new RuntimeException(ex);
            
        }
    }
}