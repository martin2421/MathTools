
package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;

public class MENU_OTHERS extends javax.swing.JFrame {

   
    public MENU_OTHERS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelMain = new javax.swing.JPanel();
        MATH_TOOLS = new javax.swing.JLabel();
        button_simulequations = new javax.swing.JButton();
        button_fractions = new javax.swing.JButton();
        button_hcfandlcm = new javax.swing.JButton();
        button_equationline = new javax.swing.JButton();
        button_back = new javax.swing.JButton();
        TITLE_OTHERS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Others");
        setName("frame_MENUOTHERS"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        MATH_TOOLS.setBackground(new java.awt.Color(0, 0, 0));
        MATH_TOOLS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        MATH_TOOLS.setForeground(new java.awt.Color(255, 0, 0));
        MATH_TOOLS.setText("MATH TOOLS");
        MATH_TOOLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_simulequations.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_simulequations.setText("Simultaneous Equations");
        button_simulequations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simulequationsActionPerformed(evt);
            }
        });

        button_fractions.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_fractions.setText("Mixed Fraction ↔ Improper Fraction");
        button_fractions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fractionsActionPerformed(evt);
            }
        });

        button_hcfandlcm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_hcfandlcm.setText("HCF and LCM");
        button_hcfandlcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hcfandlcmActionPerformed(evt);
            }
        });

        button_equationline.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_equationline.setText("Equation of a Straight Line");
        button_equationline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_equationlineActionPerformed(evt);
            }
        });

        button_back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_back.setText("Go back");
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        TITLE_OTHERS.setBackground(new java.awt.Color(0, 0, 0));
        TITLE_OTHERS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        TITLE_OTHERS.setForeground(new java.awt.Color(0, 0, 255));
        TITLE_OTHERS.setText("Others");
        TITLE_OTHERS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(TITLE_OTHERS)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_simulequations, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_fractions, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_hcfandlcm, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_equationline, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MATH_TOOLS)
                    .addComponent(TITLE_OTHERS))
                .addGap(31, 31, 31)
                .addComponent(button_fractions, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_hcfandlcm, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_equationline, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_simulequations, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
        // TODO add your handling code here:
        MAIN_MENU MAIN_MENU = new MAIN_MENU();
        MAIN_MENU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_backActionPerformed

    private void button_fractionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fractionsActionPerformed
        // TODO add your handling code here:
        Mixed_Improper Mixed_Improper = new Mixed_Improper();
        Mixed_Improper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_fractionsActionPerformed

    private void button_hcfandlcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_hcfandlcmActionPerformed
        // TODO add your handling code here:
        HCF_LCM HCF_LCM = new HCF_LCM();
        HCF_LCM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_hcfandlcmActionPerformed

    private void button_equationlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_equationlineActionPerformed
        // TODO add your handling code here:
        Equation_Line Equation_Line = new Equation_Line();
        Equation_Line.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_equationlineActionPerformed

    private void button_simulequationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simulequationsActionPerformed
        // TODO add your handling code here:
        Simultaneous_Equation Simultaneous_Equation = new Simultaneous_Equation();
        Simultaneous_Equation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_simulequationsActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_OTHERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_OTHERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_OTHERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_OTHERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_OTHERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JLabel TITLE_OTHERS;
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_equationline;
    private javax.swing.JButton button_fractions;
    private javax.swing.JButton button_hcfandlcm;
    private javax.swing.JButton button_simulequations;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
