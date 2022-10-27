package com.curso3;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.backend.Cliente;
import com.backend.Curso;

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
        ObservableList<Cliente> items = FXCollections.observableArrayList (App.getClientes().values());
        this.LV_clientes.setItems(items);
        ObservableList<Curso> items2 = FXCollections.observableArrayList (App.getCursos().values());
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
        if(App.getCliente_has_curso().containsKey(cliente.getId()) && App.getCliente_has_curso().get(cliente.getId()) == curso.getId()){
            JOptionPane.showMessageDialog(null, "O cliente ja possui este curso!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cliente != null && curso != null) {
            App.addClienteCurso(cliente.getId(), curso.getId());
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!", "Dados Gravados", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o cliente e o curso!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
