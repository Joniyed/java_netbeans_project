package messsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JONIYED
 */
public class MessSystem extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
         stage.setScene(scene);
         stage.setOnCloseRequest(close->{
            FXMLDocumentController jb = new FXMLDocumentController();
            try {
                 jb.rs.close();
                 jb.stm.close();
                 jb.con.close();
            } catch (Exception e) {
                System.out.println("Close req----"+e);
            }
         });
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
