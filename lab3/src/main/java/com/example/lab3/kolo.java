package com.example.lab3;

public class kolo extends figura{
    private double radius;

    public kolo(double radius){
        this.radius=radius;

    }
    private String info = "radius kola= "+GetRadius()+"sm";
    private double pole = 3.14*GetRadius()*GetRadius();



    public void SetRadius(double radius){
        this.radius=radius;
    }
    public double GetRadius(){
        return radius;
    }
}
