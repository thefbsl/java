package com.company;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/kbasuke";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        String username = "postgres";
        String password = "euphoria1";

        try{
            //Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
//            String sql = "INSERT INTO atheletes (id, name, skill, number)" + "VALUES('5','Takao', 'hawk_eye', '10')," +
//                    " ('6','Kuroko', 'phantom', '11'), ('7','Haizaki', 'steal', '6')";

            String sql = "SELECT id, name, skill, number FROM atheletes";


            statement = connection.createStatement();
            
//            int rows = statement.executeUpdate(sql);
//            if (rows > 0){
//                System.out.println("new player was added");
//            }
//            System.out.println("Succesfully connected");

            resultSet = statement.executeQuery(sql);

//            while(resultSet.next()){
//                int id = resultSet.getInt("id"); // column_name
//                String name = resultSet.getString("name"); // column_name
//                String skill = resultSet.getString("skill"); // column_name
//                String number = resultSet.getString("number"); // column_name
//                System.out.println(id + " " + name + " " + skill + " " + number);
//            }

//            while(resultSet.next()){
//                int id = resultSet.getInt(1); //column_index
//                String name = resultSet.getString(2); //column_index
//                String skill = resultSet.getString(3); //column_index
//                String number = resultSet.getString(4); //column_index
//                System.out.println(id + " " + name + " " + skill + " " + number);
//            }

//            while(resultSet.next()){
//                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("skill") + " "
//                        + resultSet.getString("skill") + " " + resultSet.getString("number"));
//            }

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                        + resultSet.getString(3) + " " + resultSet.getString(4));
            }

        }catch (SQLException e){
            System.out.println("Error in connection");
            e.printStackTrace();
        }finally {
            try{
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }

        }

    }
}
