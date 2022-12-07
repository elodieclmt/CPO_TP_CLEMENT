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
      
    public void CliqueCellule(int x,int y){
        for (int i=0 ;i<5 ; i++){
            for(int j=0 ; j<5 ;j++){
                if(i==0 &&j==0){ //on change l'état des cellules dans le coin en bas à gauche
                    grille[x][y].ChangeTonEtat();
                    grille[x+1][y].ChangeTonEtat();
                    grille[x][y+1].ChangeTonEtat();
                }
                if(i==0 &&j==4){ //on change l'état des cellules dans le coin en bas à droite
                    grille[x][y].ChangeTonEtat();
                    grille[x+1][y].ChangeTonEtat();
                    grille[x][y-1].ChangeTonEtat();
                }
                if(i==4 &&j==0){ //on change l'état des cellules dans le coin en haut à gauche
                    grille[x][y].ChangeTonEtat();
                    grille[x-1][y].ChangeTonEtat();
                    grille[x][y+1].ChangeTonEtat();
                }
                if(i==4 &&j==4){ //on change l'état des cellules dans le coin en haut à droite
                    grille[x][y].ChangeTonEtat();
                    grille[x-1][y].ChangeTonEtat();
                    grille[x][y-1].ChangeTonEtat();
                }
                if( j==0 && (0<i && i<4 )){ //changement pour la colonne 0
                    grille[x][y].ChangeTonEtat();
                    grille[x+1][y].ChangeTonEtat();
                    grille[x-1][y].ChangeTonEtat();
                    grille[x][y+1].ChangeTonEtat();
                }
                if( j==4 && (0<i && i<4 )){ //changement pour la colonne 4
                    grille[x][y].ChangeTonEtat();
                    grille[x+1][y].ChangeTonEtat();
                    grille[x-1][y].ChangeTonEtat();
                    grille[x][y-1].ChangeTonEtat();
                }
                if( i==0 && (0<j && j<4)){ //changement pour la ligne 0
                    grille[x][y].ChangeTonEtat();
                    grille[x][y-1].ChangeTonEtat();
                    grille[x][y+1].ChangeTonEtat();
                    grille[x+1][y].ChangeTonEtat();
                }
                if( i==4 && (0<j && j<4)){ //changement pour la ligne 4
                    grille[x][y].ChangeTonEtat();
                    grille[x][y-1].ChangeTonEtat();
                    grille[x][y+1].ChangeTonEtat();
                    grille[x-1][y].ChangeTonEtat();
                }
                if((1<i && i<4)&&(1<i && i<4)){ // pour le reste de la grille
                    grille[x][y].ChangeTonEtat();
                    grille[x][y-1].ChangeTonEtat();
                    grille[x][y+1].ChangeTonEtat();
                    grille[x-1][y].ChangeTonEtat();
                    grille[x+1][y].ChangeTonEtat();
                }
            }
        }
    }  
}
