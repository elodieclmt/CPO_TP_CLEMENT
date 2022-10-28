/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_clement;

import java.util.Scanner;

/**
 *
 * @author Elodie
 */
public class TP2_convertisseurObjet_CLEMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Convertisseur premiernb = new Convertisseur();
        
        double result1 = premiernb.CelciusVersFarenheit(4);
        System.out.println(result1);
        double result2 = premiernb.CelciusVersKelvin(100);
        System.out.println(result2);
        double result3 = premiernb.KelvinVersClescius(5);
        System.out.println(result3);
        System.out.println(premiernb);
       
        Convertisseur deuxiemenb = new Convertisseur();
        
        double result4 = deuxiemenb.FarenheitVersKelvin(9);
        System.out.println(result4);
        double result5 = deuxiemenb.FarenheitVersCelcius(80);
        System.out.println(result5);
        System.out.println(deuxiemenb);
        
        Convertisseur ConverChoisit = new Convertisseur();
        
      Scanner sc = new Scanner(System.in);
      double nombre = sc.nextDouble();
      int Choix = ConverChoisit.Choisir();
      if(Choix==1){
          double nbfinal=ConverChoisit.CelciusVersKelvin(nombre);
          System.out.println(nbfinal);
      }
      else if(Choix==2){
          double nbfinal=ConverChoisit.KelvinVersClescius(nombre);
          System.out.println(nbfinal);
      }
      else if(Choix==3){
          double nbfinal=ConverChoisit.FarenheitVersCelcius(nombre);
          System.out.println(nbfinal);
      }
      else if(Choix==4){
          double nbfinal=ConverChoisit.CelciusVersFarenheit(nombre);
          System.out.println(nbfinal);    
        }
      else if(Choix==5){
          double nbfinal=ConverChoisit.FarenheitVersKelvin(nombre);
          System.out.println(nbfinal);   
      }
      else if(Choix==6){
          double nbfinal=ConverChoisit.KelvinVersFarenheit(nombre);
          System.out.println(nbfinal);}
        
    }
    
    
}
