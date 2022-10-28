/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_clement;

/**
 *
 * @author Elodie
 */
public class BouteilleBiere {  //création de la classe
    //initialisation des attribus
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {  //création d'une méthode qui affiche les éléments contenue sur l'étiquette
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie + ouverte ) ;
    }
public BouteilleBiere(String unNom, double unDegre, String   //Création d'un constructeur
uneBrasserie) {                                              //avec trois paramètre
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
}
 public void Décapsuler(){   //méthode pour savoir grace à un booleen si la bouteille
    if (ouverte == false){   //est décapsuler ou non et si non la décapuler alors
        ouverte = true;
    } else{
        System.out.println("erreur : biere déjà ouverte");
        ouverte = false;
    }
 }
 @Override
public String toString() {  //méthode toString permet de retourner une chaine de caratère
String chaine_a_retourner;  //mise en forme
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}   



