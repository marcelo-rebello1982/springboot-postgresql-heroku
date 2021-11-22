package com.marcelopaulo.algafood.domain.repository.usuario;

import com.marcelopaulo.algafood.domain.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
