package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try{
            String url = "jdbc:mysql://localhost:3306/eemployeemangement";
            String username = "root";
            String password = "1234";

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
