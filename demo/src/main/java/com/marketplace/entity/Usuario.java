package com.marketplace.entity;

import java.util.Date;

//import com.marketplace.entity.enumeration.StatusUsuario;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
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
	@Column(name = "Id_usuario")
	private Long id;
	
	@Column(name = "Nome" , nullable = false)
	private String nome;

	@Column(name = "Cpf", nullable = false, unique = true, length = 11)
	private String cpf;
	
    @Column(name = "Email", nullable = false)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_telefone")
	private Telefone telefone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_endereco")
	private Endereco endereco;

	@Column(name = "Dt_criacao")
	private Date dt_criacao;

	@Column(name = "DT_nascimento")
	private Date dt_nascimento;

	@Column(name = "Sexo", nullable = false)
	private char sexo;
	
	
	//@Column(name = "St_usuario")
	//@Enumerated(EnumType.STRING)
	//private StatusUsuario status;
}