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
    //on enleve le private pour permettre à l'interface graphique d'utiliser la grille
    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];
    //grille de 6 ligne et 7 colonne avec l'élément (0,0) en bas à gauche

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
     * @param colonne
     * @return le numéro de la première ligne vide +ajoute le jeton dans la case libre
     */
    public int ajouterJetonDansColonne(Jeton ajout,int colonne){
      
       int ligne=0;
        while(grille[ligne][colonne].presenceJeton()){
           
          ligne+=1;
       }
        grille[ligne][colonne].AffecterJeton(ajout);
        return ligne;  
    }
  
    /**
     *verifie si la grille est pleine en fonction revoie vrai ou faux
     * @return
     */
    public boolean grilleRemplie(){
        int tmp =0;
        for (int i=0;i<6;i++){
            for(int j=0; j<7;j++){
                if(grille[i][j].presenceJeton()==false){
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
    
    
    
    /**
     * affiche la grille avec ses différents élements
     */
    public void afficherGrilleSurConsole(){ //i=ligne  j=colonne case 00en bas à gauche
        for (int i=5;i>=0;i--){
            for(int j=0; j<7;j++){
                System.out.print(grille[i][j].toString());
            }
            System.out.println("\n");
    }
    }
    
    /**
     *
     * @param x
     * @param y
     * @return verifie la presence d'un jeton dans une case choisit
     */
    public boolean PresenceJeton(int x, int y){
        if(grille[x][y].presenceJeton()==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     *
     * @param x
     * @param y
     * @return la couleur du jeton dans une case choisit de la grille
     */
    public String lireCouleurDuJeton(int x, int y){
        return grille[x][y].lireCouleurDuJeton();
    }
    
    //les 4 méthodes qui suivent sont utilisée dans etreGagnantePourCouleur()
    // afin de vérifier si la grille est gagnante ou pas dans toutes les
    //circonstante possible
    
    public boolean ligneGagnantePourCouleur(String couleur){
        for (int i=5;i>=0;i--){
            for(int j=0; j<4;j++){
               if(lireCouleurDuJeton(i,j)==couleur && lireCouleurDuJeton(i,j+1)==couleur && lireCouleurDuJeton(i,j+2)==couleur && lireCouleurDuJeton(i,j+3)==couleur){
                   return true;
               } 
            }
        }return false;
        
    }
    
    public boolean colonneGagnantePourCouleur(String couleur){
        for (int j=0;j<7;j++){
            for(int i=0; i<3;i++){
               if(lireCouleurDuJeton(i,j)==couleur && lireCouleurDuJeton(i+1,j)==couleur && lireCouleurDuJeton(i+2,j)==couleur && lireCouleurDuJeton(i+3,j)==couleur){
                   return true;
               } 
            }
        }return false;
        
    }
    
    public boolean digonaleMontanteGagnantePourCouleur(String couleur){
        for (int j=0;j<4;j++){
            for(int i=0; i<3;i++){
               if(lireCouleurDuJeton(i,j)==couleur && lireCouleurDuJeton(i+1,j+1)==couleur && lireCouleurDuJeton(i+2,j+2)==couleur && lireCouleurDuJeton(i+3,j+3)==couleur){
                   return true;
               } 
            }
        }return false;
        
    }
    
    public boolean diagonaleDesendanteGagnantePourCouleur(String couleur){
        for (int j=0;j<4;j++){
            for(int i=5; i>2;i--){
               if(lireCouleurDuJeton(i,j)==couleur && lireCouleurDuJeton(i-1,j+1)==couleur && lireCouleurDuJeton(i-2,j+2)==couleur && lireCouleurDuJeton(i-3,j+3)==couleur){
                   return true;
               } 
            }
        }return false;
        
    }
    
    /**
     *utilise les methode qui vérifie s'il y a une ligne,colonne,digonale gagnante
     * @param couleur
     * @return
     */
    public boolean etreGagnantePourCouleur(String couleur){
        if(ligneGagnantePourCouleur(couleur)==true || colonneGagnantePourCouleur(couleur)==true || digonaleMontanteGagnantePourCouleur(couleur)==true || diagonaleDesendanteGagnantePourCouleur(couleur)==true){
            return true;
        }
        return false;
    }
    
    /**
     * verifie si la colonne est pleine 
     * @param c
     * @return
     */
    public boolean colonneRemplie(int c){
        int i =0;
        while(grille[i][c]!=null){
           i+=1;
       }
        if(i==6){
           return true; 
        }
        return false;  
    }
    
    /**
     *lorsqu'un jeton est supprimé, fait passer le jeton du dessus dans la case vide en dessous
     * @param colonne
     */
    public void tasserColonne(int colonne){
        for (int i=0; i<5; i++){
            if (PresenceJeton(i,colonne) == false){
                Jeton j = grille[i+1][colonne].recupererJeton();
                grille[i][colonne].AffecterJeton(j);
                
            }
        }
    }
    
    /**
     *place un trou noir dans une case choisie
     * @param x
     * @param y
     */
    public void placerTrouNoir(int x, int y){
        grille[x][y].placerTrouNoir();
    }
    
    /**
     *supprime le trou noir dans une case choisie 
     * @param x
     * @param y
     */
    public void supprimerTrouNoir(int x, int y){
        grille[x][y].supprimerTrouNoir();
    }
    
    /**
     *ajoute un désintégrateur à l'endroit choisie
     * @param x
     * @param y
     */
    public void placerDesintegrateur(int x, int y){
        grille[x][y].placerDesintegrateur();
    }
    
    /**
     *supprime le desintegrateur dans une case choisie 
     * @param x
     * @param y
     */
    public void supprimerDesintegrateur(int x, int y){
        grille[x][y].supprimerDesintegrateur();
    }
    
    /**
     * supprime le eton de la cellule visée
     * @param x
     * @param y
     */
    public void supprimerJeton(int x, int y){
        grille[x][y].supprimerJeton();
    }
    
    /**
     *
     * @param x
     * @param y
     * @return la référence du jeton enlevé
     */
    public Jeton recupererJeton(int x, int y){
        return grille[x][y].recupererJeton();
    }
    
    /**
     *
     * @param x
     * @param y
     * @return la présence ou non d'un desintegrateur dans une cellule precise
     */
    public boolean presenceDesintegrateur(int x, int y){
        return grille[x][y].presenceDesintegrateur();
    }
    
    /**
     *
     * @param x
     * @param y
     * @return la présence ou non d'un troue noir dans une cellule precise
     */
    public boolean presenceTrouNoir(int x, int y){
        return grille[x][y].presenceTrouNoir();
    }
}
