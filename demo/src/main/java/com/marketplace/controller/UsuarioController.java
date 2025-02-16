package com.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.service.UsuarioService;
import com.marketplace.entity.Usuario;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;


	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
		usuarioService.cadastrarUsuario(usuario);
		return ResponseEntity.ok(usuario);
	}

	@DeleteMapping("/deletar")
	public ResponseEntity<Usuario> deletarUsuario(@RequestBody Usuario usuario) {
		usuarioService.deletarUsuario(usuario);
		return ResponseEntity.ok(usuario);
	}
}
