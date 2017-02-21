/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Daniel
 */
public class Flute implements IInstrument {
   String sound;
   int fluteVolume;
   String color;
   
   public Flute(){
      fluteVolume = 3;
   }
   
   public String play(){
      return sound;
   }
   
   public int getSoundVolume(){
      return fluteVolume;
   }
   
   public String getColor(){
      return color;
   }
}
