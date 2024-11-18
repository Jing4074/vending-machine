package vending_machine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class notepad extends javax.swing.JFrame {
    //Reference from (https://github.com/Nilesh-d/TextLogin/blob/master/NotepadLogin/src/textlogin/notepad.java)
    File f = new File("src\\vending_machine");
    int ln;
    String Username,Password;
    
    public notepad() {
        initComponents();
    }

    
    void readFile(){
        try {
            FileReader fr = new FileReader(f+"admin.txt");
            System.out.println("File exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f+"admin.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
    
    void addData(String usr,String pswd){
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\admin.txt", "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            //if condition added after video to have no lines on first entry
            if(ln>0){
                System.out.print("Success added new admin");
                      
            }
            raf.writeBytes(usr+ ",");
            raf.writeBytes(pswd+ "\r\n");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void CheckData(String usr,String pswd){
    
        try {
            RandomAccessFile raf = new RandomAccessFile(f+"\\admin.txt", "rw");
            String line = raf.readLine();
            Username=line.substring(9);
            Password=raf.readLine().substring(9);
            
            if(usr.equals(Username)& pswd.equals(Password)){
                JOptionPane.showMessageDialog(null, "Password matched");
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Username or Password");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    void logic(String usr,String pswd){
        try {
            List<String> lines = Files.readAllLines(Paths.get(f + "\\admin.txt"), StandardCharsets.UTF_8);

            boolean found = false;

            for (String line : lines) {
                String[] parts = line.split(",");

                String forUser = parts[0];
                String forPswd = parts[1];

                if (usr.equals(forUser) && pswd.equals(forPswd)) {
                    JOptionPane.showMessageDialog(null, "Login Success");
                    AdminHomepage adminHomepage = new AdminHomepage();
                    adminHomepage.setVisible(true);
                    found = true;
                    setVisible(false);
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Incorrect username/password");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }
    
    public void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f+"\\admin.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of admin:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_txtfield = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        show_password_chkbox = new javax.swing.JCheckBox();
        password_txtfield = new javax.swing.JPasswordField();
        cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        clear_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        clear_button.setText("Clear all");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Password");

        user_txtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtfieldActionPerformed(evt);
            }
        });

        register_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("STAFF LOGIN/REGISTER");

        show_password_chkbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_password_chkbox.setText("Show Password");
        show_password_chkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password_chkboxActionPerformed(evt);
            }
        });

        password_txtfield.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cancel_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(register_button)
                                .addGap(40, 40, 40)
                                .addComponent(login_button)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(show_password_chkbox))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(clear_button)
                                .addGap(49, 49, 49)
                                .addComponent(cancel_button)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_txtfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(show_password_chkbox)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(register_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
    readFile();
    countLines();
    String username = user_txtfield.getText();
    String password = password_txtfield.getText();
    logic(username,password); 
    }//GEN-LAST:event_login_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
    user_txtfield.setText("");     
    password_txtfield.setText("");

    }//GEN-LAST:event_clear_buttonActionPerformed

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
    readFile();
    countLines();
    String username = user_txtfield.getText();
    String password = password_txtfield.getText();
    addData(username,password);  
    JOptionPane.showMessageDialog(null,"Data Registered");    
    }//GEN-LAST:event_register_buttonActionPerformed

    private void user_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtfieldActionPerformed
     
    }//GEN-LAST:event_user_txtfieldActionPerformed

    private void show_password_chkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password_chkboxActionPerformed
        if(show_password_chkbox.isSelected()){
            password_txtfield.setEchoChar((char)0);
        }else{
            password_txtfield.setEchoChar(('*'));
        }
    }//GEN-LAST:event_show_password_chkboxActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancel_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton clear_button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_txtfield;
    private javax.swing.JButton register_button;
    private javax.swing.JCheckBox show_password_chkbox;
    private javax.swing.JTextField user_txtfield;
    // End of variables declaration//GEN-END:variables
}
