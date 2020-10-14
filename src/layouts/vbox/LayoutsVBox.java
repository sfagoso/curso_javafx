/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts.vbox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author saul
 */
public class LayoutsVBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label labelTitle = new Label("Login");
        labelTitle.setFont(new Font(45));
        labelTitle.alignmentProperty();
        
        Label labelUser = new Label("Usuario");
        labelUser.setFont(new Font(15));
        labelUser.alignmentProperty();
        
        Label labelPassword = new Label("Contraseña");
        labelPassword.setFont(new Font(15));
        
        TextField textUser = new TextField();
        textUser.setMaxWidth(150);
        
        PasswordField textPass = new PasswordField();
        textPass.setMaxWidth(150);
        
        Button btnLogin = new Button("Entrar");
        btnLogin.setMaxWidth(150);
        btnLogin.setCursor(Cursor.HAND);
        
        VBox root = new VBox();
        
        root.getChildren().addAll(labelTitle, labelUser, textUser, labelPassword, textPass, btnLogin);
        // Para posicionar los elementos del Layout en el centro
        root.setAlignment(Pos.CENTER);
        
        VBox.setMargin(labelUser, new Insets(10, 0, 0, 0));
        VBox.setMargin(labelPassword, new Insets(10, 0, 0, 0));
        VBox.setMargin(btnLogin, new Insets(10, 0, 0, 0));
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("VBox Layout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
