/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package premiereinitgraphique_clement;

/**
 *
 * @author Elodie
 */
public class fenetreprincipale extends javax.swing.JFrame {

    /**
     * Creates new form fenetreprincipale
     */
    public fenetreprincipale() {
        initComponents();
        System.out.println("fenetre crée");
        msg_bienvenue.setText("Bonjour le monde!!");
        resultat.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg_bienvenue = new javax.swing.JLabel();
        msg_Fin = new javax.swing.JLabel();
        Bouton_valider = new javax.swing.JButton();
        Zone_nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Zone_salaire = new javax.swing.JTextField();
        Bouton_augmenter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Zone_prenom = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        resultat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_bienvenue.setBackground(new java.awt.Color(102, 255, 204));
        msg_bienvenue.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        msg_bienvenue.setForeground(new java.awt.Color(255, 102, 204));
        msg_bienvenue.setText(" Hello World !");
        getContentPane().add(msg_bienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 14, 200, -1));

        msg_Fin.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        msg_Fin.setForeground(new java.awt.Color(255, 102, 204));
        msg_Fin.setText("Goodbye !!");
        getContentPane().add(msg_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 90, -1));

        Bouton_valider.setBackground(new java.awt.Color(255, 204, 204));
        Bouton_valider.setText("Clique ici");
        Bouton_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_validerActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Zone_nom.setBackground(new java.awt.Color(255, 255, 204));
        Zone_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zone_nomActionPerformed(evt);
            }
        });
        getContentPane().add(Zone_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 44, 100, -1));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Entrez votre nom :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Entrez votre salaire :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Zone_salaire.setBackground(new java.awt.Color(255, 255, 204));
        Zone_salaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zone_salaireActionPerformed(evt);
            }
        });
        getContentPane().add(Zone_salaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 180, 100, -1));

        Bouton_augmenter.setBackground(new java.awt.Color(255, 204, 204));
        Bouton_augmenter.setText("Augmenter Salaire");
        Bouton_augmenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_augmenterActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_augmenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Entrez votre prénom :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Zone_prenom.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(Zone_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 0), null));

        resultat.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        resultat.setForeground(new java.awt.Color(255, 153, 0));
        resultat.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(resultat)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(resultat)
                .addGap(124, 124, 124))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 10, 410, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_validerActionPerformed
        // TODO add your handling code here:
        msg_Fin.setText("Au revoir!");
        String a= Zone_nom.getText();
        String b = Zone_prenom.getText();
        resultat.setText("Bonjour "+a+" " + b);
        
        resultat.setVisible(true);
    }//GEN-LAST:event_Bouton_validerActionPerformed

    private void Zone_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zone_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Zone_nomActionPerformed

    private void Bouton_augmenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_augmenterActionPerformed
        // TODO add your handling code here:
        String salaire = Zone_salaire.getText();
        int salaire_entier = Integer.parseInt(salaire);
        salaire_entier++; //l'augmente de 1
        Zone_salaire.setText(salaire_entier+"");
    }//GEN-LAST:event_Bouton_augmenterActionPerformed

    private void Zone_salaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zone_salaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Zone_salaireActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreprincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_augmenter;
    private javax.swing.JButton Bouton_valider;
    private javax.swing.JTextField Zone_nom;
    private javax.swing.JTextField Zone_prenom;
    private javax.swing.JTextField Zone_salaire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msg_Fin;
    private javax.swing.JLabel msg_bienvenue;
    private javax.swing.JLabel resultat;
    // End of variables declaration//GEN-END:variables
}
