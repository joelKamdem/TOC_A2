/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import pda.BinaryPda;
import pda.Palindrome;
import pda.PalindromeGenerator;

import java.awt.Color;
import java.util.Stack;

/**
 *
 * @author tsaku
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ispal_string = new javax.swing.JTextField();
        compute = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        response1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        binaryInput = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        response2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        palindrome_alphabet = new javax.swing.JTextField();
        response3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Task:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I. Detect Palindrome Language", "II. Detect 0^n1^n Language", "III. Generate Palindrome"}));

        jLabel2.setText("I. Enter Text:");

        ispal_string.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ispal_stringActionPerformed(evt);
            }
        });

        compute.setText("Compute ");
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/palindrome.png"))); // NOI18N
        jLabel3.setText("Palindrome");

        response1.setText("Test Response");

        jLabel5.setText("II. Enter 0^n1^n Language Sequesnce: ");

        binaryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binaryInputActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        response2.setText("Test Response");

        jLabel6.setText("III. Enter Desired Palindrome Alphabet: ");

        palindrome_alphabet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palindrome_alphabetActionPerformed(evt);
            }
        });

        response3.setText("Test Response");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 171, Short.MAX_VALUE)
                                    .addComponent(ispal_string)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(palindrome_alphabet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(binaryInput)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(compute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(response1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(response2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(response3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ispal_string, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(compute))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(response1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(binaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(response2)))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palindrome_alphabet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(response3))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        // TODO add your handling code here:
        //DFA_Structures dfa_list = new DFA_Structures();
        Boolean sentinel;
        if (jComboBox1.getSelectedItem().equals("I. Detect Palindrome Language")) {
            sentinel = false;
            try {
                System.out.print(ispal_string.getText());
                Stack<Character> stack = new Stack<Character>();
                sentinel = Palindrome.isPalindrome(stack, ispal_string.getText());
                if (sentinel) {
                    System.out.println(sentinel);
                    response1.setText("Correct");
                    response1.setBackground(Color.blue);
                } else {
                    response1.setText("Wrong");
                    response1.setBackground(Color.red);
                }
                response1.setOpaque(true);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (jComboBox1.getSelectedItem().equals("II. Detect 0^n1^n Language")) {
            sentinel = false;
            try {
                sentinel = BinaryPda.isBinaryPda(binaryInput.getText());
                if (sentinel) {
                    response2.setText("Correct");
                    response2.setBackground(Color.blue);
                } else {
                    response2.setText("Wrong");
                    response2.setBackground(Color.red);
                }
                response2.setOpaque(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (jComboBox1.getSelectedItem().equals("III. Generate Palindrome")) {
            String result = "";
            try {
                result = PalindromeGenerator.makePalindrome(palindrome_alphabet.getText());
                Stack<Character> stack = new Stack<Character>();
                if (Palindrome.isPalindrome(stack, result)) {
                    System.out.print(result.toString());
                    response3.setText(result);
                    response3.setBackground(Color.blue);
                    
                } else {
                    response3.setText("Wrong");
                    response3.setBackground(Color.red);
                }
                 } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    
    }//GEN-LAST:event_computeActionPerformed

    private void palindrome_alphabetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palindrome_alphabetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palindrome_alphabetActionPerformed

    private void binaryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binaryInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_binaryInputActionPerformed

    private void ispal_stringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ispal_stringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ispal_stringActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField binaryInput;
    private javax.swing.JButton compute;
    private javax.swing.JTextField ispal_string;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField palindrome_alphabet;
    private javax.swing.JLabel response1;
    private javax.swing.JButton response2;
    private javax.swing.JButton response3;
    // End of variables declaration//GEN-END:variables
}
