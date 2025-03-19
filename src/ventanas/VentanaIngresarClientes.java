package ventanas;

import java.sql.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VentanaIngresarClientes extends javax.swing.JFrame {

    public VentanaIngresarClientes() {
        initComponents();
        Image icon = getToolkit().getImage(getClass().getResource("/imagenes/logo_f.png"));
        setIconImage(icon);

        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_nombreapp = new javax.swing.JLabel();
        l_titulo = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        t_tel = new javax.swing.JTextField();
        t_direccion = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_ingresar = new javax.swing.JButton();
        l_telefono = new javax.swing.JLabel();
        l_nombre = new javax.swing.JLabel();
        l_direccion = new javax.swing.JLabel();
        l_fondoingresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar un cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_nombreapp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_nombreapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_nombreapp.setText("Aplicación de Java © 2025");
        getContentPane().add(l_nombreapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 20));

        l_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(102, 0, 153));
        l_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_titulo.setText("Registrar un cliente nuevo");
        getContentPane().add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 60));

        t_nombre.setBackground(new java.awt.Color(222, 222, 248));
        t_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_nombre.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 260, 30));

        t_tel.setBackground(new java.awt.Color(222, 222, 248));
        t_tel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_tel.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 260, 30));

        t_direccion.setBackground(new java.awt.Color(222, 222, 248));
        t_direccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_direccion.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 260, 30));

        b_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_cancelar.setText("Cancelar");
        b_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 30));

        b_ingresar.setBackground(new java.awt.Color(200, 200, 231));
        b_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_ingresar.setText("Ingresar");
        b_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(b_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 100, 30));

        l_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_telefono.setForeground(new java.awt.Color(102, 0, 153));
        l_telefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_telefono.setText("Teléfono:");
        getContentPane().add(l_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 70, 30));

        l_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_nombre.setForeground(new java.awt.Color(102, 0, 153));
        l_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_nombre.setText("Nombre:");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, 30));

        l_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_direccion.setForeground(new java.awt.Color(102, 0, 153));
        l_direccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_direccion.setText("Dirección:");
        getContentPane().add(l_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 70, 30));

        l_fondoingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(l_fondoingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ingresarActionPerformed
        String nombre = t_nombre.getText().trim();
        String direccion = t_direccion.getText().trim();
        String telefono = t_tel.getText().trim();

        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
            mostrarMensaje("Se deben llenar todos los campos.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        String sql = "INSERT INTO clientes (nombre, direccion, telefono) VALUES (?, ?, ?)";

        try (Connection con = Conexion.conectar(); PreparedStatement insertar = con.prepareStatement(sql)) {

            insertar.setString(1, nombre);
            insertar.setString(2, direccion);
            insertar.setString(3, telefono);

            int res = insertar.executeUpdate();

            if (res > 0) {
                mostrarMensaje("Cliente ingresado con éxito.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }
        } catch (SQLException e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_ingresarActionPerformed

    private void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }

    private void limpiarCampos() {
        t_nombre.setText("");
        t_direccion.setText("");
        t_tel.setText("");
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        dispose();
        new VentanaClientes().setVisible(true);
    }//GEN-LAST:event_b_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaIngresarClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_ingresar;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_fondoingresar;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_nombreapp;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_tel;
    // End of variables declaration//GEN-END:variables
}
