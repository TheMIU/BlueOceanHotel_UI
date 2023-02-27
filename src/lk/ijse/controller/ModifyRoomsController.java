package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ModifyRoomsController implements Initializable {
    public JFXComboBox cmbRoomType;
    public JFXComboBox cmbFilterRooms;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cmbRoomType.getItems().addAll("All Rooms","2 Beds", "1 Bed");
        cmbFilterRooms.getItems().addAll("None","Available","Reserved","Maintenance","Cleaning");
    }

    public void btnBackClickOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/AdminDashboard.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
