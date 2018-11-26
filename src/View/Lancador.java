/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAOLancador;
import Model.ClienteTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import util.MeuRenderer;

/**
 *
 * @author jairjunior
 */
public class Lancador extends javax.swing.JFrame {

    private ClienteTableModel tableModel;

    /**
     * Creates new form Lancador
     */
    public Lancador() {
        initComponents();
        escondeElementosDelivery();
        //ocultaColunasTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comandabtn = new javax.swing.JButton();
        caixabtn = new javax.swing.JButton();
        sangriabtn = new javax.swing.JButton();
        turnobtn = new javax.swing.JButton();
        deliverybtn = new javax.swing.JButton();
        balcaobtn = new javax.swing.JButton();
        sairbtn = new javax.swing.JButton();
        deliverypanel = new javax.swing.JPanel();
        numerolbl = new javax.swing.JLabel();
        numerotxt = new javax.swing.JTextField();
        nomelbl = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteslst = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 760));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setPreferredSize(new java.awt.Dimension(1366, 760));

        comandabtn.setText("Comanda");
        comandabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comandabtnActionPerformed(evt);
            }
        });

        caixabtn.setText("Abrir caixa");
        caixabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixabtnActionPerformed(evt);
            }
        });

        sangriabtn.setText("Sangria");
        sangriabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangriabtnActionPerformed(evt);
            }
        });

        turnobtn.setText("Abrir Turno");
        turnobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnobtnActionPerformed(evt);
            }
        });

        deliverybtn.setText("Delivery");
        deliverybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverybtnActionPerformed(evt);
            }
        });

        balcaobtn.setText("Balcão");
        balcaobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balcaobtnActionPerformed(evt);
            }
        });

        sairbtn.setText("Sair");

        numerolbl.setText("Numero");

        nomelbl.setText("Nome");

        clienteslst.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        clienteslst.setModel(getTableModel());
        clienteslst.setToolTipText("");
        clienteslst.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        clienteslst.setRowHeight(32);
        clienteslst.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(clienteslst);
        TableCellRenderer renderer = new MeuRenderer();
        clienteslst.setDefaultRenderer(Object.class, renderer);

        javax.swing.GroupLayout deliverypanelLayout = new javax.swing.GroupLayout(deliverypanel);
        deliverypanel.setLayout(deliverypanelLayout);
        deliverypanelLayout.setHorizontalGroup(
            deliverypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliverypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deliverypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(deliverypanelLayout.createSequentialGroup()
                        .addComponent(numerolbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        deliverypanelLayout.setVerticalGroup(
            deliverypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliverypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deliverypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerolbl)
                    .addComponent(numerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomelbl)
                    .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(deliverypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caixabtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comandabtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sangriabtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliverybtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balcaobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                        .addComponent(sairbtn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sangriabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comandabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliverybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balcaobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliverypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comandabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comandabtnActionPerformed
        // TODO add your handling code here:
        escondeElementosDelivery();
    }//GEN-LAST:event_comandabtnActionPerformed

    private void deliverybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverybtnActionPerformed
        // TODO add your handling code here:
        exibeElementosDelivery();
        //DAOLancador.listar();


    }//GEN-LAST:event_deliverybtnActionPerformed

    @SuppressWarnings("empty-statement")
    private void caixabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixabtnActionPerformed
        // TODO add your handling code here:
        escondeElementosDelivery();
        String valor = JOptionPane.showInputDialog("Informe o valor de fundo de caixa");

        float valorf = 0;
        try {
            valorf = Float.parseFloat(valor);
        } catch (Exception e) {
            e.printStackTrace();
            valor = JOptionPane.showInputDialog("Informe o valor de fundo de caixa");

        };


    }//GEN-LAST:event_caixabtnActionPerformed

    private void turnobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnobtnActionPerformed
        // TODO add your handling code here:
        escondeElementosDelivery();
    }//GEN-LAST:event_turnobtnActionPerformed

    private void sangriabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangriabtnActionPerformed
        // TODO add your handling code here:
        escondeElementosDelivery();
    }//GEN-LAST:event_sangriabtnActionPerformed

    private void balcaobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balcaobtnActionPerformed
        // TODO add your handling code here:
        escondeElementosDelivery();
    }//GEN-LAST:event_balcaobtnActionPerformed
    public void escondeElementosDelivery() {
        numerolbl.setVisible(false);
        numerotxt.setVisible(false);
        nomelbl.setVisible(false);
        nometxt.setVisible(false);
        clienteslst.setVisible(false);
        deliverypanel.setVisible(false);
    }

    public void ocultaColunasTable() {
        
            clienteslst.getColumnModel().getColumn(0).setPreferredWidth(0);
        
    }

    public void exibeElementosDelivery() {
        numerolbl.setVisible(true);
        numerotxt.setVisible(true);
        nomelbl.setVisible(true);
        nometxt.setVisible(true);
        clienteslst.setVisible(true);
        deliverypanel.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Lancador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lancador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lancador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lancador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Lancador l = new Lancador();
                l.setVisible(true);

            }
        });
    }

    private ClienteTableModel getTableModel() {
        if (tableModel == null) {
            tableModel = new ClienteTableModel();
        }
        return tableModel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balcaobtn;
    private javax.swing.JButton caixabtn;
    private javax.swing.JTable clienteslst;
    private javax.swing.JButton comandabtn;
    private javax.swing.JButton deliverybtn;
    private javax.swing.JPanel deliverypanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomelbl;
    private javax.swing.JTextField nometxt;
    private javax.swing.JLabel numerolbl;
    private javax.swing.JTextField numerotxt;
    private javax.swing.JButton sairbtn;
    private javax.swing.JButton sangriabtn;
    private javax.swing.JButton turnobtn;
    // End of variables declaration//GEN-END:variables
}
