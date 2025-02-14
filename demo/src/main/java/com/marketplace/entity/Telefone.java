package com.marketplace.entity;

import org.springframework.beans.factory.annotation.Autowired;

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
@NoArgsConstructor
@AllArgsConstructor 
@EqualsAndHashCode
@Table(name = "tb_telefone")
public class Telefone {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_telefone;
	@Autowired
	private Usuario id_usuario;
	private String ddd;
	private String telefone;
	
}
