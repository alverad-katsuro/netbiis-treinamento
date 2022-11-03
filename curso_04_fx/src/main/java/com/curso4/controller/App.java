package com.curso4.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.curso4.unidade4.bd.ClienteDAO;
import com.curso4.unidade4.bd.ClienteHasCursoDAO;
import com.curso4.unidade4.bd.CursoDAO;
import com.curso4.unidade4.model.Cliente;
import com.curso4.unidade4.model.ClienteHasCurso;
import com.curso4.unidade4.model.ClienteHasCursoId;
import com.curso4.unidade4.model.Curso;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    private static ClienteDAO clienteDAO = new ClienteDAO();
    private static CursoDAO cursoDAO = new CursoDAO();
    private static ClienteHasCursoDAO clienteHasCursoDAO = new ClienteHasCursoDAO();
    private static List<Cliente> clientes = recuperarCliente();
    private static List<Curso> cursos = recuperarCurso();
    private static List<ClienteHasCurso> vendas = recuperarVenda();
    private static Scene scene;
    private static PrimaryController controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary" + ".fxml"));
        Parent loader = fxmlLoader.load();
        scene = new Scene(loader, 640, 480);
        Cliente cliente = new Cliente("aaa", "aaa", "aaa", "aaaa", "aaaa");
        Curso curso = new Curso("Curso01", "alguma descricao", 15000.0, "www.google.com");
        cadastrarCurso(curso);
        cadastrarCliente(cliente);
        stage.setScene(scene);
        stage.setResizable(false);
        App.setController(fxmlLoader.getController());
        stage.show();
    }

    public static void setRoot(String fxml) {
        try {
            scene.setRoot(loadFXML(fxml));
        } catch (IOException e) {
            System.out.println("Algum erro aconteceu");
            e.printStackTrace();
        }
    }

    public static void setRoot(Parent parent) {
        scene.setRoot(parent);
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    // JAVA FX ABAIXO

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

    // FIM

    // CRUD

    public static void cadastrarCliente(Cliente cliente) {
        clienteDAO.persist(cliente);
        clientes.add(cliente);
    }

    public static void deletarCliente(Cliente cliente) {
        clienteDAO.delete(cliente);
        clientes.remove(cliente);
    }

    public static void atualizarCliente(Cliente cliente) {
        clienteDAO.merge(cliente);
    }

    public static List<Cliente> recuperarCliente(){
        return clienteDAO.findAll();
    }

    public static Cliente recuperarCliente(int clientID){
        return clienteDAO.findById(clientID);
    }

    public static void cadastrarCurso(Curso curso) {
        cursoDAO.persist(curso);
        cursos.add(curso);
    }

    public static void deletarCurso(Curso curso) {
        cursoDAO.delete(curso);
        cursos.remove(curso);
    }

    public static void atualizarCurso(Curso curso) {
        cursoDAO.merge(curso);
    }

    public static List<Curso> recuperarCurso(){
        return cursoDAO.findAll();
    }

    public static Curso recuperarCurso(int cursoID){
        return cursoDAO.findById(cursoID);
    }

    public static void cadastrarVenda(ClienteHasCurso venda) {
        clienteHasCursoDAO.persist(venda);
        vendas.add(venda);
    }

    public static void deletarVenda(ClienteHasCurso venda) {
        clienteHasCursoDAO.delete(venda);
        vendas.remove(venda);
    }

    public static void atualizarVenda(ClienteHasCurso venda) {
        clienteHasCursoDAO.merge(venda);
    }

    public static List<ClienteHasCurso> recuperarVenda(){
        return clienteHasCursoDAO.findAll();
    }

    public static ClienteHasCurso recuperarVenda(int cliente_id, int curso_id){
        return clienteHasCursoDAO.findById(new ClienteHasCursoId(cliente_id, curso_id));
    }

    public static void cadastrarVenda(Cliente cliente, Curso curso){
        ClienteHasCursoId chc_id = new ClienteHasCursoId(cliente.getClienteId(), curso.getCursoId());
        ClienteHasCurso venda = new ClienteHasCurso(chc_id, cliente, curso, Date.valueOf(LocalDate.now().toString()));
        cadastrarVenda(venda);
    }

    // METODOS DA CLASSE


    public static List<Cliente> getClientes() {
        return clientes;
    }
  

    public static List<Curso> getCursos() {
        return cursos;
    }

    // FIM


}