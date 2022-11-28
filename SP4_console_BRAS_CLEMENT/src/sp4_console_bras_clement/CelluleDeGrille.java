package sp4_console_bras_clement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elodie
 */
public class CelluleDeGrille {
  
    private Jeton jetonCourant;

    public CelluleDeGrille() {
        jetonCourant=null;
    }

     
    public boolean presenceJeton(){
        if(jetonCourant==null){
            return false;
            }
        else{
            return true;
        }
    }

    public void AffecterJeton(Jeton jetonCourant) {
        this.jetonCourant = jetonCourant;
    }
    
   public String lireCouleurDuJeton(){
       if(jetonCourant != null){
           return jetonCourant.lireCouleur();
       }else{
           return "vide";
       }
   }
   
  public Jeton recupererJeton(){
      Jeton tmp = jetonCourant;
      jetonCourant=null;
      return tmp;
  } 

    @Override
    public String toString() {
        if(presenceJeton()==true){
            return jetonCourant.toString();
        }
        else{
            return ".";
        }
    }

    
    
   
  
}
