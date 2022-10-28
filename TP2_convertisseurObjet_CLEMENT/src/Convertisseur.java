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
nbConversions += 1;
}
    public void CelciusVersKelvin(double CVK){
        CVK = CVK + 273.15;    
    }
    
    public void KelvinVersClescius (double KVC){
        KVC = KVC - 273.15;    
    }
    
    public void FarenheitVersCelcius (double FVC){
        FVC = (FVC - 32)*(5/9);    
    }
    
    public void CelciusVersFarenheit (double CVF){
        CVF = (CVF*(9/5))+32;    
    }
    
        public void FarenheitVersKelvin (double FVK){
        FVK = (FVK-32)*(5/9)+273.15 ;    
    }
        
    public void KelvinVersFarenheit (double KVF){
        KVF = (KVF -273.15)*(9/5)+32;    
    }   
     
    @Override
public String toString () {
return "nb de conversions"+ nbConversions;
}
}
