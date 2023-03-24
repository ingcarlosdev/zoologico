
package views;

import java.util.Date;
import javax.swing.JOptionPane;
import views.VentanaFactura;
import views.VentanaMenu;
import views.VentanaPlanes;
import zoologico.DepartamentoLogistica;

public class VentanaComprarBoletas extends javax.swing.JFrame {
    Date  pFecha;
    DepartamentoLogistica deptoLogic = new DepartamentoLogistica();

    public VentanaComprarBoletas() {
        initComponents();
         setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnVerPlanes = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        pGenerotxt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        pEdadtxt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pCedulatxt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        pNombretxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnComprarPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("COMPRAR BOLETAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("PLAN 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 113, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("PLAN 2");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 174, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("PLAN 3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("PLAN 4");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("ABONO 1");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 111, -1, -1));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("ABONO 2");
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 166, -1, -1));

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("ABONO 3");
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 215, -1, -1));

        jLabel3.setText("Adultos $40000");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 103, -1, -1));

        jLabel4.setText("Niños $40000");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 193, -1, -1));

        jLabel5.setText("Adultos $60000");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 168, -1, -1));

        jLabel6.setText("Niños $20000");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 125, -1, -1));

        jLabel7.setText("Adultos $90000");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel8.setText("Niños $70000");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 261, -1, -1));

        jLabel9.setText("Adultos $120000");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel10.setText("Niños $10000");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel11.setText("Adultos $180000");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel12.setText("Niños $150000");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel13.setText("$15000000");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 113, -1, -1));

        jLabel15.setText("$50000000");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 217, -1, -1));

        jLabel17.setText("$30000000");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 168, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ELEGIR PLAN O ABONO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -10, -1, 40));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("PLAN 5");
        jPanel2.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("OBSERVAR CADA PLAN");

        btnVerPlanes.setText("VER");
        btnVerPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlanesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(btnVerPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(btnVerPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, 140));

        jLabel18.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel18.setText(" TENDRAS UN DESCUENTO DEL 15%");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 260, 30));

        jLabel19.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel19.setText("RECUERDA!! SI VISITAS NUESTRO ZOOLOGICO MAS DE  2 VECES,");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 440, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 530, 410));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("GENERO:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel4.add(pGenerotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 143, -1));

        jLabel25.setText("EDAD: ");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel4.add(pEdadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 143, -1));

        jLabel24.setText("CEDULA:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        pCedulatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCedulatxtActionPerformed(evt);
            }
        });
        jPanel4.add(pCedulatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 143, -1));

        jLabel23.setText("NOMBRE: ");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        pNombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNombretxtActionPerformed(evt);
            }
        });
        jPanel4.add(pNombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 143, -1));

        jLabel22.setText("CLIENTE");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 260, 260));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnComprarPlan.setText("COMPRAR PLAN");
        btnComprarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprarPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnComprarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
      this.setVisible(false);
     VentanaMenu menu = new VentanaMenu();
     menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void btnVerPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlanesActionPerformed

        this.setVisible(false);
        VentanaPlanes ventanaPlanes = new VentanaPlanes();
        ventanaPlanes.setVisible(true);
    }//GEN-LAST:event_btnVerPlanesActionPerformed

    private void pNombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNombretxtActionPerformed

    private void btnComprarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPlanActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Compra exitosa ¡Disfruten!");
        VentanaFactura factura = new VentanaFactura();
        this.setVisible(false);
        factura.setVisible(true);

        String pNombre, pCedula,pTipoCompra=" ";
        int pEdad;
        char pGenero;
        int pVisitas = 0;
        double pValorCompraN=0;
        double pValorCompraA=0;
        int cantidad=0;
        double total=0;
        Date pFecha = new Date();

        pNombre = pNombretxt.getText();
        pCedula = pCedulatxt.getText();
        pEdad = Integer.parseInt(pEdadtxt.getText());
        pGenero = pGenerotxt.getText().charAt(0);
        
        deptoLogic.ingresarCliente( pNombre, pCedula, pEdad, pGenero, pVisitas);
        
        for(int i=0;i<deptoLogic.ListaClientes.size();i++){
            if(deptoLogic.ListaClientes.get(i).getCedula().equals(pCedula)){
                pVisitas++;
            }
        }

        if(jRadioButton1.isSelected()){
            pTipoCompra = "Plan 1";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 20000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 40000;
                total = pValorCompraA*cantidad;
            }

        }

        if(jRadioButton2.isSelected()){
            pTipoCompra = "Plan 2";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 40000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 60000;
                total = pValorCompraA*cantidad;
            }
        }

        if(jRadioButton3.isSelected()){
            pTipoCompra = "Plan 3";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 70000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 90000;
                total = pValorCompraA*cantidad;
            }

        }

        if( jRadioButton4.isSelected()){
            pTipoCompra = "Plan 4";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 100000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 120000;
                total = pValorCompraA*cantidad;
            }

        }

        if(jRadioButton5.isSelected()){
            pTipoCompra = "Plan 5";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 150000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 180000;
                total = pValorCompraA*cantidad;
            }
        }
        if(jRadioButton6.isSelected()){
            pTipoCompra = "Abono Anual";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 15000000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 15000000;
                total = pValorCompraA*cantidad;
            }
        }
        if(jRadioButton7.isSelected()){
            pTipoCompra = "Abono Familiar";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 30000000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 30000000;
                total = pValorCompraA*cantidad;
            }
        }
        if(jRadioButton8.isSelected()){
            pTipoCompra = "Abono VIP";
            cantidad++;
            if(pEdad<12){
                pValorCompraN = 50000000;
                total = pValorCompraN*cantidad;
            } else {
                pValorCompraA = 50000000;
                total = pValorCompraA*cantidad;
            }
        }
        
        if(pVisitas > 2){
            pValorCompraA= pValorCompraA-(pValorCompraA*0.15);
            pValorCompraN=  pValorCompraN-(pValorCompraN*0.15);
            JOptionPane.showMessageDialog(null, "Felicitaciones haz obtenido un descuento del 15% por ser cliente frecuente");
        }
        deptoLogic.ingresarVentas(pTipoCompra,pValorCompraN,pValorCompraA, pFecha, cantidad, total, pNombre, pCedula, pEdad, pGenero, pVisitas);

    }//GEN-LAST:event_btnComprarPlanActionPerformed

    private void pCedulatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCedulatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCedulatxtActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaComprarBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaComprarBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaComprarBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaComprarBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaComprarBoletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarPlan;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerPlanes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JTextField pCedulatxt;
    private javax.swing.JTextField pEdadtxt;
    private javax.swing.JTextField pGenerotxt;
    private javax.swing.JTextField pNombretxt;
    // End of variables declaration//GEN-END:variables
}
