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
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;

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

    /**
     * ajoute un trou noir en passant sa valeur à vrai
     */
    public void placerTrouNoir(){
        avoirTrouNoir = true;
    }
    
    /**
     *supprime un trou noir en passant sa valeur à faux
     */
    public void supprimerTrouNoir(){
        avoirTrouNoir = false;
    }

    /**
     *
     * @return la valeur du trou noir pour savoir s'il est presnt ou pas sur la case
     */
    public boolean presenceTrouNoir() {
        return avoirTrouNoir;
    }
    
    /**
     *supprime le jeton qui ce trouve sur la case du trou noir ou par désintégration
     */
    public void supprimerJeton(){
        jetonCourant=null;
    }
    
    /**
     *
     * @return la valeur(V/F) du désintegrateur pour savoir ci celui-ci est present
     */
    public boolean presenceDesintegrateur(){
        return avoirDesintegrateur == true;
    }
    
    /**
     *ajoute un désintegrateur sur la cellule en mettant se valeur à vrai
     */
    public void placerDesintegrateur(){
        avoirDesintegrateur = true;
    }
    
    /**
     * premet de supprimer le desintegrateur en passant sa valeur à faux
     */
    public void supprimerDesintegrateur(){
        avoirDesintegrateur = false;
    }
    
    /**
     *supprime le trou noir et le jeton qui se trouve sur la case du trou noir
     */
    public void activerTrouNoir(){
        supprimerJeton();
        supprimerTrouNoir();
    }
            
   
  
}
