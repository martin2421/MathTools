package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JTextField;

public class circle2_2D extends javax.swing.JFrame {

    public circle2_2D() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        input_angle = new javax.swing.JTextField();
        input_r = new javax.swing.JTextField();
        input_L = new javax.swing.JTextField();
        input_A = new javax.swing.JTextField();
        button_CALCULATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        button_GoBack = new javax.swing.JButton();
        MATH_TOOLS = new javax.swing.JLabel();
        panel_Drawing = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillOval(225, 30, 350, 350);

                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawOval(225, 30, 350, 350);

                g2d.drawLine(400, 205, 575, 205);
                g2d.drawLine(400, 205, 487, 55);
                g2d.drawArc(355, 155, 100, 100, 0, 62);
                g2d.setColor(Color.RED);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawArc(215, 30, 360, 350, 0, 59);

                g2d.setFont(new Font("Comic Sans", Font.BOLD, 25));
                g2d.setColor(Color.BLACK);
                g2d.drawString("L", 570, 100);
                g2d.drawString("r", 485, 230);
                g2d.drawString("θ", 425, 195);
            }
        };
        button_CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Circle (Arc Length and Area of a Sector)");
        setName("frame_circle2"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        PromptSupport.setPrompt("Enter value of θ", input_angle);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_angle);
        input_angle.setBackground(new java.awt.Color(238, 238, 238));
        input_angle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_angle.setForeground(new java.awt.Color(153, 153, 174));
        input_angle.setToolTipText(null);
        input_angle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of r", input_r);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_r);
        input_r.setBackground(new java.awt.Color(238, 238, 238));
        input_r.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_r.setForeground(new java.awt.Color(153, 153, 174));
        input_r.setToolTipText(null);
        input_r.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of L", input_L);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_L);
        input_L.setBackground(new java.awt.Color(238, 238, 238));
        input_L.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_L.setForeground(new java.awt.Color(153, 153, 174));
        input_L.setToolTipText(null);
        input_L.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_A);
        input_A.setBackground(new java.awt.Color(238, 238, 238));
        input_A.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_A.setForeground(new java.awt.Color(153, 153, 174));
        input_A.setToolTipText(null);
        input_A.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        button_CALCULATE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_CALCULATE.setText("CALCULATE");
        button_CALCULATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CALCULATEActionPerformed(evt);
            }
        });

        infoBox.setEditable(false);
        infoBox.setBackground(new java.awt.Color(249, 203, 156));
        infoBox.setColumns(20);
        infoBox.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        infoBox.setForeground(new java.awt.Color(0, 0, 0));
        infoBox.setLineWrap(true);
        infoBox.setRows(5);
        infoBox.setText("This tool can help you find the area of a sector or the length of an arc, or some of the other elements. \n\nL = r x θ (angle in radians)\nA = ½ x r² x θ (angle in radians)\n\nRadian = Angle x π/180 ");
        infoBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(infoBox);

        button_GoBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_GoBack.setText("Go back");
        button_GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_GoBackActionPerformed(evt);
            }
        });

        MATH_TOOLS.setBackground(new java.awt.Color(0, 0, 0));
        MATH_TOOLS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 55)); // NOI18N
        MATH_TOOLS.setForeground(new java.awt.Color(255, 0, 0));
        MATH_TOOLS.setText("MATH TOOLS");
        MATH_TOOLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel_Drawing.setBackground(new java.awt.Color(255, 243, 228));
        panel_Drawing.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel_DrawingLayout = new javax.swing.GroupLayout(panel_Drawing);
        panel_Drawing.setLayout(panel_DrawingLayout);
        panel_DrawingLayout.setHorizontalGroup(
            panel_DrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        panel_DrawingLayout.setVerticalGroup(
            panel_DrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        button_CLEAR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_CLEAR.setText("CLEAR");
        button_CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CLEARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(input_L, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelMainLayout.createSequentialGroup()
                            .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelMainLayout.createSequentialGroup()
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelMainLayout.createSequentialGroup()
                                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(input_angle, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(input_r, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(210, 210, 210))
                                .addGroup(panelMainLayout.createSequentialGroup()
                                    .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(MATH_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_angle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_r, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_L, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CALCULATEActionPerformed
        // Error initially set to False
        boolean error = false;

        // Inputs to String
        String Astr = input_A.getText();
        String Lstr = input_L.getText();
        String anglestr = input_angle.getText();
        String rstr = input_r.getText();

        // Doubles that will get its corresponding String value
        double A = 0;
        double L = 0;
        double angle = 0;
        double r = 0;

        // ArrayList that will add any JTextField that it finds to be empty
        ArrayList<JTextField> emptyTextFields = new ArrayList<JTextField>();

        try {
            A = Double.parseDouble(Astr);
        } catch (NumberFormatException e) {
            if (Astr.equals("")) {
                emptyTextFields.add(input_A);
            } else {
                error = true;
                Methods.seterrorTf(input_A);
            }
        }

        try {
            L = Double.parseDouble(Lstr);
        } catch (NumberFormatException e) {
            if (Lstr.equals("")) {
                emptyTextFields.add(input_L);
            } else {
                error = true;
                Methods.seterrorTf(input_L);
            }
        }

        try {
            angle = Double.parseDouble(anglestr);
        } catch (NumberFormatException e) {
            if (anglestr.equals("")) {
                emptyTextFields.add(input_angle);
            } else {
                error = true;
                Methods.seterrorTf(input_angle);
            }
        }

        try {
            r = Double.parseDouble(rstr);
        } catch (NumberFormatException e) {
            if (rstr.equals("")) {
                emptyTextFields.add(input_r);
            } else {
                error = true;
                Methods.seterrorTf(input_r);
            }
        }

        if (!(error)) {
            if (emptyTextFields.size() == 4 || emptyTextFields.size() == 3) {
                Methods.setemptyTf(input_A);
                Methods.setemptyTf(input_L);
                Methods.setemptyTf(input_angle);
                Methods.setemptyTf(input_r);
            } else if (emptyTextFields.size() == 2) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);

                if (tempField == input_A && tempField2 == input_L) { // Calculate A and L using r and angle
                    A = (Math.pow(r, 2) * angle) / 2;
                    input_A.setText(String.valueOf(A));
                    L = r * angle;
                    input_L.setText(String.valueOf(L));
                } else if (tempField == input_A && tempField2 == input_angle) { // Calculate A and Angle using r and L
                    angle = L / r;
                    input_angle.setText(String.valueOf(angle));
                    A = (Math.pow(r, 2) * angle) / 2;
                    input_A.setText(String.valueOf(A));
                } else if (tempField == input_A && tempField2 == input_r) { // Calculate A and r using L and angle
                    r = L / angle;
                    input_r.setText(String.valueOf(r));
                    A = (Math.pow(r, 2) * angle) / 2;
                    input_A.setText(String.valueOf(A));
                } else if (tempField == input_L && tempField2 == input_angle) { // Calculate L and Angle using A and r
                    angle = (2 * A) / Math.pow(r, 2);
                    input_angle.setText(String.valueOf(angle));
                    L = r * angle;
                    input_L.setText(String.valueOf(L));
                } else if (tempField == input_L && tempField2 == input_r) { // Calculate L and r using A and angle
                    r = Math.sqrt((2 * A) / angle);
                    input_r.setText(String.valueOf(r));
                    L = r * angle;
                    input_L.setText(String.valueOf(L));
                } else if (tempField == input_angle && tempField2 == input_r) { // Calculate Angle and r using A and L
                    Methods.seterrorTf(input_angle);
                    Methods.seterrorTf(input_r);
                }
            }
        }

    }//GEN-LAST:event_button_CALCULATEActionPerformed

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(input_A);
        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_A);

        Methods.cleartf(input_L);
        PromptSupport.setPrompt("Enter value of L", input_L);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_L);

        Methods.cleartf(input_angle);
        PromptSupport.setPrompt("Enter value of θ", input_angle);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_angle);

        Methods.cleartf(input_r);
        PromptSupport.setPrompt("Enter value of r", input_r);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_r);
    }//GEN-LAST:event_button_CLEARActionPerformed

    private void button_GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_GoBackActionPerformed
        // TODO add your handling code here:
        MENU_2DSHAPES MENU_2DSHAPES = new MENU_2DSHAPES();
        MENU_2DSHAPES.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_GoBackActionPerformed

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
            java.util.logging.Logger.getLogger(circle2_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(circle2_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(circle2_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(circle2_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new circle2_2D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JButton button_CALCULATE;
    private javax.swing.JButton button_CLEAR;
    private javax.swing.JButton button_GoBack;
    private javax.swing.JTextArea infoBox;
    private javax.swing.JTextField input_A;
    private javax.swing.JTextField input_L;
    private javax.swing.JTextField input_angle;
    private javax.swing.JTextField input_r;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panel_Drawing;
    // End of variables declaration//GEN-END:variables
}
