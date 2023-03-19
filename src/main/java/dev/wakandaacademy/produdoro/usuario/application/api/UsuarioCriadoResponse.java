package dev.wakandaacademy.produdoro.usuario.application.api;

import java.util.UUID;

import dev.wakandaacademy.produdoro.usuario.domain.StatusUsuario;
import lombok.Value;

@Value
public class UsuarioCriadoResponse {

	private final UUID idUsuario;
	private final String email;
	private final ConfiguracaoUsuarioResponse configuracao;
	private final StatusUsuario status;
	private final Integer quantidadePomodorosPausaCurta = 0;

}
