package com.example.td2.exercice6;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class pendu extends Application {

    private Dico myDico = new Dico();

    private String word ;



    @Override
    public void start(Stage primaryStage) throws Exception {


        word = myDico.getMot();

        // Création du conteneur principal
        VBox vbox = new VBox();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        VBox centerControl = new VBox();
        centerControl.setAlignment( Pos.CENTER );
        Label nbrVie = new Label("Nombre de vies : ");
        TextField zoneTexte = new TextField();



        zoneTexte.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> {
            String key = keyEvent.getCharacter() ;

            if( key.length() == 1 ) {
                if (word.contains(key)) {
                    System.out.println("caractere correcte");
                }
            }

        });

        centerControl.getChildren().addAll( zoneTexte, nbrVie );

        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                centerControl

        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 600 );
        primaryStage.setHeight( 800 );
        primaryStage.setTitle("Pendu");

        // Affichage de la fenêtre
        primaryStage.show();



    }
    public static void main(String[] args) {
        launch(args);
    }
}
