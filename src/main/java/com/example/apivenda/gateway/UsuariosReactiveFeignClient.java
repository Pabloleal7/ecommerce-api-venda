package com.example.apivenda.gateway;

import com.example.apivenda.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "api-usuarios")
public interface UsuariosReactiveFeignClient {

    @GetMapping("/usuarios")
    Flux<UsuarioDTO> getUsuarios();

    @GetMapping("/usuarios/{alunoId}")
    Mono<UsuarioDTO> getUsuarioById(@PathVariable("alunoId") String alunoId);


}
