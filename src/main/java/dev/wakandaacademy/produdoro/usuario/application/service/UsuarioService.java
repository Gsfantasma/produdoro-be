package dev.wakandaacademy.produdoro.usuario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UsuarioService implements UsuarioApplicationService {

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioService - criaNovoUsuario");
		log.info("Request: {}", usuarioNovo);
		log.info("[finish], UsuarioService, criaNovoUsuario");
		return new UsuarioCriadoResponse(null, null, null, null);

	}

}
