package br.com.cadastro.michel.controller;

import br.com.cadastro.michel.converter.UsuarioConverter;
import br.com.cadastro.michel.dto.UsuarioDTO;
import br.com.cadastro.michel.entity.Usuario;
import br.com.cadastro.michel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController // essa classe trabalha com metodos HTTP
@RequestMapping("/usuario") //essa classe aponta a URL deste controller
public class UsuarioController {

    //responsavel por executar metodos HTTP


    @Autowired
    private UsuarioConverter usuarioConverter;

    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping("/cadastro")
    public ResponseEntity<?> cadastraUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {

        Usuario usuario = usuarioConverter.converter(usuarioDTO);
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);

    }


}
