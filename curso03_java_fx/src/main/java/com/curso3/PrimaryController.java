package com.curso3;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToCliente() throws IOException {
        App.setRoot("cliente");
    }

    @FXML
    private void switchToCurso() throws IOException {
        App.setRoot("curso");
    }

    @FXML
    private void switchToVenda() throws IOException {
        App.setRoot("venda");
    }
}
