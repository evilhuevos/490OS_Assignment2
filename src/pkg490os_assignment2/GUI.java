/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg490os_assignment2;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Jose
 */
public class GUI extends JFrame {
    
        public GUI(int vgaps, int hgaps){
            super("GUI");
            Container pane = this.getContentPane();
            GridLayout layout = new GridLayout(5,3);
            layout.setVgap(vgaps);
            layout.setHgap(hgaps);
            
            JLabel codeLabel = new JLabel("Course Code:");
            JLabel nameLabel = new JLabel("Course Name:");
            JLabel creditsLabel = new JLabel("No. Of Credits:");
            JLabel departmentLable = new JLabel("Department");
            JButton addButton = new JButton("Add course");
            JButton displayAllButton = new JButton("Display all");
            JButton displayButton = new JButton ("Display (dept)");
            JTextField codeText = new JTextField ();
            JTextField nameText = new JTextField ();
            JTextField creditText = new JTextField ();
            JList listBox = new JList();
            JComboBox combo = new JComboBox();
            
            pane.add(codeLabel);
            pane.add(codeText);
            pane.add(listBox);
            
            
            
          
            
        }

    private GUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               try{
                   UIManager.setLookAndFeel(
                   "javax.swing.plaf.metal.MetalLookAndFeel");
               }catch (Exception ex){
                   ex.printStackTrace();
               }
               new GUI().setVisible(true);
            }
        });
}  
    }

