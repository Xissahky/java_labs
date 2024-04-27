package com.example.lab3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {

        prostokat vasia=new prostokat(4.0,5.0);
        vasia.info();
        //System.out.println(vasia.pole());
        vasia.SetA(5.0);
        //System.out.println(vasia.GetA());
        //vasia.info();
        //System.out.println(vasia.pole());
        vasia.SetB(10.0);
        //System.out.println(vasia.GetB());
       // vasia.info();
        //System.out.println(vasia.pole());
        kolo swieta = new kolo(3.0);
        //System.out.println(swieta.GetRadius());
        kolo liena = new kolo(5.0);
        kolo vika = new kolo(4.0);
        kolo veronika = new kolo(1.0);
        var lista = new ArrayList<figura>();
        lista.add(vasia);
        lista.add(swieta);
        lista.add(liena);
        lista.add(vika);
        lista.add(veronika);

        for (figura el:lista){
            if(el.pole()<5){
                el.info();
            }
        }
    }
}