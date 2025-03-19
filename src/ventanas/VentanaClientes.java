package ventanas;

import java.sql.Statement;
import java.sql.ResultSet;
import java.awt.Image;
import javax.swing.JOptionPane;
import conexion.Conexion;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class VentanaClientes extends javax.swing.JFrame {
    
    public VentanaClientes() {
        initComponents();
        
        Image icon = getToolkit().getImage(getClass().getResource("/imagenes/logo_f.png"));
        setIconImage(icon);
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        mostrar("clientes");
    }
    
    private static final String[] COLUMNAS_CLIENTES = {"Id_cliente", "Nombre", "Direccion", "Teléfono"};
    
    public final void mostrar(String tabla) {
        String sql = "SELECT * FROM " + tabla;
        inicializarTabla();
        
        try (Connection con = Conexion.conectar(); Statement consulta = con.createStatement(); ResultSet resultado = consulta.executeQuery(sql)) {
            llenarTabla(resultado);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void inicializarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, COLUMNAS_CLIENTES) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla1.setModel(modelo);
        configurarTabla(tabla1);
    }
    
    private void llenarTabla(ResultSet resultado) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        
        while (resultado.next()) {
            modelo.addRow(new Object[]{
                resultado.getString("Id_cliente"),
                resultado.getString("Nombre"),
                resultado.getString("Direccion"),
                resultado.getString("Telefono")
            });
        }
    }
    
    private void configurarTabla(JTable tabla) {
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        centrarTexto(tabla);
        
        for (int f = 0; f < tabla.getColumnCount(); f++) {
            tabla.getColumnModel().getColumn(f).setResizable(false);
        }
    }
    
    private void centrarTexto(JTable tabla) {
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
        
        DefaultTableCellRenderer header = (DefaultTableCellRenderer) tabla.getTableHeader().getDefaultRenderer();
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 14));
        tabla.getTableHeader().setDefaultRenderer(header);
    }
    
    private void buscarCliente(String sql, String parametro) {
        inicializarTabla();
        
        try (Connection con = Conexion.conectar(); PreparedStatement consulta = con.prepareStatement(sql)) {
            
            consulta.setString(1, parametro);
            
            try (ResultSet res = consulta.executeQuery()) {
                if (!res.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "El cliente no existe.", "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                
                llenarTabla(res);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_logo = new javax.swing.JLabel();
        b_volver = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        jscrollpane = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        b_buscar = new javax.swing.JButton();
        l_nombrecliente = new javax.swing.JLabel();
        l_idcliente1 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        t_idcliente = new javax.swing.JTextField();
        b_borrar = new javax.swing.JButton();
        b_actualizar = new javax.swing.JButton();
        b_insertar = new javax.swing.JButton();
        l_nombremodulo = new javax.swing.JLabel();
        l_nombreapp = new javax.swing.JLabel();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_f.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 70));

        b_volver.setBackground(new java.awt.Color(200, 200, 231));
        b_volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_volver.setForeground(new java.awt.Color(102, 0, 204));
        b_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        b_volver.setText(" Volver");
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 120, 50));

        b_salir.setBackground(new java.awt.Color(200, 200, 231));
        b_salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_salir.setForeground(new java.awt.Color(102, 0, 204));
        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        b_salir.setText(" Salir");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 120, 50));

        tabla1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jscrollpane.setViewportView(tabla1);

        getContentPane().add(jscrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 1000, 330));

        b_buscar.setBackground(new java.awt.Color(200, 200, 231));
        b_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(102, 0, 153));
        b_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        b_buscar.setText("  Buscar");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 130, 70));

        l_nombrecliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_nombrecliente.setForeground(new java.awt.Color(102, 0, 153));
        l_nombrecliente.setText("Nombre:");
        getContentPane().add(l_nombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 70, 30));

        l_idcliente1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_idcliente1.setForeground(new java.awt.Color(102, 0, 153));
        l_idcliente1.setText("Id Cliente:");
        getContentPane().add(l_idcliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 70, 30));

        t_nombre.setBackground(new java.awt.Color(222, 222, 248));
        t_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_nombre.setForeground(new java.awt.Color(102, 0, 153));
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 210, 30));

        t_idcliente.setBackground(new java.awt.Color(222, 222, 248));
        t_idcliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_idcliente.setForeground(new java.awt.Color(102, 0, 153));
        t_idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idclienteActionPerformed(evt);
            }
        });
        getContentPane().add(t_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 210, 30));

        b_borrar.setBackground(new java.awt.Color(200, 200, 231));
        b_borrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_borrar.setForeground(new java.awt.Color(102, 0, 153));
        b_borrar.setText("Borrar");
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 110, 40));

        b_actualizar.setBackground(new java.awt.Color(200, 200, 231));
        b_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_actualizar.setForeground(new java.awt.Color(102, 0, 153));
        b_actualizar.setText("Actualizar");
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, 40));

        b_insertar.setBackground(new java.awt.Color(200, 200, 231));
        b_insertar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_insertar.setForeground(new java.awt.Color(102, 0, 153));
        b_insertar.setText("Nuevo cliente");
        b_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_insertarActionPerformed(evt);
            }
        });
        getContentPane().add(b_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, 40));

        l_nombremodulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_nombremodulo.setForeground(new java.awt.Color(102, 0, 153));
        l_nombremodulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_nombremodulo.setText("Módulo de Clientes");
        getContentPane().add(l_nombremodulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 1000, 70));

        l_nombreapp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_nombreapp.setText("Aplicación de Java © 2025");
        getContentPane().add(l_nombreapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, -1, -1));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_ppal.png"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1147, 619));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        dispose();
        new VentanaLogin().setVisible(true);
    }//GEN-LAST:event_b_volverActionPerformed

    private void t_idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idclienteActionPerformed

    }//GEN-LAST:event_t_idclienteActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Quiere salir de la aplicación?", "Confirmar", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        String idCliente = t_idcliente.getText().trim();
        String nombreCliente = t_nombre.getText().trim();
        
        if (idCliente.isEmpty() && nombreCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID o un nombre para buscar.", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String sql = !idCliente.isEmpty()
                ? "SELECT * FROM clientes WHERE id_cliente = ?"
                : "SELECT * FROM clientes WHERE nombre LIKE ?";
        
        String parametro = !idCliente.isEmpty() ? idCliente : "%" + nombreCliente + "%";
        buscarCliente(sql, parametro);
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_insertarActionPerformed
        new VentanaIngresarClientes().setVisible(true);
    }//GEN-LAST:event_b_insertarActionPerformed

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed
        new VentanaActualizarClientes().setVisible(true);
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
        new VentanaBorrarClientes().setVisible(true);
    }//GEN-LAST:event_b_borrarActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_insertar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_volver;
    private javax.swing.JScrollPane jscrollpane;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_idcliente1;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_nombreapp;
    private javax.swing.JLabel l_nombrecliente;
    private javax.swing.JLabel l_nombremodulo;
    private javax.swing.JTextField t_idcliente;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
