package com.example.apivenda.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemVenda {

    private String nomeProduto;
    private BigDecimal preçoUnitario;
    private Integer quantidade;

}
