package vending_machine;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class RegisterAdmin {
static ArrayList<Login> data = new ArrayList<Login>();
boolean admin;
String adminname;
String adminuser = "";
    public static void read(){
        try{
            Scanner s = new Scanner(new File("admin.txt"));
            while(s.hasNext()){
                String a = s.nextLine();
                String b = s.nextLine();
                s.nextLine();
                data.add(new Login(a,b));
            }
        }catch(Exception e){
            System.out.println("Error.....");
        }
    }
    public static void write(){
        try{
            PrintWriter a = new PrintWriter("admin.txt");
            for(int i=0; i<data.size(); i++){
                a.println(data.get(i).user);
                a.println(data.get(i).password);
                a.println();
            }
            a.close();
        }catch(Exception e){
            System.out.println("Error.....");
        }
    }
    public static Login checkName(String x){
        for(int i=0; i<data.size(); i++){
            if(x.equals(data.get(i).user)){
                return data.get(i);
            }
        } 
        return null;
    }
    
    
    void admin_login(String adminu, String adminp)
    {
        String path = "src\\vending_machine\\admin.txt";
        
        File file = new File(path);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (adminu.equals(line.trim())) {
                    String password = br.readLine().trim();
                    if (adminp.equals(password)) {
                        admin = true;
                        adminname = adminu;
                        break;
                    }
                }
                br.readLine(); // Skip the empty line between entries
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public boolean admin_login(){       
        return admin;
    }
    public String adminname()
    {
        return adminname;
    }

    boolean admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

