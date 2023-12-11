package GUI;

import java.util.ArrayList;
import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

public class Mixed_Improper extends javax.swing.JFrame {

    public Mixed_Improper() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        input_a = new javax.swing.JTextField();
        input_b = new javax.swing.JTextField();
        input_c = new javax.swing.JTextField();
        input_x = new javax.swing.JTextField();
        input_y = new javax.swing.JTextField();
        button_CALCULATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        button_GoBack = new javax.swing.JButton();
        MATH_TOOLS = new javax.swing.JLabel();
        label_Improper = new javax.swing.JLabel();
        label_Mixed = new javax.swing.JLabel();
        button_CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Mixed Fraction ~ Improper Fraction");
        setName("frame_fractions"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1007, 680));
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));
        panelMain.setPreferredSize(new java.awt.Dimension(1007, 670));

        PromptSupport.setPrompt("a", input_a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_a);
        input_a.setBackground(new java.awt.Color(238, 238, 238));
        input_a.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_a.setForeground(new java.awt.Color(153, 153, 174));
        input_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_a.setToolTipText(null);
        input_a.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_b);
        input_b.setBackground(new java.awt.Color(238, 238, 238));
        input_b.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_b.setForeground(new java.awt.Color(153, 153, 174));
        input_b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_b.setToolTipText(null);
        input_b.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("c", input_c);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_c);
        input_c.setBackground(new java.awt.Color(238, 238, 238));
        input_c.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_c.setForeground(new java.awt.Color(153, 153, 174));
        input_c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_c.setToolTipText(null);
        input_c.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("x", input_x);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_x);
        input_x.setBackground(new java.awt.Color(238, 238, 238));
        input_x.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_x.setForeground(new java.awt.Color(153, 153, 174));
        input_x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_x.setToolTipText(null);
        input_x.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("y", input_y);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_y);
        input_y.setBackground(new java.awt.Color(238, 238, 238));
        input_y.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_y.setForeground(new java.awt.Color(153, 153, 174));
        input_y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_y.setToolTipText(null);
        input_y.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

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
        infoBox.setText("This tool converts mixed fractions into improper mixed fractions and vice versa. ");
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

        label_Improper.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label_Improper.setForeground(new java.awt.Color(0, 0, 0));
        label_Improper.setText("Improper");
        label_Improper.setToolTipText("");

        label_Mixed.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label_Mixed.setForeground(new java.awt.Color(0, 0, 0));
        label_Mixed.setText("Mixed");
        label_Mixed.setToolTipText("");

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
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(input_a, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_c, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(input_x, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Improper)
                                    .addComponent(input_y, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 262, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(label_Mixed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(MATH_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_x, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_c, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_y, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(input_a, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Mixed)
                    .addComponent(label_Improper))
                .addGap(56, 56, 56)
                .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CALCULATEActionPerformed
        // Error initially set to False
        boolean error = false;

        // Inputs to String
        String astr = input_a.getText();
        String bstr = input_b.getText();
        String cstr = input_c.getText();
        String xstr = input_x.getText();
        String ystr = input_y.getText();

        // Doubles that will get its corresponding String value
        int a = 0;
        int b = 0;
        int c = 0;
        int x = 0;
        int y = 0;

        // ArrayList that will add any JTextField that it finds to be empty
        ArrayList<JTextField> emptyTextFields = new ArrayList<JTextField>();

        try {
            a = Integer.parseInt(astr);
        } catch (NumberFormatException e) {
            if (astr.equals("")) {
                emptyTextFields.add(input_a);
            } else {
                error = true;
                Methods.seterrorTf(input_a);
            }
        }

        try {
            b = Integer.parseInt(bstr);
        } catch (NumberFormatException e) {
            if (bstr.equals("")) {
                emptyTextFields.add(input_b);
            } else {
                error = true;
                Methods.seterrorTf(input_b);
            }
        }

        try {
            c = Integer.parseInt(cstr);
        } catch (NumberFormatException e) {
            if (cstr.equals("")) {
                emptyTextFields.add(input_c);
            } else {
                error = true;
                Methods.seterrorTf(input_c);
            }
        }

        try {
            x = Integer.parseInt(xstr);
        } catch (NumberFormatException e) {
            if (xstr.equals("")) {
                emptyTextFields.add(input_x);
            } else {
                error = true;
                Methods.seterrorTf(input_x);
            }
        }

        try {
            y = Integer.parseInt(ystr);
        } catch (NumberFormatException e) {
            if (ystr.equals("")) {
                emptyTextFields.add(input_y);
            } else {
                error = true;
                Methods.seterrorTf(input_y);
            }
        }

        if (!(error)) {
            if (emptyTextFields.size() == 5 || emptyTextFields.size() == 4) {
                Methods.setemptyTf(input_a);
                Methods.setemptyTf(input_b);
                Methods.setemptyTf(input_c);
                Methods.setemptyTf(input_x);
                Methods.setemptyTf(input_y);
            } else if (emptyTextFields.size() == 3) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);
                JTextField tempField3 = emptyTextFields.get(2);

                if (tempField == input_a && tempField2 == input_b && tempField3 == input_c) { // Calculate Mixed fraction
                    a = x / y;
                    input_a.setText(String.valueOf(a));
                    b = x % y;
                    input_b.setText(String.valueOf(b));
                    c = y;
                    input_c.setText(String.valueOf(c));
                }

            } else if (emptyTextFields.size() == 2) {
                JTextField tempField = emptyTextFields.get(0);
                JTextField tempField2 = emptyTextFields.get(1);

                if (tempField == input_x && tempField2 == input_y) { // Calculate Improper fraction
                    x = (a * c) + b;
                    input_x.setText(String.valueOf(x));
                    y = c;
                    input_y.setText(String.valueOf(y));
                }
            }
        }
    }//GEN-LAST:event_button_CALCULATEActionPerformed

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(input_a);
        PromptSupport.setPrompt("a", input_a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_a);

        Methods.cleartf(input_b);
        PromptSupport.setPrompt("b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_b);

        Methods.cleartf(input_c);
        PromptSupport.setPrompt("c", input_c);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_c);

        Methods.cleartf(input_x);
        PromptSupport.setPrompt("x", input_x);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_x);

        Methods.cleartf(input_y);
        PromptSupport.setPrompt("y", input_y);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_y);
    }//GEN-LAST:event_button_CLEARActionPerformed

    private void button_GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_GoBackActionPerformed
        // TODO add your handling code here:
        MENU_OTHERS MENU_OTHERS = new MENU_OTHERS();
        MENU_OTHERS.setVisible(true);
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
            java.util.logging.Logger.getLogger(Mixed_Improper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mixed_Improper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mixed_Improper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mixed_Improper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Mixed_Improper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JButton button_CALCULATE;
    private javax.swing.JButton button_CLEAR;
    private javax.swing.JButton button_GoBack;
    private javax.swing.JTextArea infoBox;
    private javax.swing.JTextField input_a;
    private javax.swing.JTextField input_b;
    private javax.swing.JTextField input_c;
    private javax.swing.JTextField input_x;
    private javax.swing.JTextField input_y;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Improper;
    private javax.swing.JLabel label_Mixed;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
