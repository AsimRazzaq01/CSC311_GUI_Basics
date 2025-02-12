package org.example.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.RotateEvent;
import javafx.scene.shape.Arc;

public class GUIController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label MyName;
    @FXML
    private Button button_to_make_rotation;
    @FXML
    private Arc my_arc;
    @FXML
    private ImageView pacman;

    int x = 180;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Hello There !");
    }


    public void rotate_label(ActionEvent actionEvent) {
        my_arc.setRotate(x++);
        MyName.setRotate(x);
        pacman.setRotate(x++);
    }







}