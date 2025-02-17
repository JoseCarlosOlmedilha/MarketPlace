package com.marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.repository.UsuarioRepository;
import com.marketplace.entity.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario cadastrarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public String deletarUsuario(Long id) {
		usuarioRepository.deleteById(id);
		return "Usuário deletado com sucesso!";	
	}
	
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
	
	public List<Usuario> buscarTodosUsuarios(){
		List<Usuario> lista = usuarioRepository.findAll();
		return lista;
	}
	
}
