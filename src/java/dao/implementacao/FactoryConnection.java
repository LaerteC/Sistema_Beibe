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
    
    private static final String URL="jdbc:mysql://localhost/beibe?userTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USER="root";
    private static final String SENHA="210394";
    
    public static Connection getConnection(){
        
        try{
            
            return DriverManager.getConnection(URL,USER,SENHA);
            
        }catch(SQLException ex){
            
            throw new RuntimeException(ex);
            
        }
    }
    
}
