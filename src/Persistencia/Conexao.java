/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairjunior
 */
public class Conexao {
     String url = "jdbc:postgresql://localhost:5432/master";
            String usuario = "postgres";
            String senha = "postgres";
            Connection con = null;
            Statement stmt = null;
           ResultSet res =null;
    
    public Conexao(){
        
        try {

           
            Class.forName("org.postgresql.Driver");



            this.con = DriverManager.getConnection(url, usuario, senha);
            this.stmt = this.con.createStatement();
           
            

            System.out.println("Conexão realizada com sucessogfdgfdg.");

        } catch (Exception e) {
            System.out.println("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \n Recompile e execute novamente.");

        }

    
        }
        /**
     *
     * @param query
     * @return
     */
    public ResultSet exeq(String query){
         try {
             this.res=this.stmt.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return this.res;
    }
            
        

}
