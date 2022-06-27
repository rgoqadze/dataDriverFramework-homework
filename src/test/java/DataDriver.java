import org.testng.annotations.Test;

import java.sql.*;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.netty.handler.codec.rtsp.RtspHeaders.Values.URL;

public class DataDriver {

    @Test
    public static void getconection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://DESKTOP-SASB5U7\\SQLEXPRESS;encrypt=true;trustServerCertificate=true";

        String user = "testAutomation";
        String password = "Testautomation123";

        Connection conection = null;
        try {
            conection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL,user,password);
        Statement st = con.createStatement();
        String query = "SELECT * FROM students";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String firsstName = rs.getString("firsstName");
            String lastName = rs.getString("lastName");
            String phonenumber = rs.getString("phone");
            open("https://demoqa.com/automation-practice-form");
            $(byId("firstName")).setValue(firsstName);
            $(byId("lastName")).setValue(lastName);
            $(byId("userNumber")).setValue(phonenumber);
        }


    }

}
