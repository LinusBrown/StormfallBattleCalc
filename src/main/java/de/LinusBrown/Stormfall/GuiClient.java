/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.LinusBrown.Stormfall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Maik
 */
public class GuiClient extends Application{

    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Pane viewPane = new Pane();
        Scene scene = new Scene(viewPane);
        stage.setScene(scene);
        stage.show();
    }
    
}
