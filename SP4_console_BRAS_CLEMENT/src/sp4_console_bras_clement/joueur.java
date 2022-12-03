/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

import java.util.ArrayList;

/**
 *
 * @author Elodie
 */
public class joueur {
    //on enleve les private pour avoir acces dans l'interface graphique
     String nom;
     String couleur;
    private ArrayList<Jeton> reserveJeton = new ArrayList<Jeton>();
    private int nombreDesintegrateurs;

    /**
     * constructeur qui initialise le nom du joueur ainsi que son nombre de 
     * désintegrateur à 0
     * @param nom
     */
    public joueur(String nom) {
        this.nom = nom;
    }
    
    /**
     *accesseur de lecture qui affecte la couleur en parametre au joueur
     * @param couleur
     */
    public void affecterCouleur(String couleur){
        this.couleur = couleur;
    }
    
    /**
     * renvoie le nombre de jeton disponible d'un joueur
     * @return
     */
    public int nombreDeJeton(){
        return reserveJeton.size();
    }
    
    /**
     * ajoute un jeton à la reserve du joueur
     * @param ajoutJeton
     */
    public void ajouterJeton(Jeton ajoutJeton){
        reserveJeton.add(ajoutJeton);
    }
    
    /**
     *simule le jeu d'un jeton en l'enlevant de la réserve et en renvoyant sa reference
     * @return
     */
    public Jeton jouerJeton(){
        Jeton j=reserveJeton.remove(0);
        return j;
    }

    /**
     * accesseur de lecture qui renvoie l'attribut de couleur
     * @return
     */
    public String LireCouleur() {
        return couleur;
    }
    
    /**
     * augment le nombre de désintegrateur d'un joueur
     */
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs += 1;
    }
    
    /**
     *diminue le nombre de désintegrateur d'un joueur
     */
    public void utiliserDesintegrateur(){
        nombreDesintegrateurs -= 1;
    }

    /**
     *permet de recuperer le nombre de désintegrateur d'un joueur
     * @return
     */
    public int getNombreDesintegrateurs() {
        return nombreDesintegrateurs;
    }
    
    
}
