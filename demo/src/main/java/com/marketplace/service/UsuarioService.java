package com.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.repository.UsuarioRepository;

import exception.usuarioexception.UsuarioNullException;

import com.marketplace.entity.Usuario;


@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario cadastrarUsuario(Usuario usuario) {
		if(usuario.getNome() == null || usuario.getCpf() == null || usuario.getEmail() == null){
			throw new UsuarioNullException();
		}
		return usuarioRepository.save(usuario);
	}

	public String deletarUsuario(Usuario usuario){
		usuarioRepository.delete(usuario);
		return "Usuário deletado com sucesso!";	
	}
	
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

	
}
