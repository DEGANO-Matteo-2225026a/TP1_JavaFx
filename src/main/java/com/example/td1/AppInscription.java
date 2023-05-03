package com.example.td1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import org.controlsfx.control.spreadsheet.Grid;

public class AppInscription extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Création du conteneur principal
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        BorderPane Pane = new BorderPane();
        // creation du conteneur du haut de page (menuBar)
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuHelp = new Menu("Help");

        MenuItem menuFileNew = new MenuItem("New");
        MenuItem menuFileOpen = new MenuItem("Open");
        MenuItem menuFileSave = new MenuItem("Save");
        MenuItem menuFileClose = new MenuItem("Close");

        MenuItem menuEditCut = new MenuItem("Cut");
        MenuItem menuEditCopy = new MenuItem("Copy");
        MenuItem menuEditPaste = new MenuItem("Paste");

        menuFile.getItems().add(menuFileNew);
        menuFile.getItems().add(menuFileOpen);
        menuFile.getItems().add(menuFileSave);
        menuFile.getItems().add(menuFileClose);

        menuEdit.getItems().add(menuEditCut);
        menuEdit.getItems().add(menuEditCopy);
        menuEdit.getItems().add(menuEditPaste);

        MenuBar menuTop = new MenuBar(menuFile, menuEdit, menuHelp);



        // Création du conteneur pour le cote gauche de la page
        VBox leftControl = new VBox();
        Label Text = new Label("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");
        leftControl.getChildren().add(Text);
        leftControl.getChildren().add(btn1);
        leftControl.getChildren().add(btn2);
        leftControl.getChildren().add(btn3);
        VBox.setMargin( leftControl, new Insets(10.0d) );
        Pane.setLeft(leftControl);

        // Création du conteneur pour le centre de la page (formulaire et bouttons)
        VBox vboxFormButton = new VBox();
        HBox hboxform = new HBox();
        GridPane formulaire = new GridPane();
        Label textName = new Label("Name: ");
        Label textEmail = new Label("Email: ");
        Label textPw = new Label("Password : ");
        TextField Name = new TextField();
        TextField Email = new TextField();
        TextField Pw = new TextField();

        GridPane.setConstraints(textName, 0, 0);
        GridPane.setConstraints(textEmail, 0, 1);
        GridPane.setConstraints(textPw, 0, 2);
        GridPane.setConstraints(Name, 1, 0);
        GridPane.setConstraints(Email, 1, 1);
        GridPane.setConstraints(Pw, 1, 2);

        formulaire.getChildren().add(textName);
        formulaire.getChildren().add(Name);
        formulaire.getChildren().add(textEmail);
        formulaire.getChildren().add(Email);
        formulaire.getChildren().add(textPw);
        formulaire.getChildren().add(Pw);

        HBox buttonform = new HBox();
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");

        buttonform.getChildren().addAll( cancel, submit);

        // Création du conteneur du bas de page

        HBox bottomControl = new HBox();
        bottomControl.setAlignment(Pos.BOTTOM_CENTER );
        Label textBottom = new Label("Ceci est un label de bas de page");
        bottomControl.getChildren().add(textBottom);
        VBox.setVgrow( hbox, Priority.ALWAYS );

        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
             menuTop,
                hbox,
                bottomControl

        );

        vboxFormButton.getChildren().addAll(
                formulaire,
                buttonform
        );

        hboxform.getChildren().addAll(
               vboxFormButton
        );

        hbox.getChildren().addAll(
          leftControl,
          vboxFormButton
        );

        leftControl.setAlignment(Pos.CENTER_LEFT );
        vboxFormButton.setAlignment(Pos.CENTER );
        hboxform.setAlignment(Pos.CENTER);



        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premiere exemple de manipulation");

        // Affichage de la fenêtre
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }

}
