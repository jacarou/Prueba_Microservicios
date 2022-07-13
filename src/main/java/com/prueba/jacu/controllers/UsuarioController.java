package com.prueba.jacu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.jacu.models.ResponseModel;
import com.prueba.jacu.models.UsuarioRequestModel;
import com.prueba.jacu.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<ResponseModel> obtenerUsuario(@RequestParam long identificacion,
			@RequestParam String tipoIdentificacion) {
		
		UsuarioRequestModel usuario =  new UsuarioRequestModel(identificacion, tipoIdentificacion);
		
		return this.usuarioService.obtenerUsuario(usuario);
	}

}
