package models.animals;

import models.enums.Desplazamiento;
import models.enums.Pico;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un Tucan dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Toucan extends Herbivorous{

    private Pico pico;

    /**
     * Constructor de un tucan
     */
    public Toucan(){
        this.pico = Pico.DOBLADO;
    }
}
