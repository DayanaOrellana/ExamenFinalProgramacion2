package edu.umg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField care;
    private JPasswordField contrase;
    private JButton registrar;
    private JTextField mestre;
    private JTextField ususario;
    private JTextField gamil;


    public login(){
        add(care);
        add(contrase);
        add(registrar);
        add(mestre);
        add(ususario);
        add(gamil);
        setSize(500,500);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuari = ususario.getText();
                String contraseña = contrase.getText();
                String carrera = care.getText();
                String semestre = mestre.getText();
                String gmail = gamil.getText();
                if (usuari.equals("")||contrase.equals("")||care.equals("")||mestre.equals("")||gamil.equals("")){
                    JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Registro exitoso");
                }
            }

        });
    }
    public static void main(String[]args){
        login login = new login();
    }
}


