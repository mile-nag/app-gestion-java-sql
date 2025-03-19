package ventanas;

import java.sql.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaBorrarClientes extends javax.swing.JFrame {

    public VentanaBorrarClientes() {
        initComponents();
        Image icon = getToolkit().getImage(getClass().getResource("/imagenes/logo_f.png"));
        setIconImage(icon);

        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_titulo = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        l_nombreapp = new javax.swing.JLabel();
        b_buscar = new javax.swing.JButton();
        l_idCliente = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        b_borrar = new javax.swing.JButton();
        l_telCliente = new javax.swing.JLabel();
        l_telefono = new javax.swing.JLabel();
        l_direccionCliente = new javax.swing.JLabel();
        l_nombre = new javax.swing.JLabel();
        l_direccion = new javax.swing.JLabel();
        l_nombreCliente = new javax.swing.JLabel();
        l_fondoingresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Borrar clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(102, 0, 153));
        l_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_titulo.setText("Borrar cliente");
        getContentPane().add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 60));

        t_id.setBackground(new java.awt.Color(200, 200, 231));
        t_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_id.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 30));

        l_nombreapp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_nombreapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_nombreapp.setText("Aplicación de Java © 2025");
        getContentPane().add(l_nombreapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 20));

        b_buscar.setBackground(new java.awt.Color(200, 200, 231));
        b_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_buscar.setText("Buscar");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, 30));

        l_idCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_idCliente.setForeground(new java.awt.Color(102, 0, 153));
        l_idCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_idCliente.setText("Id: ");
        getContentPane().add(l_idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 70, 30));

        b_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_cancelar.setText("Cancelar");
        b_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 100, 30));

        b_borrar.setBackground(new java.awt.Color(200, 200, 231));
        b_borrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_borrar.setText("Borrar");
        b_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 100, 30));

        l_telCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_telCliente.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(l_telCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 260, 30));

        l_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_telefono.setForeground(new java.awt.Color(102, 0, 153));
        l_telefono.setText("Teléfono:");
        getContentPane().add(l_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 70, 30));

        l_direccionCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_direccionCliente.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(l_direccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 260, 30));

        l_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_nombre.setForeground(new java.awt.Color(102, 0, 153));
        l_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_nombre.setText("Nombre: ");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, 30));

        l_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_direccion.setForeground(new java.awt.Color(102, 0, 153));
        l_direccion.setText("Dirección:");
        getContentPane().add(l_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 70, 30));

        l_nombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_nombreCliente.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(l_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 260, 30));

        l_fondoingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(l_fondoingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Connection con = Conexion.conectar();

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
        String idCliente = t_id.getText().trim();

        if (idCliente.isEmpty() || !esEntero(t_id)) {
            mostrarMensaje("Debe buscar el ID del cliente a borrar.", "Alerta", JOptionPane.WARNING_MESSAGE);
            t_id.setText("");
            return;
        }

        String sql = "DELETE FROM clientes WHERE id_cliente = ?";

        try (PreparedStatement ejecucion = con.prepareStatement(sql)) {
            ejecucion.setInt(1, Integer.parseInt(idCliente));
            int fila = ejecucion.executeUpdate();

            if (fila > 0) {
                mostrarMensaje("Cliente eliminado con éxito.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                mostrarMensaje("No se encontró el cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_borrarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        dispose();
        new VentanaClientes().setVisible(true);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        String idCliente = t_id.getText().trim();

        if (idCliente.isEmpty()) {
            mostrarMensaje("El campo no puede estar vacío.", "Alerta", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!esEntero(t_id)) {
            mostrarMensaje("Debe colocar un valor válido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            t_id.setText("");
            return;
        }

        String sql = "SELECT nombre, direccion, telefono FROM clientes WHERE id_cliente = ?";

        try (PreparedStatement consulta = con.prepareStatement(sql)) {
            consulta.setString(1, idCliente);

            try (ResultSet res = consulta.executeQuery()) {
                if (res.next()) {
                    l_nombreCliente.setText(res.getString("nombre"));
                    l_direccionCliente.setText(res.getString("direccion"));
                    l_telCliente.setText(res.getString("telefono"));
                } else {
                    mostrarMensaje("Cliente no encontrado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_buscarActionPerformed

    private void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }

    public static boolean esEntero(JTextField textField) {
        String texto = textField.getText().trim();
        return texto.matches("-?\\d+");
    }

    private void limpiarCampos() {
        t_id.setText("");
        l_nombreCliente.setText("");
        l_direccionCliente.setText("");
        l_telCliente.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaBorrarClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_direccionCliente;
    private javax.swing.JLabel l_fondoingresar;
    private javax.swing.JLabel l_idCliente;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_nombreCliente;
    private javax.swing.JLabel l_nombreapp;
    private javax.swing.JLabel l_telCliente;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_id;
    // End of variables declaration//GEN-END:variables
}
