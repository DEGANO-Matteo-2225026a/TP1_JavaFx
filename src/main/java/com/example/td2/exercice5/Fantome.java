package com.example.td2.exercice5;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Fantome extends Personnage {

    private Rectangle basCorps;


    private Circle oeilGauche;
    private Circle retineGauche;

    private Circle oeilDroit;
    private Circle retineDroite;


    public Fantome() {
        super("droite", Color.BLUE, Color.BLUE);
        basCorps = new Rectangle(0, 10, 20, 10);
        basCorps.setFill(Color.BLUE);

        oeilGauche = new Circle(6, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineGauche = new Circle(oeilGauche.getCenterX(), 6, 1, Color.BLACK);

        oeilDroit = new Circle(14, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineDroite = new Circle(oeilDroit.getCenterX(), 6, 1, Color.BLACK);


        super.getChildren().add(basCorps);
        super.getChildren().add(oeilGauche);
        super.getChildren().add(retineGauche);
        super.getChildren().add(oeilDroit);
        super.getChildren().add(retineDroite);
    }

    public void bougerRetineGaucheAGauche() {
        double nouvelleCoordonneeX = oeilGauche.getCenterX() - 1;
        double centerY = oeilGauche.getCenterY();
        retineGauche.setCenterY(centerY);
        retineGauche.setCenterX(nouvelleCoordonneeX);
    }

    public void bougerRetineGaucheADroite() {
        double nouvelleCoordonneeX = oeilGauche.getCenterX() + 1;
        double centerY = oeilGauche.getCenterY();
        retineGauche.setCenterY(centerY);
        retineGauche.setCenterX(nouvelleCoordonneeX);
    }

    public void bougerRetineDroiteAGauche() {
        double nouvelleCoordonneeX = oeilDroit.getCenterX() - 1;
        double centerY = oeilDroit.getCenterY();
        retineDroite.setCenterY(centerY);
        retineDroite.setCenterX(nouvelleCoordonneeX);
    }

    public void bougerRetineDroiteADroite() {
        double nouvelleCoordonneeX = oeilDroit.getCenterX() + 1;
        double centerY = oeilDroit.getCenterY();
        retineDroite.setCenterY(centerY);
        retineDroite.setCenterX(nouvelleCoordonneeX);
    }

    public void bougerRetineGaucheEnHaut() {
        double centerX = oeilGauche.getCenterX();
        double centerY = oeilGauche.getCenterY();
        double nouvelleCoordonneeY = centerY - 1;
        retineGauche.setCenterX(centerX);
        retineGauche.setCenterY(nouvelleCoordonneeY);
    }

    public void bougerRetineDroiteEnHaut() {
        double centerX = oeilDroit.getCenterX();
        double centerY = oeilDroit.getCenterY();
        double nouvelleCoordonneeY = centerY - 1;
        retineDroite.setCenterX(centerX);
        retineDroite.setCenterY(nouvelleCoordonneeY);
    }

    public void bougerRetineGaucheEnBas() {
        double centerX = oeilGauche.getCenterX();
        double centerY = oeilGauche.getCenterY();
        double nouvelleCoordonneeY = centerY + 1;
        retineGauche.setCenterX(centerX);
        retineGauche.setCenterY(nouvelleCoordonneeY);
    }

    public void bougerRetineDroiteEnBas() {
        double centerX = oeilDroit.getCenterX();
        double centerY = oeilDroit.getCenterY();
        double nouvelleCoordonneeY = centerY + 1;
        retineDroite.setCenterX(centerX);
        retineDroite.setCenterY(nouvelleCoordonneeY);
    }



    @Override
    public void deplacerAGauche() {
        super.deplacerAGauche();
        //sens de la bouche
        basCorps.setX(basCorps.getX() - LARGEUR_MOITIE_PERSONNAGE + 10);
        basCorps.setY(basCorps.getY());
        oeilGauche.setCenterX(oeilGauche.getCenterX() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilGauche.setCenterY(oeilGauche.getCenterY());
        oeilDroit.setCenterX(oeilDroit.getCenterX() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilDroit.setCenterY(oeilDroit.getCenterY());
        bougerRetineGaucheAGauche();
        bougerRetineDroiteAGauche();
    }

    @Override
    public void deplacerADroite(double largeurJeu) {
        super.deplacerADroite(largeurJeu);
        basCorps.setX(basCorps.getX() + LARGEUR_MOITIE_PERSONNAGE - 10);
        basCorps.setY(basCorps.getY());
        oeilGauche.setCenterX(oeilGauche.getCenterX() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilGauche.setCenterY(oeilGauche.getCenterY());
        oeilDroit.setCenterX(oeilDroit.getCenterX() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilDroit.setCenterY(oeilDroit.getCenterY());
        bougerRetineGaucheADroite();
        bougerRetineDroiteADroite();
    }

    @Override
    public void deplacerEnBas(double hauteurJeu) {
        super.deplacerEnBas(hauteurJeu);
        basCorps.setX(basCorps.getX());
        basCorps.setY(basCorps.getY() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilGauche.setCenterX(oeilGauche.getCenterX());
        oeilGauche.setCenterY(oeilGauche.getCenterY() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilDroit.setCenterX(oeilDroit.getCenterX());
        oeilDroit.setCenterY(oeilDroit.getCenterY() + LARGEUR_MOITIE_PERSONNAGE - 10);
        bougerRetineGaucheEnBas();
        bougerRetineDroiteEnBas();
    }

    @Override
    public void deplacerEnHaut() {
        super.deplacerEnHaut();
        basCorps.setX(basCorps.getX());
        basCorps.setY(basCorps.getY() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilGauche.setCenterX(oeilGauche.getCenterX());
        oeilGauche.setCenterY(oeilGauche.getCenterY() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilDroit.setCenterX(oeilDroit.getCenterX());
        oeilDroit.setCenterY(oeilDroit.getCenterY() - LARGEUR_MOITIE_PERSONNAGE + 10);
        bougerRetineGaucheEnHaut();
        bougerRetineDroiteEnHaut();
    }


}