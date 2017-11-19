/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgenfx;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sun.plugin.javascript.navig.Anchor;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *
 * @author Arod6
 */
public class NewGenFX extends Application {

    private int numClicks = 0;
    Label lbl = new Label();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("NewGen");
        BorderPane root = new BorderPane();
        TextArea tb = new TextArea();
        double sum = 0;
        double adding = 0;
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(5));
        gp.setHgap(5);
        gp.setVgap(5);
        Button total = new Button("Total");
        Button checkOut = new Button("Check Out");

        GridPane rightGP = new GridPane();
        rightGP.addColumn(0, tb, checkOut, total);
        tb.setPrefRowCount(40);

        //GridPane bottomGP= new GridPane();
        Button[][] grid = new Button[5][5];
        Button[][] btn = new Button[5][5];

        ArrayList<String> al = new ArrayList<>();

        String brands[] = {"A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E",
            "A", "B", "C", "D", "E"};
        String prices[] = {"5.25", "2.25", "3.45", "1.45", "2.23",
            "4.02", "5.25", "1.25", ".075", "5.25",
            "3.02", "5.25", "2.25", "1.78", "5.25",
            "2.02", "1.65", "5.25", "4.65", "5.25",
            "3.68", "1.75", "3.32", "5.25", "4.42",
            "4.02", "5.25", "1.25", ".075", "5.25",
            "3.02", "5.25", "2.25", "1.76", "5.25",
            "2.02", "1.65", "5.25", "4.65", "5.25",
            "3.68", "1.75", "3.32", "5.25", "4.42",
            "2.43", "2.22", "1.25", "5.25", "5.25"};

        int numItem = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                btn[i][j] = new Button(numItem + " " + brands[numItem] + " \n" + prices[numItem]);
                btn[i][j].setPrefSize(100, 100);
                gp.add(btn[i][j], i, j);
                String hola = numItem + " " + brands[numItem] + " " + prices[numItem];
                String arrValue = prices[numItem];
                btn[i][j].setOnAction((ActionEvent event) -> {
                    System.out.println(hola);
                    tb.appendText(numClicks + " " + hola + "\n");
                    al.add(numClicks, arrValue);
                    System.out.println("arrValue" + numClicks + " " + arrValue);
                    numClicks++;
                });
                numItem++;
                al.forEach((String price) -> {
                    System.out.println(price);
                });
                System.out.println("Start For loop:");
                for (String al1 : al) {
                    adding = Double.parseDouble((String) al.get(j));
                    System.out.println("al " + al.get(j));
                    System.out.println("adding " + adding);
                    sum += adding;
                    System.out.println("For loop "+sum);
                }
            }
        }

        System.out.println("Sum:" + sum);
        String displayTotal = Double.toString(sum);

        total.setOnAction((ActionEvent event) -> {
            tb.setText("Total is: $" + displayTotal);
            System.out.println("Diplay Total $" + displayTotal);
        });

        System.out.println("Sum" + sum);
        root.setCenter(gp);
        root.setRight(rightGP);
        Scene scene = new Scene(root);
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
