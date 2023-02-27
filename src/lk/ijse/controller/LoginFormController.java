package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public JFXButton btnLogin;
    public JFXPasswordField txtPassword;
    public JFXTextField txtUserName;
    public Label txtAlertPassword;
    public Label txtAlertUsername;

    public void btnLoginClickOnAction(ActionEvent actionEvent) throws IOException {
        String password = txtPassword.getText();
        String userName = txtUserName.getText();

        if(password.equals("1234") && userName.equals("admin")){
            Parent root = FXMLLoader.load(getClass().getResource("../view/AdminDashboard.fxml"));
            Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        }else if(password.equals("1234") && userName.equals("rep")){
            Parent root = FXMLLoader.load(getClass().getResource("../view/ReciptionistDashboard.fxml"));
            Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }

        if(!userName.equals("rep")||!userName.equals("admin")){
            txtAlertUsername.setText("Wrong username !");
        }

        if(userName.equals("rep")||userName.equals("admin")){
            txtAlertUsername.setText(null);
        }

        if(!password.equals("1234")){
            txtAlertPassword.setText("Wrong password !");
        }

        if(password.equals("1234")){
            txtAlertPassword.setText(null);
        }
    }

}
