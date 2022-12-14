/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp_lightsoff_bras_clement;

import java.util.Scanner;

/**
 *
 * @author Elodie
 */
public class TP_LightOff_Graphique extends javax.swing.JFrame {

        Grille plateau = new Grille();
        Joueur j1 = new Joueur();
         
    /**
     * Creates new form TP_LightOff_Graphique
     */
    public TP_LightOff_Graphique() {
        initComponents();
        
        for (int i=4; i>=0 ; i--){
           for (int j=0; j<5; j++){
               CellulesGraphique cellGraph = new CellulesGraphique(plateau.grille[i][j]);
               grilleDeJeu.add(cellGraph);
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

        grilleDeJeu = new javax.swing.JPanel();
        info_joueur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Nom_Joueur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        affichage = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbt_demarrer = new javax.swing.JButton();
        nb_score = new javax.swing.JLabel();
        jbt_c4 = new javax.swing.JButton();
        jbt_c0 = new javax.swing.JButton();
        jbt_c1 = new javax.swing.JButton();
        jbt_c2 = new javax.swing.JButton();
        jbt_c3 = new javax.swing.JButton();
        jbt_l0 = new javax.swing.JButton();
        jbt_l4 = new javax.swing.JButton();
        jbt_l3 = new javax.swing.JButton();
        jbt_l2 = new javax.swing.JButton();
        jbt_l1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilleDeJeu.setBackground(new java.awt.Color(255, 255, 255));
        grilleDeJeu.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(grilleDeJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 480, 480));

        info_joueur.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Info Joueur :");

        jLabel2.setText("Nom :");

        Text_Nom_Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Nom_JoueurActionPerformed(evt);
            }
        });

        jLabel3.setText("Score :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        affichage.setViewportView(jTextArea1);

        jbt_demarrer.setText("Démarrer Partie");

        javax.swing.GroupLayout info_joueurLayout = new javax.swing.GroupLayout(info_joueur);
        info_joueur.setLayout(info_joueurLayout);
        info_joueurLayout.setHorizontalGroup(
            info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_joueurLayout.createSequentialGroup()
                .addGroup(info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, info_joueurLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, info_joueurLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(info_joueurLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Text_Nom_Joueur))
                            .addGroup(info_joueurLayout.createSequentialGroup()
                                .addGroup(info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(affichage, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(info_joueurLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(nb_score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 12, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(info_joueurLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jbt_demarrer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info_joueurLayout.setVerticalGroup(
            info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_joueurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_Nom_Joueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(info_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nb_score))
                .addGap(36, 36, 36)
                .addComponent(affichage, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbt_demarrer)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 190, -1));

        jbt_c4.setText("5");
        jbt_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_c4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jbt_c0.setText("1");
        jbt_c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_c0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_c0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jbt_c1.setText("2");
        jbt_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_c1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jbt_c2.setText("3");
        jbt_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_c2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jbt_c3.setText("4");
        jbt_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_c3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jbt_l0.setText("5");
        jbt_l0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_l0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jbt_l4.setText("1");
        jbt_l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_l4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jbt_l3.setText("2");
        jbt_l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_l3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jbt_l2.setText("3");
        jbt_l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_l2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jbt_l1.setText("4");
        jbt_l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_l1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_Nom_JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Nom_JoueurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Nom_JoueurActionPerformed

    private void jbt_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_c4ActionPerformed

    private void jbt_c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_c0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_c0ActionPerformed

    private void jbt_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_c1ActionPerformed

    private void jbt_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_c2ActionPerformed

    private void jbt_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_c3ActionPerformed

    private void jbt_l0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_l0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_l0ActionPerformed

    private void jbt_l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_l4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_l4ActionPerformed

    private void jbt_l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_l3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_l3ActionPerformed

    private void jbt_l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_l2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_l2ActionPerformed

    private void jbt_l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_l1ActionPerformed

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
            java.util.logging.Logger.getLogger(TP_LightOff_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TP_LightOff_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TP_LightOff_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TP_LightOff_Graphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TP_LightOff_Graphique().setVisible(true);
            }
        });
    }
    
    public void LancerPartie(){

        //demmande au joueur de choisir son nom
        String NomJoueur = Text_Nom_Joueur.getText();
        j1.nom = NomJoueur;
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text_Nom_Joueur;
    private javax.swing.JScrollPane affichage;
    private javax.swing.JPanel grilleDeJeu;
    private javax.swing.JPanel info_joueur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbt_c0;
    private javax.swing.JButton jbt_c1;
    private javax.swing.JButton jbt_c2;
    private javax.swing.JButton jbt_c3;
    private javax.swing.JButton jbt_c4;
    private javax.swing.JButton jbt_demarrer;
    private javax.swing.JButton jbt_l0;
    private javax.swing.JButton jbt_l1;
    private javax.swing.JButton jbt_l2;
    private javax.swing.JButton jbt_l3;
    private javax.swing.JButton jbt_l4;
    private javax.swing.JLabel nb_score;
    // End of variables declaration//GEN-END:variables
}
