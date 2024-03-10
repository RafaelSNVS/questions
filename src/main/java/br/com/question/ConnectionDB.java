package br.com.question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static void main(String... x){
        try{
            Connection connection= DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/questions_bank?user=root&password=svrConnect209");
                System.out.println("Conectado");
                connection.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
