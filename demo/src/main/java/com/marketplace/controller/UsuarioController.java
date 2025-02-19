package com.marketplace.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.service.UsuarioService;
import com.marketplace.entity.Usuario;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;


	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
		Usuario usuarioSalvo = usuarioService.cadastrarUsuario(usuario);
		URI uri = URI.create("/usuarios/" + usuarioSalvo.getId_Usuario());
		return ResponseEntity.created(uri).body(usuarioSalvo);
	}

	@DeleteMapping("/deletar")
	public ResponseEntity<Usuario> deletarUsuario(@RequestBody Usuario usuario) {
		usuarioService.deletarUsuario(usuario);
		return ResponseEntity.ok(usuario);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getMethodName(@PathVariable Long id) {
		Usuario usuario = usuarioService.buscarPorId(id);
		return ResponseEntity.ok(usuario);
	}
	
}
