package sp4_console_bras_clement;

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Elodie
 */
public class SP4_graphique extends javax.swing.JFrame {

    joueur[] listeJoueurs = new joueur[2];
    joueur joueurCourant;
    PlateauDeJeu plateau = new PlateauDeJeu();

    /**
     * Creates new form SP4_graphique
     */
    public SP4_graphique() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                cellule_graphique cellGraph = new cellule_graphique(plateau.grille[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CelluleDeGrille c = cellGraph.CelluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }

                        if (c.jetonCourant.couleur.equals(joueurCourant.couleur)) {
                            textMessage.setText("le joueur " + joueurCourant.nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            joueurSuivant();
                        } else {
                            if (joueurCourant.getNombreDesintegrateurs() > 0) {
                                textMessage.setText("le joueur " + joueurCourant.nom + " désintegre un jeton");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                                joueurSuivant();
                            } else {
                                return;
                            }
                        }
                        plateau.tasserGrille();
                        panneau_grille.add(cellGraph);
                        panneau_grille.repaint();  //premet de rafrechir le grille
                        //on verifie les condition de victoire et en fonction on affiche le bon message
                        lbl_j1_desint.setText(listeJoueurs[0].getNombreDesintegrateurs() + "");
                        lbl_j2_desint.setText(listeJoueurs[1].getNombreDesintegrateurs() + "");

                        boolean vict_j1 = plateau.etreGagnantePourCouleur(listeJoueurs[0].couleur);
                        boolean vict_j2 = plateau.etreGagnantePourCouleur(listeJoueurs[1].couleur);

                        if (vict_j1 && !vict_j2) {
                            textMessage.setText("Victoire de " + listeJoueurs[0].nom);
                        }
                        if (vict_j2 && !vict_j1) {
                            textMessage.setText("Victoire de " + listeJoueurs[1].nom);
                        }

                        if (vict_j1 && vict_j2) {
                            if (joueurCourant == listeJoueurs[0]) {
                                textMessage.setText("Victoire de " + listeJoueurs[1].nom + "(faute de jeu de l'autre joueur)");
                            } else {
                                textMessage.setText("Victoire de " + listeJoueurs[0].nom + "(faute de jeu de l'autre joueur");;
                            }
                        }
                    }
                });
                panneau_grille.add(cellGraph);

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        textMessage = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 20, 120, -1));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 50, 120, -1));

        btn_start.setLabel("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        panneau_info_joueurs.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_info_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel5.setText("Joueur 1 :");
        panneau_info_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText("couleur :");
        panneau_info_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel7.setText("désintégrateurs :");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbl_j1_nom.setText("nomjoueur1");
        panneau_info_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_info_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 123, 250, 10));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_info_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel9.setText("couleur :");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel10.setText("désintégrateurs :");
        panneau_info_joueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbl_j2_couleur.setText("couleurjoueur2");
        panneau_info_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Infos Joueurs :");
        panneau_info_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setText("Joueur 2 :");
        panneau_info_joueurs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbl_j2_nom.setText("nomjoueur2");
        panneau_info_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Infos Jeu :");
        panneau_info_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setText("Joueur Courant :");
        panneau_info_partie.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lbl_jcourant.setText("nomjoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        textMessage.setColumns(20);
        textMessage.setRows(5);
        message.setViewportView(textMessage);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, 100));

        btn_col_0.setLabel("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });

        btn_col_1.setLabel("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });

        btn_col_2.setLabel("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });

        btn_col_3.setLabel("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });

        btn_col_4.setLabel("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });

        btn_col_5.setLabel("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });

        btn_col_6.setLabel("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_col_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_col_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btn_col_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btn_col_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btn_col_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_col_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_col_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(panneau_grille, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panneau_info_joueurs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(panneau_creation_partie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panneau_info_partie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_col_0)
                    .addComponent(btn_col_1)
                    .addComponent(btn_col_2)
                    .addComponent(btn_col_3)
                    .addComponent(btn_col_4)
                    .addComponent(btn_col_5)
                    .addComponent(btn_col_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panneau_grille, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panneau_creation_partie, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panneau_info_joueurs, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panneau_info_partie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(0);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(2);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(5);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(6);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        //affiche les deux autres labels(info joueur et info partie lorsque
        //l'on appuis sur le bouton démarrer
        panneau_info_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);

    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    public boolean jouerDansColonne(int indice_colonne) {

        //ajout d'un jeton de la couleur du joueur dans la ligne la plus basse
        //de la colonne choisis par le joueur 
        int ligne = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), indice_colonne);

        //vérification de laprésence ou non de trou noir ou désintégrateur
        //sur la case où est tombé le jeton
        if (plateau.presenceTrouNoir(ligne, indice_colonne) == true) {
            plateau.supprimerJeton(ligne, indice_colonne);
            plateau.supprimerTrouNoir(ligne, indice_colonne);
        }
        if (plateau.presenceDesintegrateur(ligne, indice_colonne) == true) {
            joueurCourant.obtenirDesintegrateur();
            plateau.supprimerDesintegrateur(ligne, indice_colonne);
        }

        panneau_grille.repaint();

        lbl_j1_desint.setText(listeJoueurs[0].getNombreDesintegrateurs() + "");
        lbl_j2_desint.setText(listeJoueurs[1].getNombreDesintegrateurs() + "");

        boolean vict_j1 = plateau.etreGagnantePourCouleur(listeJoueurs[0].couleur);
        boolean vict_j2 = plateau.etreGagnantePourCouleur(listeJoueurs[1].couleur);

        if (vict_j1 && !vict_j2) {
            textMessage.setText("Victoire de " + listeJoueurs[0].nom);
        }
        if (vict_j2 && !vict_j1) {
            textMessage.setText("Victoire de " + listeJoueurs[1].nom);
        }

        if (vict_j1 && vict_j2) {
            if (joueurCourant == listeJoueurs[0]) {
                textMessage.setText("Victoire de " + listeJoueurs[1].nom + "(faute de jeu de l'autre joueur)");
            } else {
                textMessage.setText("Victoire de " + listeJoueurs[0].nom + "(faute de jeu de l'autre joueur");;
            }
        }

        return true;
    }

    //méthode qui permet de changer de joueur lorsq'ils ont jouer
    public void joueurSuivant() {
        if (joueurCourant == listeJoueurs[0]) {
            joueurCourant = listeJoueurs[1];
            lbl_jcourant.setText(joueurCourant.nom);
        } else {
            joueurCourant = listeJoueurs[0];
            lbl_jcourant.setText(joueurCourant.nom);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SP4_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SP4_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SP4_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SP4_graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SP4_graphique().setVisible(true);
            }
        });
    }

    public void initialiserPartie() {

        String nomJoueur1 = nom_joueur1.getText();
        joueur J1 = new joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur2.getText();
        joueur J2 = new joueur(nomJoueur2);

        System.out.println(J1.nom + " est de couleur " + J1.couleur);
        System.out.println(J2.nom + " est de couleur " + J2.couleur);

        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;

        attribuerCouleurAuxJoueurs();

        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateur();

        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        lbl_j1_couleur.setText(J1.couleur);
        lbl_j2_couleur.setText(J2.couleur);
        lbl_j1_desint.setText(J1.getNombreDesintegrateurs() + "");
        lbl_j2_desint.setText(J2.getNombreDesintegrateurs() + "");

        //determine qui est le premier joueur
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            joueurCourant = listeJoueurs[0];
        } else {
            joueurCourant = listeJoueurs[0];
        }

        lbl_jcourant.setText(joueurCourant.nom);
    }

    public void creerEtAffecterJeton(joueur J1) {
        String couleur = J1.LireCouleur();
        for (int i = 0; i < 30; i++) {
            Jeton jeton = new Jeton(couleur);
            J1.ajouterJeton(jeton);
            i += 1;
        }

    }

    public void placerTrousNoirsEtDesintegrateur() {
        Random ran = new Random();
        int ligne = ran.nextInt(6);
        int colonne = ran.nextInt(7);
        int i = 0;
        int j = 0;
        int k = 0;

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JTextArea textMessage;
    // End of variables declaration//GEN-END:variables
}
