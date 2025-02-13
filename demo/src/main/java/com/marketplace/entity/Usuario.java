package com.marketplace.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_usuario;
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false, unique = true, length = 11)
	private String cpf;
	
	@Column(nullable = false)
	private String email;
	
	//private Telefone telefone;
	//private Endereco endereco;
	
	private Date dt_criacao;
	private Date dt_nascimento;
	@Column(nullable = false)
	private char sexo;
	//private StatusUsuario statusUsuario;
	
	
	
	
	
	
	
}
