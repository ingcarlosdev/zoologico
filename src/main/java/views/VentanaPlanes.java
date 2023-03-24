
package views;

import zoologico.Abono;
import zoologico.Plan;


public class VentanaPlanes extends javax.swing.JFrame {


    public VentanaPlanes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        plan1 = new javax.swing.JButton();
        plan2 = new javax.swing.JButton();
        plan3 = new javax.swing.JButton();
        plan4 = new javax.swing.JButton();
        plan5 = new javax.swing.JButton();
        abonoAnual = new javax.swing.JButton();
        abonoFamiliar = new javax.swing.JButton();
        abonoVIP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PLANES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 25, -1, -1));

        jLabel2.setText("ABONOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 178, 42));

        plan1.setText("PLAN 1");
        plan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan1ActionPerformed(evt);
            }
        });
        jPanel1.add(plan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 252, 58));

        plan2.setText("PLAN 2");
        plan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan2ActionPerformed(evt);
            }
        });
        jPanel1.add(plan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 252, 58));

        plan3.setText("PLAN 3");
        plan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan3ActionPerformed(evt);
            }
        });
        jPanel1.add(plan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 252, 59));

        plan4.setText("PLAN 4");
        plan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan4ActionPerformed(evt);
            }
        });
        jPanel1.add(plan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 252, 61));

        plan5.setText("PLAN 5");
        plan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan5ActionPerformed(evt);
            }
        });
        jPanel1.add(plan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 252, 60));

        abonoAnual.setText("ABONO ANUAL");
        abonoAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonoAnualActionPerformed(evt);
            }
        });
        jPanel1.add(abonoAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 252, 58));

        abonoFamiliar.setText("ABONO FAMILIAR");
        abonoFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonoFamiliarActionPerformed(evt);
            }
        });
        jPanel1.add(abonoFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 252, 58));

        abonoVIP.setText("ABONO VIP");
        abonoVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonoVIPActionPerformed(evt);
            }
        });
        jPanel1.add(abonoVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 252, 58));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        VentanaMenu menu = new VentanaMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void plan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan1ActionPerformed
        double pPrecioA = 40000;
        double pPrecioN = 20000;
        String pRecorrido = "-Animales Domestico\n-Animales Granja\n-Show basico\n-Realidad virtual";
        String pComida = "";
        Plan plan = new Plan(pPrecioA, pPrecioN, pRecorrido, pComida);
        plan.mostrarPlan(pPrecioA, pPrecioN, pRecorrido, pComida);
        
        
    }//GEN-LAST:event_plan1ActionPerformed

    private void plan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan2ActionPerformed
        double pPrecioA = 60000;
        double pPrecioN = 40000;
        String pRecorrido = "-Animales Salvajes\n-Animales Granja\n-Show basico\n-Realidad virtual experiencia jurasica";
        String pComida = "";
        Plan plan = new Plan(pPrecioA, pPrecioN, pRecorrido, pComida);
        plan.mostrarPlan(pPrecioA, pPrecioN, pRecorrido, pComida);
    }//GEN-LAST:event_plan2ActionPerformed

    private void plan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan3ActionPerformed
        double pPrecioA = 90000;
        double pPrecioN = 70000;
        String pRecorrido = "-Animales Domesticos\n-Animales Salvajes\n-Animales Granja\n-Acuario\n-Show especial\n-Realidad virtual experiencia inmersiva";
        String pComida = "";
        Plan plan = new Plan(pPrecioA, pPrecioN, pRecorrido, pComida);
        plan.mostrarPlan(pPrecioA, pPrecioN, pRecorrido, pComida);
    }//GEN-LAST:event_plan3ActionPerformed

    private void plan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan4ActionPerformed
        double pPrecioA = 120000;
        double pPrecioN = 100000;
        String pRecorrido = "Recogida y regreso al hotel\n-Animales Domesticos\n-Animales Salvajes\n-Animales Granja\n-Acuario\n-Show especial\n-Interaccion supervisada con Animales\n-Realidad virtual experiencia inmersiva";
        String pComida = "Refrigerio";
        Plan plan = new Plan(pPrecioA, pPrecioN, pRecorrido, pComida);
        plan.mostrarPlan(pPrecioA, pPrecioN, pRecorrido, pComida);
    }//GEN-LAST:event_plan4ActionPerformed

    private void plan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan5ActionPerformed
        double pPrecioA = 180000;
        double pPrecioN = 150000;
        String pRecorrido = "Recogida y regreso al hotel\n-Animales Domesticos\n-Animales Salvajes\n-Animales Granja\n-Acuario\n-Show especial\n-Interaccion supervisada con Animales\n-Guía profesional (Bilungue)\n-Realidad virtual experiencia inmersiva";
        String pComida = "Almuerzo";
        Plan plan = new Plan(pPrecioA, pPrecioN, pRecorrido, pComida);
        plan.mostrarPlan(pPrecioA, pPrecioN, pRecorrido, pComida);
        
    }//GEN-LAST:event_plan5ActionPerformed

    private void abonoAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonoAnualActionPerformed
        double pPrecio = 15000000;
        String pBeneficio = "Permitir el acceso ilimitado al zoologico durante un año completo \ncon la posibilidad de entrar a un invitado de forma gratiuta en cada visita\n";
        Abono abono = new Abono(pPrecio,pBeneficio);
        abono.mostrarAbono(pPrecio, pBeneficio);
    }//GEN-LAST:event_abonoAnualActionPerformed

    private void abonoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonoFamiliarActionPerformed
        double pPrecio = 30000000;
        String pBeneficio = "Permitir el acceso ilimitado al zoológico durante un año completo \npara una familia de un máximo de cuatro personas, con la posibilidad de traer a un invitado de forma gratuita en cada visita. \nTambién podría incluir descuentos en la tienda de regalos y en la cafetería.";
        Abono abono = new Abono(pPrecio,pBeneficio);
        abono.mostrarAbono(pPrecio, pBeneficio);

    }//GEN-LAST:event_abonoFamiliarActionPerformed

    private void abonoVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonoVIPActionPerformed
        double pPrecio = 50000000;
        String pBeneficio = "Obtener acceso ilimitado al zoológico durante un año completo \n con la posibilidad de traer a un invitado de forma gratuita en cada visita. \n También incluiría acceso a eventos exclusivos, como cenas con los cuidadores de los animales o visitas guiadas privadas.";
        Abono abono = new Abono(pPrecio,pBeneficio);
        abono.mostrarAbono(pPrecio, pBeneficio);

    }//GEN-LAST:event_abonoVIPActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPlanes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abonoAnual;
    private javax.swing.JButton abonoFamiliar;
    private javax.swing.JButton abonoVIP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton plan1;
    private javax.swing.JButton plan2;
    private javax.swing.JButton plan3;
    private javax.swing.JButton plan4;
    private javax.swing.JButton plan5;
    // End of variables declaration//GEN-END:variables
}
