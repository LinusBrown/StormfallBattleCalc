/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.LinusBrown.Stormfall.Client.Views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Maik
 */
public class BattlegroudCalculationView extends GridPane{
    Label lblTop = new Label("Bitte füllen Sie den Spionagebericht aus:");
    
    ImageView imgMarennenon = new ImageView();
    Label lblMarennon = new Label("Marennon");
    TextField txtMarennon = new TextField();
    
    ImageView imgOrk = new ImageView();
    Label lblOrk = new Label("Orks");
    TextField txtOrk = new TextField();
    
    ImageView imgOrk2 = new ImageView();
    Label lblOrk2 = new Label("Ork Plünderer");
    TextField txtOrk2 = new TextField();
    
    ImageView imgOger = new ImageView();
    Label lblOger = new Label("Oger");
    TextField txtOger = new TextField();
    
    javafx.scene.control.Button btnCalculate = new Button("Berechnung starten");
    
    public BattlegroudCalculationView(){
        super();

        stylePane();
        
        styleButtons();
        
        addComponents();
    }
    
    private void stylePane(){
        setGridLinesVisible(true);
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10,20,10,20));
    }
    
    private void styleButtons(){
        btnCalculate.setMaxWidth(Double.MAX_VALUE);
    }
    
    
    
    
    private void addComponents(){
        add(lblTop, 0, 0, 2,2);
        
        add(imgMarennenon, 0,2);
        add(lblMarennon, 1, 2);
        add(txtMarennon, 2, 2);
        
        add(imgOrk, 0, 3);
        add(lblOrk, 1, 3);
        add(txtOrk, 2, 3);
        
        add(imgOrk2, 0, 4);
        add(lblOrk2, 1, 4);
        add(txtOrk2, 2, 4);
        
        
        add(imgOger, 0, 5);
        add(lblOger, 1, 5);
        add(txtOger, 2, 5);
        
        add(btnCalculate, 0, 7, 4, 1);
        
    }
}
