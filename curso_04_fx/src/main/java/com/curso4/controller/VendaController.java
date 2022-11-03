package com.curso4.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.curso4.unidade4.model.Cliente;
import com.curso4.unidade4.model.Curso;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class VendaController implements Initializable {
    @FXML private ListView<Curso> LV_cursos = new ListView<Curso>();
    @FXML private ListView<Cliente> LV_clientes = new ListView<Cliente>(); 

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        criaLista();
    }

    @FXML
    private void criaLista(){
        ObservableList<Cliente> items = FXCollections.observableArrayList (App.getClientes());
        this.LV_clientes.setItems(items);
        ObservableList<Curso> items2 = FXCollections.observableArrayList (App.getCursos());
        this.LV_cursos.setItems(items2);
    }

    @FXML
    private void cancelar(){
        App.getController().setP_block("clienteSearch");
    }

    @FXML
    private boolean createVenda(){
        Cliente cliente = LV_clientes.getSelectionModel().getSelectedItem();            
        Curso curso = LV_cursos.getSelectionModel().getSelectedItem();         
        if(App.recuperarVenda(cliente.getClienteId(), curso.getCursoId()) != null){
            JOptionPane.showMessageDialog(null, "O cliente ja possui este curso!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cliente != null && curso != null) {
            App.cadastrarVenda(cliente, curso);
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!", "Dados Gravados", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o cliente e o curso!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
