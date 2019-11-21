package messsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
/**
 *
 * @author JONIYED
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane loginPane;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button log;
    Connection con;
    com.mysql.jdbc.Statement stm;
    ResultSet rs;
    @FXML
    private AnchorPane pane2;
    @FXML
    private AnchorPane pane3;
    @FXML
    private TextField createuname;
    @FXML
    private TextField createpass;
    @FXML
    private Label msg;
    @FXML
    private Label loginmasg;
    @FXML
    private AnchorPane pane4;
    @FXML
    private AnchorPane pane5;
    @FXML
    private TextField member_id;
    @FXML
    private TextField member_email;
    @FXML
    private TextField member_phone;
    @FXML
    private TextField member_name;
    @FXML
    private TextField member_address;
    
    public String man_id="";
    
    @FXML
    private Label member_info_label;
    @FXML
    private TextField man_name;
    @FXML
    private TextField man_email;
    @FXML
    private TextField man_phone;
    @FXML
    private TextField man_address;
    @FXML
    private TextField man_joining_date;
    @FXML
    private Label meallabel;
    @FXML
    private TextField meal_memberid;
    @FXML
    private TextField meal_breakfast;
    @FXML
    private TextField meal_launch;
    @FXML
    private TextField meal_dinner;
    @FXML
    private TextField meal_date;
    @FXML
    private AnchorPane pane6;
    @FXML
    private TextField bazar_name;
    @FXML
    private TextField bazar_cost;
    @FXML
    private TextField bazar_memberid;
    @FXML
    private TextField bazar_date;
    @FXML
    private Label bazar_label;
    @FXML
    private AnchorPane pane7;
    @FXML
    private TextField search_name;
    @FXML
    private TextField search_address;
    @FXML
    private TextField search_phone;
    @FXML
    private TextField search_email;
    @FXML
    private TextField search_memberid;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/mess_system?user=root&password=");
           stm=(com.mysql.jdbc.Statement) con.createStatement();
           loginPane.setVisible(true);
           pane2.setVisible(false);
           pane3.setVisible(false);
           pane4.setVisible(false);
           pane5.setVisible(false);
           pane6.setVisible(false);
           pane7.setVisible(false);
           
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.println("err"+e);
       }
  }    

    @FXML
    private void dologin(ActionEvent event) {
        String uname;
        String pass;
        uname=username.getText();
        pass=password.getText();
        String sql = "select pass from user_pass where username = '"+uname+"'";
        String text = "";
        if(uname.length()>0&&pass.length()>0)
        {
            try
            {
                 int yes_no=JOptionPane.showConfirmDialog(null,"Do you want to LOGIN","LOGIN",JOptionPane.YES_NO_OPTION);
                 if(yes_no==0)
                 {
                    rs = stm.executeQuery(sql);
                    while(rs.next())
                    {
                         text = rs.getString(1);
                    }
                        if(pass.equals(text))
                        {
                            this.man_id=uname;
                            loginPane.setVisible(false);
                            pane2.setVisible(true);
                            pane3.setVisible(false);
                            pane4.setVisible(false);
                            pane5.setVisible(false);
                            pane6.setVisible(false);
                            pane7.setVisible(false);
                        }
                        else   
                        {
                            loginmasg.setText("Username and password not matched......");
                        }
                 }
            }catch(SQLException e)
            {
               username.setText(""+e); 
            }

        }else
            username.setText("Give User name and password");
        
    }
    
    @FXML
    private void doclear(ActionEvent event) {
        loginmasg.setText("");
        username.setText("");
        password.setText("");
        createuname.setText("");
        createpass.setText("");
        msg.setText("");
        member_id.setText("");
        member_email.setText("");
        member_phone.setText("");
        member_name.setText("");
        member_address.setText("");
        meal_memberid.setText("");
        meal_breakfast.setText("");
        meal_launch.setText("");
        meal_dinner.setText("");
        meal_date.setText("");
        bazar_name.setText("");
        bazar_cost.setText("");
        bazar_date.setText("");
        bazar_memberid.setText("");
        bazar_label.setText("");
        search_memberid.setText("");
        search_name.setText("");
        search_address.setText("");
        search_email.setText("");
        search_phone.setText("");
    }

    @FXML
    private void createacc(ActionEvent event) {
        loginPane.setVisible(false);
        pane2.setVisible(false);
        pane3.setVisible(true);
        pane4.setVisible(false);
        pane5.setVisible(false);
        pane6.setVisible(false);
        pane7.setVisible(false);
    }

    @FXML
    private void doback(ActionEvent event) {
        loginPane.setVisible(true);
        pane2.setVisible(false);
        pane3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
        pane6.setVisible(false);
        pane7.setVisible(false);
    }

    @FXML
    private void dosave(ActionEvent event) {
         String manname,name,email,phone,address,date,cpass,cuname;
         
         cpass=createpass.getText();
         cuname=createuname.getText();
         manname=man_name.getText();
         email=man_email.getText();
         phone=man_phone.getText();
         address=man_address.getText();
         date=man_joining_date.getText();
         String sql1 = "select username from user_pass";
         String sql2="insert into user_pass values ('"+cuname+"','"+cpass+"')";
         String sql3="insert into manager values('"+cuname+"','"+manname+"','"+phone+"','"+email+"','"+address+"','"+date+"')";
         int count=0;
         try
         {
                rs=stm.executeQuery(sql1);
                while(rs.next())
                {
                    name=rs.getString(1);
                    if(name.equals(cuname))
                    {
                        count++;
                        break;
                    }
                }
                if(count>0)
                {
                       msg.setText("This user name is already used.. Enter valid one.......");
                }
                else
                {
                    int yes_no=JOptionPane.showConfirmDialog(null, "Do you want to save...","CreateAcc",JOptionPane.YES_NO_OPTION);
                    if(yes_no==0)
                    {
                        int test=stm.executeUpdate(sql2);
                        int test1=stm.executeUpdate(sql3);
                        if(test>0 && test1>0)
                        {
                            msg.setText("Successfully Created");
                             createuname.setText("");
                            createpass.setText("");
                            man_name.setText("");
                            man_phone.setText("");
                            man_email.setText("");
                            man_address.setText("");
                            man_joining_date.setText("");
                        }
                    }
                }
         }
         catch(SQLException e)
         {
             System.out.println(e);
         }
    }

    @FXML
    private void addmember(ActionEvent event) {
        loginPane.setVisible(false);
        pane2.setVisible(false);
        pane3.setVisible(false);
        pane4.setVisible(true);
        pane5.setVisible(false);
        pane5.setVisible(false);
        pane6.setVisible(false);
        pane7.setVisible(false);
    }

    @FXML
    private void addmeal(ActionEvent event) {
        loginPane.setVisible(false);
        pane2.setVisible(false);
        pane3.setVisible(false);
        pane4.setVisible(false);
        pane6.setVisible(false);
        pane5.setVisible(true);
        pane7.setVisible(false);
    }

    @FXML
    private void member_info_save(ActionEvent event) {
        String memberid,name,phone,email,address;
        memberid=member_id.getText();
        name=member_name.getText();
        phone=member_phone.getText();
        email=member_email.getText();
        address=member_address.getText();
        String sql="insert into member values ('"+memberid+"','"+name+"','"+phone+"','"+email+"','"+address+"','"+man_id+"')";
        int test=JOptionPane.showConfirmDialog(null, "Do you want to save?","Save Member Information...",JOptionPane.YES_NO_OPTION);
        if(test==0)
        {
            try
            {
                int res=stm.executeUpdate(sql);
                if(res>0)
                {
                    member_info_label.setText("Member information successfully saved... thanks a lot.......");
                    member_name.setText("");
                    member_phone.setText("");
                    member_email.setText("");
                    member_address.setText("");
                    member_id.setText("");
                }
            }
            catch(SQLException e)
            {
                System.out.println("Member info err"+e);
            }
        }
    }

    @FXML
    private void home(ActionEvent event) {
        loginPane.setVisible(false);
        pane2.setVisible(true);
        pane3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
        pane6.setVisible(false);
        pane7.setVisible(false);
    }

    @FXML
    private void dologout(ActionEvent event) {
           loginPane.setVisible(true);
           pane2.setVisible(false);
           pane3.setVisible(false);
           pane4.setVisible(false);
           pane5.setVisible(false);
           pane6.setVisible(false);
           pane7.setVisible(false);
           this.man_id="";
           
    }

    @FXML
    private void doclose(ActionEvent event) {
        try {
            rs.close();
            stm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void mealsave(ActionEvent event) {
        double breakfast,launch,dinner,total;
        int serial=0;
        String memberid,date,sql;
        
        sql="SELECT max(serial_no) FROM meal";
        try
        {
           rs=stm.executeQuery(sql);
           while(rs.next())
           {
               serial=Integer.parseInt(rs.getString(1))+1;
           }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        memberid=meal_memberid.getText();
        breakfast=Double.parseDouble(meal_breakfast.getText());
        launch=Double.parseDouble(meal_launch.getText());
        dinner=Double.parseDouble(meal_dinner.getText());
        total=breakfast+dinner+launch;
        date=meal_date.getText();
        sql="insert into meal values("+serial+",'"+memberid+"',"+breakfast+","+launch+","+dinner+","+total+",'"+date+"')";
        System.out.println(sql);
        try
        {
            int yes_no=JOptionPane.showConfirmDialog(null,"Is this all information is correct ???","Save..",JOptionPane.YES_NO_OPTION);
            if(yes_no==0)
            {
                int test=stm.executeUpdate(sql);
                if(test>0)
                {
                   meallabel.setText("Successfully saved all data......");
                }
            }
         }
        catch (SQLException e)
        {
            System.out.println("Meal: "+e);
        }
    }

    @FXML
    private void daily_act(ActionEvent event) {
           loginPane.setVisible(false);
           pane2.setVisible(false);
           pane3.setVisible(false);
           pane4.setVisible(false);
           pane5.setVisible(false);
           pane6.setVisible(true);
           pane7.setVisible(false);
    }

    @FXML
    private void bazar_save(ActionEvent event) {
        String date,name,memberid,sql,bazarcost;
        double cost;
        int act_no=0;
        name=bazar_name.getText();
        date=bazar_date.getText();
        memberid=bazar_memberid.getText();
        bazarcost=(bazar_cost.getText());
        sql="SELECT max(act_no) FROM daily_activity";
        try
        {
            rs=stm.executeQuery(sql);
            while (rs.next())
            {
                act_no=Integer.parseInt(rs.getString(1))+1;
            }
        }
        catch(SQLException e )
        {
            
        }
        if(name.isEmpty() || date.isEmpty() || memberid.isEmpty() || bazarcost.isEmpty())
        {
            
        }
        else
        {
            cost=Double.parseDouble(bazarcost);
            sql="insert into daily_activity values("+act_no+",'"+name+"',"+cost+",'"+memberid+"','"+date+"')";
            int yes_no=JOptionPane.showConfirmDialog(null, "All information are correct?","Save",JOptionPane.YES_NO_OPTION);
            if(yes_no==0)
            {
                try
                {
                    int test=stm.executeUpdate(sql);
                    if(test>0)
                    {
                        bazar_label.setText("Succefully added all information.... Thanks");
                        bazar_name.setText("");
                        bazar_cost.setText("");
                        bazar_date.setText("");
                        bazar_memberid.setText("");
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    @FXML
    private void dosearch(ActionEvent event) {
        String memberid,name="",address=" ",email="",phone=" ",sql;
        memberid=search_memberid.getText();
        sql="select name,phone,email,address FROM member where member_id='"+memberid+"'";
        try {
            rs=stm.executeQuery(sql);
            while(rs.next())
            {
                name=rs.getString(1);
                phone=rs.getString(2);
                email=rs.getString(3);
                address=rs.getString(4);
            }
            search_name.setText(name);
            search_address.setText(address);
            search_phone.setText(phone);
            search_email.setText(email);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void dosearchpane(ActionEvent event) {
           loginPane.setVisible(false);
           pane2.setVisible(false);
           pane3.setVisible(false);
           pane4.setVisible(false);
           pane5.setVisible(false);
           pane6.setVisible(false);
           pane7.setVisible(true);
    }
    
}
