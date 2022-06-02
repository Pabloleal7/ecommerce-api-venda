package com.example.apivenda.document;


import com.example.apivenda.dto.ItemVendaDTO;
import com.example.apivenda.dto.UsuarioDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Venda {

    @Id
    private String id;
    private String usuarioId;
    private List<ItemVendaDTO> listaItens;
    private Boolean isConcluido;
}
