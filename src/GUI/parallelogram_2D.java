package GUI;

import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JTextField;

public class parallelogram_2D extends javax.swing.JFrame {

    public parallelogram_2D() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        input_a = new javax.swing.JTextField();
        input_b = new javax.swing.JTextField();
        input_h = new javax.swing.JTextField();
        input_A = new javax.swing.JTextField();
        input_P = new javax.swing.JTextField();
        button_CALCULATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        button_GoBack = new javax.swing.JButton();
        MATH_TOOLS = new javax.swing.JLabel();
        panel_Drawing = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                int[] xPoints = {175, 575, 470, 75};
                int[] yPoints = {90, 90, 440, 440};
                int nPoints = xPoints.length;

                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillPolygon(xPoints, yPoints, nPoints);

                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawPolygon(xPoints, yPoints, nPoints);

                g2d.setColor(Color.BLACK);
                Stroke dashed = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
                g2d.setStroke(dashed);
                g2d.drawLine(175, 90, 175, 440);

                g2d.setFont(new Font("Comic Sans", Font.BOLD, 25));
                g2d.setColor(Color.BLACK);
                g2d.drawString("a", 100, 265);
                g2d.drawString("b", 290, 470);
                g2d.drawString("h", 190, 265);
            }
        };
        button_CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Parallelogram (Perimeter and Area)");
        setName("frame_parallelogram"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        PromptSupport.setPrompt("Enter value of a", input_a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_a);
        input_a.setBackground(new java.awt.Color(238, 238, 238));
        input_a.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_a.setForeground(new java.awt.Color(153, 153, 174));
        input_a.setToolTipText(null);
        input_a.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_b);
        input_b.setBackground(new java.awt.Color(238, 238, 238));
        input_b.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_b.setForeground(new java.awt.Color(153, 153, 174));
        input_b.setToolTipText(null);
        input_b.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of h", input_h);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_h);
        input_h.setBackground(new java.awt.Color(238, 238, 238));
        input_h.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_h.setForeground(new java.awt.Color(153, 153, 174));
        input_h.setToolTipText(null);
        input_h.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_A);
        input_A.setBackground(new java.awt.Color(238, 238, 238));
        input_A.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_A.setForeground(new java.awt.Color(153, 153, 174));
        input_A.setToolTipText(null);
        input_A.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of P", input_P);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_P);
        input_P.setBackground(new java.awt.Color(238, 238, 238));
        input_P.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_P.setForeground(new java.awt.Color(153, 153, 174));
        input_P.setToolTipText(null);
        input_P.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

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
        infoBox.setText("You can find the different values or calculate the area or perimeter by filling in the values that you have.\n\nA = b x h\nP = 2 x (a + b)\n");
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
            .addGap(0, 600, Short.MAX_VALUE)
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
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(input_h, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(input_P, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(input_a, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(436, 436, 436)
                        .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
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
                        .addComponent(input_a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_A, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_h, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_P, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_Drawing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        String Pstr = input_P.getText();
        String astr = input_a.getText();
        String bstr = input_b.getText();
        String hstr = input_h.getText();

        // Doubles that will get its corresponding String value
        double A = 0;
        double P = 0;
        double a = 0;
        double b = 0;
        double h = 0;

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
            P = Double.parseDouble(Pstr);
        } catch (NumberFormatException e) {
            if (Pstr.equals("")) {
                emptyTextFields.add(input_P);
            } else {
                error = true;
                Methods.seterrorTf(input_P);
            }
        }

        try {
            a = Double.parseDouble(astr);
        } catch (NumberFormatException e) {
            if (astr.equals("")) {
                emptyTextFields.add(input_a);
            } else {
                error = true;
                Methods.seterrorTf(input_a);
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

        try {
            h = Double.parseDouble(hstr);
        } catch (NumberFormatException e) {
            if (hstr.equals("")) {
                emptyTextFields.add(input_h);
            } else {
                error = true;
                Methods.seterrorTf(input_h);
            }
        }

        if (!(error)) {
            if (emptyTextFields.size() == 5) {
                Methods.setemptyTf(input_A);
                Methods.setemptyTf(input_P);
                Methods.setemptyTf(input_a);
                Methods.setemptyTf(input_b);
                Methods.setemptyTf(input_h);
            } else if (emptyTextFields.size() == 3) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);
                JTextField tempField3 = emptyTextFields.get(2);

                if (tempField == input_A && tempField2 == input_P && tempField3 == input_a) { // Calculate A using b and h
                    A = b * h;
                    input_A.setText(String.valueOf(A));
                } else if (tempField == input_P && tempField2 == input_a && tempField3 == input_b) { // Calculate b using A and h
                    b = A / h;
                    input_b.setText(String.valueOf(b));
                } else if (tempField == input_P && tempField2 == input_a && tempField3 == input_h) { // Calculate h using A and b
                    h = A / b;
                    input_h.setText(String.valueOf(h));
                } else if (tempField == input_A && tempField2 == input_P && tempField3 == input_h) { // Calculate P using a and b
                    P = 2 * (a + b);
                    input_P.setText(String.valueOf(P));
                } else if (tempField == input_A && tempField2 == input_a && tempField3 == input_h) { // Calculate a using P and b
                    a = (P / 2) - b;
                    input_a.setText(String.valueOf(a));
                } else if (tempField == input_A && tempField2 == input_b && tempField3 == input_h) { // Calculate b using P and a
                    b = (P / 2) - a;
                    input_b.setText(String.valueOf(b));
                } 
                
                
            } else if (emptyTextFields.size() == 2) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);

                if (tempField == input_A && tempField2 == input_P) {
                    A = b * h;
                    input_A.setText(String.valueOf(A));
                    P = 2 * (a + b);
                    input_P.setText(String.valueOf(P));
                }
            }
        }
    }//GEN-LAST:event_button_CALCULATEActionPerformed

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(input_A);
        PromptSupport.setPrompt("Enter value of A", input_A);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_A);

        Methods.cleartf(input_P);
        PromptSupport.setPrompt("Enter value of P", input_P);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_P);

        Methods.cleartf(input_b);
        PromptSupport.setPrompt("Enter value of b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_b);

        Methods.cleartf(input_a);
        PromptSupport.setPrompt("Enter value of a", input_a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_a);

        Methods.cleartf(input_h);
        PromptSupport.setPrompt("Enter value of h", input_h);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_h);
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parallelogram_2D().setVisible(true);
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
    private javax.swing.JTextField input_P;
    private javax.swing.JTextField input_a;
    private javax.swing.JTextField input_b;
    private javax.swing.JTextField input_h;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panel_Drawing;
    // End of variables declaration//GEN-END:variables
}
