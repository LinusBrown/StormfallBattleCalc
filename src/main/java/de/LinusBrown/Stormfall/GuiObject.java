/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.LinusBrown.Stormfall;

import de.LinusBrown.Stormfall.Client.Views.BattlegroudCalculationView;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Maik
 */
public class GuiObject {
    private Scene scene;
    private Pane pane;
    
    private Button btnSelectDefensive;
    private Button btnSelectOffensive;
    private Button btnSelectHelp;
    
    
    public GuiObject(){
        initPane();
        initScene();
    }

    private void initScene(){
        scene = new Scene(pane);
    }
    
    private void initPane(){
        pane = new BattlegroudCalculationView();
    }

    public Scene getScene() {
        return scene;
    }
    
}
