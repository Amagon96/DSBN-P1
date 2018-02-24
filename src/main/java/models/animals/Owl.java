package models.animals;

import models.enums.Desplazamiento;
import models.enums.Pico;
import models.subtypes.Herbivorous;

/**
 * Modelo que representa un Buho dentro de la aplicación
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Owl extends Herbivorous{

    private Pico pico;
    /**
     * Constructor de un buho
     */
    public Owl(){
        this.pico = Pico.CORVO;
        this.setDesplazamiento(Desplazamiento.AEREO);
    }
}
