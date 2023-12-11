
package GUI;

import java.util.ArrayList;
import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

public class Equation_Line extends javax.swing.JFrame {

   
    public Equation_Line() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        input_x1 = new javax.swing.JTextField();
        input_y1 = new javax.swing.JTextField();
        input_x2 = new javax.swing.JTextField();
        input_y2 = new javax.swing.JTextField();
        button_CLEAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        button_GoBack = new javax.swing.JButton();
        MATH_TOOLS = new javax.swing.JLabel();
        label_yequals = new javax.swing.JLabel();
        output_gradient = new javax.swing.JTextField();
        label_X = new javax.swing.JLabel();
        output_Sign = new javax.swing.JTextField();
        output_yintercept = new javax.swing.JTextField();
        button_CALCULATE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Equation of a Straight Line");
        setName("frame_equationline"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        PromptSupport.setPrompt("Enter value of x₁", input_x1);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_x1);
        input_x1.setBackground(new java.awt.Color(238, 238, 238));
        input_x1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_x1.setForeground(new java.awt.Color(153, 153, 174));
        input_x1.setToolTipText(null);
        input_x1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of y₁", input_y1);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_y1);
        input_y1.setBackground(new java.awt.Color(238, 238, 238));
        input_y1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_y1.setForeground(new java.awt.Color(153, 153, 174));
        input_y1.setToolTipText(null);
        input_y1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of x₂", input_x2);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_x2);
        input_x2.setBackground(new java.awt.Color(238, 238, 238));
        input_x2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_x2.setForeground(new java.awt.Color(153, 153, 174));
        input_x2.setToolTipText(null);
        input_x2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("Enter value of y₂", input_y2);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_y2);
        input_y2.setBackground(new java.awt.Color(238, 238, 238));
        input_y2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_y2.setForeground(new java.awt.Color(153, 153, 174));
        input_y2.setToolTipText(null);
        input_y2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        button_CLEAR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_CLEAR.setText("CLEAR");
        button_CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CLEARActionPerformed(evt);
            }
        });

        infoBox.setEditable(false);
        infoBox.setBackground(new java.awt.Color(249, 203, 156));
        infoBox.setColumns(20);
        infoBox.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        infoBox.setForeground(new java.awt.Color(0, 0, 0));
        infoBox.setLineWrap(true);
        infoBox.setRows(5);
        infoBox.setText("To find the equation of a straight line, we can use any two coordinates in the form of \n( x₁ , y₁) and ( x₂ , y₂ ) with the equation: \n\nm = ( y₂ - y₁ ) / ( x₂ - x₁ )");
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

        label_yequals.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_yequals.setForeground(new java.awt.Color(0, 0, 0));
        label_yequals.setText("y =");
        label_yequals.setToolTipText("");

        output_gradient.setEditable(false);
        output_gradient.setBackground(new java.awt.Color(238, 238, 238));
        output_gradient.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_gradient.setForeground(new java.awt.Color(153, 153, 174));
        output_gradient.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output_gradient.setText("Gradient");
        output_gradient.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        label_X.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_X.setForeground(new java.awt.Color(0, 0, 0));
        label_X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_X.setText("x");
        label_X.setToolTipText("");

        output_Sign.setEditable(false);
        output_Sign.setBackground(new java.awt.Color(238, 238, 238));
        output_Sign.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_Sign.setForeground(new java.awt.Color(153, 153, 174));
        output_Sign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output_Sign.setText("Sign");
        output_Sign.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));
        /*
        */

        output_yintercept.setEditable(false);
        output_yintercept.setBackground(new java.awt.Color(238, 238, 238));
        output_yintercept.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_yintercept.setForeground(new java.awt.Color(153, 153, 174));
        output_yintercept.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output_yintercept.setText("y - intercept");
        output_yintercept.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));
        /*
        */

        button_CALCULATE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_CALCULATE.setText("CALCULATE");
        button_CALCULATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CALCULATEActionPerformed(evt);
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
                        .addComponent(input_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(input_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(524, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_yequals)
                                .addGap(18, 18, 18)
                                .addComponent(output_gradient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_X)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(output_Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(output_yintercept, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addComponent(input_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(input_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(MATH_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(output_Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(output_yintercept, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_X, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(output_gradient, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addComponent(label_yequals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(73, 73, 73)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
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

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(output_gradient);
        output_gradient.setText("Gradient");
        
        Methods.cleartf(output_Sign);
        output_Sign.setText("Sign");
        
        Methods.cleartf(output_yintercept);
        output_yintercept.setText("y - intercept");
        
        Methods.cleartf(input_x1);
        PromptSupport.setPrompt("Enter value of x₁", input_x1);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_x1);   
        
        Methods.cleartf(input_y1);
        PromptSupport.setPrompt("Enter value of y₁", input_y1);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_y1); 
        
        Methods.cleartf(input_x2);
        PromptSupport.setPrompt("Enter value of x₂", input_x2);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_x2);
        
        Methods.cleartf(input_y2);
        PromptSupport.setPrompt("Enter value of y₂", input_y2);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_y2);
    }//GEN-LAST:event_button_CLEARActionPerformed

    private void button_CALCULATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CALCULATEActionPerformed
        // Error initially set to False
        boolean error = false; 

        // Inputs to String
        String x1str = input_x1.getText();
        String y1str = input_y1.getText();
        String x2str = input_x2.getText();
        String y2str = input_y2.getText();

        // Doubles that will get its corresponding String value
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        
        // ArrayList that will add any JTextField that it finds to be empty
        ArrayList<JTextField> emptyTextFields = new ArrayList<JTextField>();
        
        try {
            x1 = Double.parseDouble(x1str);
        } catch (NumberFormatException e) {
            if (x1str.equals("")) {
                emptyTextFields.add(input_x1);
            } else {
                error = true;
                Methods.seterrorTf(input_x1);
            }
        }
        
        try {
            y1 = Double.parseDouble(y1str);
        } catch (NumberFormatException e) {
            if (y1str.equals("")) {
                emptyTextFields.add(input_y1);
            } else {
                error = true;
                Methods.seterrorTf(input_y1);
            }
        }
        
        try {
            x2 = Double.parseDouble(x2str);
        } catch (NumberFormatException e) {
            if (x2str.equals("")) {
                emptyTextFields.add(input_x2);
            } else {
                error = true;
                Methods.seterrorTf(input_x2);
            }
        }
        
        try {
            y2 = Double.parseDouble(y2str);
        } catch (NumberFormatException e) {
            if (y2str.equals("")) {
                emptyTextFields.add(input_y2);
            } else {
                error = true;
                Methods.seterrorTf(input_y2);
            }
        }
        
        if (!(error)) {
            if (emptyTextFields.size() == 4 || emptyTextFields.size() == 3 || emptyTextFields.size() == 2 || emptyTextFields.size() == 1) {
                Methods.setemptyTf(input_x1);
                Methods.setemptyTf(input_y1);
                Methods.setemptyTf(input_x2);
                Methods.setemptyTf(input_y2);
            } else {
                double gradient = (y2 - y1) / (x2 - x1);
                output_gradient.setText(String.valueOf(gradient));
                double c = y1 - (gradient * x1);
                if (c < 0) {
                    output_Sign.setText(" - ");
                } else {
                    output_Sign.setText(" + ");
                }
                output_yintercept.setText(String.valueOf(Math.abs(c)));
            }
        }
        
    }//GEN-LAST:event_button_CALCULATEActionPerformed

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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equation_Line().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MATH_TOOLS;
    private javax.swing.JButton button_CALCULATE;
    private javax.swing.JButton button_CLEAR;
    private javax.swing.JButton button_GoBack;
    private javax.swing.JTextArea infoBox;
    private javax.swing.JTextField input_x1;
    private javax.swing.JTextField input_x2;
    private javax.swing.JTextField input_y1;
    private javax.swing.JTextField input_y2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_X;
    private javax.swing.JLabel label_yequals;
    private javax.swing.JTextField output_Sign;
    private javax.swing.JTextField output_gradient;
    private javax.swing.JTextField output_yintercept;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
