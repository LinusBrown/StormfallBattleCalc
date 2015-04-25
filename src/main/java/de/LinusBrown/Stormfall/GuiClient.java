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
    public static final String appTitle = "Stormfall Helper";
    public static final String appVersion = "0.0.1";
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        GuiObject gui = new GuiObject();
        gui.getScene();
        
        stage.setTitle(String.format("%s - v%s", appTitle, appVersion));
        stage.setScene(gui.getScene());
        stage.setResizable(false);
        stage.show();
    }
        
}
