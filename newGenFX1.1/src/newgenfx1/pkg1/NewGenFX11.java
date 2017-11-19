/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgenfx1.pkg1;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Arod6
 */
public class NewGenFX11 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();
        TextArea ta = new TextArea();
        
        ArrayList<String> al = new ArrayList<>();
        Button[][] btn = new Button[5][5];
        for (int i = 0; i <btn.length; i++) {
            for (int j = 0; j < btn.length; j++) {
                btn[i][j]= new Button();
                btn[i][j].setText(i+" "+j);
                gp.add(btn[i][j], i, j);
                String temp = Integer.toString(j);
                
                btn[i][j].setOnAction(new EventHandler<ActionEvent>() {   
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println(temp);
                        ta.appendText(temp+"\n");
                    }
                });
            }
        }

        
        
        root.setCenter(gp);
        root.setRight(ta);
        root.getChildren();

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("New Gen POS");
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
