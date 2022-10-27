package com.curso3;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

import javax.swing.JOptionPane;
import com.backend.Curso;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CursoController implements Initializable {
    private int id = -1;
    @FXML private ListView<Curso> LV_cursos = new ListView<Curso>();
    @FXML private TextField TF_nome;
    @FXML private TextField TF_valor;
    @FXML private TextField TF_url;
    @FXML private TextArea  TA_descricao;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        criaLista();
    }

    public void initData(Curso curso) {
        this.id = curso.getId();
        this.LV_cursos.getItems().clear();
        this.TF_nome.setText(curso.getNome());
        this.TF_url.setText(curso.getUrl());
        this.TF_valor.setText(String.format("%.2f", curso.getValor()));
    }

    @FXML
    private void criaLista(){
        ObservableList<Curso> items = FXCollections.observableArrayList(App.getCursos().values());
        this.LV_cursos.setItems(items);
    }

    @FXML
    private boolean createCurso(){
        if (validaCampos()) {
            if (id >= 0) {
                Curso curso = App.getCurso(id);
                curso.setNome(TF_nome.getText());
                curso.setDescricao(TA_descricao.getText());
                curso.setUrl(TF_url.getText());
                curso.setValor(Float.parseFloat(TF_valor.getText().replace(",", ".")));
                JOptionPane.showMessageDialog(null, "Curso atualizado com sucesso!", "Dados Gravados", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Curso curso = new Curso(TF_nome.getText(), TA_descricao.getText(), Float.parseFloat(TF_valor.getText().replace(",", ".")), TF_url.getText());
                App.addCurso(curso.getId(), curso);
                JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!", "Dados Gravados", JOptionPane.INFORMATION_MESSAGE);
            }
            App.getController().setP_block("cursoSearch");
            return true;
        } else {
            return false;
        }
    }

    @FXML
    private void cancelar(){
        App.getController().setP_block("cursoSearch");
    }

    @FXML 
    private boolean deleteCurso(){
        System.out.println("Entrei no delete");
        if (App.getCursos().size() == 0) {
            return false;
        } else {
            Curso curso = LV_cursos.getSelectionModel().getSelectedItem();
            App.removeCurso(curso);
            criaLista();
            return true; 
        }
    }

    @FXML
    private boolean searchCurso(){
        System.out.println("Entrei na busca");
        if (App.getCursos().size() == 0) {
            return false;
        } else {
            Curso curso = LV_cursos.getSelectionModel().getSelectedItem();            
            FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                "cursoFormulario.fxml"
                )
            );
            try {
                Parent parent = loader.load();
                App.getController().setP_block(parent);
            } catch (IOException e) {
                System.out.println("Erro searchCurso - CursoController");
                e.printStackTrace();
            }
            CursoController controller = loader.getController();
            controller.initData(curso);
            return true; 
        }
    }
   

    private boolean validaCampos(){
        if(TF_nome.getText().length() == 0){
            return false;
        }
        if(TF_url.getText().length() == 0){
            return false;
        }
        if(TF_valor.getText().length() == 0){
            return false;
        }
        if(TA_descricao.getText().length() == 0){
            return false;
        }
        return true;
    }

}
