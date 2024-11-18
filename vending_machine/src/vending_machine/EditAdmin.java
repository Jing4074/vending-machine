package vending_machine;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EditAdmin extends javax.swing.JFrame {

    String filePath = "src\\vending_machine\\admin.txt";
    
    public EditAdmin() {
        initComponents();
    }

    EditAdmin(String loggedInUsername) {
         
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        old_password_txtfield = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_txtfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        show_password_chkbox = new javax.swing.JCheckBox();
        edit_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        new_password_txtfield = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        new_user_txtfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        old_password_txtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Your Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Old Password:");

        user_txtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("EDIT STAFF");

        show_password_chkbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_password_chkbox.setText("Show Password");
        show_password_chkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password_chkboxActionPerformed(evt);
            }
        });

        edit_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        edit_button.setText("SAVE");
        edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_buttonActionPerformed(evt);
            }
        });

        clear_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        clear_button.setText("CLEAR");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        cancel_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cancel_button.setText("CANCEL");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Please enter username and password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("New Password:");

        new_password_txtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        new_password_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_password_txtfieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("New Username:");

        new_user_txtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        new_user_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_user_txtfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(show_password_chkbox)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit_button)
                        .addGap(50, 50, 50)
                        .addComponent(clear_button)
                        .addGap(50, 50, 50)
                        .addComponent(cancel_button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(new_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(new_user_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(old_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_txtfield)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_user_txtfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(old_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_password_chkbox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button)
                    .addComponent(clear_button)
                    .addComponent(cancel_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtfieldActionPerformed

        
    }//GEN-LAST:event_user_txtfieldActionPerformed
    
    public void setUserTextFieldText(String text) {
        user_txtfield.setText(text);
    }
    
    private void show_password_chkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password_chkboxActionPerformed
        if(show_password_chkbox.isSelected()){
            old_password_txtfield.setEchoChar((char)0);
            new_password_txtfield.setEchoChar((char)0);
        }else{
            old_password_txtfield.setEchoChar(('*'));
            new_password_txtfield.setEchoChar(('*'));
        }
    }//GEN-LAST:event_show_password_chkboxActionPerformed

    private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
        // edit staff profile
        String oldUsername = user_txtfield.getText();
        String newUsername = new_user_txtfield.getText();
        String oldPassword = old_password_txtfield.getText();
        String newPassword = new_password_txtfield.getText();
    
        ArrayList<String> newUser = new ArrayList<>();
        boolean edited = false; // Flag to track if any data was edited
        
        try {
            FileReader fr = new FileReader(filePath);
            Scanner reader = new Scanner(fr);
            String line;
            String[] lineArr;

            while (reader.hasNextLine()) {
                line = reader.nextLine();
                lineArr = line.split(",");

            
            if (lineArr[0].equals(oldUsername)) {
                JOptionPane.showMessageDialog(null, "User found");
                if (lineArr[1].equals(oldPassword)) {
                    line = newUsername + "," + newPassword;
                    edited = true; // Set the flag to true
                }else{
                    JOptionPane.showMessageDialog(null, "Password does not match");
                    user_txtfield.setText("");
                    new_user_txtfield.setText("");
                    old_password_txtfield.setText("");
                    new_password_txtfield.setText("");
                }
            }           
            newUser.add(line);
        }
        
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (PrintWriter pr = new PrintWriter(filePath)) {
            newUser.forEach((str) -> {
                pr.println(str);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Show a message if data was edited
        if (edited) {
            JOptionPane.showMessageDialog(null, "Data has been successfully edited");
        }
       
    }//GEN-LAST:event_edit_buttonActionPerformed

    private void new_password_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_password_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_password_txtfieldActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        user_txtfield.setText("");
        new_user_txtfield.setText("");
        old_password_txtfield.setText("");
        new_password_txtfield.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void new_user_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_user_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_user_txtfieldActionPerformed

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
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton edit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField new_password_txtfield;
    private javax.swing.JTextField new_user_txtfield;
    private javax.swing.JPasswordField old_password_txtfield;
    private javax.swing.JCheckBox show_password_chkbox;
    private javax.swing.JTextField user_txtfield;
    // End of variables declaration//GEN-END:variables
}
