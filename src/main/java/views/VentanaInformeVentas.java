/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import zoologico.DepartamentoLogistica;
import zoologico.Ventas;

/**
 *
 * @author Isabel
 */
public class VentanaInformeVentas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInformeVentas
     */
    private static String[] columnas;
    private DefaultTableModel modeloTablaVentas;
    DepartamentoLogistica deptoLogic;
    
    private Object[][] obtenerDatosTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    int filas = modelo.getRowCount();
    int columnas = modelo.getColumnCount();
    Object[][] datos = new Object[filas][columnas];
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            datos[i][j] = modelo.getValueAt(i, j);
        }
    }
    return datos;
}

    public VentanaInformeVentas() {
        initComponents();
        setLocationRelativeTo(null);
        modeloTablaVentas = new DefaultTableModel();    //crear modelo
        tabla.setModel(modeloTablaVentas);              //poner modelo a la tabla
        columnas = new String[3];                       //crear columnas
        columnas[0] = "TIPO COMPRA";
        columnas[1] = "CANTIDAD";
        columnas[2] = "TOTAL";
        modeloTablaVentas.setColumnIdentifiers(columnas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("VER INFORME DE VENTAS");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MOSTRAR INFORME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("IMPRIMIR PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        VentanaMenu menu = new VentanaMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            ArrayList<String> impresos = new ArrayList<>();
            ArrayList<Ventas> imprimir = new ArrayList<>();
            for (int i = 0; i < deptoLogic.Ventass.size(); i++) {
                if(impresos.contains(deptoLogic.Ventass.get(i).getTipoCompra())) {
                    for (int j = 0; j < imprimir.size(); j++) {
                        if (imprimir.get(j).getTipoCompra() == deptoLogic.Ventass.get(i).getTipoCompra()) {
                            imprimir.get(j).setCantidad(imprimir.get(j).getCantidad() + 1);
                            imprimir.get(j).setTotal(imprimir.get(j).getTotal() + deptoLogic.Ventass.get(i).getTotal());
                   
                        }
                    }
                }
                else {
                    imprimir.add(new Ventas(deptoLogic.Ventass.get(i).getTipoCompra(), deptoLogic.Ventass.get(i).getValorCompraN(),deptoLogic.Ventass.get(i).getValorCompraA(), deptoLogic.Ventass.get(i).getFecha(), deptoLogic.Ventass.get(i).getCantidad(), deptoLogic.Ventass.get(i).getTotal(), deptoLogic.Ventass.get(i).getNombre(), deptoLogic.Ventass.get(i).getCedula(),deptoLogic.Ventass.get(i).getEdad(),deptoLogic.Ventass.get(i).getGenero(),deptoLogic.Ventass.get(i).getVisitas()));
                    impresos.add(deptoLogic.Ventass.get(i).getTipoCompra()); 
                    imprimir.get(impresos.size()-1).setCantidad(1);
                }
            }

            for (int i = 0; i < imprimir.size(); i++) {
            Object[] info = new Object[3];
            info[0] = imprimir.get(i).getTipoCompra();
            info[1] = imprimir.get(i).getCantidad();
            info[2] = imprimir.get(i).getTotal();
            modeloTablaVentas.addRow(info);
            }
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   Document document = new Document();
        try {
         PdfWriter.getInstance(document, new FileOutputStream("/E://Desktop/InformeVentas.pdf"));

         Paragraph encabezado = new Paragraph();
         encabezado.setAlignment(Element.ALIGN_CENTER);
         document.setMargins(75, 36, 75, 36);
         Image logo = Image.getInstance("E:\\Pictures\\LogoZoo.jpg");
         logo.scaleAbsolute(80, 80);
         encabezado.add(logo);

         // Añadir información de la empresa
         Chunk nombre = new Chunk("Zoologico Camián\n", FontFactory.getFont(FontFactory.TIMES_ITALIC, 18));
         Chunk ubicacion = new Chunk("Calle 17 #123, Medellin Antioquia\n", FontFactory.getFont(FontFactory.TIMES_ITALIC, 12));
         Chunk numero = new Chunk("Teléfono: 3195548644\n", FontFactory.getFont(FontFactory.TIMES_ITALIC, 12));
         Chunk correo = new Chunk("Correo: anai.patino@udea.edu.co\n", FontFactory.getFont(FontFactory.TIMES_ITALIC, 12));
         encabezado.add(nombre);
         encabezado.add(ubicacion);
         encabezado.add(numero);
         encabezado.add(correo);

         document.open();
         document.add(encabezado);

         String texto = "\n\n\nCon el fin de brindar información actualizada y verás de las ventas del Zoológico Camián ofrecemos este informe como MPV, estaremos atentos ante cualquier novedad.\n\n\n\n";
         Paragraph paragraph = new Paragraph(texto);
         document.add(paragraph);
         
         ArrayList<String> impresos = new ArrayList<>();
            ArrayList<Ventas> imprimir = new ArrayList<>();
            for (int i = 0; i < deptoLogic.Ventass.size(); i++) {
                if(impresos.contains(deptoLogic.Ventass.get(i).getTipoCompra())) {
                    for (int j = 0; j < imprimir.size(); j++) {
                        if (imprimir.get(j).getTipoCompra() == deptoLogic.Ventass.get(i).getTipoCompra()) {
                            imprimir.get(j).setCantidad(imprimir.get(j).getCantidad() + 1);
                            imprimir.get(j).setTotal(imprimir.get(j).getTotal() + deptoLogic.Ventass.get(i).getTotal());
                   
                        }
                    }
                }
                else {
                    imprimir.add(new Ventas(deptoLogic.Ventass.get(i).getTipoCompra(), deptoLogic.Ventass.get(i).getValorCompraN(),deptoLogic.Ventass.get(i).getValorCompraA(), deptoLogic.Ventass.get(i).getFecha(), deptoLogic.Ventass.get(i).getCantidad(), deptoLogic.Ventass.get(i).getTotal(), deptoLogic.Ventass.get(i).getNombre(), deptoLogic.Ventass.get(i).getCedula(),deptoLogic.Ventass.get(i).getEdad(),deptoLogic.Ventass.get(i).getGenero(),deptoLogic.Ventass.get(i).getVisitas()));
                    impresos.add(deptoLogic.Ventass.get(i).getTipoCompra()); 
                    imprimir.get(impresos.size()-1).setCantidad(1);
                }
            }

         PdfPTable tabla = new PdfPTable(3);
         tabla.setWidthPercentage(100);
         PdfPCell tipoCompra = new PdfPCell(new Phrase("TIPO COMPRA"));
         PdfPCell cantidad = new PdfPCell(new Phrase("CANTIDAD"));
         PdfPCell total = new PdfPCell(new Phrase("TOTAL"));
         tabla.addCell(tipoCompra);
         tabla.addCell(cantidad);
         tabla.addCell(total);
         
         for(int i = 0; i < imprimir.size(); i++){
             tabla.addCell(imprimir.get(i).getTipoCompra());
             tabla.addCell(String.valueOf(imprimir.get(i).getCantidad()));
             tabla.addCell(String.valueOf(imprimir.get(i).getTotal()));
         }
         document.add(tabla);
         
        Paragraph piePagina = new Paragraph();
        Chunk infoZOODI = new Chunk("\n\n\n\n\n\n\n\n\nZOODI Administración internacional de zoológicos\n", FontFactory.getFont(FontFactory.TIMES_ITALIC, 12));
        piePagina.add(infoZOODI);
        piePagina.add(ubicacion);
        piePagina.add(numero);
        piePagina.add(correo);
        piePagina.setAlignment(Element.ALIGN_CENTER);
        document.add(piePagina);
        
             } catch (DocumentException e) {
                 e.printStackTrace();
             } catch (Exception e) {
                 e.printStackTrace();
             } finally {
                 document.close();
             }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInformeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInformeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInformeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInformeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInformeVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
