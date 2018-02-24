package models.enums;


/**
 * Created by Andree
 */
public enum Pico {
    LARGO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    DOBLADO(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    ANGULO(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    CRUZADO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    CORVO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    ACINCELADO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE),
    RECURVADO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE),
    TIJERA(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);

    private Boolean capturaPeces;
    private Boolean tamizarLodo;
    private Boolean rompeSemillas;
    private Boolean extraerSemillasPino;
    private Boolean desgarrar;
    private Boolean perforarMadera;
    private Boolean extraerAnimalesEnterrados;
    private Boolean alimentarseDePlancton;


    Pico(Boolean capturaPeces, Boolean tamizarLodo, Boolean rompeSemillas, Boolean extraerSemillasPino, Boolean desgarrar, Boolean perforarMadera, Boolean extraerAnimalesEnterrados, Boolean alimentarseDePlancton){
        this.capturaPeces = capturaPeces;
        this.tamizarLodo = tamizarLodo;
        this.rompeSemillas = rompeSemillas;
        this.extraerSemillasPino = extraerSemillasPino;
        this.desgarrar = desgarrar;
        this.perforarMadera = perforarMadera;
        this.extraerAnimalesEnterrados = extraerAnimalesEnterrados;
        this.alimentarseDePlancton = alimentarseDePlancton;
    }

    public Boolean getCapturaPeces() {
        return capturaPeces;
    }

    public Boolean getTamizarLodo() {
        return tamizarLodo;
    }

    public Boolean getRompeSemillas() {
        return rompeSemillas;
    }

    public Boolean getExtraerSemillasPino() {
        return extraerSemillasPino;
    }

    public Boolean getDesgarrar() {
        return desgarrar;
    }

    public Boolean getPerforarMadera() {
        return perforarMadera;
    }

    public Boolean getExtraerAnimalesEnterrados() {
        return extraerAnimalesEnterrados;
    }

    public Boolean getAlimentarseDePlancton() {
        return alimentarseDePlancton;
    }
}
