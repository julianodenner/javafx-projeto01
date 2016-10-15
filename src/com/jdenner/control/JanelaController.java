package com.jdenner.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class JanelaController implements Initializable {

    @FXML
    private Label lbMeuTexto;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbMeuTexto.setText("Texto alterado via código!");
    }    
    
}
