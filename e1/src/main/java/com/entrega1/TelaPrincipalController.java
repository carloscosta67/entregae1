package com.entrega1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private TextField idadeCliente;

    @FXML
    private TextField nomeCliente;

    @FXML
    private TextField profissaoCliente;

    @FXML
    private TextField sexoCliente;

    @FXML
    private TextField txtAnoCarro;

    @FXML
    private TextField txtAnoMoto1;

    @FXML
    private TextField txtCarroCor;

    @FXML
    private TextField txtCarroModelo;

    @FXML
    private TextField txtCorMoto1;

    @FXML
    private TextField txtMarcaCarro;

    @FXML
    private TextField txtMarcaMoto1;

    @FXML
    private TextField txtModeloMoto1;

    @FXML
    void CadastrarCarro(ActionEvent event) {
        Carro prata = new Carro(txtCarroModelo.getText(), txtMarcaCarro.getText(),txtCarroCor.getText(), Integer.parseInt(txtAnoCarro.getText()));
        prata.status();
    
    }

    @FXML
    void CadastrarCliente(ActionEvent event) {
        Cliente pessoa = new Cliente(nomeCliente.getText(), Integer.parseInt(idadeCliente.getText()),sexoCliente.getText(),profissaoCliente.getText());
        pessoa.status();
    }

    @FXML
    void CadastrarMoto(ActionEvent event) {
        Moto maquina = new Moto(txtModeloMoto1.getText(), txtMarcaMoto1.getText(),txtCorMoto1.getText(), Integer.parseInt(txtAnoMoto1.getText()));
        maquina.status();
    

    }

}
