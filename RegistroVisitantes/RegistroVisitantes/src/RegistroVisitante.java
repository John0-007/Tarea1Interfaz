

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.application.Application;
import javafx.geometry.*;

public class RegistroVisitante extends Application{
    @Override
    public void start(Stage primerStage){

        Label Titulo = new Label("Registro de Visitantes"); 
        Label Nombre = new Label("Nombre Completo: ");
        Label Cedula = new Label("Cedula");
        Label Celular = new Label("Celular");
        Label MotivodeVisita = new Label("Motivo de Visita");
        Label VisitaraQuien = new Label("A quien es su visita");
        Label Fecha = new Label("Fecha de su visita");

        

        TextField Tnombre = new TextField();
        TextField Tcedula = new TextField();
        TextField Tcelular = new TextField();
        TextField Tmvisita = new TextField();
        TextField Tavisitar = new TextField();
        TextField Tfecha = new TextField();

       ComboBox<String> plegable = new ComboBox<>();                                   
        plegable.getItems().addAll("Estudiante", "Padre o Tutor", "Suplidor", "Invitado"); 
        plegable.setValue("Visitas...");

        RadioButton Rbotton = new RadioButton("Cardnet");
        RadioButton Rbotton2 = new RadioButton("Cedula");
        RadioButton Rbotton3 = new RadioButton("Pasaporte");

        HBox horizontal = new HBox();
        horizontal.getChildren().addAll(Rbotton,Rbotton2,Rbotton3);
        horizontal.setAlignment(Pos.CENTER);
        HBox.setMargin(Rbotton2, new Insets(10, 20, 10, 20));

        Button boton = new Button("Registrar");
        Button boton1 = new Button("Limpiar");
        Button boton2 = new Button("Cancelar");
        HBox botones = new HBox();
        botones.getChildren().addAll(boton,boton1,boton2);
        botones.setAlignment(Pos.CENTER);
        HBox.setMargin(boton1, new Insets( 10, 10,10,10));







   

        


        VBox ruta = new VBox();
        VBox.setMargin(Tnombre, new Insets(0,0,10,0));
        VBox.setMargin(Tcedula, new Insets(0,0,10,0));      
        VBox.setMargin(Tcelular, new Insets(0,0,10,0));
        VBox.setMargin(Tmvisita, new Insets(0,0,10,0));
        VBox.setMargin(Tavisitar, new Insets(0,0,10,0));
        VBox.setMargin(Tfecha, new Insets(0,0,10,0));

        ruta.setAlignment(Pos.CENTER);
        ruta.getChildren().addAll(Titulo, Nombre,Tnombre, Cedula,Tcedula,Celular,Tcelular,MotivodeVisita,Tmvisita,VisitaraQuien,Tavisitar,Fecha,Tfecha, plegable,horizontal,botones);
        Scene escnea = new Scene(ruta, 500, 600);
        primerStage.setScene(escnea);
        primerStage.setTitle("Registro Visitantes ");
        primerStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
