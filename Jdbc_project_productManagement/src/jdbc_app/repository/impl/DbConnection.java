package jdbc_app.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection init(){
        try{
            return  DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc_project_productManagement",
                    "postgres",
                    "123456"
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
