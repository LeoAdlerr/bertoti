package com.bertoti.bertotiApiRest.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "usuario")
//@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@Component
public class Usuario {
	public Usuario(String usuNome, String usuEmail, String usuSenha) {
		this.usuNome = usuNome;
		this.usuEmail = usuEmail;
		this.usuSenha = usuSenha;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private Integer usuId;

	@Column(name = "usu_nome")
	private String usuNome;

	@Column(name = "usu_email")
	private String usuEmail;

	@Column(name = "usu_senha")
	private String usuSenha;

}