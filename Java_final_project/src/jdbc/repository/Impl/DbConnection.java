package jdbc.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection init(){
        try{
            return  DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/student_management",
                    "postgres",
                    "123456"
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
