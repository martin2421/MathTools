package GUI;

import java.util.ArrayList;
import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

public class Simultaneous_Equation extends javax.swing.JFrame {

    public Simultaneous_Equation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        label_firstEquation = new javax.swing.JLabel();
        label_secondEquation = new javax.swing.JLabel();
        input_a = new javax.swing.JTextField();
        input_b = new javax.swing.JTextField();
        input_m = new javax.swing.JTextField();
        input_c = new javax.swing.JTextField();
        input_d = new javax.swing.JTextField();
        input_n = new javax.swing.JTextField();
        label_X1 = new javax.swing.JLabel();
        label_Y1 = new javax.swing.JLabel();
        label_X2 = new javax.swing.JLabel();
        label_Y2 = new javax.swing.JLabel();
        label_XAnswer = new javax.swing.JLabel();
        label_YAnswer = new javax.swing.JLabel();
        output_X = new javax.swing.JTextField();
        output_Y = new javax.swing.JTextField();
        button_CALCULATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        button_GoBack = new javax.swing.JButton();
        MATH_TOOLS = new javax.swing.JLabel();
        button_CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Tools - Simultaneous Equations");
        setName("frame_simulequations"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 243, 228));

        label_firstEquation.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_firstEquation.setForeground(new java.awt.Color(0, 0, 0));
        label_firstEquation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_firstEquation.setText("1st Equation:");
        label_firstEquation.setToolTipText("");

        label_secondEquation.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_secondEquation.setForeground(new java.awt.Color(0, 0, 0));
        label_secondEquation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_secondEquation.setText("2nd Equation:");
        label_secondEquation.setToolTipText("");

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

        PromptSupport.setPrompt("m", input_m);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_m);
        input_m.setBackground(new java.awt.Color(238, 238, 238));
        input_m.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_m.setForeground(new java.awt.Color(153, 153, 174));
        input_m.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_m.setToolTipText(null);
        input_m.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("c", input_c);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_c);
        input_c.setBackground(new java.awt.Color(238, 238, 238));
        input_c.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_c.setForeground(new java.awt.Color(153, 153, 174));
        input_c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_c.setToolTipText(null);
        input_c.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("d", input_d);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_d);
        input_d.setBackground(new java.awt.Color(238, 238, 238));
        input_d.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_d.setForeground(new java.awt.Color(153, 153, 174));
        input_d.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_d.setToolTipText(null);
        input_d.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        PromptSupport.setPrompt("n", input_n);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT,input_n);
        input_n.setBackground(new java.awt.Color(238, 238, 238));
        input_n.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_n.setForeground(new java.awt.Color(153, 153, 174));
        input_n.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_n.setToolTipText(null);
        input_n.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        label_X1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_X1.setForeground(new java.awt.Color(0, 0, 0));
        label_X1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_X1.setText("x   + ");
        label_X1.setToolTipText("");

        label_Y1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_Y1.setForeground(new java.awt.Color(0, 0, 0));
        label_Y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Y1.setText("y = ");
        label_Y1.setToolTipText("");

        label_X2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_X2.setForeground(new java.awt.Color(0, 0, 0));
        label_X2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_X2.setText("x   + ");
        label_X2.setToolTipText("");

        label_Y2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_Y2.setForeground(new java.awt.Color(0, 0, 0));
        label_Y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Y2.setText("y = ");
        label_Y2.setToolTipText("");

        label_XAnswer.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_XAnswer.setForeground(new java.awt.Color(0, 0, 0));
        label_XAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_XAnswer.setText("x = ");
        label_XAnswer.setToolTipText("");

        label_YAnswer.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_YAnswer.setForeground(new java.awt.Color(0, 0, 0));
        label_YAnswer.setText("y =");
        label_YAnswer.setToolTipText("");

        output_X.setEditable(false);
        output_X.setBackground(new java.awt.Color(238, 238, 238));
        output_X.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_X.setForeground(new java.awt.Color(153, 153, 174));
        output_X.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output_X.setText("Answer");
        output_X.setToolTipText(null);
        output_X.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

        output_Y.setEditable(false);
        output_Y.setBackground(new java.awt.Color(238, 238, 238));
        output_Y.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        output_Y.setForeground(new java.awt.Color(153, 153, 174));
        output_Y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output_Y.setText("Answer");
        output_Y.setToolTipText(null);
        output_Y.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174)));

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
        infoBox.setText("Fill in the values for a, b, c, d, m, and n in order to solve the simultaneous equation and solve for x and y.");
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
                .addGap(21, 21, 21)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(MATH_TOOLS, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(595, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(label_firstEquation)
                                        .addGap(18, 18, 18)
                                        .addComponent(input_a, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_X1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(label_Y1)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label_XAnswer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(output_X, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(label_YAnswer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(output_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(input_m, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_secondEquation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_c, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_X2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_d, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(label_Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_n, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_YAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_CALCULATE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_GoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(MATH_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(output_X, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_XAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)))
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_X1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_firstEquation, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_b, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_m, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_secondEquation, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_c, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_X2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_d, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_n, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(label_Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
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
        String astr = input_a.getText();
        String bstr = input_b.getText();
        String cstr = input_c.getText();
        String dstr = input_d.getText();
        String mstr = input_m.getText();
        String nstr = input_n.getText();

        // Doubles that will get its corresponding String value
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double m = 0;
        double n = 0;

        // ArrayList that will add any JTextField that it finds to be empty
        ArrayList<JTextField> emptyTextFields = new ArrayList<JTextField>();

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
            c = Double.parseDouble(cstr);
        } catch (NumberFormatException e) {
            if (cstr.equals("")) {
                emptyTextFields.add(input_c);
            } else {
                error = true;
                Methods.seterrorTf(input_c);
            }
        }

        try {
            d = Double.parseDouble(dstr);
        } catch (NumberFormatException e) {
            if (dstr.equals("")) {
                emptyTextFields.add(input_d);
            } else {
                error = true;
                Methods.seterrorTf(input_d);
            }
        }

        try {
            m = Double.parseDouble(mstr);
        } catch (NumberFormatException e) {
            if (mstr.equals("")) {
                emptyTextFields.add(input_m);
            } else {
                error = true;
                Methods.seterrorTf(input_m);
            }
        }

        try {
            n = Double.parseDouble(nstr);
        } catch (NumberFormatException e) {
            if (nstr.equals("")) {
                emptyTextFields.add(input_n);
            } else {
                error = true;
                Methods.seterrorTf(input_n);
            }
        }

        if (!(error)) {
            if (emptyTextFields.size() == 6 || emptyTextFields.size() == 5 || emptyTextFields.size() == 4
                || emptyTextFields.size() == 3 || emptyTextFields.size() == 2 || emptyTextFields.size() == 1) {
                Methods.setemptyTf(input_a);
                Methods.setemptyTf(input_b);
                Methods.setemptyTf(input_c);
                Methods.setemptyTf(input_d);
                Methods.setemptyTf(input_m);
                Methods.setemptyTf(input_n);
            } else {
                double X = (b * n - d * m) / (b * c - a * d);
                output_X.setText(String.valueOf(X));
                double Y = (a * n - c * m) / (a * d - b * c);
                output_Y.setText(String.valueOf(Y));
            }
        }

    }//GEN-LAST:event_button_CALCULATEActionPerformed

    private void button_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CLEARActionPerformed
        Methods.cleartf(output_X);
        output_X.setText("Answer");

        Methods.cleartf(output_Y);
        output_Y.setText("Answer");

        Methods.cleartf(input_a);
        PromptSupport.setPrompt("a", input_a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_a);

        Methods.cleartf(input_b);
        PromptSupport.setPrompt("b", input_b);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_b);

        Methods.cleartf(input_c);
        PromptSupport.setPrompt("c", input_c);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_c);

        Methods.cleartf(input_d);
        PromptSupport.setPrompt("d", input_d);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_d);

        Methods.cleartf(input_m);
        PromptSupport.setPrompt("m", input_m);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_m);

        Methods.cleartf(input_n);
        PromptSupport.setPrompt("n", input_n);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, input_n);
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simultaneous_Equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simultaneous_Equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simultaneous_Equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simultaneous_Equation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simultaneous_Equation().setVisible(true);
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
    private javax.swing.JTextField input_d;
    private javax.swing.JTextField input_m;
    private javax.swing.JTextField input_n;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_X1;
    private javax.swing.JLabel label_X2;
    private javax.swing.JLabel label_XAnswer;
    private javax.swing.JLabel label_Y1;
    private javax.swing.JLabel label_Y2;
    private javax.swing.JLabel label_YAnswer;
    private javax.swing.JLabel label_firstEquation;
    private javax.swing.JLabel label_secondEquation;
    private javax.swing.JTextField output_X;
    private javax.swing.JTextField output_Y;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
