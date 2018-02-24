package models.animals;

import models.Animal;
import models.subtypes.Herbivorous;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Modelo que representa un Cebra dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Zebra extends Herbivorous{
    /**
     * Constructor de una zebra
     */
    public Zebra(){

    }

    public void correr(Integer x, String... args) {
        List<String> argsList = Arrays.asList(args);
        argsList.stream().forEach((String e)->{
            System.out.println("Correr = " + e);
        });
    }
}
