package models.animals;

import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un Helefante dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Elephant extends Herbivorous implements Consumidor{

    @Override
    public String toString(){
        return "Soy un ufelante";
    }

    private Integer tamañoColmillos;

    /**
     * Constructor de un elefante
     */
    public Elephant(){
        this.tamañoColmillos = 1;
    }

    @Override
    public void comer() {
        System.out.println("ñom ñom ñom");
    }

    @Override
    public String hablar(String lenguaje) {
        return "hablo como ulefante";
    }

}
