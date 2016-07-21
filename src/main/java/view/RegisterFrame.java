/*
 * Created by JFormDesigner on Wed Jul 20 19:34:15 EEST 2016
 */

package main.java.view;

import main.java.db.LaboratoryDB;
import main.java.exceptions.RegisterException;
import main.java.model.MedPersonal;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Alex Alex
 */
public class RegisterFrame extends JFrame {

    MedPersonal medPersonal = new MedPersonal();
    public RegisterFrame() {
        initComponents();
    }


    public void createMedPersonal() {

        medPersonal.setName(textField1.getText());
        medPersonal.setSurname(textField2.getText());
        medPersonal.setDateOfBirth(LocalDate.of(0, 1, 1));
        medPersonal.setPhoneNumber(textField6.getText());
        medPersonal.setEmail(textField7.getText());
        medPersonal.setLogin(textField8.getText());
        medPersonal.setPass(textField9.getText());
    }

    private void button1ActionPerformed(ActionEvent e)  {

        LaboratoryDB db = new LaboratoryDB();
        createMedPersonal();
        try {
            db.saveMedPerson(medPersonal.getName(), medPersonal.getSurname(), medPersonal.getDateOfBirth(), medPersonal.getPhoneNumber(),
                    medPersonal.getEmail(), medPersonal.getLogin(), medPersonal.getPass(), medPersonal.getPosition());
        } catch (RegisterException e1) {
            e1.printStackTrace();
        }
        if(medPersonal.getEmail().equals(textField7.getText()));
        JOptionPane.showMessageDialog(rootPane, "Save OK");
        System.out.println(db.getMedPersonalsByLogin());
        // TODO add your code here
    }

    private void comboBox1ItemStateChanged(ItemEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alex Alex
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        label6 = new JLabel();
        textField6 = new JTextField();
        label7 = new JLabel();
        textField7 = new JTextField();
        label8 = new JLabel();
        comboBox1 = new JComboBox<>();
        label2 = new JLabel();
        textField8 = new JTextField();
        textField9 = new JTextField();
        label9 = new JLabel();
        label10 = new JLabel();
        panel3 = new JPanel();
        button1 = new JButton();

        //======== this ========
        setTitle("RegisterFrame");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 1),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(null);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- label1 ----
                label1.setText("name");
                label1.setFont(new Font("sansserif", Font.PLAIN, 14));
                label1.setLabelFor(textField1);
                panel2.add(label1);
                label1.setBounds(215, 26, 92, label1.getPreferredSize().height);

                //---- textField1 ----
                textField1.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField1);
                textField1.setBounds(49, 20, 119, textField1.getPreferredSize().height);

                //---- textField2 ----
                textField2.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField2);
                textField2.setBounds(49, 57, 119, textField2.getPreferredSize().height);

                //---- label3 ----
                label3.setText("birthday");
                label3.setFont(new Font("sansserif", Font.PLAIN, 14));
                label3.setLabelFor(textField3);
                panel2.add(label3);
                label3.setBounds(215, 100, 92, label3.getPreferredSize().height);

                //---- textField3 ----
                textField3.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField3);
                textField3.setBounds(49, 94, 119, textField3.getPreferredSize().height);

                //---- label4 ----
                label4.setText("month of birth");
                label4.setFont(new Font("sansserif", Font.PLAIN, 14));
                label4.setLabelFor(textField4);
                panel2.add(label4);
                label4.setBounds(215, 137, 92, label4.getPreferredSize().height);

                //---- textField4 ----
                textField4.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField4);
                textField4.setBounds(49, 131, 119, textField4.getPreferredSize().height);

                //---- label5 ----
                label5.setText("year of birth");
                label5.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(label5);
                label5.setBounds(215, 174, 92, label5.getPreferredSize().height);

                //---- textField5 ----
                textField5.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField5);
                textField5.setBounds(49, 168, 119, textField5.getPreferredSize().height);

                //---- label6 ----
                label6.setText("number phone");
                label6.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(label6);
                label6.setBounds(new Rectangle(new Point(215, 211), label6.getPreferredSize()));

                //---- textField6 ----
                textField6.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField6);
                textField6.setBounds(49, 205, 119, textField6.getPreferredSize().height);

                //---- label7 ----
                label7.setText("email");
                label7.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(label7);
                label7.setBounds(215, 248, 92, label7.getPreferredSize().height);

                //---- textField7 ----
                textField7.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(textField7);
                textField7.setBounds(49, 242, 119, textField7.getPreferredSize().height);

                //---- label8 ----
                label8.setText("position");
                label8.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(label8);
                label8.setBounds(215, 364, 92, label8.getPreferredSize().height);

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Head",
                    "Doctor",
                    "Assistant",
                    "Patient"
                }));
                comboBox1.setFont(new Font("sansserif", Font.PLAIN, 14));
                comboBox1.setAutoscrolls(true);
                comboBox1.setDoubleBuffered(true);
                comboBox1.setMaximumRowCount(2);
                comboBox1.addItemListener(e -> comboBox1ItemStateChanged(e));
                panel2.add(comboBox1);
                comboBox1.setBounds(49, 359, 119, comboBox1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("surname");
                label2.setFont(new Font("sansserif", Font.PLAIN, 14));
                label2.setLabelFor(textField2);
                panel2.add(label2);
                label2.setBounds(215, 63, 92, label2.getPreferredSize().height);
                panel2.add(textField8);
                textField8.setBounds(49, 279, 119, textField8.getPreferredSize().height);
                panel2.add(textField9);
                textField9.setBounds(49, 319, 119, textField9.getPreferredSize().height);

                //---- label9 ----
                label9.setText("login");
                label9.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(label9);
                label9.setBounds(215, 283, 78, label9.getPreferredSize().height);

                //---- label10 ----
                label10.setText("password");
                label10.setFont(new Font("sansserif", Font.PLAIN, 14));
                panel2.add(label10);
                label10.setBounds(215, 323, 78, label10.getPreferredSize().height);

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
            panel2.setBounds(0, 0, 350, 395);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //---- button1 ----
                button1.setText("OK");
                button1.addActionListener(this::button1ActionPerformed);
                panel3.add(button1);
                button1.setBounds(new Rectangle(new Point(270, 5), button1.getPreferredSize()));

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
            panel3.setBounds(0, 405, 350, 40);

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
        panel1.setBounds(0, 0, 350, 470);

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
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label7;
    private JTextField textField7;
    private JLabel label8;
    private JComboBox<String> comboBox1;
    private JLabel label2;
    private JTextField textField8;
    private JTextField textField9;
    private JLabel label9;
    private JLabel label10;
    private JPanel panel3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void start() {
        EventQueue.invokeLater(() -> {
            try {
                RegisterFrame frame = new RegisterFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
