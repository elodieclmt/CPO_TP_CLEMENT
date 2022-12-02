/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elodie
 */
public class Partie {

    private joueur[] listeJoueurs = new joueur[2];
    private joueur joueurCourant;
    private PlateauDeJeu plateau;

    /**
     * constructeur qui ajoute les deux joueurs au tableau listeJoueur et
     * initialise un plateau
     *
     * @param joueurCourant1
     * @param joueurCourant2
     */
    public Partie(joueur joueurCourant1, joueur joueurCourant2) {

        listeJoueurs[0] = joueurCourant1;
        listeJoueurs[1] = joueurCourant2;
        plateau = new PlateauDeJeu();
    }

    /**
     * distribution aléatoire des couelrus aux joueurs
     */
    public void attribuerCouleurAuxJoueurs() {
        Random couleur = new Random();
        int choix = couleur.nextInt(1);
        if (choix == 1) {
            listeJoueurs[0].affecterCouleur("jaune");
            listeJoueurs[1].affecterCouleur("rouge");
        } else {
            listeJoueurs[1].affecterCouleur("jaune");
            listeJoueurs[0].affecterCouleur("rouge");
        }

    }

    /**
     * création des 30 jetons et affectation au joueur en paramètre
     *
     * @param J1
     */
    public void creerEtAffecterJeton(joueur J1) {
        String couleur = J1.LireCouleur();
        for (int i = 0; i < 30; i++) {
            Jeton jeton = new Jeton(couleur);
            J1.ajouterJeton(jeton);
            i += 1;
        }

    }

    /**
     * initialise la partie en attribuant les couleurs aux joueurs et place les
     * tours noir et désintégrateur
     */
    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateur();
    }

    /**
     * place les 5 trous noirs et les 5 désintégrateur dans le plateau Sachant
     * que 3 des désintegrateurs doivent se situer sur la meme case qu'un trou
     * noir
     */
    public void placerTrousNoirsEtDesintegrateur() {
        Random ran = new Random();
        int ligne = ran.nextInt(6);
        int colonne = ran.nextInt(7);
        int i = 0;
        int j = 0;
        int k=0;

        while (i < 3) {
            while (plateau.presenceTrouNoir(ligne, colonne) == true || plateau.presenceDesintegrateur(ligne, colonne) == true) {
                ligne = ran.nextInt(6);
                colonne = ran.nextInt(7);
            }
            plateau.placerTrouNoir(ligne, colonne);
            plateau.placerDesintegrateur(ligne, colonne);
            i += 1;
        }

        while (j < 2) {
            while (plateau.presenceTrouNoir(ligne, colonne) == true || plateau.presenceDesintegrateur(ligne, colonne) == true) {
                ligne = ran.nextInt(6);
                colonne = ran.nextInt(7);
            }
            plateau.placerTrouNoir(ligne, colonne);

            j += 1;
        }

        while (k < 2) {
            while (plateau.presenceTrouNoir(ligne, colonne) == true || plateau.presenceDesintegrateur(ligne, colonne) == true) {
                ligne = ran.nextInt(6);
                colonne = ran.nextInt(7);
            }
            plateau.placerDesintegrateur(ligne, colonne);

            k += 1;
        }
    }

    public void lancerPartie() {

        plateau.afficherGrilleSurConsole();
        joueurCourant = listeJoueurs[0];
        boolean coupValide = false;
       
        while (plateau.grilleRemplie() == false && plateau.etreGagnantePourCouleur("jaune") == false && plateau.etreGagnantePourCouleur("rouge") == false) {
            
            coupValide = false;
            do {
                //on demande au joueur ce qu'il veut faire et on récupère sa valeur dans une variable
                System.out.println("Taper 1 si vous voulez jouer un jeton");
                System.out.println("Taper 2 si vous voulez jouer un désintégrateur");
                System.out.println("Taper 3 si vous voulez récuperer un jeton");

                Scanner reponse = new Scanner(System.in);
                int choix = reponse.nextInt();

                if (choix == 1) {  //si le joueur veut jouer un jeton
                    System.out.println("Rentrer un numéro de colonne entre 0 et 6 (sachant que la colonne 0 est la plus à gauche)");

                    Scanner colonne = new Scanner(System.in);
                    int cln = colonne.nextInt();    //cln est le juméro de la colonne dans laquel le joueur souhaite jouer

                    //ajout d'un jeton de la couleur du joueur dans la ligne la plus basse
                    //de la colonne choisis par le joueur 
                    int ligne = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), cln);

                    //vérification de laprésence ou non de trou noir ou désintégrateur
                    //sur la case où est tombé le jeton
                    if (plateau.presenceTrouNoir(ligne, cln) == true) {
                        plateau.supprimerJeton(ligne, cln);
                        plateau.supprimerTrouNoir(ligne, cln);
                    }
                    if (plateau.presenceDesintegrateur(ligne, cln) == true) {
                        joueurCourant.obtenirDesintegrateur();
                        plateau.supprimerDesintegrateur(ligne, cln);
                    }
                    coupValide = true;

                }

                //si l'utilisateur décide de jouer un désintégrateur
                if (choix == 2 && joueurCourant.getNombreDesintegrateurs() > 0) {
                    if (joueurCourant.getNombreDesintegrateurs() > 0) {
                        joueurCourant.utiliserDesintegrateur();

                        System.out.println("Renseigner la ligne du jeton que vous souhaiter désintégrer");
                        Scanner ligne = new Scanner(System.in);
                        int lgn = ligne.nextInt();

                        System.out.println("Renseigner la colonne du jeton que vous souhaiter désintégrer");
                        Scanner colonne = new Scanner(System.in);
                        int cln = colonne.nextInt();

                        coupValide = true;
                        plateau.supprimerJeton(lgn, cln);
                        plateau.tasserColonne(cln);
                    }
                }

                //si le joueur souhaite récuperer un jeton
                if (choix == 3) {
                    System.out.println("Renseigner la ligne du jeton que vous souhaiter récuperer");
                    Scanner ligne = new Scanner(System.in);
                    int lgn = ligne.nextInt();

                    System.out.println("Renseigner la colonne du jeton que vous souhaiter récuperer");
                    Scanner colonne = new Scanner(System.in);
                    int cln = colonne.nextInt();

                    plateau.recupererJeton(lgn, cln);
                    joueurCourant.ajouterJeton(plateau.recupererJeton(lgn, cln));
                    plateau.tasserColonne(cln);
                    coupValide = true;

                }
            
            } while (coupValide == false);
            plateau.afficherGrilleSurConsole();

            if (joueurCourant == listeJoueurs[0]) {
                joueurCourant = listeJoueurs[1];
            } else {
                joueurCourant = listeJoueurs[0];
            }

        }

    }

}
