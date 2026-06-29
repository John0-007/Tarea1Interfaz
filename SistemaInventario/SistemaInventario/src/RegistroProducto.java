
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.geometry.*;



public class RegistroProducto extends Application {
    @Override
   public void start(Stage primerStage){

    Label titulo = new Label("Registro de productos");
    Label CodigoProducto = new Label("Codigo de Producto");
    Label NombreProducto = new Label("Nombre del Producto");
    Label Categoria = new Label("Categoria");
    Label Precio = new Label("Precio");
    Label Cantida = new Label("Cantidad");
    Label Proveedor = new Label("Proveedor");


    TextField Ttitulo = new TextField();
    TextField TcodigoProducto = new TextField();
    TextField TNombreProducto = new TextField();
    TextField TCategoria = new TextField();
    TextField TPrecio = new TextField();
    TextField TCantida = new TextField();
    TextField TProveedor = new TextField();


    VBox.setMargin(Ttitulo, new Insets (0,0,10,0));
    VBox.setMargin(TcodigoProducto,new Insets(0,0,10,0));
    VBox.setMargin(TNombreProducto,new Insets( 0,0,10,0));
    VBox.setMargin(TCategoria, new Insets(0,0,10,0));
    VBox.setMargin(TPrecio,new  Insets(0,0,10,0));
    VBox.setMargin(TCantida, new Insets( 0,0,10,0));
    VBox.setMargin(TProveedor, new Insets(0,0,10,0));



    ComboBox <String> plegable = new ComboBox<>();
    plegable.getItems().add("Disponible");
    plegable.getItems().add("Agotado");
    plegable.getItems().add("Bajo Inventario");
    plegable.setValue("Estado..");
    Button boton = new Button("Guardar");
    boton.setCursor(Cursor.HAND);
    Button boton1 = new Button("Editar");
    boton1.setCursor(Cursor.HAND);
    Button boton2 = new Button("Eliminar");
    boton2.setCursor(Cursor.HAND);
    Button boton3 = new Button("Buscar");
    boton3.setCursor(Cursor.HAND);
    HBox horizontal = new HBox();
    horizontal.getChildren().addAll(boton,boton1,boton2,boton3);
    horizontal.setAlignment(Pos.CENTER);
    HBox.setMargin(boton, new Insets( 10,10,10,10));
    HBox.setMargin(boton1, new Insets(10,10,10,10));
    HBox.setMargin(boton2, new Insets(10,10,10,10));
    HBox.setMargin(boton3, new Insets(10,10,10,10));

    CheckBox perecedero    = new CheckBox("Producto Perecedero");
    perecedero.setCursor(Cursor.HAND);
    CheckBox refrigeracion = new CheckBox("Requiere Refrigeracion");
    refrigeracion.setCursor(Cursor.HAND);
    CheckBox importado     = new CheckBox("Producto Importado");
    importado.setCursor(Cursor.HAND);
    HBox horizontal2 = new HBox(10, perecedero,refrigeracion,importado);






    VBox ruta = new VBox();
    ruta.setAlignment(Pos.CENTER);
    ruta.getChildren().addAll(titulo,Ttitulo,CodigoProducto,TcodigoProducto,NombreProducto,TNombreProducto,Categoria,TCategoria,Cantida,TCantida,Proveedor,TProveedor,Precio, TPrecio,plegable,horizontal,horizontal2);
    Scene escena = new Scene(ruta, 500, 500);
    primerStage.setScene(escena);
    primerStage.setTitle("Registro de Productos");
    primerStage.show();

   }
    public static void main(String[] args) {
        launch(args);
    }
    }

