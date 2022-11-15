/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Elodie
 */
public class Baton extends Arme {
     
    private int age;
    public Baton (String Nom , int nb , int Age){
       super(Nom , nb);
       if (Age>0){
           age = Age;
       }else{
           age = 0;
       }if (Age>100){
           Age=100;
       }
       this.age = Age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
        this.age = age;
    }}

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
    
}
