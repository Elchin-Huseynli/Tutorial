import java.sql.*;
import java.time.LocalDate;

public class DataBaseConnect {
    public static void statement (String url, String user, String password, String request) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url1 = url;
        String user1 = user;
        String password1 = password;
        Connection connection = DriverManager.getConnection(url, user, password);

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(request);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String major = resultSet.getString("major");
                int fee = resultSet.getInt("fee");
                LocalDate startDate = resultSet.getDate("start_date").toLocalDate();

                Student student = new Student(id, name, surname, major, fee, startDate);
                System.out.println(student);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void preparedStatement (String url, String user, String password, String request) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url1 = url;
        String user1 = user;
        String password1 = password;
        Connection connection = DriverManager.getConnection(url, user, password);

        try (PreparedStatement preparedStatement = connection.prepareStatement(request)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String major = resultSet.getString("major");
                int fee = resultSet.getInt("fee");
                LocalDate startDate = resultSet.getDate("start_date").toLocalDate();

                Student student = new Student(id, name, surname, major, fee, startDate);
                System.out.println(student);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
