/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_clement;

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
        
    }
    
    
}
