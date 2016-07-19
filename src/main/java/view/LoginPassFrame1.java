package main.java.view;

import main.java.controller.MedPersonalControllerImpl;
import main.java.exceptions.LoginException;
import main.java.model.MedPersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class LoginPassFrame1 extends JFrame {

    private MedPersonalControllerImpl controller;

    JTextField login;
    JTextField password;

    public LoginPassFrame1(MedPersonalControllerImpl controller) {
        this.controller = controller;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }


    private void button1ActionPerformed(ActionEvent e) {
        MedPersonal result;
        try {
            result = controller.logIn(login.getText(), password.getText());
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
            LoginPassFrame1.this.dispose();
        } catch (LoginException e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(LoginPassFrame1.this,
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
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        login = new JTextField();
        password = new JPasswordField();
        JButton button2 = new JButton();
        JButton button1 = new JButton();

        //======== this ========
        setTitle("identification");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("login");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(35, 30), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("pasword");
            label2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(30, 75), label2.getPreferredSize()));
            panel1.add(login);
            login.setBounds(120, 25, 87, 33);
            panel1.add(password);
            password.setBounds(120, 70, 87, 33);

            //---- button2 ----
            button2.setText("cancel");
            button2.addActionListener(this::button2ActionPerformed);
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(140, 130), button2.getPreferredSize()));

            //---- button1 ----
            button1.setText("ok");
            button1.addActionListener(this::button1ActionPerformed);
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(43, 132), button1.getPreferredSize()));
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 225, 181);

        contentPane.setPreferredSize(new Dimension(240, 180));
        pack();
        setLocationRelativeTo(getOwner());
    }
}
