package dev.wakandaacademy.produdoro.usuario.application.api;

import javax.validation.Valid;

public class UsuarioController implements UsuarioAPI {
	
	@Override
	public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		return null;
	}

}
