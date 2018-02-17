package models.enums;

/**
 * Created by Andree
 */
public enum Genero {
    MASCULINO(Boolean.FALSE, Boolean.FALSE),
    FEMENINO(Boolean.TRUE, Boolean.TRUE);

    private Boolean tieneCrias;
    private Boolean amamanta;

    Genero(Boolean tieneCrias, Boolean amamanta){
        this.tieneCrias = tieneCrias;
        this.amamanta = amamanta;
    }

    public Boolean getTieneCrias() {
        return tieneCrias;
    }

    public Boolean getAmamanta() {
        return amamanta;
    }
}
