package GUI;

import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

public class Methods extends JTextField {
   
    /**
     * Empties a TextField after no input (Gives message "Enter a number")
     * @param tf the TextField to empty
     */
    public static void setemptyTf(JTextField tf) {
        tf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))); //Sets border to RED
        tf.setText("");
        PromptSupport.setPrompt("Enter a number", tf);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, tf);
    }

    
    /**
     * Empties a TextField after wrong input (Gives message "Error")
     * @param tf the TextField to empty and set an error indicator
     */
    public static void seterrorTf(JTextField tf) {
        tf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))); //Sets border to RED
        tf.setText("");
        PromptSupport.setPrompt("Error", tf);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, tf);
    }

    
    /**
     * Empties a TextField if 2 input's are the same (i.e Pythagoras - b/a and c can't be the same)
     * Gives message "Error - values can't be equal"
     * @param tf the TextField to empty and set an error indicator
     */
    public static void setequalerrorTf(JTextField tf) {
        tf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0))); //Sets border to RED
        tf.setText("");
        PromptSupport.setPrompt("Error - values can't be equal", tf);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, tf);
    }

    
    /**
     * Empties a TextField and return to it's original form / color (without any sign of error)
     * @param tf the TextField to empty and set an error indicator
     */
    public static void cleartf(JTextField tf) {
        tf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 174))); //Sets border to original color
        tf.setText("");
        tf.setToolTipText(null);
    }

    
    /**
     * Checks if a TextField is empty or not (returns true or false)
     * @param tf the TextField to check
     * @return empty, if true => TextField is empty || if false =? TextField is not empty
     */
    public static boolean tfisempty(JTextField tf) {
        boolean empty;
        String str = tf.getText().trim();
        if (str.equals("")) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }
    
    
    /**
     * Find the Lowest Common Multiple (LCM) between two numbers
     * @param number1 the first number from input, can't be 0
     * @param number2 the second number from input, can't be 0
     * @return lcm, the Lowest Common Multiple between both values
     */
    public static double lcm(double number1, double number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        double absNumber1 = Math.abs(number1);
        double absNumber2 = Math.abs(number2);
        double absHigherNumber = Math.max(absNumber1, absNumber2);
        double absLowerNumber = Math.min(absNumber1, absNumber2);
        double lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }
    
    
    /**
     * Find the Highest Common Factor (HCF) between two numbers
     * @param number1 the first number from input
     * @param number2 the second number from input
     * @return hcf, Highest Common Factor between both values
     */
    public static double hcf(double number1, double number2) {
        double i = number1 % number2;
        while (i != 0) {
            number1 = number2;
            number2 = i;
            i = number1 % number2;
        }
        return number2;
    }
    

}