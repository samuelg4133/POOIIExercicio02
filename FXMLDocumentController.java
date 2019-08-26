/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2pooii;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Samuel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button buttonPegarDados;
    @FXML
    private TextArea TextArea;
    @FXML
    private Label LabelRespostas;
    @FXML
    private CheckBox CheckBoxAcao;
    @FXML
    private CheckBox CheckBoxTerror;
    @FXML
    private CheckBox CheckBoxRomance;
    @FXML
    private CheckBox CheckBoxComedia;
    @FXML
    private Label label1;
    @FXML
    private RadioButton RadioButtonJumanji;
    @FXML
    private RadioButton RadioButtonNenhum;
    @FXML
    private RadioButton RadioButtonTitanic;
    @FXML
    private Label label11;
    @FXML
    private ToggleGroup FilmeEscolha;
    
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
        
        String filmeGenero ="";
        String filme="";
        String opiniao="";
        
        if(CheckBoxAcao.isSelected()){
        filmeGenero+=CheckBoxAcao.getText();   
        }
         if(CheckBoxTerror.isSelected()){
        filmeGenero+=" "+CheckBoxTerror.getText();   
        }
          if(CheckBoxRomance.isSelected()){
        filmeGenero+=" "+CheckBoxRomance.getText();   
        }
           if(CheckBoxComedia.isSelected()){
        filmeGenero+=" "+CheckBoxComedia.getText();   
        }
           
         if(RadioButtonJumanji.isSelected()){
        filme+=RadioButtonJumanji.getText();   
        }
          if(RadioButtonTitanic.isSelected()){
        filme+=RadioButtonTitanic.getText();   
        }
           if(RadioButtonNenhum.isSelected()){
        filme+=RadioButtonNenhum.getText();   
        }  
           
           opiniao = "\n" + TextArea.getText();
           
           LabelRespostas.setText("Respostas: "+"\n"+filmeGenero+"\n"+filme+opiniao);
          
    }
    
}
