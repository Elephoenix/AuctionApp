package auctionappfx.com.auctionappfxmain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.DriverManager;
import java.sql.Connection;

import java.io.IOException;
import java.sql.SQLException;

public class AuctionAppApplication extends Application {
    @Override
    public void start(Stage stage)   {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AuctionApp_view.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("АукционApp");
            stage.setScene(scene);
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
       try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AuctionApp", "postgres", "123")) {

            if (conn != null) {
                System.out.println("Соединение с базой УДАЧНО!");

            } else {
                System.out.println("Что то не так с коннетом!");
            }


        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
        }
        launch();


    }
}