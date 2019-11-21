
package forth_apps.meas_management_system;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane p1;
    @FXML
    private Pane p3;
    @FXML
    private Pane p2;
    @FXML
    private TextField p2t1;
    @FXML
    private PasswordField p2t2;
     Connection con;
     ResultSet res;
     Statement sta;
    @FXML
    private TextField p3t1;
    @FXML
    private PasswordField p3t2;
    @FXML
    private PasswordField p3t3;
    @FXML
    private Pane p4;
    @FXML
    private Pane p5;
    @FXML
    private Pane p6;
    @FXML
    private Pane p7;
    @FXML
    private TextField p7t1;
    @FXML
    private TextField p7t2;
    @FXML
    private TextField p7t3;
    @FXML
    private TextField p7t4;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mass_management_system","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
    }    

    @FXML
    private void p1manager(ActionEvent event) {
        p2.setVisible(true);
        p1.setVisible(false);
        p3.setVisible(false);
    }

    @FXML
    private void p1member(ActionEvent event) {
        p2.setVisible(true);
        p1.setVisible(false);
        p3.setVisible(false);
    }

    @FXML
    private void p2exit(ActionEvent event) {
        p2.setVisible(false);
        p1.setVisible(true);
        p3.setVisible(false);
    }

    @FXML
    private void p2login(ActionEvent event) {
        
        String te;
        String te2;
        te = p2t1.getText();
        te2 = p2t2.getText();
        String sql = "select * from member_password where User_name = '"+te+"'";
            String text = "";
            String name = "joniyed";
            String pass = "nahidmk";
        if(te.length()>0&&te2.length()>0)
        {
            
            try
            {
               res = sta.executeQuery(sql);
               while(res.next())
               {
                   text = res.getString(2);                  
               }
               if(te2.equals(text))
                {
                    if( te.equals(name)&& text.equals(pass) )
                    {
                        p1.setVisible(false);
                        p2.setVisible(false);
                        p3.setVisible(false);
                        p4.setVisible(true);
                        p5.setVisible(false);
                    }
                    else{
                        p1.setVisible(false);
                        p2.setVisible(false);
                        p3.setVisible(false);
                        p4.setVisible(false);
                        p5.setVisible(true);
                    }
                }else
                    JOptionPane.showConfirmDialog(null,"chack...user name and password...");
                       
            }catch(Exception e)
            {
               JOptionPane.showConfirmDialog(null,e); 
            }
            
        }else
            JOptionPane.showConfirmDialog(null,"give User name and password");
      }
    

    @FXML
    private void p2reset(ActionEvent event) {
        p2t1.setText("");
        p2t2.setText("");
    }

    @FXML
    private void p2signup(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
    }

    @FXML
    private void p3save(ActionEvent event) {
        String te = p3t1.getText();
        String te1 = p3t2.getText();
        String te2 = p3t3.getText();
        String te3 = "select * from member_password where User_name = '"+te+"'";
        String text = "";
         int a = JOptionPane.showConfirmDialog(null,"Do you want to Signup","Signup", JOptionPane.YES_NO_OPTION);
      if(a==0)
      {
        if(te.length()>0&&te1.length()>0&te2.length()>0)
        {
            if(te1.length()>5&&te2.length()>5){
           
           if(te1.equals(te2))
           {
                try{
                res = sta.executeQuery(te3);
                while(res.next())
                {
                    text = res.getString(2);
                }               
             }catch(Exception e)
              {
                JOptionPane.showConfirmDialog(null,e);                
              }
                if(text.equals(te1))
                {
                    JOptionPane.showConfirmDialog(null,"this password already used");
                }else
               {
                   String sql = "Insert into member_password values('"+te+"','"+te1+"')";
                    try
                    {
                       if(sta.executeUpdate(sql)>0)
                     {
                         JOptionPane.showConfirmDialog(null,"done");
                     }  
                       else
                           JOptionPane.showConfirmDialog(null,"sorry");
                    }catch(Exception e)
                    {
                        JOptionPane.showConfirmDialog(null,"this user name already used");
                    }
               }
               
           }
           else
               JOptionPane.showConfirmDialog(null,"plese correct your password");
            }else
                JOptionPane.showConfirmDialog(null, "give more then 5 charecter");
            
        }else
            JOptionPane.showConfirmDialog(null,"Complete all things....");
      }
    }

    @FXML
    private void p3reset(ActionEvent event) {
        p3t1.setText("");
        p3t2.setText("");
        p3t3.setText("");
    }

    @FXML
    private void p3exit(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
    }

    @FXML
    private void p4account(ActionEvent event) {
        p4.setVisible(false);
        p7.setVisible(true);
    }

    @FXML
    private void p4member(ActionEvent event) {
        p4.setVisible(false);
        p6.setVisible(true);
    }

    @FXML
    private void p4meal(ActionEvent event) {
        p4.setVisible(false);
    }

    @FXML
    private void p4dailyactivities(ActionEvent event) {
        p4.setVisible(false);
    }

    @FXML
    private void p4totalcalculation(ActionEvent event) {
        p4.setVisible(false);
    }

    @FXML
    private void p4exit(ActionEvent event) {
        p1.setVisible(true);
        p4.setVisible(false);
    }

    @FXML
    private void p4memberdelataion(ActionEvent event) {
       p4.setVisible(false);
    }

    @FXML
    private void p6addmember(ActionEvent event) {
        p6.setVisible(false);
    }

    @FXML
    private void p6findmember(ActionEvent event) {
        p6.setVisible(false);
        p7.setVisible(true);
    }

    @FXML
    private void p6exit(ActionEvent event) {
        p6.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void p7exit(ActionEvent event) {
        p7.setVisible(false);
        p6.setVisible(true);
    }

    @FXML
    private void p7save(ActionEvent event) {
        String te = p7t1.getText();
        String te2 = p7t1.getText();
        String text = "";
        String text2 = "";
    }

    @FXML
    private void p7reset(ActionEvent event) {
       p7t1.setText("");
       p7t2.setText("");
       p7t2.setText("");
       p7t2.setText("");
    }
    
}
