
package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;

public class MENU_3DSHAPES extends javax.swing.JFrame {

   
    public MENU_3DSHAPES() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelMain = new javax.swing.JPanel();
        MATH_TOOLS = new javax.swing.JLabel();
        button_cube = new javax.swing.JButton();
        button_sphere = new javax.swing.JButton();
        button_cylinder = new javax.swing.JButton();
        button_back = new javax.swing.JButton();
        TITLE_3DSHAPES = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - 3D Shapes");
        setName("frame_MENU3DSHPAES"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        MATH_TOOLS.setBackground(new java.awt.Color(0, 0, 0));
        MATH_TOOLS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        MATH_TOOLS.setForeground(new java.awt.Color(255, 0, 0));
        MATH_TOOLS.setText("MATH TOOLS");
        MATH_TOOLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_cube.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_cube.setText("Cube (Surface Area and Volume)");
        button_cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cubeActionPerformed(evt);
            }
        });

        button_sphere.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_sphere.setText("Sphere (Surface Area and Volume)");
        button_sphere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sphereActionPerformed(evt);
            }
        });

        button_cylinder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_cylinder.setText("Cylinder (Surface Area and Volume)");
        button_cylinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cylinderActionPerformed(evt);
            }
        });

        button_back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_back.setText("Go back");
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        TITLE_3DSHAPES.setBackground(new java.awt.Color(0, 0, 0));
        TITLE_3DSHAPES.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        TITLE_3DSHAPES.setForeground(new java.awt.Color(0, 0, 255));
        TITLE_3DSHAPES.setText("3D Shapes");
        TITLE_3DSHAPES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(TITLE_3DSHAPES)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_cylinder, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_sphere, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_cube, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(298, 298, 298))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MATH_TOOLS)
                    .addComponent(TITLE_3DSHAPES))
                .addGap(18, 18, 18)
                .addComponent(button_cube, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(button_sphere, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(button_cylinder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void button_cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cubeActionPerformed
        // TODO add your handling code here:
        cube_3D cube_3D = new cube_3D();
        cube_3D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_cubeActionPerformed

    private void button_sphereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sphereActionPerformed
        // TODO add your handling code here:
        sphere_3D sphere_3D = new sphere_3D();
        sphere_3D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_sphereActionPerformed

    private void button_cylinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cylinderActionPerformed
        // TODO add your handling code here:
        cylinder_3D cylinder_3D = new cylinder_3D();
        cylinder_3D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_cylinderActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_3DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_3DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_3DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_3DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MENU_3DSHAPES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JLabel TITLE_3DSHAPES;
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_cube;
    private javax.swing.JButton button_cylinder;
    private javax.swing.JButton button_sphere;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
