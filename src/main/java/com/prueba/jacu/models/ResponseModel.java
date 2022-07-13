package com.prueba.jacu.models;

public class ResponseModel {
	private UsuarioResponseModel usuario;
	private int status;
	private String error;
	private String message;
	
	public ResponseModel(UsuarioResponseModel usuario, int status, String error, String message) {
		super();
		this.usuario = usuario;
		this.status = status;
		this.error = error;
		this.message = message;
	}
	public UsuarioResponseModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioResponseModel usuario) {
		this.usuario = usuario;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
