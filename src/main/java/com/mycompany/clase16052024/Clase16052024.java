
package com.mycompany.clase16052024;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clase16052024 extends JFrame {
    public Clase16052024() {
        setTitle("Ventana Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton boton = new JButton("423032132");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaDatos();
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(boton);
        add(panel);
        
        setVisible(true);
    }
    
    private void mostrarVentanaDatos() {
        JFrame ventanaDatos = new JFrame("423032132");
        ventanaDatos.setSize(300, 200);
        
        JLabel labelNombre = new JLabel("Nombre: Sergio Armando Calzada LOzada");
        JLabel labelEdad = new JLabel("Edad: 20 años");
        JLabel labelCuenta = new JLabel("No de cuenta:423032132");
        JLabel labelNacimiento = new JLabel("Fecha de nacimiento: 8 de septiembre de 2003");
        JLabel labelDireccion = new JLabel("Direccion:Cerrda Guerrero s/n");
        
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel.add(labelNombre);
        panel.add(labelEdad);
        panel.add(labelCuenta);
        panel.add(labelNacimiento);
        panel.add(labelDireccion);
        
        ventanaDatos.add(panel);
        ventanaDatos.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Clase16052024();
            }
        });
    }
}
