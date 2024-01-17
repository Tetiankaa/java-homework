package homework4.mysql_connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb","username","password");

        PreparedStatement preparedStatement = connection.prepareStatement("select * from cities");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<City> cities = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);

            cities.add(new City(id,name));
        }

        cities.forEach(System.out::println);

        connection.close();
    }
}
