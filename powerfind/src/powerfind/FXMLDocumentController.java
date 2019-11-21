
package powerfind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author JONIYED
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField number;
    @FXML
    private TextField power;
    @FXML
    private Button check;
    @FXML
    private Button result;
    @FXML
    private TextArea t3;
    @FXML
    private Pane pane1;
    @FXML
    private AnchorPane anchor;
    
    public boolean check(String a)
    {
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='0') count++;
            if(a.charAt(i)=='1') count++;
            if(a.charAt(i)=='2') count++;
            if(a.charAt(i)=='3') count++;
            if(a.charAt(i)=='4') count++;
            if(a.charAt(i)=='5') count++;
            if(a.charAt(i)=='6') count++;
            if(a.charAt(i)=='7') count++;
            if(a.charAt(i)=='8') count++;
            if(a.charAt(i)=='9') count++;
            else {
                count=0;
                break;
            }
            
        }
        if(count!=0)
        {
            return true;
        }
        else return false;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void docheck(ActionEvent event) {
        pane1.setVisible(false);
        number.setText("");
        power.setText("");
        t3.setText("");
        
    }

    @FXML
    private void doresutl(ActionEvent event) {
        
        String a=number.getText();
        String b=power.getText();
        if(a.length()==0 || b.length()==0 || !check(a) || !check(b))
        {
            t3.setText("Invalid input.");
        }
        else
        {
            int x=Integer.parseInt(a);
            int y=Integer.parseInt(b);
            double z=Math.pow(x, y);
            System.out.println(z+ " ");
            t3.setText(Math.pow(x, y)+" ");
        }
    }
    
}
