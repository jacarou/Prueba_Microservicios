package com.prueba.jacu.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prueba.jacu.models.ResponseModel;
import com.prueba.jacu.models.UsuarioRequestModel;
import com.prueba.jacu.models.UsuarioResponseModel;
import com.prueba.jacu.util.Validador;

@Service
public class UsuarioService {

	public ResponseEntity<ResponseModel> obtenerUsuario(UsuarioRequestModel usuarioBuscado) {
		
		UsuarioResponseModel usuarioResultado = new UsuarioResponseModel(23445322, "C", "Jhony", "Alejandro", "Caro",
				"Umbariba", "310-850-1357", "Carrera 40 # 22 - 78", "Bogota");
		ResponseModel respuesta = new ResponseModel(null,200, null,null);
		
		try {
			if(!Validador.validarEntrada(usuarioBuscado)) {
				respuesta.setStatus(400);
				respuesta.setError("Bad Request");
				respuesta.setMessage("Tipo de documento no valido");
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(respuesta);
			}
			if(!Validador.validarExistencia(usuarioBuscado, usuarioResultado)){
				respuesta.setStatus(404);
				respuesta.setError("Not Found");
				respuesta.setMessage("No se encontro información");
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(respuesta);
			}
			
			respuesta.setUsuario(usuarioResultado);
			return ResponseEntity.status(HttpStatus.OK).body(respuesta);
			
		} catch (Exception e) {
			respuesta.setStatus(500);
			respuesta.setError("Internal Server Error");
			respuesta.setMessage("Error interno del servidor");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(respuesta);
		}

	}

}
