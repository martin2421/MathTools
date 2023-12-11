
package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;

public class MENU_2DSHAPES extends javax.swing.JFrame {

   
    public MENU_2DSHAPES() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelMain = new javax.swing.JPanel();
        MATH_TOOLS = new javax.swing.JLabel();
        button_square = new javax.swing.JButton();
        button_triangle = new javax.swing.JButton();
        button_circle = new javax.swing.JButton();
        button_rectangle = new javax.swing.JButton();
        button_parallelogram = new javax.swing.JButton();
        button_circle2 = new javax.swing.JButton();
        button_back = new javax.swing.JButton();
        TITLE_2DSHAPES = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - 2D Shapes");
        setName("frame_MENU2DSHAPES"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        MATH_TOOLS.setBackground(new java.awt.Color(0, 0, 0));
        MATH_TOOLS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        MATH_TOOLS.setForeground(new java.awt.Color(255, 0, 0));
        MATH_TOOLS.setText("MATH TOOLS");
        MATH_TOOLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_square.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_square.setText("Square (Perimeter and Area)");
        button_square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_squareActionPerformed(evt);
            }
        });

        button_triangle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_triangle.setText("Triangle (Perimeter and Area)");
        button_triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_triangleActionPerformed(evt);
            }
        });

        button_circle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_circle.setText("Circle (Circumference and Area)");
        button_circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_circleActionPerformed(evt);
            }
        });

        button_rectangle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_rectangle.setText("Rectangle (Perimeter and Area)");
        button_rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rectangleActionPerformed(evt);
            }
        });

        button_parallelogram.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_parallelogram.setText("Parallelogram (Perimeter and Area)");
        button_parallelogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_parallelogramActionPerformed(evt);
            }
        });

        button_circle2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_circle2.setText("Circle (Arc Length and Area of a Sector)");
        button_circle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_circle2ActionPerformed(evt);
            }
        });

        button_back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_back.setText("Go back");
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        TITLE_2DSHAPES.setBackground(new java.awt.Color(0, 0, 0));
        TITLE_2DSHAPES.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 65)); // NOI18N
        TITLE_2DSHAPES.setForeground(new java.awt.Color(0, 0, 255));
        TITLE_2DSHAPES.setText("2D Shapes");
        TITLE_2DSHAPES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TITLE_2DSHAPES))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_circle, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelMainLayout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(button_triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(button_square, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_parallelogram, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_circle2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MATH_TOOLS)
                    .addComponent(TITLE_2DSHAPES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_square, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_parallelogram, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_circle2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_circle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void button_squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_squareActionPerformed
        // TODO add your handling code here:
        square_2D square_2D = new square_2D();
        square_2D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_squareActionPerformed

    private void button_triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_triangleActionPerformed
        // TODO add your handling code here:
        triangle_2D triangle_2D = new triangle_2D();
        triangle_2D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_triangleActionPerformed

    private void button_circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_circleActionPerformed
        // TODO add your handling code here:
        circle_2D circle_2D = new circle_2D();
        circle_2D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_circleActionPerformed

    private void button_circle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_circle2ActionPerformed
        // TODO add your handling code here:
        circle2_2D circle2_2D = new circle2_2D();
        circle2_2D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_circle2ActionPerformed

    private void button_rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rectangleActionPerformed
        // TODO add your handling code here:
        rectangle_2D rectangle_2D = new rectangle_2D();
        rectangle_2D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_rectangleActionPerformed

    private void button_parallelogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_parallelogramActionPerformed
        // TODO add your handling code here:
        parallelogram_2D parallelogram_2D = new parallelogram_2D();
        parallelogram_2D.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_parallelogramActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_2DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_2DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_2DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_2DSHAPES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_2DSHAPES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JLabel TITLE_2DSHAPES;
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_circle;
    private javax.swing.JButton button_circle2;
    private javax.swing.JButton button_parallelogram;
    private javax.swing.JButton button_rectangle;
    private javax.swing.JButton button_square;
    private javax.swing.JButton button_triangle;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
