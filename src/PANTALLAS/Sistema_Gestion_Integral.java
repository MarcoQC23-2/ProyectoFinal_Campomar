/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PANTALLAS;


/**
 *
 * @author USUARIO
 */
public class Sistema_Gestion_Integral extends javax.swing.JFrame {

    
    public Sistema_Gestion_Integral()
    {
     
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        Color_fondo = new javax.swing.JPanel();
        imagen1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bbtn_Dashboard = new javax.swing.JButton();
        bttn_Produccion = new javax.swing.JButton();
        bttn_Almacenamiento = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Color_fondo.setBackground(new java.awt.Color(0, 36, 120));
        Color_fondo.setForeground(new java.awt.Color(255, 255, 255));

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/campomar-logo.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("ALMACENAMIENTO");

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setText("PRODUCCION");

        bbtn_Dashboard.setBackground(new java.awt.Color(255, 204, 0));
        bbtn_Dashboard.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bbtn_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bbtn_Dashboard)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        bttn_Produccion.setText("PRODUCCION");
        bttn_Produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_ProduccionActionPerformed(evt);
            }
        });

        bttn_Almacenamiento.setText("ALMACENAMIENTO");
        bttn_Almacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_AlmacenamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Color_fondoLayout = new javax.swing.GroupLayout(Color_fondo);
        Color_fondo.setLayout(Color_fondoLayout);
        Color_fondoLayout.setHorizontalGroup(
            Color_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Color_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Color_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Color_fondoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(bttn_Produccion)
                        .addGap(70, 70, 70)
                        .addComponent(bttn_Almacenamiento))
                    .addComponent(imagen1))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        Color_fondoLayout.setVerticalGroup(
            Color_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Color_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Color_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Color_fondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Color_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttn_Produccion)
                            .addComponent(bttn_Almacenamiento))
                        .addGap(179, 179, 179)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Color_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Color_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_ProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_ProduccionActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_bttn_ProduccionActionPerformed

    private void bttn_AlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_AlmacenamientoActionPerformed
        // TODO add your handling code here:
      

    }//GEN-LAST:event_bttn_AlmacenamientoActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema_Gestion_Integral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema_Gestion_Integral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema_Gestion_Integral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema_Gestion_Integral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema_Gestion_Integral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Color_fondo;
    private javax.swing.JButton bbtn_Dashboard;
    private javax.swing.JButton bttn_Almacenamiento;
    private javax.swing.JButton bttn_Produccion;
    private javax.swing.JLabel imagen1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

