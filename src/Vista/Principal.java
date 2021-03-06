
package Vista;

/**
 *
 * @author bels
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuVentas = new javax.swing.JMenu();
        jMenuItemVentas_P = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\"SISTEMA REFACCIONARIA\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto.png"))); // NOI18N
        jMenu6.setText("Producto");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu6MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprasNegro.png"))); // NOI18N
        jMenu3.setText("Proveedor");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenuVentas.setBackground(new java.awt.Color(0, 0, 0));
        jMenuVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventanegro.png"))); // NOI18N
        jMenuVentas.setText("Ventas");
        jMenuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuVentasMousePressed(evt);
            }
        });

        jMenuItemVentas_P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONO.png"))); // NOI18N
        jMenuItemVentas_P.setText("Ventas_Productos");
        jMenuItemVentas_P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemVentas_PMousePressed(evt);
            }
        });
        jMenuVentas.add(jMenuItemVentas_P);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Servicio.png"))); // NOI18N
        jMenuItem6.setText("Servicio_Mec??nico");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuVentas.add(jMenuItem6);

        jMenuBar1.add(jMenuVentas);

        jMenu1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarionegro.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado.png"))); // NOI18N
        jMenu5.setText("Empleado");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });
        jMenu5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu5KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\bels\\OneDrive\\Documentos\\NetBeansProjects\\SISTEMA DE VENTAS CODIGO JAVA NETBEANS 14092017\\SistemaDeVentas\\src\\ImanegesMenuBar\\CErrar2.png")); // NOI18N
        jMenu2.setText("Cerrar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
         Cliente A=new Cliente();// Se crea la instancia del formulario productos
       A.setVisible(true); // se manda a ser visible el formulario
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
    
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
       Proveedor A=new Proveedor();// Se crea la instancia del formulario productos
       A.setVisible(true); // se manda a ser visible el formulario
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenuVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVentasMousePressed
    
    }//GEN-LAST:event_jMenuVentasMousePressed

    private void jMenu5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu5KeyPressed
       
    }//GEN-LAST:event_jMenu5KeyPressed

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        Usuario A=new Usuario();
       A.setVisible(true);
    }//GEN-LAST:event_jMenu5MousePressed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           Servicio_Mecanico A=new Servicio_Mecanico();
       A.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MousePressed
        Producto A=new Producto();// Se crea la instancia del formulario productos
        A.setVisible(true); // se manda a ser visible el formulario
    }//GEN-LAST:event_jMenu6MousePressed

    private void jMenuItemVentas_PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemVentas_PMousePressed
         Ventass A=new Ventass();// Se crea la instancia del formulario productos
       A.setVisible(true); // se manda a ser visible el formulario
    }//GEN-LAST:event_jMenuItemVentas_PMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemVentas_P;
    private javax.swing.JMenu jMenuVentas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
