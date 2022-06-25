import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataDriver {
    @Test
    public static void getconection() {
        String url = "jdbc:sqlserver://DESKTOP-SASB5U7//SQLEXPRESS";
        String user = "testAutomation";
        String password = "Testautomation123";

        try {
            Connection conection = DriverManager.getConnection(url,user,password);
            System.out.println("Success");
        } catch (SQLException e) {
            System.out.println("Fail");
            e.printStackTrace();
        }


    }

}
