package com.week10.dataManager.sakilaMovies;

import com.week10.dataManager.Product;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SakilaDataManager {
    private DataSource dataSource;

    public SakilaDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<Actor> getActorsByName(String ActorToSearchFor) {
        List<Actor> actors = new ArrayList<>();
        // query
        String query = "SELECT * FROM Actor WHERE first_name LIKE ?";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, "%" + ActorToSearchFor + "%");

            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                // process
                while(resultSet.next()) {
                    int id = resultSet.getInt("actor_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");

                    actors.add(new Actor(id, firstName, lastName));
                }
            }

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return actors;
    }

}
