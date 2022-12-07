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
    public void Grille(){
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
    
    
}
