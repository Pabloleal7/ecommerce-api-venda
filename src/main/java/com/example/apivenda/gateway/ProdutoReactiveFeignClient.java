package com.example.apivenda.gateway;

import com.example.apivenda.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "api-produto")
public interface ProdutoReactiveFeignClient {

    @GetMapping("/")
    Flux<UsuarioDTO> getUsuarios();

    @GetMapping("/{produtoId}")
    Mono<UsuarioDTO> getUsuarioById(@PathVariable("produtoId") String produtoId);
}
