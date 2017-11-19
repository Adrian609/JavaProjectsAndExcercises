/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formvalidation;

import javafx.scene.shape.*;
import javafx.application.Application;
import javafx.beans.property.*;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Arod6
 */
public class FormValidation extends Application {
    private final static String MY_PASS = "password1";
    private final static BooleanProperty GRANTED_ACCESS = new SimpleBooleanProperty(false);
    private final static int MAX_ATTEMTS =3;
    private final IntegerProperty ATTEMPTS = new SimpleIntegerProperty(0);
    
    
    
    @Override
    public void start(Stage primaryStage) {
        User user = new User();
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        
        Group root = new Group();
        Scene scene = new Scene(root, 320, 112, Color.rgb(0,0,0,0));

        primaryStage.setScene(scene);
        
        Color foregroundColor = Color.rgb(255, 255, 255,.9);
        
        Rectangle background = new Rectangle(320, 112);
        background.setX(0);
        background.setY(0);
        background.setArcHeight(15);
        background.setArcWidth(15);
        background.setFill(Color.rgb(0, 0, 0,.55));
        background.setStrokeWidth(1.5);
        background.setFill(foregroundColor);
        
        Text userName = new Text();
        
        userName.setFont(Font.font("SanSerif", FontWeight.BOLD, 30));
        userName.setFill(foregroundColor);
        userName.setSmooth(true);
        userName.textProperty().bind(user.userNameProperty());
        
        HBox userNameCell = new HBox();
        userNameCell.prefWidthProperty().bind(primaryStage.widthProperty().subtract(45));
        userNameCell.getChildren().add(userName);
        
        SVGPath padLock = new SVGPath();
        padLock.setFill(foregroundColor);
        padLock.setContent("M24.875,15.334v-4");
        
        HBox row1= new HBox();
        row1.getChildren().addAll(userNameCell, padLock);
        
        PasswordField passwordField = new PasswordField();
        passwordField.setFont(Font.font("SanSerif", 20));
        passwordField.setPromptText("Enter Password");
        passwordField.setStyle("-fxtext-fill:black;"+ "-fx-prompt-text-fill:grey");
        
        passwordField.prefWidthProperty().bind(primaryStage.widthProperty().subtract(55));
        
        user.passwordProperty().bind(passwordField.textProperty());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
