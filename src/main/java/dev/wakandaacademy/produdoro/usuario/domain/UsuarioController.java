package dev.wakandaacademy.produdoro.usuario.domain;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioAPI;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {
	@Override
	public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioController - postNovoUsuario");
		return null;
	}
	
	

}
