/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bras_clement;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Elodie
 */
public class cellule_graphique extends JButton {
    CelluleDeGrille CelluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    
    public cellule_graphique(CelluleDeGrille uneCellule){
     CelluleAssociee =  uneCellule;  
    }
    
    @Override
    public void paintComponent(Graphics G){
      super.paintComponent(G);
      setIcon(img_vide); //attribut l'image celluleVide.png qui 
                                   //represente une cellule vide 
    }
}
