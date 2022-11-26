package com.bertoti.bertotiApiRest.repository;

import java.util.List;

import com.bertoti.bertotiApiRest.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(value = "SELECT * FROM usuario WHERE usu_Email = ?1 and usu_Senha = ?2", nativeQuery = true)

	public Usuario findByest_Nome_Senha_Usuario(String email, String senha);

	@Query(value = "SELECT * FROM usuario", nativeQuery = true)
	public List<Usuario> selectListaUsuario();
}
