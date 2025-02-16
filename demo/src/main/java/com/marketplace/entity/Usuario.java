package com.marketplace.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id_Usuario;
	
	@Column(name = "nome" , nullable = false)
	private String nome;

	@Column(name = "cpf", nullable = false, unique = true, length = 11)
	private String cpf;
	
    @Column(name = "email", nullable = false)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_telefone")
	private Telefone telefone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_endereco")
	private Endereco endereco;

	private Date dt_criacao;
	private Date dt_nascimento;

	@Column(name = "sexo", nullable = false)
	private char sexo;
	
}