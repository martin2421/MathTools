package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JTextField;

public class circle_2D extends javax.swing.JFrame {

    public circle_2D() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        input_r = new javax.swing.JTextField();
        input_A = new javax.swing.JTextField();
        input_C = new javax.swing.JTextField();
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
                g2d.fillOval(100, 20, 400, 400);

                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawOval(100, 20, 400, 400);

                Stroke dashed = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
                g2d.setStroke(dashed);
                g2d.drawLine(300, 220, 500, 220);

                g2d.setFont(new Font("Comic Sans", Font.BOLD, 25));
                g2d.setColor(Color.BLACK);
                g2d.drawString("C", 450, 70);
                g2d.drawString("r", 380, 210);
            }
        };
        button_CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Circle (Circumference and Area)");
        setName("frame_circle"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        PromptSupport.setPrompt("Enter value of r", input_r);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_r);
        input_r.setBackground(new java.awt.Color(238, 238, 238));
        input_r.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_r.setForeground(new java.awt.Color(153, 153, 174));
        input_r.setToolTipText(null);
        input_r.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_A);
        input_A.setBackground(new java.awt.Color(238, 238, 238));
        input_A.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_A.setForeground(new java.awt.Color(153, 153, 174));
        input_A.setToolTipText(null);
        input_A.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of C", input_C);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_C);
        input_C.setBackground(new java.awt.Color(238, 238, 238));
        input_C.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_C.setForeground(new java.awt.Color(153, 153, 174));
        input_C.setToolTipText(null);
        input_C.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

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
        infoBox.setText("You can find the different values or calculate the area or perimeter (cicumference) by filling in the values that you have. \n\nA = π x r²\nC = 2 x π x r");
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_DrawingLayout.setVerticalGroup(
            panel_DrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
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
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_C, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_r, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Drawing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)
                        .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(MATH_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_r, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_C, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CALCULATEActionPerformed
        // Error initially set to False
        boolean error = false;

        // Inputs to String
        String Astr = input_A.getText();
        String Cstr = input_C.getText();
        String rstr = input_r.getText();
        
        // Doubles that will get its corresponding String value
        double A = 0;
        double C = 0;
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
            C = Double.parseDouble(Cstr);
        } catch (NumberFormatException e) {
            if (Cstr.equals("")) {
                emptyTextFields.add(input_C);
            } else {
                error = true;
                Methods.seterrorTf(input_C);
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
            if (emptyTextFields.size() == 3) {
                Methods.setemptyTf(input_A);
                Methods.setemptyTf(input_C);
                Methods.setemptyTf(input_r);
            } else if (emptyTextFields.size() == 2) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);

                if (tempField == input_A && tempField2 == input_C) { // Calculate A and C using r
                   A = (Math.PI) * (Math.pow(r, 2));
                   input_A.setText(String.valueOf(A));
                   C = 2 * (Math.PI) * r;
                   input_C.setText(String.valueOf(C));
                } else if (tempField == input_A && tempField2 == input_r) { // Calculate A and r using C
                   r = C / (2 * Math.PI);
                   input_r.setText(String.valueOf(r));
                   A = (Math.PI) * (Math.pow(r, 2));
                   input_A.setText(String.valueOf(A));
                } else if (tempField == input_C && tempField2 == input_r) { // Calculate C and r using A
                   r = Math.sqrt(A / Math.PI);
                   input_r.setText(String.valueOf(r));
                   C = 2 * (Math.PI) * r;
                   input_C.setText(String.valueOf(C));
                }
            }
        }
  
    }//GEN-LAST:event_button_CALCULATEActionPerformed

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(input_A);
        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_A);
        
        Methods.cleartf(input_C);
        PromptSupport.setPrompt("Enter value of C", input_C);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_C);
        
        Methods.cleartf(input_r);
        PromptSupport.setPrompt("Enter value of r", input_r);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_r);
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
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(circle_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(circle_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(circle_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(circle_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new circle_2D().setVisible(true);
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
    private javax.swing.JTextField input_C;
    private javax.swing.JTextField input_r;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panel_Drawing;
    // End of variables declaration//GEN-END:variables
}
