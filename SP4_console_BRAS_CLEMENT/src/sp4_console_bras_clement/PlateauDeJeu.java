/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

/**
 *
 * @author Elodie
 */
public class PlateauDeJeu {
    
    private CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];

    /**
     *constructeur pour créer 42 cellules de type CelluleDeGrille
     * permet de mettre un objet dans chaque case
     */
    public PlateauDeJeu() {
    
    for(int i=0;i<6;i++){
        for(int j=0;j<7;j++){
             this.grille[i][j] = new CelluleDeGrille();
        }
    }
    }
    
    /**
     *
     * @param ajout
     * @param ligne
     * @return le numéro de la première ligne vide
     */
    public int ajouterJetonDansColonne(Jeton ajout,int colonne){
       int i =0;
       int ligne=0;
        while(grille[i][colonne]!=null){
           ligne =i;
           i+=1;
       }
        return ligne;  
    }
  
    public boolean grilleRemplie(){
        int tmp =0;
        for (int i=0;i<6;i++){
            for(int j=0; j<7;j++){
                if(grille[i][j]==null){
                     tmp +=1;
                }
            }
        }
        if(tmp==0){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
