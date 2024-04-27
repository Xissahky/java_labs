package com.example.lab3;

public class prostokat extends figura{
    private double a;
    private double b;

    public prostokat(double a,double b){
        this.a=a;
        this.b=b;

    }
    private String info = "A= "+ GetA()+"sm, B= "+GetB()+"sm";
    private double pole = GetA()*GetB();
    public void SetA(double a){
        this.a=a;
    }

    public void SetB(double b){
        this.b=b;
    }

    public double GetA(){
        return a;
    }

    public double GetB(){
        return b;
    }

}
