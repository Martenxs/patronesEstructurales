package vista;

import controlador.FacadeControlador;
import controlador.FlyweightControlador;
import controlador.ProxyControlador;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear botones
        Button botonFacade = new Button("Mostrar Facade");
        Button botonFlyweight = new Button("Mostrar Flyweight");
        Button botonProxy = new Button("Mostrar Proxy");

        // Crear instancias de controladores
        FacadeControlador facadeControlador = new FacadeControlador();
        FlyweightControlador flyweightControlador = new FlyweightControlador();
        ProxyControlador proxyControlador = new ProxyControlador();

        // Acciones de los botones
        botonFacade.setOnAction(e -> {
            String resultado = facadeControlador.ejecutarFacade();
            mostrarResultado("Resultado Facade", resultado);
        });

        botonFlyweight.setOnAction(e -> {
            String resultado = flyweightControlador.ejecutarFlyweight();
            mostrarResultado("Resultado Flyweight", resultado);
        });

        botonProxy.setOnAction(e -> {
            String resultado = proxyControlador.ejecutarProxy();
            mostrarResultado("Resultado Proxy", resultado);
        });

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(botonFacade, botonFlyweight, botonProxy);

        // Escena
        Scene scene = new Scene(layout, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Patrones de Diseño");
        primaryStage.show();
    }

    private void mostrarResultado(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
