package com.curso3;

import java.io.IOException;
import javafx.fxml.FXML;

public class CursoController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToCliente() throws IOException {
        App.setRoot("cliente");
    }
}
