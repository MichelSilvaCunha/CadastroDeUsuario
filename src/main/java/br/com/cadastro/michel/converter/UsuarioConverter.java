package br.com.cadastro.michel.converter;


import br.com.cadastro.michel.dto.UsuarioDTO;
import br.com.cadastro.michel.entity.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {
    public Usuario converter(UsuarioDTO usuarioDTO) {
        return new Usuario(usuarioDTO.getNome(), usuarioDTO.getSobreNome(), usuarioDTO.getCpf());
    }
}
