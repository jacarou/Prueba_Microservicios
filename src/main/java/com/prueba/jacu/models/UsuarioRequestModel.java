package com.prueba.jacu.models;

public class UsuarioRequestModel {

    private long identificacion;
    private String tipoDocumento;

    public UsuarioRequestModel(long identificacion, String tipoDocumento) {
		super();
		this.identificacion = identificacion;
		this.tipoDocumento = tipoDocumento;
	}
	public long getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

}
