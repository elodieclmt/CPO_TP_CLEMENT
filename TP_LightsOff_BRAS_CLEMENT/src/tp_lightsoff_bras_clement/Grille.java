/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_lightsoff_bras_clement;

/**
 *
 * @author Elodie
 */
public class Grille {
    
    //cellule (0,0) en bas à gauche
    CelluleLumineuse[][] grille = new CelluleLumineuse[5][5];
    
    /**
     * creation du tableau avec les 25 cases d'objet celluleLumineuse
     */
    public Grille(){
        for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
             this.grille[i][j] = new CelluleLumineuse();
        }
    }
    }
    
    /**
     *
     * @param x
     * @param y
     * @return l'état d'une cellule precise (Allumé ou éteinte) 
     */
    public boolean LireCellule(int x, int y){
        return grille[x][y].LireEtat();
    }
    
    /**
     * Allume une case choisie
     * @param x
     * @param y
     */
    public void CelluleAllume(int x, int y){
        grille[x][y].AllumeToi();
    }
    
    /**
     * Eteint une case choisie
     * @param x
     * @param y
     */
    public void CelluleEteint(int x, int y){
        grille[x][y].EteintToi();
    }
    
    /**
     * Change la valeur d'une case choisie
     * @param x
     * @param y
     */
    public void CelluleChange(int x, int y){
        grille[x][y].ChangeTonEtat();
    }
    
    public void afficherGrilleSurConsole(){ //i=ligne  j=colonne case 00en bas à gauche
        for (int i=4;i>=0;i--){
            for(int j=0; j<5;j++){
                System.out.print(grille[i][j].toString());
            }
            System.out.println("\n");
    }
    }
    
    /**
     * verifie si chaque cellule est éteinte si oui alors elle renvoie vrai
     * sinon elle renvoie faux
     * @return
     */
    public boolean grilleGagnante(){
        int tmp =0;
        for (int i=0;i<5;i++){
            for(int j=0; j<5;j++){
                if(grille[i][j].LireEtat()==false){
                     tmp +=1;
                }
            }
        }
        if(tmp==25){
            return true;
        }else{
            return false;
        }
    }
      
    /**
     * methode qui permet de changer les valeurs (cellule allumée ou eteinte) d'une case
     * choisi et de celle situtee à cote
     * @param x
     * @param y
     */
    public void CliqueCellule(int x,int y){
        grille[x][y].ChangeTonEtat();
        if (x>0){ // verifie qu'on ne se situe pas sur la ligne la plus basse
          grille[x-1][y].ChangeTonEtat();
        }
        if (x<4){ // verifie qu'on ne se situe pas sur la ligne la plus haute
          grille[x+1][y].ChangeTonEtat();
        }
        if (y>0){ // verifie qu'on ne se situe pas sur la colonne la plus a gauche
          grille[x][y-1].ChangeTonEtat();
        }
        if (y<4){ // verifie qu'on ne se situe pas sur la colonne la plus a droite
          grille[x][y+1].ChangeTonEtat();
        }
        
    }  
}
