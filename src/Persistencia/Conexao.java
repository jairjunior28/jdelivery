/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jairjunior
 */
public class Conexao {
    
    public Conexao(){
        
        try {

            String url = "jdbc:postgresql://localhost:5432/master";
            String usuario = "postgres";
            String senha = "postgres";

            Class.forName("org.postgresql.Driver");

            Connection con = null;

            con = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão realizada com sucessogfdgfdg.");

        } catch (Exception e) {
            System.out.println("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \n Recompile e execute novamente.");

        }
    }

}
