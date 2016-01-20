package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public MenuItem altaLibro;
    public TextField altaLibroTitulo;
    public TextField altaLibroEjemplares;
    public TextField altaLibroPaginas;
    public TextField altaLibroEditorial;
    public TextField altaLibroAño;
    public Button guardarAltaLibro;
    public MenuItem bajaLibro;
    public MenuItem modificarLibro;
    public MenuItem buscarLibro;
    public MenuItem altaSocio;
    public MenuItem bajaSocio;
    public MenuItem modificarSocio;
    public MenuItem buscarSocio;
    public MenuItem prestar;
    public MenuItem librosPrestados;
    public MenuItem sociosPrestados;
    public MenuItem prestamosExcedidosSocios;
    public MenuItem prestamosExcedidosLibros;
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    private ArrayList<Prestamo> prestamos;


    public void nuevaVentana(String type, String title)
    {
        try {

            Parent root = FXMLLoader.load(getClass().getResource(type));
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /*public void initialize()
    {
        guardarAltaLibro.requestFocus();
    }*/
    public void altaLibro(ActionEvent actionEvent)
    {
        nuevaVentana("altaLibro.fxml", "Alta de libro");
    }

    public void bajaLibro(ActionEvent actionEvent)
    {
        nuevaVentana("bajaLibro.fxml", "Baja de libro");
    }

    public void modificarLibro(ActionEvent actionEvent)
    {
        nuevaVentana("modificarLibro.fxml", "Modificar el libro");
    }

    public void buscarLibro(ActionEvent actionEvent)
    {
        nuevaVentana("buscarLibro.fxml", "Buscar un libro");
    }

    public void altaSocio(ActionEvent actionEvent)
    {
        nuevaVentana("altaSocio.fxml", "Alta de socio");
    }

    public void bajaSocio(ActionEvent actionEvent)
    {
        nuevaVentana("bajaSocio.fxml", "Baja de socio");
    }

    public void modificarSocio(ActionEvent actionEvent)
    {
        nuevaVentana("modificarSocio.fxml", "Modificar un socio");
    }

    public void buscarSocio(ActionEvent actionEvent)
    {
        nuevaVentana("buscarSocio.fxml", "Buscar un socio");
    }

    public void prestar(ActionEvent actionEvent)
    {
        nuevaVentana("prestar.fxml", "Prestamo de libro");
    }

    public void librosPrestados(ActionEvent actionEvent)
    {
        nuevaVentana("librosPrestados.fxml", "Libros en prestamo");
    }

    public void sociosPrestados(ActionEvent actionEvent)
    {
        nuevaVentana("sociosPrestados.fxml", "Socios con prestamos");
    }

    public void prestamosExcedidosSocios(ActionEvent actionEvent)
    {
        nuevaVentana("prestamosExcedidosSocios.fxml", "Prestamos excedidos por socios");
    }

    public void prestamosExcedidosLibros(ActionEvent actionEvent)
    {
        nuevaVentana("prestamosExcedidosLibros.fxml", "Prestamos excedidos por libros");
    }
}
