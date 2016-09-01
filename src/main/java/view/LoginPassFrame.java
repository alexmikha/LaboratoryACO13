package view;

import controller.MedPersonalControllerImpl;
import exceptions.LoginException;
import model.MedPersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class LoginPassFrame extends JFrame {

    private MedPersonalControllerImpl controller;


    public LoginPassFrame(MedPersonalControllerImpl controller) {
        this.controller = controller;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);

    }


    private void button1ActionPerformed(ActionEvent e) {
        MedPersonal result;
        try {
            result = controller.logIn(textField1.getText(), passwordField1.getText());
            switch (result.getPosition()) {
                case DOCTOR:
                    new DoctorFrame(result, controller.getDb());
                    break;
                case ASSISTANT:
                    new AssistantFrame(result, controller.getDb());
                    break;
                case HEAD:
                    new HeadFrame(result, controller.getDb());
                    break;
            }
            LoginPassFrame.this.dispose();
        } catch (LoginException e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(LoginPassFrame.this,
                    e1.getMessage(),
                    e1.getClass().getName(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("cancel")) {
            System.exit(0);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alex Alex
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        passwordField1 = new JPasswordField();

        //======== this ========
        setTitle("Indetification");
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

            //---- label1 ----
            label1.setText("login");
            label1.setFont(new Font("sansserif", Font.PLAIN, 14));
            panel1.add(label1);
            label1.setBounds(143, 20, 70, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("password");
            label2.setFont(new Font("sansserif", Font.PLAIN, 14));
            panel1.add(label2);
            label2.setBounds(143, 59, 67, label2.getPreferredSize().height);

            //---- textField1 ----
            textField1.setFont(new Font("sansserif", Font.PLAIN, 14));
            panel1.add(textField1);
            textField1.setBounds(43, 14, 82, textField1.getPreferredSize().height);

            //---- button1 ----
            button1.setText("OK");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(43, 108, 82, button1.getPreferredSize().height);

            //---- button2 ----
            button2.setText("Cancel");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(143, 108), button2.getPreferredSize()));

            //---- passwordField1 ----
            passwordField1.setFont(new Font("sansserif", Font.PLAIN, 14));
            panel1.add(passwordField1);
            passwordField1.setBounds(43, 53, 82, passwordField1.getPreferredSize().height);

//            { // compute preferred size
//                Dimension preferredSize = new Dimension();
//                for(int i = 0; i < panel1.getComponentCount(); i++) {
//                    Rectangle bounds = panel1.getComponent(i).getBounds();
//                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
//                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
//                }
//                Insets insets = panel1.getInsets();
//                preferredSize.width += insets.right;
//                preferredSize.height += insets.bottom;
//                panel1.setMinimumSize(preferredSize);
//                panel1.setPreferredSize(preferredSize);
//            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 250, 155);

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
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}