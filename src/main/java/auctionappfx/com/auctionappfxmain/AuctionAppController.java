package auctionappfx.com.auctionappfxmain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AuctionAppController {
    private Stage stage;
    private Scene scene;
    Parent root;

    @FXML
    Button btnEnter, btnRegistration;

    /**
     * Меняем сцены
     */
    public void switchToSceneUserOffice(ActionEvent event) throws IOException {
        FXMLLoader l = new FXMLLoader(getClass().getResource("UserOfice.fxml"));
        Parent root = l.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        UserOficeController uo = l.getController();
        //if (uo.id==UserOficeController new n())
        uo.id = 777;
    }

    public void switchToSceneRegistrationNewUser(ActionEvent event) throws IOException {
        FXMLLoader k = new FXMLLoader(getClass().getResource("RegistrationNewUser.fxml"));
        Parent root = k.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        RegistrationNewUserController rnn = k.getController();
    }
}

//возврат на главный экран входа
        /*public void switchToSceneAuctionApp(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AuctionApp_view.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/


