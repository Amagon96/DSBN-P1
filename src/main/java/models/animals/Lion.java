package models.animals;

import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un León dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Lion extends Herbivorous implements Consumidor{

    private Integer tamañoMelena;
    /**
     * Constructor de un leon
     */
    public Lion(){
        this.tamañoMelena = 1;

    }

    @Override
    public void comer() {
        System.out.println("chom chom");
    }

    @Override
    public String hablar(String lenguaje) {
        return "hablo como leon";
    }
}
