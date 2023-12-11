package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;

public class MAIN_MENU extends javax.swing.JFrame {

    public MAIN_MENU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelMain = new javax.swing.JPanel();
        MATH_TOOLS = new javax.swing.JLabel();
        button_2D = new javax.swing.JButton();
        button_3D = new javax.swing.JButton();
        button_others = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Main Menu");
        setIconImages(null);
        setName("frame_MAINMENU"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        MATH_TOOLS.setBackground(new java.awt.Color(0, 0, 0));
        MATH_TOOLS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        MATH_TOOLS.setForeground(new java.awt.Color(255, 0, 0));
        MATH_TOOLS.setText("MATH TOOLS");
        MATH_TOOLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_2D.setBackground(new java.awt.Color(0, 255, 0));
        button_2D.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 36)); // NOI18N
        button_2D.setForeground(new java.awt.Color(0, 0, 0));
        button_2D.setText("2D Shapes");
        button_2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2DActionPerformed(evt);
            }
        });

        button_3D.setBackground(new java.awt.Color(255, 255, 0));
        button_3D.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 36)); // NOI18N
        button_3D.setForeground(new java.awt.Color(0, 0, 0));
        button_3D.setText("3D Shapes");
        button_3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3DActionPerformed(evt);
            }
        });

        button_others.setBackground(new java.awt.Color(255, 0, 0));
        button_others.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 36)); // NOI18N
        button_others.setForeground(new java.awt.Color(0, 0, 0));
        button_others.setText("Others");
        button_others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_othersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(button_2D, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(button_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(button_others, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(MATH_TOOLS)
                .addGap(37, 37, 37)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_2D, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_others, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
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

    private void button_3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3DActionPerformed
        // TODO add your handling code here:
        MENU_3DSHAPES MENU_3DSHAPES = new MENU_3DSHAPES();
        MENU_3DSHAPES.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_3DActionPerformed

    private void button_othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_othersActionPerformed
        // TODO add your handling code here:
        MENU_OTHERS MENU_OTHERS = new MENU_OTHERS();
        MENU_OTHERS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_othersActionPerformed

    private void button_2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2DActionPerformed
        // TODO add your handling code here:
        MENU_2DSHAPES MENU_2DSHAPES = new MENU_2DSHAPES();
        MENU_2DSHAPES.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_2DActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JButton button_2D;
    private javax.swing.JButton button_3D;
    private javax.swing.JButton button_others;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
