package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    // Is where all of our logic/events go

    @FXML
    private BorderPane borderpane;
    //BorderPane was the main pane we dropped everything onto in our .fxml file
    // we're creating this variable so we can manipulate it

    @FXML
    public void exit(MouseEvent mouseEvent) {
        Stage stage = (Stage) borderpane.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void goto_ViewPatients(MouseEvent mouseEvent) throws IOException {
        loadScreen("viewPatients");
    }
    @FXML
    public void goto_AddPatient(MouseEvent mouseEvent) throws IOException {
        loadScreen("addPatient");
    }

    private void loadScreen(String selection) throws IOException {
        // create a parent (the top most scene in a pane)
        Parent root;
        // set it equal to whatever scene we want to see
        selection = selection + ".fxml";
        root = FXMLLoader.load(getClass().getResource(selection));
        // then in our borderpane (.fxml file), the CENTER will be set to whatever we send it.
        borderpane.setCenter(root);
    }

    // we will use this to switch control between panes
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
