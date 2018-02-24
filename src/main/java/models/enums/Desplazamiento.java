package models.enums;

public enum Desplazamiento {
    TERRESTRE(Boolean.FALSE, Boolean.FALSE),
    AEREO(Boolean.TRUE, Boolean.FALSE),
    ACUATICO(Boolean.FALSE, Boolean.TRUE);

    private Boolean tienePico;
    private Boolean tieneEscamas;

    Desplazamiento(Boolean tienePico, Boolean tieneEscamas){
        this.tienePico = tienePico;
        this.tieneEscamas = tieneEscamas;
    }

    public Boolean getTienePico() {
        return tienePico;
    }

    public Boolean getTieneEscamas() {
        return tieneEscamas;
    }
}
