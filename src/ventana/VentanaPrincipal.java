package ventana;

import java.awt.Image;

public class VentanaPrincipal extends javax.swing.JFrame {

public VentanaPrincipal() {
        initComponents();
        Image icon = getToolkit().getImage(getClass().getResource("/imagenes/logo_f.png"));
        setIconImage(icon);
        setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_email = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        b_volver = new javax.swing.JButton();
        b_deposito = new javax.swing.JButton();
        b_ventas = new javax.swing.JButton();
        b_productos = new javax.swing.JButton();
        b_clientes = new javax.swing.JButton();
        l_logo = new javax.swing.JLabel();
        l_nombremodulo = new javax.swing.JLabel();
        l_nombreapp = new javax.swing.JLabel();
        l_fondo = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        m_opciones = new javax.swing.JMenu();
        op_abrir = new javax.swing.JMenuItem();
        op_guardar = new javax.swing.JMenuItem();
        op_salir = new javax.swing.JMenuItem();
        m_ayuda = new javax.swing.JMenu();
        op_acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana principal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_email.setBackground(new java.awt.Color(200, 200, 231));
        b_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_email.setForeground(new java.awt.Color(102, 0, 153));
        b_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.png"))); // NOI18N
        b_email.setText("  E-mail");
        getContentPane().add(b_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 120, 50));

        b_salir.setBackground(new java.awt.Color(200, 200, 231));
        b_salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        b_salir.setForeground(new java.awt.Color(102, 0, 204));
        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        b_salir.setText(" Salir");
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 120, 50));

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
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 120, 50));

        b_deposito.setBackground(new java.awt.Color(204, 204, 204));
        b_deposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_deposito.setForeground(new java.awt.Color(102, 0, 153));
        b_deposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        b_deposito.setText(" Depósito");
        getContentPane().add(b_deposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 180, 80));

        b_ventas.setBackground(new java.awt.Color(204, 204, 204));
        b_ventas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_ventas.setForeground(new java.awt.Color(102, 0, 153));
        b_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        b_ventas.setText(" Ventas");
        getContentPane().add(b_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 180, 80));

        b_productos.setBackground(new java.awt.Color(204, 204, 204));
        b_productos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_productos.setForeground(new java.awt.Color(102, 0, 153));
        b_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        b_productos.setText(" Productos");
        getContentPane().add(b_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, 80));

        b_clientes.setBackground(new java.awt.Color(204, 204, 204));
        b_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_clientes.setForeground(new java.awt.Color(102, 0, 153));
        b_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        b_clientes.setText(" Clientes");
        getContentPane().add(b_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 180, 80));

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_f.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 70));

        l_nombremodulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_nombremodulo.setForeground(new java.awt.Color(102, 0, 153));
        l_nombremodulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_nombremodulo.setText("Módulo de administración");
        getContentPane().add(l_nombremodulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 960, 70));

        l_nombreapp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_nombreapp.setText("Aplicación de Java © 2025");
        getContentPane().add(l_nombreapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_ppal.png"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1006, 400));

        menubar.setBackground(new java.awt.Color(200, 200, 231));

        m_opciones.setBackground(new java.awt.Color(200, 200, 231));
        m_opciones.setBorder(null);
        m_opciones.setForeground(new java.awt.Color(102, 0, 153));
        m_opciones.setText(" Opciones  ");
        m_opciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        op_abrir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op_abrir.setForeground(new java.awt.Color(102, 0, 153));
        op_abrir.setText("Abrir");
        m_opciones.add(op_abrir);

        op_guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op_guardar.setForeground(new java.awt.Color(102, 0, 153));
        op_guardar.setText("Guardar");
        m_opciones.add(op_guardar);

        op_salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op_salir.setForeground(new java.awt.Color(102, 0, 153));
        op_salir.setText("Salir");
        m_opciones.add(op_salir);

        menubar.add(m_opciones);

        m_ayuda.setBackground(new java.awt.Color(200, 200, 231));
        m_ayuda.setBorder(null);
        m_ayuda.setForeground(new java.awt.Color(102, 0, 153));
        m_ayuda.setText(" Ayuda");
        m_ayuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        op_acercade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        op_acercade.setForeground(new java.awt.Color(102, 0, 153));
        op_acercade.setText("Acerca de");
        m_ayuda.add(op_acercade);

        menubar.add(m_ayuda);

        setJMenuBar(menubar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_volverActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_clientes;
    private javax.swing.JButton b_deposito;
    private javax.swing.JButton b_email;
    private javax.swing.JButton b_productos;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_ventas;
    private javax.swing.JButton b_volver;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_nombreapp;
    private javax.swing.JLabel l_nombremodulo;
    private javax.swing.JMenu m_ayuda;
    private javax.swing.JMenu m_opciones;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem op_abrir;
    private javax.swing.JMenuItem op_acercade;
    private javax.swing.JMenuItem op_guardar;
    private javax.swing.JMenuItem op_salir;
    // End of variables declaration//GEN-END:variables
}
