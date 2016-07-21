/*
 * Created by JFormDesigner on Thu Jul 21 18:15:40 EEST 2016
 */

package main.java.view;

import main.java.db.LaboratoryDB;
import main.java.model.MedPersonal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Alex Alex
 */
public class AssistantFrame extends JFrame {
    public AssistantFrame(MedPersonal result, LaboratoryDB db) {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alex Alex
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        setTitle("AssistantFrame");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(null);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2);
            panel2.setBounds(0, 0, 585, 320);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- button1 ----
                button1.setText("Cancel");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel3.add(button1);
                button1.setBounds(new Rectangle(new Point(510, 5), button1.getPreferredSize()));

                //---- button2 ----
                button2.setText("OK");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel3.add(button2);
                button2.setBounds(new Rectangle(new Point(460, 5), button2.getPreferredSize()));

                //---- button3 ----
                button3.setText("OrdersWorking");
                button3.addActionListener(e -> button3ActionPerformed(e));
                panel3.add(button3);
                button3.setBounds(new Rectangle(new Point(345, 5), button3.getPreferredSize()));

                //---- button4 ----
                button4.setText("TakeOderWork");
                button4.addActionListener(e -> button4ActionPerformed(e));
                panel3.add(button4);
                button4.setBounds(new Rectangle(new Point(230, 5), button4.getPreferredSize()));

                //---- button5 ----
                button5.setText("CheckanAnalyzes");
                button5.addActionListener(e -> button5ActionPerformed(e));
                panel3.add(button5);
                button5.setBounds(new Rectangle(new Point(140, 5), button5.getPreferredSize()));

                //---- button6 ----
                button6.setText(" AllProcessedOrdersPeriod");
                button6.addActionListener(e -> button6ActionPerformed(e));
                panel3.add(button6);
                button6.setBounds(new Rectangle(new Point(5, 5), button6.getPreferredSize()));

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel3);
            panel3.setBounds(0, 325, 585, 35);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 585, 360);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Alex Alex
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
