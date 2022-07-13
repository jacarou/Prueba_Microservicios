package com.prueba.jacu.util;

import com.prueba.jacu.models.UsuarioRequestModel;
import com.prueba.jacu.models.UsuarioResponseModel;

public class Validador {

	public static boolean validarEntrada(UsuarioRequestModel usuarioEntrada) {
		return (usuarioEntrada.getTipoDocumento().length() == 1
				&& (usuarioEntrada.getTipoDocumento().equalsIgnoreCase("C")
				|| usuarioEntrada.getTipoDocumento().equalsIgnoreCase("P")));
	}
	
	public static boolean validarExistencia(UsuarioRequestModel usuarioEntrada, UsuarioResponseModel usuarioSalida) {
		return (usuarioEntrada.getTipoDocumento().equalsIgnoreCase(usuarioSalida.getTipoDocumento())
				&& usuarioEntrada.getIdentificacion() == usuarioSalida.getIdentificacion()
				);		
	}
}
