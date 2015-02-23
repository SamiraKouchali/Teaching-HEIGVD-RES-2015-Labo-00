/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Samira
 */
public class Flute extends IInstrument{
     String play(){
    return "pouet";
    }
    int getSoundVolume(){
    return Volume;
    }
    String getColor(){
    return color;
    }
    private int Volume = 40;
    private String color = "gris";
}
