package com.example.apivenda.service;

import com.example.apivenda.document.ItemVenda;
import com.example.apivenda.document.Venda;
import com.example.apivenda.dto.ItemVendaDTO;
import com.example.apivenda.dto.UsuarioDTO;
import com.example.apivenda.gateway.UsuariosReactiveFeignClient;
import com.example.apivenda.repository.ItemVendaRepository;
import com.example.apivenda.repository.VendaRespository;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class VendaService {

    private final VendaRespository vendaRespository;
    private final ItemVendaRepository itemVendaRepository;
    private final UsuariosReactiveFeignClient feignClient;

    public VendaService(VendaRespository vendaRespository, UsuariosReactiveFeignClient feignClient,ItemVendaRepository itemVendaRepository){
        this.vendaRespository = vendaRespository ;
        this.itemVendaRepository = itemVendaRepository;

        this.feignClient =  feignClient;

    }

    public Mono<Venda> criarCarrinho(String idUsuario){

        Mono<UsuarioDTO> usuarioDTO = feignClient.getUsuarioById(idUsuario);

        Venda venda = new Venda();
        venda.setUsuarioId(idUsuario);
        venda.setIsConcluido(false);

        return vendaRespository.save(venda);


    }

    public Mono<Venda> adicionarProduto(String idCarrinho, List<ItemVendaDTO> itemVendaList){

        List<ItemVenda> itemVenda;

//itemVendaList.stream().map(i -> itemVenda.add(new ItemVenda(UUID.randomUUID().toString(),i.) ) )





        return null;
    }

    public Mono<Venda> finalizarCompra(String idCarrinho){

        Mono <Venda> venda = vendaRespository.findById(idCarrinho);

        //venda = venda.map(v -> { v.setIsConcluido(true)})
        return null;

    }



}
