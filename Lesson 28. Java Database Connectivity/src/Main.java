import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DataBaseConnect.statement("jdbc:postgresql://localhost:5432/div_academy3",
                "postgres","h.elcin78","select * from student");

//        DataBaseConnect.preparedStatement("jdbc:postgresql://localhost:5432/div_academy3",
//                "postgres","h.elcin78","select * from student");
    }
}