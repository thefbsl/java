package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        String jdbcURL = "jdbc:postgresql://localhost:5432/kbasuke";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        String username = "postgres";
        String password = "euphoria1";

        try{
            //Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "SELECT id, name, skill, number FROM atheletes WHERE id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, x);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id") + " name:" + resultSet.getString("name") +
                        " skill:" + resultSet.getString("skill") + " number:" + resultSet.getString("number"));
            }


        }catch (SQLException e){
            System.out.println("Error in connection");
            e.printStackTrace();
        }finally {
            try{
                resultSet.close();
                connection.close();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }
}
