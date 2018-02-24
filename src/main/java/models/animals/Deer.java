package models.animals;

import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un Venado dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Deer extends Herbivorous implements Consumidor{



    private Integer tamañoCornamenta;

    /**
     * Constructor de un ciervo
     */
    public Deer(){
        this.tamañoCornamenta = 1;

    }

    @Override
    public void comer() {
        System.out.println("moooooo");
    }

    @Override
    public String hablar(String lenguaje) {
        return "hablo como venado";
    }
}
