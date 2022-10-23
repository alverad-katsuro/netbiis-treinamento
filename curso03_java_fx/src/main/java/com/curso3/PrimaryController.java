package com.curso3;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class PrimaryController {
    @FXML private Pane P_block;

    
    /** 
     * @return Pane
     */
    protected Pane getP_block() {
        return P_block;
    }

    /** 
     * @param p_block
     */
    protected void setP_block(Pane p_block) {
        P_block = p_block;
    }

    protected void setP_block(String fxml){
        this.P_block.getChildren().clear();
        try {
            this.P_block.getChildren().add(App.loadFXML(fxml));
        } catch (IOException e) {
            System.out.println("Erro setP_block - PrimaryController");
            e.printStackTrace();
        }
    }

    /*
     * 
     */
    protected void setP_block(Parent parent){
        this.P_block.getChildren().clear();
        this.P_block.getChildren().add(parent);
    }

    /** 
     * @throws IOException
     */
    @FXML
    private void switchToClienteFind() throws IOException {
        setP_block("clienteSearch");
    }

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToClienteCreate() throws IOException {
        setP_block("clienteFormulario");
    }

      
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToCursoCreate() throws IOException {
        App.setRoot("cursoCreateUpdate");
    }

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToCursoUpdate() throws IOException {
        App.setRoot("cursoCreateUpdate");
    }

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToCursoDelete() throws IOException {
        App.setRoot("cursoCreateUpdate");
    }

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToCursoFind() throws IOException {
        App.setRoot("cursoCreateUpdate");
    }

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToVendaCreate() throws IOException {
        App.setRoot("vendaCreateUpdate");
    }

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToVendaUpdate() throws IOException {
        App.setRoot("vendaCreateUpdate");
    }
    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToVendaDelete() throws IOException {
        App.setRoot("vendaCreateUpdate");
    }

    @FXML
    private void switchToVendaFind() throws IOException {
        App.setRoot("vendaCreateUpdate");
    }
}
