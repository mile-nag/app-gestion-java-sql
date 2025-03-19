package ventanas;

import java.sql.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VentanaActualizarClientes extends javax.swing.JFrame {

    public VentanaActualizarClientes() {
        initComponents();
        Image icon = getToolkit().getImage(getClass().getResource("/imagenes/logo_f.png"));
        setIconImage(icon);

        setLocationRelativeTo(null);
        setResizable(false);
    }

    private Connection con = Conexion.conectar();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_titulo = new javax.swing.JLabel();
        t_tel = new javax.swing.JTextField();
        t_nombre = new javax.swing.JTextField();
        t_id = new javax.swing.JTextField();
        t_direccion = new javax.swing.JTextField();
        l_nombreapp = new javax.swing.JLabel();
        b_buscar = new javax.swing.JButton();
        l_idCliente = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        b_actualizar = new javax.swing.JButton();
        l_telefono = new javax.swing.JLabel();
        l_nombre = new javax.swing.JLabel();
        l_direccion = new javax.swing.JLabel();
        l_fondoingresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(102, 0, 153));
        l_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_titulo.setText("Actualizar cliente");
        getContentPane().add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 60));

        t_tel.setBackground(new java.awt.Color(222, 222, 248));
        t_tel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_tel.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 260, 30));

        t_nombre.setBackground(new java.awt.Color(222, 222, 248));
        t_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_nombre.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 260, 30));

        t_id.setBackground(new java.awt.Color(200, 200, 231));
        t_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_id.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 30));

        t_direccion.setBackground(new java.awt.Color(222, 222, 248));
        t_direccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_direccion.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 260, 30));

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
        l_idCliente.setText("Id:");
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
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 30));

        b_actualizar.setBackground(new java.awt.Color(200, 200, 231));
        b_actualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_actualizar.setText("Actualizar");
        b_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 100, 30));

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

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed

        String idCliente = t_id.getText().trim();
        String nombre = t_nombre.getText().trim();
        String direccion = t_direccion.getText().trim();
        String telefono = t_tel.getText().trim();

        if (idCliente.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
            mostrarMensaje("Todos los campos tienen que estar completos.", "Alerta", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String verificarCliente = "SELECT EXISTS(SELECT 1 FROM clientes WHERE id_cliente = ?)";
        String actualizar = "UPDATE clientes SET nombre = ?, direccion = ?, telefono = ? WHERE id_cliente = ?";

        try (Connection con = Conexion.conectar(); PreparedStatement verificar = con.prepareStatement(verificarCliente); PreparedStatement pActualizar = con.prepareStatement(actualizar)) {

            verificar.setInt(1, Integer.parseInt(idCliente));
            try (ResultSet res = verificar.executeQuery()) {
                if (res.next() && res.getBoolean(1)) {

                    pActualizar.setString(1, nombre);
                    pActualizar.setString(2, direccion);
                    pActualizar.setString(3, telefono);
                    pActualizar.setInt(4, Integer.parseInt(idCliente));

                    int respuesta = pActualizar.executeUpdate();
                    if (respuesta > 0) {
                        mostrarMensaje("Cliente actualizado con éxito.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos();
                    } else {
                        mostrarMensaje("Error al intentar actualizar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    mostrarMensaje("El cliente no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            mostrarMensaje("Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            mostrarMensaje("El ID del cliente debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }

    private void limpiarCampos() {
        t_id.setText("");
        t_nombre.setText("");
        t_direccion.setText("");
        t_tel.setText("");
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        dispose();
        new VentanaClientes().setVisible(true);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        String idCliente = t_id.getText().trim();

        if (idCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un id para buscar un cliente.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

        String sql = "SELECT nombre, direccion, telefono FROM clientes WHERE id_cliente = ?";

        try {
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setInt(1, Integer.parseInt(idCliente));
            ResultSet res = consulta.executeQuery();

            if (res.next()) {
                t_nombre.setText(res.getString("nombre"));
                t_direccion.setText(res.getString("direccion"));
                t_tel.setText(res.getString("telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b_buscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaActualizarClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_fondoingresar;
    private javax.swing.JLabel l_idCliente;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_nombreapp;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_tel;
    // End of variables declaration//GEN-END:variables
}
