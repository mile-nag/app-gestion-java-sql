
package ventana;
import java.awt.Image;
import java.awt.Toolkit;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
        Image icon = getToolkit().getImage(getClass().getResource("/imagenes/icon.png"));
        setIconImage(icon);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_acceder = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campo_pass = new javax.swing.JPasswordField();
        campo_usuario = new javax.swing.JTextField();
        l_pass = new javax.swing.JLabel();
        l_usuario = new javax.swing.JLabel();
        l_logo = new javax.swing.JLabel();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_acceder.setBackground(new java.awt.Color(153, 153, 255));
        b_acceder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_acceder.setText("Acceder");
        b_acceder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 153)));
        b_acceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(b_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 100, 40));

        b_salir.setBackground(new java.awt.Color(153, 153, 255));
        b_salir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_salir.setText("Salir");
        b_salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 153)));
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 100, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Aplicación de Java © 2025");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 220, 20));

        campo_pass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_pass.setForeground(new java.awt.Color(102, 0, 153));
        campo_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 153)));
        campo_pass.setSelectionColor(new java.awt.Color(204, 204, 255));
        campo_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_passActionPerformed(evt);
            }
        });
        getContentPane().add(campo_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 220, 30));

        campo_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_usuario.setForeground(new java.awt.Color(51, 0, 153));
        campo_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 153)));
        campo_usuario.setSelectionColor(new java.awt.Color(204, 204, 255));
        getContentPane().add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 220, 30));

        l_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_pass.setText("Contraseña:");
        getContentPane().add(l_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 220, -1));

        l_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_usuario.setText("Nombre de usuario:");
        getContentPane().add(l_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 220, -1));

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_1.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 130));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 401, 588));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_passActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_salirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_acceder;
    private javax.swing.JButton b_salir;
    private javax.swing.JPasswordField campo_pass;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_pass;
    private javax.swing.JLabel l_usuario;
    // End of variables declaration//GEN-END:variables
}
