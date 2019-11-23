package jdbcStarter;

import java.sql.*;

public class MainApp {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3308/warehouse?serverTimezone=UTC";
        String userName="root";
        String password="tutoderien";

        try {
            Connection con = DriverManager.getConnection(url,userName,password);
            Statement statement = con.createStatement();

            statement.execute("insert into products(name) values ('printer HP'),('Scanner assus')");

            ResultSet resultSet = statement.executeQuery("select * from products");

            while (resultSet.next()){
                System.out.println("id: "+resultSet.getInt("id"));
                System.out.println("nom: "+resultSet.getString("name"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
