package com.example.apivenda.repository;

import com.example.apivenda.document.Venda;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendaRespository extends ReactiveMongoRepository<Venda,String> {
}
