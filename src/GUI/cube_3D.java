package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JTextField;

public class cube_3D extends javax.swing.JFrame {

    public cube_3D() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        input_b = new javax.swing.JTextField();
        input_V = new javax.swing.JTextField();
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

                int[] xPoints = {100, 200, 504, 400};
                int[] yPoints = {150, 100, 100, 150};
                int nPoints = xPoints.length;

                int[] xPoints2 = {100, 400, 400, 100};
                int[] yPoints2 = {150, 150, 400, 400};
                int nPoints2 = xPoints2.length;

                int[] xPoints3 = {400, 507, 507, 400};
                int[] yPoints3 = {150, 100, 350, 400};
                int nPoints3 = xPoints3.length;

                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillPolygon(xPoints, yPoints, nPoints);
                g2d.fillPolygon(xPoints2, yPoints2, nPoints2);
                g2d.fillPolygon(xPoints3, yPoints3, nPoints3);

                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawPolygon(xPoints, yPoints, nPoints);
                g2d.drawPolygon(xPoints2, yPoints2, nPoints2);
                g2d.drawPolygon(xPoints3, yPoints3, nPoints3);

                g2d.setFont(new Font("Comic Sans", Font.BOLD, 25));
                g2d.setColor(Color.BLACK);
                g2d.drawString("b", 515, 250);
            }
        };
        button_CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Cube (Surface Area and Volume)");
        setName("frame_cube"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        PromptSupport.setPrompt("Enter value of b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_b);
        input_b.setBackground(new java.awt.Color(238, 238, 238));
        input_b.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_b.setForeground(new java.awt.Color(153, 153, 174));
        input_b.setToolTipText(null);
        input_b.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of V", input_V);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_V);
        input_V.setBackground(new java.awt.Color(238, 238, 238));
        input_V.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_V.setForeground(new java.awt.Color(153, 153, 174));
        input_V.setToolTipText(null);
        input_V.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

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
        infoBox.setText("You can find the volume or the surface area of a cube by using these formulas: \n\nV = b³\nA = 6 x b²");
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
            .addGap(0, 650, Short.MAX_VALUE)
        );
        panel_DrawingLayout.setVerticalGroup(
            panel_DrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
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
                    .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                            .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(297, 297, 297)
                            .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelMainLayout.createSequentialGroup()
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(input_V, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(MATH_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_V, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
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
        String Vstr = input_V.getText();
        String bstr = input_b.getText();
        
        // Doubles that will get its corresponding String value
        double A = 0;
        double V = 0;
        double b = 0;

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
            V = Double.parseDouble(Vstr);
        } catch (NumberFormatException e) {
            if (Vstr.equals("")) {
                emptyTextFields.add(input_V);
            } else {
                error = true;
                Methods.seterrorTf(input_V);
            }
        }

        try {
            b = Double.parseDouble(bstr);
        } catch (NumberFormatException e) {
            if (bstr.equals("")) {
                emptyTextFields.add(input_b);
            } else {
                error = true;
                Methods.seterrorTf(input_b);
            }
        }

        if (!(error)) {
            if (emptyTextFields.size() == 3) {
                Methods.setemptyTf(input_A);
                Methods.setemptyTf(input_V);
                Methods.setemptyTf(input_b);
            } else if (emptyTextFields.size() == 2) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);

                if (tempField == input_A && tempField2 == input_V) { // Calculate A and V using b
                    A = 6 * (Math.pow(b, 2));
                    input_A.setText(String.valueOf(A));
                    V = Math.pow(b, 3);
                    input_V.setText(String.valueOf(V));
                } else if (tempField == input_A && tempField2 == input_b) { // Calculate A and b using V
                    b = Math.cbrt(V);
                    input_b.setText(String.valueOf(b));
                    A = 6 * (Math.pow(b, 2));
                    input_A.setText(String.valueOf(A));
                } else if (tempField == input_V && tempField2 == input_b) { // Calculate V and b using A
                    b = Math.sqrt(A / 6);
                    input_b.setText(String.valueOf(b));
                    V = Math.pow(b, 3);
                    input_V.setText(String.valueOf(V));
                }
            }
        }

    }//GEN-LAST:event_button_CALCULATEActionPerformed

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(input_A);
        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_A);

        Methods.cleartf(input_V);
        PromptSupport.setPrompt("Enter value of V", input_V);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_V);

        Methods.cleartf(input_b);
        PromptSupport.setPrompt("Enter value of b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_b);
    }//GEN-LAST:event_button_CLEARActionPerformed

    private void button_GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_GoBackActionPerformed
        // TODO add your handling code here:
        MENU_3DSHAPES MENU_3DSHAPES = new MENU_3DSHAPES();
        MENU_3DSHAPES.setVisible(true);
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
            java.util.logging.Logger.getLogger(cube_3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cube_3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cube_3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cube_3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cube_3D().setVisible(true);
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
    private javax.swing.JTextField input_V;
    private javax.swing.JTextField input_b;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panel_Drawing;
    // End of variables declaration//GEN-END:variables
}
