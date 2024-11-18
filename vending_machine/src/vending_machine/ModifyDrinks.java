package vending_machine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModifyDrinks extends javax.swing.JFrame {


    String filePath = "src\\vending_machine\\Drinks.txt";
    int ln;
    String Username,Password;
    public ModifyDrinks() {
        initComponents();
    }
    
//    void createFolder(){
//        if(!filePath.exists()){
//            filePath.mkdirs();
//        }
//    }
    
    void readFile(){
        try {
            FileReader fr = new FileReader(filePath);
            System.out.println("File exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(filePath);
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
    
    //DONE
    void addData(String drinkName,String drinkPrice, String drinkQuantity){
        try {
            RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            //if condition added after video to have no lines on first entry
            if(ln>0){
                System.out.print("Success");
                      
            }
            raf.writeBytes(drinkName+ ",");
            raf.writeBytes(drinkPrice+ ",");
            raf.writeBytes(drinkQuantity+ "\r\n");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //MODIFY VARIABLES FROM HERE

    void CheckData(String drinkName, String drinkPrice, String drinkQuantity) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String storedName = parts[0].trim();
//                    String storedPrice = parts[1].trim();
                    String storedQuantity = parts[2].trim();

                    if (drinkName.equals(storedName) && drinkQuantity.equals(storedQuantity)) {
                        JOptionPane.showMessageDialog(null, "Match found for " + drinkName);
                        break; 
                    }
                }
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    void logic(String drinkName,String drinkPrice, String drinkQuantity){
//        try {
//            RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
//            for(int i = 0; i < ln; i++){ 
//                String line = raf.readLine();
//                String[] parts = line.split(",");
//
//                String forDrkName = parts[0];
//                String forDrkPrice = parts[1];
//                String forDrkQuantity = parts[2];
//            
//                if(drinkName.equals(forDrkName)){
//                    JOptionPane.showMessageDialog(null, "Login Success");
//                    break;
//                }else if(i==(ln-1)){
//                    JOptionPane.showMessageDialog(null, "Incorrect username/password");
//                    break;
//                }
//                // if you are using user & passwword without email
//                // then dont forget to replace  k<=2 with k=2 below
//                for(int k=1;k<=2;k++){
//                    raf.readLine();
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    public void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of Drinks:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        add_drinks_button = new javax.swing.JButton();
        select_drink_combobox = new javax.swing.JComboBox<>();
        add_quantity_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        add_quantity_txtfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Modify Drinks");

        add_drinks_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add_drinks_button.setText("Add New Drinks");
        add_drinks_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_drinks_buttonActionPerformed(evt);
            }
        });

        select_drink_combobox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        select_drink_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a Drink--", "Pepsi", "Coca Cola", "Sprite", "100 plus", "Fanta Orange", "Mountain Dew", "Milo Can", "Mineral Water", "A&W", "Nescafe Latte", "Yoes Drink Chrysanthemum Tea", "Kickapoo" }));

        add_quantity_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add_quantity_button.setText("Add Quantity");
        add_quantity_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_quantity_buttonActionPerformed(evt);
            }
        });

        cancel_button.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Add to Stock");

        add_quantity_txtfield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add_quantity_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_quantity_txtfield.setText("0");
        add_quantity_txtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add_quantity_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_quantity_txtfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(select_drink_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(add_quantity_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add_drinks_button)
                        .addGap(34, 34, 34)
                        .addComponent(add_quantity_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel_button)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select_drink_combobox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_quantity_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_quantity_button)
                            .addComponent(cancel_button)
                            .addComponent(add_drinks_button))
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_drinks_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_drinks_buttonActionPerformed
        // add new drinks to Drinks.txt
        String new_drink_Name = JOptionPane.showInputDialog("Enter Drink Name: ");
        double new_drink_Price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price of the Drink: "));
        int new_drink_Quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity of the Drink: "));
        
        String newDrinkLine = new_drink_Name + "," + new_drink_Price + "," + new_drink_Quantity+",0";
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(newDrinkLine);
            JOptionPane.showMessageDialog(null, "New drink added successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding new drink.");
        }    
    }//GEN-LAST:event_add_drinks_buttonActionPerformed

    private void add_quantity_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_quantity_buttonActionPerformed
        //add quantity to selected drink
        
        String select_drink = (String) select_drink_combobox.getSelectedItem();
        double add_quantity = Double.parseDouble(add_quantity_txtfield.getText());        
        
        if(add_quantity >= 1){
            try {
                FileReader fr = new FileReader(filePath);
                Scanner reader = new Scanner(fr);
                String line;
                List<String> newDrinkQuantity = new ArrayList<>(); // Create a list to store modified lines
                boolean modified = false; // Flag to indicate if data was modified

                while (reader.hasNextLine()) {
                    line = reader.nextLine();
                    String[] lineArr = line.split(",");

                //lineArr.length can delete
                if (lineArr.length >= 3 && lineArr[0].equals(select_drink)) {
                    int oldQuantity = Integer.parseInt(lineArr[2]);
                    int newQuantity = oldQuantity + (int) add_quantity;
                    lineArr[2] = String.valueOf(newQuantity);
                    modified = true; // Set the flag to true
                }

                newDrinkQuantity.add(String.join(",", lineArr)); // Reconstruct the line and add to the list
            }

            reader.close();
            fr.close();

            if (modified) {
                try (PrintWriter pr = new PrintWriter(filePath)) {
                    newDrinkQuantity.forEach((str) -> {
                        pr.println(str);
                    });
                } catch (Exception e) {
                    // Handle the exception
                }
                JOptionPane.showMessageDialog(null, "Quantity has been updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Selected drink not found");
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please insert quantity");
        }
    }//GEN-LAST:event_add_quantity_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void add_quantity_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_quantity_txtfieldActionPerformed
        
    }//GEN-LAST:event_add_quantity_txtfieldActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyDrinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyDrinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_drinks_button;
    private javax.swing.JButton add_quantity_button;
    private javax.swing.JTextField add_quantity_txtfield;
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> select_drink_combobox;
    // End of variables declaration//GEN-END:variables
}
