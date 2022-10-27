package com.curso3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.backend.Cliente;
import com.backend.Curso;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    public static Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
    public static Map<Integer, Curso> cursos = new HashMap<Integer, Curso>();
    public static Map<Integer, Integer> cliente_has_curso = new HashMap<Integer, Integer>();
    private static Scene scene;
    private static PrimaryController controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary" + ".fxml"));
        Parent loader = fxmlLoader.load();
        scene = new Scene(loader, 640, 480);
        Cliente cliente = new Cliente("aaa", "aaa", "aaa", "aaaa", "aaaa");
        Curso curso = new Curso("Curso01", "alguma descricao", 15000, "www.google.com");
        addCurso(curso);
        addCliente(cliente);
        stage.setScene(scene);
        stage.setResizable(false);
        App.setController(fxmlLoader.getController());
        stage.show();
    }

    static void setRoot(String fxml) {
        try {
            scene.setRoot(loadFXML(fxml));
        } catch (IOException e) {
            System.out.println("Algum erro aconteceu");
            e.printStackTrace();
        }
    }

    static void setRoot(Parent parent) {
        scene.setRoot(parent);
    }

    static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void addCliente(int key, Cliente cliente){
        getClientes().put(key, cliente);
    }

    public static void addCliente(Cliente cliente){
        getClientes().put(cliente.getId(), cliente);
    }

    public static void removeCliente(Cliente cliente){
        getClientes().remove(cliente.getId());
    }

    public static Map<Integer, Cliente> getClientes() {
        return clientes;
    }

    public static Cliente getCliente(int key){
        return getClientes().get(key);
    }

    public static void setClientes(Map<Integer, Cliente> clientes) {
        App.clientes = clientes;
    }

    public static void addCurso(int key, Curso curso){
        getCursos().put(key, curso);
    }

    public static void addCurso(Curso curso){
        getCursos().put(curso.getId(), curso);
    }

    public static void removeCurso(Curso curso){
        getCursos().remove(curso.getId());
    }

    public static Map<Integer, Curso> getCursos() {
        return cursos;
    }

    public static Curso getCurso(int key){
        return getCursos().get(key);
    }

    public static void setCursos(Map<Integer, Curso> cursos) {
        App.cursos = cursos;
    }

    public static void addClienteCurso(int cliente, int curso){
        getCliente_has_curso().put(cliente, curso);
    }

    public static Map<Integer, Integer> getCliente_has_curso() {
        return cliente_has_curso;
    }

    public static void setCliente_has_curso(Map<Integer, Integer> cliente_has_curso) {
        App.cliente_has_curso = cliente_has_curso;
    }

    public static Scene getScene() {
        return scene;
    }

    public static void setScene(Scene scene) {
        App.scene = scene;
    }

    public static PrimaryController getController() {
        return controller;
    }

    public static void setController(PrimaryController controller) {
        App.controller = controller;
    }

    

}