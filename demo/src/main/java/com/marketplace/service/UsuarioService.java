package com.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.repository.UsuarioRepository;
import com.marketplace.entity.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public void cadastrarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public String deletarUsuario(Usuario usuario){
		usuarioRepository.delete(usuario);
		return "Usuário deletado com sucesso!";	
	}
	
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

	
}
