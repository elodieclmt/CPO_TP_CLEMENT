package tp2_convertisseurobjet_clement;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class Convertisseur {
 
    int nbConversions;
    
    
    public Convertisseur () {
nbConversions = 0 ;

}
    public double CelciusVersKelvin(double CVK){
        CVK = CVK + 273.15; 
        nbConversions += 1;
        return CVK;
    }
    
    public double KelvinVersClescius (double KVC){
        KVC = KVC - 273.15; 
        nbConversions += 1;
        return KVC;
    }
    
    public double FarenheitVersCelcius (double FVC){
        FVC = (FVC - 32)*(5/9); 
        nbConversions += 1;
        return FVC;
    }
    
    public double CelciusVersFarenheit (double CVF){
        CVF = (CVF*(9/5))+32; 
        nbConversions += 1;
        return CVF;
    }
    
        public double FarenheitVersKelvin (double FVK){
        FVK = (FVK-32)*(5/9)+273.15 ;   
        nbConversions += 1;
        return FVK;
    }
        
    public double KelvinVersFarenheit (double KVF){
        KVF = (KVF -273.15)*(9/5)+32;   
        nbConversions += 1;
        return KVF;
    }   
     
    @Override
public String toString () {
return "nb de conversions "+ nbConversions;
}
public int Choisir(){ 
System.out.println("1: Celcius Vers Kelvin \n"+ "2: Kelvin Vers Clescius \n"
              + "3: Farenheit Vers Celcius \n"+ "4: Celcius Vers Farenheit \n"
              + "5: Farenheit Vers Kelvin \n"+ "6: Kelvin Vers Farenheit" );  
      
      Scanner sc = new Scanner (System.in);
      int Choix = sc.nextInt();
return Choix;
}
}
