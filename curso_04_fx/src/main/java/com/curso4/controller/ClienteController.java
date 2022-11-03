package com.curso4.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.curso4.unidade4.model.Cliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ClienteController implements Initializable {
    private int id = -1;
    @FXML private TextField TF_nome;
    @FXML private TextField TF_sobrenome;
    @FXML private TextField TF_email;
    @FXML private TextField TF_cpf;
    @FXML private TextField TF_telefone;
    @FXML private Button B_salvar;
    @FXML private Button B_deletar;
    @FXML private Button B_cancelar;
    @FXML private ListView<Cliente> LV_clientes = new ListView<Cliente>(); 
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        criaLista();
    }

    @FXML
    private void criaLista(){
        ObservableList<Cliente> items = FXCollections.observableArrayList(App.getClientes());
        this.LV_clientes.setItems(items);
    }

    public void initData(Cliente cliente) {
        this.LV_clientes.getItems().clear();
        if (cliente.getClienteId() != null) {
            this.id = cliente.getClienteId();

        }
        this.TF_nome.setText(cliente.getClienteNome());
        this.TF_sobrenome.setText(cliente.getClienteSobrenome());
        this.TF_email.setText(cliente.getClienteEmail());
        this.TF_cpf.setText(cliente.getClienteCpf());
        this.TF_telefone.setText(cliente.getClienteTelefone());
    }

    @FXML
    private boolean createCliente(){
        if (validaCampos()) {
            if (id >= 0) {
                Cliente cliente = App.recuperarCliente(id);
                cliente.setClienteNome(TF_nome.getText());
                cliente.setClienteSobrenome(TF_sobrenome.getText());
                cliente.setClienteEmail(TF_email.getText());
                cliente.setClienteCpf(TF_cpf.getText());
                cliente.setClienteTelefone(TF_telefone.getText());
                App.atualizarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!", "Dados Gravados", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Cliente cliente = new Cliente(TF_nome.getText(), TF_sobrenome.getText(), TF_email.getText(), TF_telefone.getText(), TF_cpf.getText());
                App.cadastrarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Dados Gravados", JOptionPane.INFORMATION_MESSAGE);
            }
            App.getController().setP_block("clienteSearch");
            return true;
        } else {
            return false;
        }
    }

    @FXML
    private void cancelar(){
        App.getController().setP_block("clienteSearch");
    }

    @FXML 
    private boolean deleteCliente(){
        System.out.println("Entrei no delete");
        if (App.getClientes().size() == 0) {
            return false;
        } else {
            Cliente cliente = LV_clientes.getSelectionModel().getSelectedItem();
            App.deletarCliente(cliente);
            criaLista();
            return true; 
        }
    }

    @FXML
    private boolean searchCliente(){
        System.out.println("Entrei na busca");
        if (App.getClientes().size() == 0) {
            return false;
        } else {
            Cliente cliente = LV_clientes.getSelectionModel().getSelectedItem();            
            FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                "clienteFormulario.fxml"
                )
            );
            try {
                Parent parent = loader.load();
                App.getController().setP_block(parent);
            } catch (IOException e) {
                System.out.println("Erro searchCliente - ClienteController");
                e.printStackTrace();
            }
            ClienteController controller = loader.getController();
            controller.initData(cliente);
            return true; 
        }
    }
   

    private boolean validaCampos(){
        if(TF_nome.getText().length() == 0){
            return false;
        }
        if(TF_sobrenome.getText().length() == 0){
            return false;
        }
        if(TF_email.getText().length() == 0){
            return false;
        }
        if(TF_cpf.getText().length() == 0){
            return false;
        }
        if(TF_telefone.getText().length() == 0){
            return false;
        }

        return true;
    }
}
