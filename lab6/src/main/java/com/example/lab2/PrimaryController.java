package com.example.lab2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

public class PrimaryController {
    @FXML
    private Label label;

    @FXML
    private void nieb() {
        label.setTextFill(Color.BLUE);
    }
    @FXML
    private void ziel() {
        label.setTextFill(Color.GREEN);
    }
    @FXML
    private void czer() {
        label.setTextFill(Color.RED);
    }

    @FXML
    private void but1() {
        label.setText("Laboratorium 1");
    }
    @FXML
    private void but2() {
        label.setText("Laboratorium 2");
    }
    @FXML
    private void but3() {
        label.setText("Laboratorium 3");
    }

    @FXML
    private ImageView img;

    @FXML
    private void img1(){
        Image image = new Image(getClass().getResourceAsStream("Calendar.jpg"));
        img.setImage(image);
    }

    @FXML
    private void img2(){
        Image image = new Image(getClass().getResourceAsStream("Contacts.jpg"));
        img.setImage(image);}

    @FXML
    private void img3(){
        Image image = new Image(getClass().getResourceAsStream("Home.jpg"));
        img.setImage(image);
    }
    @FXML
    private ComboBox<String> exit;

    @FXML
    private void initialize() {
        exit.setOnAction(event -> {
            String selectedOption = exit.getSelectionModel().getSelectedItem();
            if (selectedOption != null && selectedOption.equals("Close Application")) {
                Platform.exit();
            }
        });
    }

}