/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_lightsoff_bras_clement;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.ImageIcon;

/**
 *
 * @author Elodie
 */
public class CellulesGraphique extends JButton {
    CelluleLumineuse CelluleGraphique;
    
    ImageIcon img_eteint = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    
    public CellulesGraphique(CelluleLumineuse uneCellule){
     CelluleGraphique =  uneCellule;
    }
    
 @Override
public void paintComponent (Graphics G){
   super.paintComponent(G);
   setIcon(img_eteint);
}   
}

