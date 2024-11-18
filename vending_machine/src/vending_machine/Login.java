package vending_machine;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Login {
    String user;
    String password;
    
    public Login (String x, String y){
        user = x;
        password = y;
    }
    
    public boolean admin_login() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
            String adminuser;
            String adminpass;
            while ((adminuser = br.readLine()) != null && (adminpass = br.readLine()) != null) {
                if (user.equals(adminuser) && password.equals(adminpass)) {
                    br.close();
                    return true; // Authentication successful
                }
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return false; // Authentication failed
    }


    
    boolean admin;
    String adminname;
    String adminpass = "";

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    void Login(String adminu, String adminp)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
            while((adminpass = br.readLine()) != null)
            {
                String[] array = adminpass.split("\t");
                if(adminu.equals(array[0]) && adminp.equals(array[1]))
                {
                    admin = true;
                    adminname = array[0];
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public boolean admin()
    {
        return admin;
    }
    public String adminname()
    {
        return adminname;
    }
}
