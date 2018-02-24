package models.animals;

import models.subtypes.Herbivorous;

/**
 * Modelo que representa un Jirafa dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Jiraf extends Herbivorous{

    private Integer tamañoCuello;
    /**
     * Constructor de un Jiraf
     */
    public Jiraf(){
        this.tamañoCuello = 1;
    }
}
