package com.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.service.UsuarioService;
import com.marketplace.entity.Usuario;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;


	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
		usuarioService.cadastrarUsuario(usuario);
		return ResponseEntity.ok().body(usuario);
	}

	@DeleteMapping("/{id}/deletar")
	public ResponseEntity<String> deletarUsuario(@PathVariable Long id) {
		usuarioService.deletarUsuario(id);
		return ResponseEntity.ok().body("Usuário deletado com sucesso!");
	}

	@GetMapping("/{id}/buscar")
	public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
		Usuario usuario = usuarioService.buscarPorId(id);
		return ResponseEntity.ok().body(usuario);
	}
	
	@GetMapping("/buscarTodos")
	public ResponseEntity<List<Usuario>> buscarTodosUsuarios(){
		List<Usuario> usuarios = usuarioService.buscarTodosUsuarios();
		return ResponseEntity.ok().body(usuarios);
	}



}
