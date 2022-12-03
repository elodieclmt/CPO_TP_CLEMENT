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
  
    Jeton jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;

    /**
     *constructeur qui initialise par défaux les valeur des attributs à nulle ou faux 
     */
    public CelluleDeGrille() {
        jetonCourant=null;
        avoirTrouNoir=false;
        avoirDesintegrateur=false;
    }

    /**
     * vérifie la presence d'une jeton dans une cellule 
     * @return vrai s'il y en a un et faux sinon
     */
    public boolean presenceJeton(){
        if(jetonCourant==null){
            return false;
            }
        else{
            return true;
        }
    }

    /**
     * accesseur de lecture qui ajoute une jeton dans la cellule
     * @param jetonCourant
     */
    public void AffecterJeton(Jeton jetonCourant) {
        this.jetonCourant = jetonCourant;
    }
    
    /**
     *Permet de connaitre la couleur du jeton s'il est present dans la cellule
     * @return soit la couleur du jeton soit vide s'il n'y en a pas
     */
    public String lireCouleurDuJeton(){
       if(jetonCourant != null){
           return jetonCourant.lireCouleur();
       }else{
           return "vide";
       }
   }
   
    /**
     * methode utiliser pour récuperer un jeton ou lorsqu'une partie est fini
     * afin de retirer tous les jetons puis de les redistribuer pour en recommencer une
     * @return la référence vers un jeton et supprime le jeton de la cellule
     */
    public Jeton recupererJeton(){
      Jeton tmp = jetonCourant;
      jetonCourant=null;
      return tmp;
  } 

    /**
     *
     * @return 
     * le caractère qui permet d'identifier ce qu'il y a dans la cellule
     */
    @Override
    public String toString() {
        if(presenceJeton()==true){
            return jetonCourant.toString();
        }
        if(presenceTrouNoir()==true || (presenceTrouNoir()==true && presenceDesintegrateur()==true)){
            return "@";
        }
        if(presenceDesintegrateur()==true){
            return "D";
        }
        else{
            return ".";
        }
    }

    /**
     * ajoute un trou noir dans la cellule
     */
    public void placerTrouNoir(){
        avoirTrouNoir = true;
    }
    
    /**
     *supprime un trou noir dans sa cellule en passant sa valeur à faux
     */
    public void supprimerTrouNoir(){
        avoirTrouNoir = false;
    }

    /**
     *
     * @return la valeur du trou noir pour savoir s'il est present ou non dans la cellule
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
     * @return la valeur(V/F) du désintegrateur pour savoir ci celui-ci est present dans la cellule
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
     * premet de supprimer le desintegrateur de la cellule en passant sa valeur à faux
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
