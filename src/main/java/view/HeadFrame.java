package view;

import controller.HeadController;
import db.LaboratoryDB;
import model.MedPersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class HeadFrame extends JFrame{
    private HeadController controller;

    public HeadFrame(MedPersonal result, LaboratoryDB db) {
        //     setTitle("HeadFrame");
        //       setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here

        RegisterFrame registerFrame = new RegisterFrame();
        registerFrame.start();
    }


    private void okButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button8ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button7ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alex Alex
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        cancelButton = new JButton();
        okButton = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button4 = new JButton();
        button7 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button8 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("HeadFrame");
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
            panel2.setBounds(0, 0, 585, 270);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
                panel3.add(cancelButton);
                cancelButton.setBounds(new Rectangle(new Point(500, 40), cancelButton.getPreferredSize()));

                //---- okButton ----
                okButton.setText("OK");
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                panel3.add(okButton);
                okButton.setBounds(new Rectangle(new Point(500, 10), okButton.getPreferredSize()));

                //---- button1 ----
                button1.setText("Recruit");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel3.add(button1);
                button1.setBounds(401, 10, 85, button1.getPreferredSize().height);

                //---- button2 ----
                button2.setText("SpeedAssistants");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel3.add(button2);
                button2.setBounds(new Rectangle(new Point(152, 40), button2.getPreferredSize()));

                //---- button4 ----
                button4.setText("Dismiss");
                button4.addActionListener(e -> button4ActionPerformed(e));
                panel3.add(button4);
                button4.setBounds(286, 40, 103, button4.getPreferredSize().height);

                //---- button7 ----
                button7.setText("ChangeAnalysis");
                button7.addActionListener(e -> button7ActionPerformed(e));
                panel3.add(button7);
                button7.setBounds(10, 10, 130, button7.getPreferredSize().height);

                //---- button5 ----
                button5.setText("View WorkDoctors");
                button5.addActionListener(e -> button5ActionPerformed(e));
                panel3.add(button5);
                button5.setBounds(10, 40, 130, button5.getPreferredSize().height);

                //---- button6 ----
                button6.setText("Reports");
                button6.addActionListener(e -> button6ActionPerformed(e));
                panel3.add(button6);
                button6.setBounds(401, 40, 85, button6.getPreferredSize().height);

                //---- button8 ----
                button8.setText("CreateAnalysis");
                button8.addActionListener(e -> button8ActionPerformed(e));
                panel3.add(button8);
                button8.setBounds(153, 10, 120, button8.getPreferredSize().height);

                //---- button3 ----
                button3.setText("ChangeOrder");
                button3.addActionListener(e -> button3ActionPerformed(e));
                panel3.add(button3);
                button3.setBounds(new Rectangle(new Point(286, 10), button3.getPreferredSize()));

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
            panel3.setBounds(0, 280, 585, 70);

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
        panel1.setBounds(0, 0, 585, 350);

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
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Alex Alex
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton cancelButton;
    private JButton okButton;
    private JButton button1;
    private JButton button2;
    private JButton button4;
    private JButton button7;
    private JButton button5;
    private JButton button6;
    private JButton button8;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}



