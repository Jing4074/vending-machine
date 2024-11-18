package vending_machine;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class vendingmenu extends javax.swing.JFrame {
    int[] drink = new int[12];
    double [] i = new double [12];
    java.io.File f = new java.io.File("src\\vending_machine");
    String filePath = "src\\vending_machine\\Drinks.txt";
    String fileOrder = "src\\vending_machine\\orders.txt";
    
    public vendingmenu() {
        initComponents();
        
        try {
        BufferedReader reader = new BufferedReader(new FileReader(f+"\\Drinks.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 3) {
                String drinkName = parts[0].trim();
                String quantityStr = parts[2].trim();
                int showquantity = Integer.parseInt(quantityStr);

                switch (drinkName) {
                    case "Pepsi":
                        show_quantity_pepsi.setText(String.valueOf(showquantity));
                        break;
                    case "Coca Cola":
                        show_quantity_cola.setText(String.valueOf(showquantity));
                        break;
                    case "Sprite":
                        show_quantity_sprite.setText(String.valueOf(showquantity));
                        break;                
                    case "100 plus":
                        show_quantity_hundredplus.setText(String.valueOf(showquantity));
                        break;                
                    case "Fanta Orange":
                        show_quantity_fanta.setText(String.valueOf(showquantity));
                        break;                
                    case "Mountain Dew":
                        show_quantity_mountaindew.setText(String.valueOf(showquantity));
                        break;                
                    case "Milo Can":
                        show_quantity_milo.setText(String.valueOf(showquantity));
                        break;                
                    case "Mineral Water":
                        show_quantity_water.setText(String.valueOf(showquantity));
                        break;                
                    case "A&W":
                        show_quantity_aandw.setText(String.valueOf(showquantity));
                        break;                
                    case "Nescafe Latte":
                        show_quantity_nescafe.setText(String.valueOf(showquantity));
                        break;                
                    case "Yeos Drink Chrysanthemum Tea":
                        show_quantity_yeos.setText(String.valueOf(showquantity));
                        break;                
                    case "Kickapoo":
                        show_quantity_kickapoo.setText(String.valueOf(showquantity));
                        break;                

                }
            }
        }
        reader.close();
    } catch (Exception e) {
        
    }
    }
    
    private void updateDrink(String drinkName, int quantityPurchased) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(drinkName)) {
                    int currentQuantity = Integer.parseInt(parts[2]);
                    int currentSales = Integer.parseInt(parts[3]);
                    int newQuantity = currentQuantity - quantityPurchased;
                    int newSales = currentSales + quantityPurchased;
                    String updatedLine = String.format("%s,%.1f,%d,%d", parts[0], Double.parseDouble(parts[1]), newQuantity, newSales);
                    lines.add(updatedLine);
                } else {
                    lines.add(line);
                }
            }

            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                for (String updatedLine : lines) {
                    writer.println(updatedLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void recordOrder(String drinkName, int quantityPurchased, String paymentMethod, String formattedAmountInserted, String formattedChange, String formattedTotalAmount) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileOrder, true))) {
            Calendar timer = Calendar.getInstance();
            timer.getTime();
            SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
            String getTime= tTime.format(timer.getTime());
            SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
            String getDate = Tdate.format(timer.getTime());
            writer.println( getDate + "," + getTime + ","+ drinkName + "," + quantityPurchased +","+ paymentMethod +","+ formattedAmountInserted +","+ formattedChange +","+formattedTotalAmount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pepsi_chkbox = new javax.swing.JCheckBox();
        sprite_chkbox = new javax.swing.JCheckBox();
        fanta_chkbox = new javax.swing.JCheckBox();
        cola_chkbox = new javax.swing.JCheckBox();
        hundredplus_chkbox = new javax.swing.JCheckBox();
        pepsitxtfield = new javax.swing.JTextField();
        mountaindew_chkbox = new javax.swing.JCheckBox();
        water_chkbox = new javax.swing.JCheckBox();
        milo_chkbox = new javax.swing.JCheckBox();
        aandw_chkbox = new javax.swing.JCheckBox();
        colatxtfield = new javax.swing.JTextField();
        yeos_chkbox = new javax.swing.JCheckBox();
        nescafe_chkbox = new javax.swing.JCheckBox();
        hundredplustxtfield = new javax.swing.JTextField();
        spritetxtfield = new javax.swing.JTextField();
        fantatxtfield = new javax.swing.JTextField();
        mountaindewtxtfield = new javax.swing.JTextField();
        milotxtfield = new javax.swing.JTextField();
        watertxtfield = new javax.swing.JTextField();
        aandwtxtfield = new javax.swing.JTextField();
        nescafetxtfield = new javax.swing.JTextField();
        yeostxtfield = new javax.swing.JTextField();
        kickapoo_chkbox = new javax.swing.JCheckBox();
        kickapootxtfield = new javax.swing.JTextField();
        pepsi_minus_button = new javax.swing.JButton();
        show_quantity_pepsi = new javax.swing.JTextField();
        show_quantity_cola = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        show_quantity_sprite = new javax.swing.JTextField();
        show_quantity_hundredplus = new javax.swing.JTextField();
        show_quantity_fanta = new javax.swing.JTextField();
        show_quantity_mountaindew = new javax.swing.JTextField();
        show_quantity_milo = new javax.swing.JTextField();
        show_quantity_water = new javax.swing.JTextField();
        show_quantity_aandw = new javax.swing.JTextField();
        show_quantity_yeos = new javax.swing.JTextField();
        show_quantity_nescafe = new javax.swing.JTextField();
        show_quantity_kickapoo = new javax.swing.JTextField();
        pepsi_add_button = new javax.swing.JButton();
        hundredplus_add_button = new javax.swing.JButton();
        hundredplus_minus_button = new javax.swing.JButton();
        milo_add_button = new javax.swing.JButton();
        nescafe_add_button = new javax.swing.JButton();
        milo_minus_button = new javax.swing.JButton();
        nescafe_minus_button = new javax.swing.JButton();
        yeos_add_button = new javax.swing.JButton();
        cola_minus_button = new javax.swing.JButton();
        cola_add_button = new javax.swing.JButton();
        yeos_minus_button = new javax.swing.JButton();
        fanta_add_button = new javax.swing.JButton();
        water_add_button = new javax.swing.JButton();
        fanta_minus_button = new javax.swing.JButton();
        water_minus_button = new javax.swing.JButton();
        sprite_add_button = new javax.swing.JButton();
        sprite_minus_button = new javax.swing.JButton();
        mountaindew_add_button = new javax.swing.JButton();
        mountaindew_minus_button = new javax.swing.JButton();
        aandw_add_button = new javax.swing.JButton();
        aandw_minus_button = new javax.swing.JButton();
        kickapoo_add_button = new javax.swing.JButton();
        kickapoo_minus_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        total_amt = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        additem = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt_txtfield = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        amt_insert_txtfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        changetxtfield = new javax.swing.JTextField();
        pay_button = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        payment_method_cb = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 42)); // NOI18N
        jLabel1.setText("VENDING MACHINE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 410, 68));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome, Select a drink:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jPanel1.setToolTipText("Welcome, Select a drink:");
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        pepsi_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        pepsi_chkbox.setText("Pepsi 320ml RM2.00");
        pepsi_chkbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pepsi_chkboxMouseClicked(evt);
            }
        });

        sprite_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        sprite_chkbox.setText("Sprite 320ml RM2.00");

        fanta_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        fanta_chkbox.setText("Fanta Orange 320ml RM2.00");

        cola_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        cola_chkbox.setText("Coca Cola 320ml RM2.00");
        cola_chkbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cola_chkboxMouseClicked(evt);
            }
        });

        hundredplus_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        hundredplus_chkbox.setText("100 plus 320ml RM2.00");

        pepsitxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pepsitxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pepsitxtfield.setText("0");
        pepsitxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mountaindew_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        mountaindew_chkbox.setText("Mountain Dew 300ml RM3.50");

        water_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        water_chkbox.setText("Mineral Water 500ml RM1.50");

        milo_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        milo_chkbox.setText("Milo Can 240ml RM2.50");

        aandw_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        aandw_chkbox.setText("A&W 320ml RM2.00");

        colatxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colatxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        colatxtfield.setText("0");
        colatxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        yeos_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        yeos_chkbox.setText("Yeos Drink Chrysanthemum Tea 250ml RM2.00");

        nescafe_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        nescafe_chkbox.setText("Nescafe Latte 240ml RM2.00");

        hundredplustxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hundredplustxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hundredplustxtfield.setText("0");
        hundredplustxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        spritetxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spritetxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        spritetxtfield.setText("0");
        spritetxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fantatxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fantatxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fantatxtfield.setText("0");
        fantatxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mountaindewtxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mountaindewtxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mountaindewtxtfield.setText("0");
        mountaindewtxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        milotxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        milotxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        milotxtfield.setText("0");
        milotxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        watertxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        watertxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        watertxtfield.setText("0");
        watertxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        aandwtxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aandwtxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aandwtxtfield.setText("0");
        aandwtxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nescafetxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nescafetxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nescafetxtfield.setText("0");
        nescafetxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        yeostxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeostxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yeostxtfield.setText("0");
        yeostxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        kickapoo_chkbox.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        kickapoo_chkbox.setText("Kickapoo 320ml RM2.00");

        kickapootxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kickapootxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kickapootxtfield.setText("0");
        kickapootxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pepsi_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pepsi_minus_button.setText("-");
        pepsi_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        pepsi_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        pepsi_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsi_minus_buttonActionPerformed(evt);
            }
        });

        show_quantity_pepsi.setEditable(false);
        show_quantity_pepsi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_pepsi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_pepsi.setText("0");
        show_quantity_pepsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_cola.setEditable(false);
        show_quantity_cola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_cola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_cola.setText("0");
        show_quantity_cola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 19)); // NOI18N
        jLabel2.setText("In Stock");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 19)); // NOI18N
        jLabel6.setText("In Stock");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 19)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("In Stock");

        show_quantity_sprite.setEditable(false);
        show_quantity_sprite.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_sprite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_sprite.setText("0");
        show_quantity_sprite.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_hundredplus.setEditable(false);
        show_quantity_hundredplus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_hundredplus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_hundredplus.setText("0");
        show_quantity_hundredplus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_fanta.setEditable(false);
        show_quantity_fanta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_fanta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_fanta.setText("0");
        show_quantity_fanta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_mountaindew.setEditable(false);
        show_quantity_mountaindew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_mountaindew.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_mountaindew.setText("0");
        show_quantity_mountaindew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_milo.setEditable(false);
        show_quantity_milo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_milo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_milo.setText("0");
        show_quantity_milo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_water.setEditable(false);
        show_quantity_water.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_water.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_water.setText("0");
        show_quantity_water.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_aandw.setEditable(false);
        show_quantity_aandw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_aandw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_aandw.setText("0");
        show_quantity_aandw.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_yeos.setEditable(false);
        show_quantity_yeos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_yeos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_yeos.setText("0");
        show_quantity_yeos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_nescafe.setEditable(false);
        show_quantity_nescafe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_nescafe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_nescafe.setText("0");
        show_quantity_nescafe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        show_quantity_kickapoo.setEditable(false);
        show_quantity_kickapoo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_quantity_kickapoo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_quantity_kickapoo.setText("0");
        show_quantity_kickapoo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pepsi_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pepsi_add_button.setText("+");
        pepsi_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        pepsi_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        pepsi_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsi_add_buttonActionPerformed(evt);
            }
        });

        hundredplus_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hundredplus_add_button.setText("+");
        hundredplus_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        hundredplus_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        hundredplus_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredplus_add_buttonActionPerformed(evt);
            }
        });

        hundredplus_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hundredplus_minus_button.setText("-");
        hundredplus_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        hundredplus_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        hundredplus_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredplus_minus_buttonActionPerformed(evt);
            }
        });

        milo_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        milo_add_button.setText("+");
        milo_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        milo_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        milo_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milo_add_buttonActionPerformed(evt);
            }
        });

        nescafe_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nescafe_add_button.setText("+");
        nescafe_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        nescafe_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        nescafe_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nescafe_add_buttonActionPerformed(evt);
            }
        });

        milo_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        milo_minus_button.setText("-");
        milo_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        milo_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        milo_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milo_minus_buttonActionPerformed(evt);
            }
        });

        nescafe_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nescafe_minus_button.setText("-");
        nescafe_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        nescafe_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        nescafe_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nescafe_minus_buttonActionPerformed(evt);
            }
        });

        yeos_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yeos_add_button.setText("+");
        yeos_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        yeos_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        yeos_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeos_add_buttonActionPerformed(evt);
            }
        });

        cola_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cola_minus_button.setText("-");
        cola_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        cola_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        cola_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cola_minus_buttonActionPerformed(evt);
            }
        });

        cola_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cola_add_button.setText("+");
        cola_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        cola_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        cola_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cola_add_buttonActionPerformed(evt);
            }
        });

        yeos_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yeos_minus_button.setText("-");
        yeos_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        yeos_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        yeos_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeos_minus_buttonActionPerformed(evt);
            }
        });

        fanta_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fanta_add_button.setText("+");
        fanta_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        fanta_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        fanta_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fanta_add_buttonActionPerformed(evt);
            }
        });

        water_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        water_add_button.setText("+");
        water_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        water_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        water_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_add_buttonActionPerformed(evt);
            }
        });

        fanta_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fanta_minus_button.setText("-");
        fanta_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        fanta_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        fanta_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fanta_minus_buttonActionPerformed(evt);
            }
        });

        water_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        water_minus_button.setText("-");
        water_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        water_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        water_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                water_minus_buttonActionPerformed(evt);
            }
        });

        sprite_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sprite_add_button.setText("+");
        sprite_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        sprite_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        sprite_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprite_add_buttonActionPerformed(evt);
            }
        });

        sprite_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sprite_minus_button.setText("-");
        sprite_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        sprite_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        sprite_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprite_minus_buttonActionPerformed(evt);
            }
        });

        mountaindew_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mountaindew_add_button.setText("+");
        mountaindew_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        mountaindew_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        mountaindew_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mountaindew_add_buttonActionPerformed(evt);
            }
        });

        mountaindew_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mountaindew_minus_button.setText("-");
        mountaindew_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        mountaindew_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        mountaindew_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mountaindew_minus_buttonActionPerformed(evt);
            }
        });

        aandw_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aandw_add_button.setText("+");
        aandw_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        aandw_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        aandw_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aandw_add_buttonActionPerformed(evt);
            }
        });

        aandw_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aandw_minus_button.setText("-");
        aandw_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        aandw_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        aandw_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aandw_minus_buttonActionPerformed(evt);
            }
        });

        kickapoo_add_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kickapoo_add_button.setText("+");
        kickapoo_add_button.setMaximumSize(new java.awt.Dimension(93, 27));
        kickapoo_add_button.setMinimumSize(new java.awt.Dimension(93, 27));
        kickapoo_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kickapoo_add_buttonActionPerformed(evt);
            }
        });

        kickapoo_minus_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kickapoo_minus_button.setText("-");
        kickapoo_minus_button.setMaximumSize(new java.awt.Dimension(93, 27));
        kickapoo_minus_button.setMinimumSize(new java.awt.Dimension(93, 27));
        kickapoo_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kickapoo_minus_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(hundredplus_chkbox)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(milo_chkbox)
                            .addComponent(nescafe_chkbox))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nescafe_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nescafetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hundredplus_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(milo_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(milotxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(milo_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nescafe_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pepsi_chkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pepsi_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hundredplustxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hundredplus_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pepsitxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pepsi_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show_quantity_milo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_nescafe, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_hundredplus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fanta_chkbox)
                            .addComponent(cola_chkbox)
                            .addComponent(water_chkbox)
                            .addComponent(yeos_chkbox))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cola_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fanta_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(water_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(watertxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(water_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fantatxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fanta_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(colatxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cola_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(show_quantity_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(yeos_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeostxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeos_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(show_quantity_water, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_quantity_yeos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_quantity_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(kickapoo_chkbox)
                                    .addGap(48, 48, 48))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(sprite_chkbox)
                                    .addGap(72, 72, 72))
                                .addComponent(mountaindew_chkbox, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(aandw_chkbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sprite_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mountaindew_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aandw_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kickapoo_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mountaindewtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mountaindew_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spritetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sprite_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aandwtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aandw_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kickapootxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kickapoo_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(show_quantity_mountaindew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_quantity_aandw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_quantity_kickapoo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(show_quantity_sprite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pepsi_chkbox)
                            .addComponent(cola_chkbox)
                            .addComponent(pepsitxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colatxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spritetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pepsi_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_sprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pepsi_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cola_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cola_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sprite_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sprite_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fantatxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hundredplustxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hundredplus_chkbox)
                            .addComponent(fanta_chkbox)
                            .addComponent(show_quantity_hundredplus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_fanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_quantity_mountaindew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hundredplus_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hundredplus_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fanta_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fanta_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(milo_chkbox)
                                .addComponent(milotxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_quantity_milo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aandwtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_quantity_aandw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(milo_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(milo_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aandw_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aandw_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(show_quantity_water, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(watertxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(water_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(water_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(water_chkbox)
                                .addComponent(aandw_chkbox)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yeos_chkbox)
                                    .addComponent(nescafe_chkbox)
                                    .addComponent(nescafetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeostxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_quantity_yeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_quantity_nescafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nescafe_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nescafe_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeos_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeos_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kickapoo_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kickapoo_chkbox)
                                    .addComponent(kickapootxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kickapoo_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_quantity_kickapoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sprite_chkbox)
                            .addComponent(show_quantity_cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mountaindew_chkbox)
                            .addComponent(mountaindew_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mountaindewtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mountaindew_minus_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1900, 390));
        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Quantity:");

        total_amt.setEditable(false);
        total_amt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total_amt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        quantity.setEditable(false);
        quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        additem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        additem.setText("ADD");
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel7.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 670, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        receipt_txtfield.setEditable(false);
        receipt_txtfield.setColumns(20);
        receipt_txtfield.setFont(new java.awt.Font("Malgun Gothic", 0, 20)); // NOI18N
        receipt_txtfield.setRows(10);
        jScrollPane1.setViewportView(receipt_txtfield);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 520, 720, 430));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Payment Method:");

        amt_insert_txtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amt_insert_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amt_insert_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amt_insert_txtfieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Change:");

        changetxtfield.setEditable(false);
        changetxtfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changetxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pay_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pay_button.setText("PAY");
        pay_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_buttonActionPerformed(evt);
            }
        });

        adminBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminBtn.setText("STAFF");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Amount Insert:");

        payment_method_cb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payment_method_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "E-Wallet", "Debit/Credit Card" }));
        payment_method_cb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amt_insert_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment_method_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payment_method_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pay_button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(changetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(amt_insert_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, 670, 250));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DengXian Light", 1, 22)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("How to Buy:\n\n 1. Select Drink\n\n 2. Insert Quantity and Click 'ADD' button\n\n 3. Select Payment Method\n\n 4. Insert Money and Click 'PAY' button\n\n 5. Receipt will be generated");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 470, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        // add all selections in cart and total up
        //DONE              
        double totalQuantity ;
        double total = 0;
        double pepsiQuantity = Double.parseDouble(pepsitxtfield.getText());
        double showPepsiQuantity = Double.parseDouble(show_quantity_pepsi.getText());
        double colaQuantity = Double.parseDouble(colatxtfield.getText());
        double showColaQuantity = Double.parseDouble(show_quantity_cola.getText());
        double spriteQuantity = Double.parseDouble(spritetxtfield.getText());
        double showSpriteQuantity = Double.parseDouble(show_quantity_sprite.getText());
        double hundredplusQuantity = Double.parseDouble(hundredplustxtfield.getText());
        double showHundredplusQuantity = Double.parseDouble(show_quantity_hundredplus.getText());
        double fantaQuantity = Double.parseDouble(fantatxtfield.getText());
        double showFantaQuantity = Double.parseDouble(show_quantity_fanta.getText());
        double mountaindewQuantity = Double.parseDouble(mountaindewtxtfield.getText());
        double showMountaindewQuantity = Double.parseDouble(show_quantity_mountaindew.getText());
        double miloQuantity = Double.parseDouble(milotxtfield.getText());
        double showMiloQuantity = Double.parseDouble(show_quantity_milo.getText());
        double waterQuantity = Double.parseDouble(watertxtfield.getText());
        double showWaterQuantity = Double.parseDouble(show_quantity_water.getText());
        double aandwQuantity = Double.parseDouble(aandwtxtfield.getText());
        double showAandwQuantity = Double.parseDouble(show_quantity_aandw.getText());
        double nescafeQuantity = Double.parseDouble(nescafetxtfield.getText());
        double showNescafeQuantity = Double.parseDouble(show_quantity_nescafe.getText());
        double yeosQuantity = Double.parseDouble(yeostxtfield.getText());
        double showYeosQuantity = Double.parseDouble(show_quantity_yeos.getText());
        double kickapooQuantity = Double.parseDouble(kickapootxtfield.getText());
        double showKickapooQuantity = Double.parseDouble(show_quantity_kickapoo.getText());
        
        totalQuantity = pepsiQuantity + colaQuantity + spriteQuantity + hundredplusQuantity + fantaQuantity +
                mountaindewQuantity + miloQuantity + waterQuantity + aandwQuantity + nescafeQuantity + yeosQuantity +kickapooQuantity ;
        
    {           
        if (pepsi_chkbox.isSelected()) {
            if(pepsiQuantity<= showPepsiQuantity){
            total += (2.00 * totalQuantity);
            int newPepsiQuantity = (int) (showPepsiQuantity - pepsiQuantity);
            show_quantity_pepsi.setText(String.valueOf(newPepsiQuantity));
            }else{
                String errorMessage = "Insufficient quantity for Pepsi";
                JOptionPane.showMessageDialog(null, errorMessage);
            }
        }
        if (cola_chkbox.isSelected()) {
            if(colaQuantity<= showColaQuantity){
            total += (2.00 * totalQuantity);
            int newColaQuantity = (int) (showColaQuantity - colaQuantity);
            show_quantity_cola.setText(String.valueOf(newColaQuantity));
            }else{
                String errorMessage = "Insufficient quantity for Coca Cola";
                JOptionPane.showMessageDialog(null, errorMessage);
            }
        }
        if (sprite_chkbox.isSelected()) {
            if(spriteQuantity<= showSpriteQuantity){
            total += (2.00 * totalQuantity);
            int newSpriteQuantity = (int) (showSpriteQuantity - spriteQuantity);
            show_quantity_sprite.setText(String.valueOf(newSpriteQuantity));
            }else{
                String errorMessage = "Insufficient quantity for Sprite";
                JOptionPane.showMessageDialog(null, errorMessage);
            }
        }
        if (hundredplus_chkbox.isSelected()) {
            if (hundredplusQuantity <= showHundredplusQuantity) {
                total += (2.00 * totalQuantity);
                int newHundredPlusQuantity = (int) (showHundredplusQuantity - hundredplusQuantity);
                show_quantity_hundredplus.setText(String.valueOf(newHundredPlusQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Hundred Plus");
            }
        }
        if (mountaindew_chkbox.isSelected()) {
        if (mountaindewQuantity <= showMountaindewQuantity) {
            total += (3.50 * totalQuantity);
            int newMountainDewQuantity = (int) (showMountaindewQuantity - mountaindewQuantity);
            show_quantity_mountaindew.setText(String.valueOf(newMountainDewQuantity));
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient quantity for Mountain Dew");
        }
        }
        if (fanta_chkbox.isSelected()) {
            if (fantaQuantity <= showFantaQuantity) {
                total += (2.00 * totalQuantity);
                int newFantaQuantity = (int) (showFantaQuantity - fantaQuantity);
                show_quantity_fanta.setText(String.valueOf(newFantaQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Fanta");
            }
        }
        if (water_chkbox.isSelected()) {
            if (waterQuantity <= showWaterQuantity) {
                total += (1.50 * totalQuantity);
                int newWaterQuantity = (int) (showWaterQuantity - waterQuantity);
                show_quantity_water.setText(String.valueOf(newWaterQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Mineral Water");
            }
        }
        if (milo_chkbox.isSelected()) {
            if (miloQuantity <= showMiloQuantity) {
                total += (2.50 * totalQuantity);
                int newMiloQuantity = (int) (showMiloQuantity - miloQuantity);
                show_quantity_milo.setText(String.valueOf(newMiloQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Milo Can");
            }
        }
        if (aandw_chkbox.isSelected()) {
            if (aandwQuantity <= showAandwQuantity) {
                total += (2.00 * totalQuantity);
                int newAandWQuantity = (int) (showAandwQuantity - aandwQuantity);
                show_quantity_aandw.setText(String.valueOf(newAandWQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for A&W");
            }
        }
        if (nescafe_chkbox.isSelected()) {
            if (nescafeQuantity <= showNescafeQuantity) {
                total += (2.00 * totalQuantity);
                int newNescafeQuantity = (int) (showNescafeQuantity - nescafeQuantity);
                show_quantity_nescafe.setText(String.valueOf(newNescafeQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Nescafe Latte");
            }
        }
        if (yeos_chkbox.isSelected()) {
            if (yeosQuantity <= showYeosQuantity) {
                total += (2.00 * totalQuantity);
                int newYeosQuantity = (int) (showYeosQuantity - yeosQuantity);
                show_quantity_yeos.setText(String.valueOf(newYeosQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Yeos Drink Chrysanthemum Tea");
            }
        }
        if (kickapoo_chkbox.isSelected()) {
            if (kickapooQuantity <= showKickapooQuantity) {
                total += (2.00 * totalQuantity);
                int newKickapooQuantity = (int) (showKickapooQuantity - kickapooQuantity);
                show_quantity_kickapoo.setText(String.valueOf(newKickapooQuantity));
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient quantity for Kickapoo");
            }
        }
    
    }
            
        total_amt.setText(String.format("RM %.2f", total));
        int intQuantity = (int) Math.round(totalQuantity);
        quantity.setText(Integer.toString(intQuantity));
        
    }//GEN-LAST:event_additemActionPerformed

    
    private void pay_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_buttonActionPerformed
        // pay button is pressed when amount inserted is entered
        String[] totalAmtArr = total_amt.getText().split(" ");
        double totalAmount = Double.parseDouble(totalAmtArr[1]);
        double amountInserted = Double.parseDouble(amt_insert_txtfield.getText());
        String paymentMethod = (String) payment_method_cb.getSelectedItem();
        double change = amountInserted - totalAmount;
        String formattedTotalAmount = String.format("RM%.2f", totalAmount);
        String formattedChange = String.format("RM%.2f", change);
        String formattedAmountInserted = String.format("RM%.2f", amountInserted);
        String[] drinkNames = {
            "Pepsi", "Coca Cola", "Sprite", "100 plus", 
            "Fanta Orange", "Mountain Dew", "Milo Can", 
            "Mineral Water", "A&W", "Nescafe Latte", 
            "Yeos Drink Chrysanthemum Tea", "Kickapoo"
        };
        
        //Generate Receipt
        drink[0]= Integer.parseInt(pepsitxtfield.getText());
        drink[1]= Integer.parseInt(colatxtfield.getText());
        drink[2]= Integer.parseInt(spritetxtfield.getText());
        drink[3]= Integer.parseInt(hundredplustxtfield.getText());
        drink[4]= Integer.parseInt(fantatxtfield.getText());
        drink[5]= Integer.parseInt(mountaindewtxtfield.getText());
        drink[6]= Integer.parseInt(milotxtfield.getText());
        drink[7]= Integer.parseInt(watertxtfield.getText());
        drink[8]= Integer.parseInt(aandwtxtfield.getText());
        drink[9]= Integer.parseInt(nescafetxtfield.getText());
        drink[10]= Integer.parseInt(yeostxtfield.getText());
        drink[11]= Integer.parseInt(kickapootxtfield.getText());
        int amountString = Integer.parseInt(quantity.getText());
        String totalText = total_amt.getText();
        String[] parts = totalText.split(" "); 
        String numericPart = parts[1];
        double total = Double.parseDouble(numericPart);
        double amt_insert = Double.parseDouble(amt_insert_txtfield.getText());                
        int refs = 1325 + (int)(Math.random()*4238);
        
        //Get date and time
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        Tdate.format(timer.getTime());
        
        if(amt_insert >= total){
            receipt_txtfield.append("Vending Machine:"+                                                  
                    "\nDate: " + Tdate.format(timer.getTime()) +
                    "\nTime: " + tTime.format(timer.getTime()) + 
                    "\nReference:\t\t\t  " + refs +                    
                    "\n========================================\t" +
                    "\nDRINKS\t\t                  " + "QUANTITY" +
                    "\nPepsi:\t\t\t    " + drink[0] +
                    "\nCoca Cola:\t\t\t    " + drink[1] +
                    "\nSprite:\t\t\t    " + drink[2] +
                    "\n100 plus:\t\t\t    " + drink[3] +
                    "\nFanta Orange:\t\t\t    " + drink[4] +
                    "\nMountain Dew:\t\t\t    " + drink[5] +
                    "\nMilo Can:\t\t\t    " + drink[6] +
                    "\nMineral Water:\t\t\t    " + drink[7] +
                    "\nA&W:\t\t\t    " + drink[8] +
                    "\nNescafe Latte:\t\t\t    " + drink[9] +
                    "\nYeos Drink Chrysanthemum Tea:\t    " + drink[10] +
                    "\nKickapoo:\t\t\t    " + drink[11] +                
                    "\n=========================================\t"+                
                    "\nTotal:\t\t\t " + formattedTotalAmount +                
                    "\nQuantity:\t\t\t    " + amountString +                
                    "\nPayment Method:\t\t  " + paymentMethod +                
                    "\nAmount Insert:\t\t\t " + formattedAmountInserted +                
                    "\nChange:\t\t\t " + formattedChange +
                    "\n=========================================\t"+                
                    "\n\nThank You For Your Puchase!");
            for (int i = 0; i < drink.length; i++) {
            if (drink[i] > 0) {
                updateDrink(drinkNames[i], (int) drink[i]);
                recordOrder(drinkNames[i], (int) drink[i], paymentMethod, formattedAmountInserted, formattedChange, formattedTotalAmount);
            }
        }
        }else{
            JOptionPane.showMessageDialog(this, "Sorry, You Need to Insert Money");
        }
        
        //set text fields for change and amount insert
        if (change <0){
            JOptionPane.showMessageDialog(this, "Sorry, You Do Not Have Enough Money");
        }else{            
            changetxtfield.setText(formattedChange);            
            amt_insert_txtfield.setText(formattedAmountInserted);
            try{
               FileReader fr = new FileReader(filePath); 
            }catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_pay_buttonActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // clear all selected options
        pepsi_chkbox.setSelected(false);
        cola_chkbox.setSelected(false);
        sprite_chkbox.setSelected(false);
        hundredplus_chkbox.setSelected(false);
        mountaindew_chkbox.setSelected(false);
        fanta_chkbox.setSelected(false);
        milo_chkbox.setSelected(false);
        water_chkbox.setSelected(false);
        aandw_chkbox.setSelected(false);
        nescafe_chkbox.setSelected(false);
        yeos_chkbox.setSelected(false);
        kickapoo_chkbox.setSelected(false);
        pepsitxtfield.setText("0");
        colatxtfield.setText("0");
        spritetxtfield.setText("0");
        hundredplustxtfield.setText("0");
        fantatxtfield.setText("0");
        mountaindewtxtfield.setText("0");
        milotxtfield.setText("0");
        watertxtfield.setText("0");
        aandwtxtfield.setText("0");
        nescafetxtfield.setText("0");
        yeostxtfield.setText("0");
        kickapootxtfield.setText("0");
        total_amt.setText(null);
        quantity.setText(null);
        amt_insert_txtfield.setText(null);
        changetxtfield.setText(null);
        receipt_txtfield.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void amt_insert_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amt_insert_txtfieldActionPerformed
        // User enters the amount inserted into the vending machine
    }//GEN-LAST:event_amt_insert_txtfieldActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // button for admin login
        String input = JOptionPane.showInputDialog("Enter admin password: ");
        if(input.equals("12345")){           
            notepad staffLogin = new notepad(); // Create an instance of StaffLogin
            staffLogin.setVisible(true); 
        } else{
            JOptionPane.showMessageDialog(null,"Wrong admin password!");
        }     
                          
    }//GEN-LAST:event_adminBtnActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // Stop and exit system
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void pepsi_chkboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pepsi_chkboxMouseClicked
        //pepsi checked box
        double cpepsi = Double.parseDouble(total_amt.getText());
        double pepsi = Double.parseDouble(pepsitxtfield.getText());
        double ipepsi= 2.00;
        
        if(pepsi_chkbox.isSelected()){
            i[0]=(pepsi * ipepsi) + cpepsi;
            String ptotal = String.format("%.2f", i[0]);
            total_amt.setText("RM" + ptotal);
        }
    }//GEN-LAST:event_pepsi_chkboxMouseClicked

    private void cola_chkboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cola_chkboxMouseClicked
        double ccola = Double.parseDouble(total_amt.getText());
        double cola = Double.parseDouble(colatxtfield.getText());
        double icola= 2.00;
        
        if(cola_chkbox.isSelected()){
            i[1]=(cola * icola) + ccola;
            String ptotal = String.format("%.2f", i[1]);
            total_amt.setText("RM" + ptotal);
        }
    }//GEN-LAST:event_cola_chkboxMouseClicked

    private void pepsi_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsi_add_buttonActionPerformed
        String currentValueStr = pepsitxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        pepsitxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_pepsi_add_buttonActionPerformed

    private void pepsi_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsi_minus_buttonActionPerformed
        String currentValueStr = pepsitxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            pepsitxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_pepsi_minus_buttonActionPerformed

    private void hundredplus_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundredplus_add_buttonActionPerformed
        String currentValueStr = hundredplustxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        hundredplustxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_hundredplus_add_buttonActionPerformed

    private void hundredplus_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundredplus_minus_buttonActionPerformed
        String currentValueStr = hundredplustxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            hundredplustxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_hundredplus_minus_buttonActionPerformed

    private void milo_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milo_add_buttonActionPerformed
        String currentValueStr = milotxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        milotxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_milo_add_buttonActionPerformed

    private void nescafe_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nescafe_add_buttonActionPerformed
        String currentValueStr = nescafetxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        nescafetxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_nescafe_add_buttonActionPerformed

    private void milo_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milo_minus_buttonActionPerformed
        String currentValueStr = milotxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            milotxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_milo_minus_buttonActionPerformed

    private void nescafe_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nescafe_minus_buttonActionPerformed
        String currentValueStr = nescafetxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            nescafetxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_nescafe_minus_buttonActionPerformed

    private void yeos_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeos_add_buttonActionPerformed
        String currentValueStr = yeostxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        yeostxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_yeos_add_buttonActionPerformed

    private void cola_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cola_minus_buttonActionPerformed
        String currentValueStr = colatxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            colatxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_cola_minus_buttonActionPerformed

    private void cola_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cola_add_buttonActionPerformed
        String currentValueStr = colatxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        colatxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_cola_add_buttonActionPerformed

    private void yeos_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeos_minus_buttonActionPerformed
        String currentValueStr = yeostxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            yeostxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_yeos_minus_buttonActionPerformed

    private void fanta_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fanta_add_buttonActionPerformed
        String currentValueStr = fantatxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        fantatxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_fanta_add_buttonActionPerformed

    private void water_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_add_buttonActionPerformed
        String currentValueStr = watertxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        watertxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_water_add_buttonActionPerformed

    private void fanta_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fanta_minus_buttonActionPerformed
        String currentValueStr = fantatxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            fantatxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_fanta_minus_buttonActionPerformed

    private void water_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_water_minus_buttonActionPerformed
        String currentValueStr = watertxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            watertxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_water_minus_buttonActionPerformed

    private void sprite_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprite_add_buttonActionPerformed
        String currentValueStr = spritetxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        spritetxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_sprite_add_buttonActionPerformed

    private void sprite_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprite_minus_buttonActionPerformed
        String currentValueStr = spritetxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            spritetxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_sprite_minus_buttonActionPerformed

    private void mountaindew_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mountaindew_add_buttonActionPerformed
        String currentValueStr = mountaindewtxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        mountaindewtxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_mountaindew_add_buttonActionPerformed

    private void mountaindew_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mountaindew_minus_buttonActionPerformed
        String currentValueStr = mountaindewtxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            mountaindewtxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_mountaindew_minus_buttonActionPerformed

    private void aandw_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aandw_add_buttonActionPerformed
        String currentValueStr = aandwtxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        aandwtxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_aandw_add_buttonActionPerformed

    private void aandw_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aandw_minus_buttonActionPerformed
        String currentValueStr = aandwtxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            aandwtxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_aandw_minus_buttonActionPerformed

    private void kickapoo_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kickapoo_add_buttonActionPerformed
        String currentValueStr = kickapootxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);
        int newValue = currentValue + 1;
        kickapootxtfield.setText(Integer.toString(newValue));
    }//GEN-LAST:event_kickapoo_add_buttonActionPerformed

    private void kickapoo_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kickapoo_minus_buttonActionPerformed
        String currentValueStr = kickapootxtfield.getText();
        int currentValue = Integer.parseInt(currentValueStr);

        if (currentValue > 0) {
            int newValue = currentValue - 1;
            kickapootxtfield.setText(Integer.toString(newValue));
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be lower than 0.");
        }
    }//GEN-LAST:event_kickapoo_minus_buttonActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vendingmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendingmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendingmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendingmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendingmenu().setVisible(true);
            }
        });
    }

    public vendingmenu(JCheckBox aandw, JButton additem, JButton admin, JTextField amt_insert, JTextField change, JButton checkout, JButton clear, 
            JCheckBox cola, JCheckBox fanta, JCheckBox hundredplus, JLabel jLabel1, JLabel jLabel2, 
            JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JPanel jPanel1, JPanel jPanel2, JPanel jPanel3, 
            JScrollPane jScrollPane1, JTextArea jTextArea1, JCheckBox milo, JCheckBox mountaindew, JCheckBox pepsi, 
            JTextField quantity, JCheckBox sprite, JTextField total, JCheckBox water) throws HeadlessException {
        this.aandw_chkbox = aandw;
        this.additem = additem;
        this.adminBtn = admin;
        this.amt_insert_txtfield = amt_insert;
        this.changetxtfield = change;
        this.pay_button = checkout;
        this.clear = clear;
        this.cola_chkbox = cola;
        this.fanta_chkbox = fanta;
        this.hundredplus_chkbox = hundredplus;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jPanel3 = jPanel3;
        this.jScrollPane1 = jScrollPane1;
        this.receipt_txtfield = jTextArea1;
        this.water_chkbox = milo;
        this.mountaindew_chkbox = mountaindew;
        this.pepsi_chkbox = pepsi;
        this.quantity = quantity;
        this.sprite_chkbox = sprite;
        this.total_amt = total;
        this.water_chkbox = water;
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aandw_add_button;
    private javax.swing.JCheckBox aandw_chkbox;
    private javax.swing.JButton aandw_minus_button;
    private javax.swing.JTextField aandwtxtfield;
    private javax.swing.JButton additem;
    private javax.swing.JButton adminBtn;
    private javax.swing.JTextField amt_insert_txtfield;
    private javax.swing.JTextField changetxtfield;
    private javax.swing.JButton clear;
    private javax.swing.JButton cola_add_button;
    private javax.swing.JCheckBox cola_chkbox;
    private javax.swing.JButton cola_minus_button;
    private javax.swing.JTextField colatxtfield;
    private javax.swing.JButton exit;
    private javax.swing.JButton fanta_add_button;
    private javax.swing.JCheckBox fanta_chkbox;
    private javax.swing.JButton fanta_minus_button;
    private javax.swing.JTextField fantatxtfield;
    private javax.swing.JButton hundredplus_add_button;
    private javax.swing.JCheckBox hundredplus_chkbox;
    private javax.swing.JButton hundredplus_minus_button;
    private javax.swing.JTextField hundredplustxtfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton kickapoo_add_button;
    private javax.swing.JCheckBox kickapoo_chkbox;
    private javax.swing.JButton kickapoo_minus_button;
    private javax.swing.JTextField kickapootxtfield;
    private javax.swing.JButton milo_add_button;
    private javax.swing.JCheckBox milo_chkbox;
    private javax.swing.JButton milo_minus_button;
    private javax.swing.JTextField milotxtfield;
    private javax.swing.JButton mountaindew_add_button;
    private javax.swing.JCheckBox mountaindew_chkbox;
    private javax.swing.JButton mountaindew_minus_button;
    private javax.swing.JTextField mountaindewtxtfield;
    private javax.swing.JButton nescafe_add_button;
    private javax.swing.JCheckBox nescafe_chkbox;
    private javax.swing.JButton nescafe_minus_button;
    private javax.swing.JTextField nescafetxtfield;
    private javax.swing.JButton pay_button;
    private javax.swing.JComboBox<String> payment_method_cb;
    private javax.swing.JButton pepsi_add_button;
    private javax.swing.JCheckBox pepsi_chkbox;
    private javax.swing.JButton pepsi_minus_button;
    private javax.swing.JTextField pepsitxtfield;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextArea receipt_txtfield;
    private javax.swing.JTextField show_quantity_aandw;
    private javax.swing.JTextField show_quantity_cola;
    private javax.swing.JTextField show_quantity_fanta;
    private javax.swing.JTextField show_quantity_hundredplus;
    private javax.swing.JTextField show_quantity_kickapoo;
    private javax.swing.JTextField show_quantity_milo;
    private javax.swing.JTextField show_quantity_mountaindew;
    private javax.swing.JTextField show_quantity_nescafe;
    private javax.swing.JTextField show_quantity_pepsi;
    private javax.swing.JTextField show_quantity_sprite;
    private javax.swing.JTextField show_quantity_water;
    private javax.swing.JTextField show_quantity_yeos;
    private javax.swing.JButton sprite_add_button;
    private javax.swing.JCheckBox sprite_chkbox;
    private javax.swing.JButton sprite_minus_button;
    private javax.swing.JTextField spritetxtfield;
    private javax.swing.JTextField total_amt;
    private javax.swing.JButton water_add_button;
    private javax.swing.JCheckBox water_chkbox;
    private javax.swing.JButton water_minus_button;
    private javax.swing.JTextField watertxtfield;
    private javax.swing.JButton yeos_add_button;
    private javax.swing.JCheckBox yeos_chkbox;
    private javax.swing.JButton yeos_minus_button;
    private javax.swing.JTextField yeostxtfield;
    // End of variables declaration//GEN-END:variables

    
}
