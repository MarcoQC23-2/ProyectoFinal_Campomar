package PANTALLAS;

/**
 *
 * @author mco_a
 */
public class Sistema_Gestion_Integral extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Sistema_Gestion_Integral.class.getName());

    /**
     * Creates new form Sistema_Gestion_Integral_II
     */
    public Sistema_Gestion_Integral() {
        initComponents();
        cargarDatosEnTabla(); // Carga las filas
    }
    private void cargarDatosEnTabla() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0); // Limpia la tabla

    // Lista de productos realistas de Campomar
    String[] productos = {
        "Sardina en Aceite",
        "Caballa en Agua",
        "Atún en Aceite Vegetal",
        "Sardina Picante",
        "Caballa Ahumada",
        "Atún en Agua",
        "Sardina con Tomate",
        "Caballa en Salsa",
        "Atún al Natural",
        "Sardina con Limón"
    };

    // Agrega datos realistas
    for (int i = 0; i < productos.length; i++) {
        String producto = productos[i];
        String pedido = "PED-" + String.format("%04d", 1000 + i);
        String lote = "LT-" + String.format("%03d", 200 + i);
        String calidad = (i % 2 == 0) ? "Calidad Aprobada" : "Observación Menor";

        modelo.addRow(new Object[]{producto, pedido, lote, calidad});
    }

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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Produccion = new javax.swing.JLabel();
        btn_Almacenamiento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(769, 509));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos", "Pedidos", "Lotes", "Control Calidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 590, 410));

        btn_Produccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Produccion.png"))); // NOI18N
        btn_Produccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProduccionMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        btn_Almacenamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Frame 2 (3).png"))); // NOI18N
        btn_Almacenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AlmacenamientoMousePressed(evt);
            }
        });
        jPanel1.add(btn_Almacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Frame 2 (2).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Rectangle 2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Group 11@2x.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Fondo_FrameIngresar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProduccionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ProduccionMouseClicked

    private void btn_AlmacenamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AlmacenamientoMousePressed
        Sistema_Gestion_Integral_II sistema_II = new Sistema_Gestion_Integral_II();
        sistema_II.setVisible(true);
        sistema_II.setLocationRelativeTo(null);
        dispose(); 
    }//GEN-LAST:event_btn_AlmacenamientoMousePressed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Sistema_Gestion_Integral().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Almacenamiento;
    private javax.swing.JLabel btn_Produccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
